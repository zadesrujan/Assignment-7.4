package assign;
//here we cretaed package as my which that organizes a set of related classes and interfaces.
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		 int[] svk ={29,4,120,54,975};
		//Integer Array is created. 
		    int n = 5;
		//Size of the array which is integer data tyep
		  Array.recursiveCall(svk, n);

		   //Array is calling the recursion  

		  }

		  public static void recursiveCall(int[] svk, int n){

		      if(svk.length <= 1) return;               
		      // Base case: just 1 

		    int[] a = new int[svk.length / 2];        
		    // Split array into two
		//For example the array has 5 elements it will divide 5 into 2 halves and 2 elements in one set 
		    //and last 2 elements in other the middle one will be alone. If size is 6 then 3 will be in
		    //one half other are in other half
		    int[] b = new int[svk.length - a.length]; 
		    //   halves, a and b
		//we are taking halves again sorting them into halves
		    for(int i = 0; i < svk.length; i++) {
		//the sorting will start from the first position
		        if(i < a.length) a[i] = svk[i];
		//length of abc and a need to be same
		        else             b[i - a.length] = svk[i];
		        //otherwise the index minus length of a is to be equal to abc index

		    }

		    recursiveCall(a, n);                            
		    // Recursively sort first

		    recursiveCall(b, n);                             
		    //   and second half.

		    int ai = 0;       
		    
		    // Merge halves: ai, bi  track position in each half.

		    int bi = 0;                                

		    while(ai + bi < svk.length) {                
		//the arrays of ai and bi should be greater than length
		        if(bi >= b.length || (ai < a.length && a[ai] < b[bi]))
		       //when the b array is not equal to length the it will go a array and see whether a is
		        	//greater than b
		        {

		            svk[ai + bi] = a[ai]; // (copy element of first array over)

		            ai++;// a array will be sorted

		        } else {

		            svk[ai + bi] = b[bi]; // (copy element of second array over)

		            bi++;// b array to be sorted

		        }

		    }

		    System.out.println(Arrays.toString(svk));
		  //system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			
		  }

		  

		
	}


