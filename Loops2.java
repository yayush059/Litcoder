import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        
        
        
        // int A = sc.nextInt();
        // int B=0;
        // while(B<=A){
        //     System.out.println(B+" ");
        //     B++;
        // }




        // int C = sc.nextInt();
        // while(C>0){
        //     int last_digit = C%10;
        //     System.out.print(last_digit);
        //     C=C/10;
        // }





        int N = sc.nextInt();
        int Rev = 0;
        while(N>0){
            Rev = (Rev*10)+(N%10);
            N=N/10;
        }
        System.out.println(Rev);




        /*do{
            System.out.println("ENTER YOUR NUMBER: ");
            int M= sc.nextInt();
            if(M%10==0){
                continue;
            }
            System.out.println(M);
        }while(true);*/






        // System.out.println("enter a number");
    
        // int n = sc.nextInt();
        // if(n==2){
        //     System.out.println(n+" is prime");
        // }
        // else{
        //     boolean isprime = true;
        //     for(int i = 0;i<=Math.sqrt(n);i++){
        //         if(n%i==0){
        //             isprime=false;
        //         }
        //     }
        //     // System.out.println(isprime==true?"n is prime":"n is not a prime");
            
        // }










        
    }
}