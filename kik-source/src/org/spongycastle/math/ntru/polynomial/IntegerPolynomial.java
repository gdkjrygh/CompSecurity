// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.polynomial;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.math.ntru.util.ArrayEncoder;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.math.ntru.polynomial:
//            Polynomial

public class IntegerPolynomial
    implements Polynomial
{

    private static final int b[] = {
        4507, 4513, 4517, 4519, 4523, 4547, 4549, 4561, 4567, 4583, 
        4591, 4597, 4603, 4621, 4637, 4639, 4643, 4649, 4651, 4657, 
        4663, 4673, 4679, 4691, 4703, 4721, 4723, 4729, 4733, 4751, 
        4759, 4783, 4787, 4789, 4793, 4799, 4801, 4813, 4817, 4831, 
        4861, 4871, 4877, 4889, 4903, 4909, 4919, 4931, 4933, 4937, 
        4943, 4951, 4957, 4967, 4969, 4973, 4987, 4993, 4999, 5003, 
        5009, 5011, 5021, 5023, 5039, 5051, 5059, 5077, 5081, 5087, 
        5099, 5101, 5107, 5113, 5119, 5147, 5153, 5167, 5171, 5179, 
        5189, 5197, 5209, 5227, 5231, 5233, 5237, 5261, 5273, 5279, 
        5281, 5297, 5303, 5309, 5323, 5333, 5347, 5351, 5381, 5387, 
        5393, 5399, 5407, 5413, 5417, 5419, 5431, 5437, 5441, 5443, 
        5449, 5471, 5477, 5479, 5483, 5501, 5503, 5507, 5519, 5521, 
        5527, 5531, 5557, 5563, 5569, 5573, 5581, 5591, 5623, 5639, 
        5641, 5647, 5651, 5653, 5657, 5659, 5669, 5683, 5689, 5693, 
        5701, 5711, 5717, 5737, 5741, 5743, 5749, 5779, 5783, 5791, 
        5801, 5807, 5813, 5821, 5827, 5839, 5843, 5849, 5851, 5857, 
        5861, 5867, 5869, 5879, 5881, 5897, 5903, 5923, 5927, 5939, 
        5953, 5981, 5987, 6007, 6011, 6029, 6037, 6043, 6047, 6053, 
        6067, 6073, 6079, 6089, 6091, 6101, 6113, 6121, 6131, 6133, 
        6143, 6151, 6163, 6173, 6197, 6199, 6203, 6211, 6217, 6221, 
        6229, 6247, 6257, 6263, 6269, 6271, 6277, 6287, 6299, 6301, 
        6311, 6317, 6323, 6329, 6337, 6343, 6353, 6359, 6361, 6367, 
        6373, 6379, 6389, 6397, 6421, 6427, 6449, 6451, 6469, 6473, 
        6481, 6491, 6521, 6529, 6547, 6551, 6553, 6563, 6569, 6571, 
        6577, 6581, 6599, 6607, 6619, 6637, 6653, 6659, 6661, 6673, 
        6679, 6689, 6691, 6701, 6703, 6709, 6719, 6733, 6737, 6761, 
        6763, 6779, 6781, 6791, 6793, 6803, 6823, 6827, 6829, 6833, 
        6841, 6857, 6863, 6869, 6871, 6883, 6899, 6907, 6911, 6917, 
        6947, 6949, 6959, 6961, 6967, 6971, 6977, 6983, 6991, 6997, 
        7001, 7013, 7019, 7027, 7039, 7043, 7057, 7069, 7079, 7103, 
        7109, 7121, 7127, 7129, 7151, 7159, 7177, 7187, 7193, 7207, 
        7211, 7213, 7219, 7229, 7237, 7243, 7247, 7253, 7283, 7297, 
        7307, 7309, 7321, 7331, 7333, 7349, 7351, 7369, 7393, 7411, 
        7417, 7433, 7451, 7457, 7459, 7477, 7481, 7487, 7489, 7499, 
        7507, 7517, 7523, 7529, 7537, 7541, 7547, 7549, 7559, 7561, 
        7573, 7577, 7583, 7589, 7591, 7603, 7607, 7621, 7639, 7643, 
        7649, 7669, 7673, 7681, 7687, 7691, 7699, 7703, 7717, 7723, 
        7727, 7741, 7753, 7757, 7759, 7789, 7793, 7817, 7823, 7829, 
        7841, 7853, 7867, 7873, 7877, 7879, 7883, 7901, 7907, 7919, 
        7927, 7933, 7937, 7949, 7951, 7963, 7993, 8009, 8011, 8017, 
        8039, 8053, 8059, 8069, 8081, 8087, 8089, 8093, 8101, 8111, 
        8117, 8123, 8147, 8161, 8167, 8171, 8179, 8191, 8209, 8219, 
        8221, 8231, 8233, 8237, 8243, 8263, 8269, 8273, 8287, 8291, 
        8293, 8297, 8311, 8317, 8329, 8353, 8363, 8369, 8377, 8387, 
        8389, 8419, 8423, 8429, 8431, 8443, 8447, 8461, 8467, 8501, 
        8513, 8521, 8527, 8537, 8539, 8543, 8563, 8573, 8581, 8597, 
        8599, 8609, 8623, 8627, 8629, 8641, 8647, 8663, 8669, 8677, 
        8681, 8689, 8693, 8699, 8707, 8713, 8719, 8731, 8737, 8741, 
        8747, 8753, 8761, 8779, 8783, 8803, 8807, 8819, 8821, 8831, 
        8837, 8839, 8849, 8861, 8863, 8867, 8887, 8893, 8923, 8929, 
        8933, 8941, 8951, 8963, 8969, 8971, 8999, 9001, 9007, 9011, 
        9013, 9029, 9041, 9043, 9049, 9059, 9067, 9091, 9103, 9109, 
        9127, 9133, 9137, 9151, 9157, 9161, 9173, 9181, 9187, 9199, 
        9203, 9209, 9221, 9227, 9239, 9241, 9257, 9277, 9281, 9283, 
        9293, 9311, 9319, 9323, 9337, 9341, 9343, 9349, 9371, 9377, 
        9391, 9397, 9403, 9413, 9419, 9421, 9431, 9433, 9437, 9439, 
        9461, 9463, 9467, 9473, 9479, 9491, 9497, 9511, 9521, 9533, 
        9539, 9547, 9551, 9587, 9601, 9613, 9619, 9623, 9629, 9631, 
        9643, 9649, 9661, 9677, 9679, 9689, 9697, 9719, 9721, 9733, 
        9739, 9743, 9749, 9767, 9769, 9781, 9787, 9791, 9803, 9811, 
        9817, 9829, 9833, 9839, 9851, 9857, 9859, 9871, 9883, 9887, 
        9901, 9907, 9923, 9929, 9931, 9941, 9949, 9967, 9973
    };
    private static final List c;
    public int a[];

    public IntegerPolynomial(int i)
    {
        a = new int[i];
    }

    public IntegerPolynomial(int ai[])
    {
        a = ai;
    }

    public static IntegerPolynomial a(byte abyte0[], int i)
    {
        return new IntegerPolynomial(ArrayEncoder.a(abyte0, i));
    }

    public static IntegerPolynomial a(byte abyte0[], int i, int j)
    {
        return new IntegerPolynomial(ArrayEncoder.a(abyte0, i, j));
    }

    private IntegerPolynomial d(IntegerPolynomial integerpolynomial)
    {
        int k1 = 0;
        int ai1[] = a;
        int ai[] = integerpolynomial.a;
        int i2 = integerpolynomial.a.length;
        if (i2 <= 32)
        {
            k1 = i2 * 2 - 1;
            integerpolynomial = new IntegerPolynomial(new int[k1]);
            for (int i = 0; i < k1; i++)
            {
                for (int i1 = Math.max(0, (i - i2) + 1); i1 <= Math.min(i, i2 - 1); i1++)
                {
                    int ai2[] = integerpolynomial.a;
                    ai2[i] = ai2[i] + ai[i1] * ai1[i - i1];
                }

            }

            return integerpolynomial;
        }
        int l1 = i2 / 2;
        integerpolynomial = new IntegerPolynomial(Arrays.a(ai1, l1));
        IntegerPolynomial integerpolynomial2 = new IntegerPolynomial(Arrays.a(ai1, l1, i2));
        IntegerPolynomial integerpolynomial4 = new IntegerPolynomial(Arrays.a(ai, l1));
        IntegerPolynomial integerpolynomial5 = new IntegerPolynomial(Arrays.a(ai, l1, i2));
        IntegerPolynomial integerpolynomial1 = (IntegerPolynomial)integerpolynomial.clone();
        integerpolynomial1.b(integerpolynomial2);
        IntegerPolynomial integerpolynomial3 = (IntegerPolynomial)integerpolynomial4.clone();
        integerpolynomial3.b(integerpolynomial5);
        integerpolynomial = integerpolynomial.d(integerpolynomial4);
        integerpolynomial2 = integerpolynomial2.d(integerpolynomial5);
        integerpolynomial3 = integerpolynomial1.d(integerpolynomial3);
        integerpolynomial3.c(integerpolynomial);
        integerpolynomial3.c(integerpolynomial2);
        integerpolynomial1 = new IntegerPolynomial(i2 * 2 - 1);
        for (int j = 0; j < integerpolynomial.a.length; j++)
        {
            integerpolynomial1.a[j] = integerpolynomial.a[j];
        }

        int k = 0;
        int j1;
        do
        {
            j1 = k1;
            if (k >= integerpolynomial3.a.length)
            {
                break;
            }
            integerpolynomial = integerpolynomial1.a;
            j1 = l1 + k;
            integerpolynomial[j1] = integerpolynomial[j1] + integerpolynomial3.a[k];
            k++;
        } while (true);
        for (; j1 < integerpolynomial2.a.length; j1++)
        {
            integerpolynomial = integerpolynomial1.a;
            int l = l1 * 2 + j1;
            integerpolynomial[l] = integerpolynomial[l] + integerpolynomial2.a[j1];
        }

        return integerpolynomial1;
    }

    public final IntegerPolynomial a(IntegerPolynomial integerpolynomial)
    {
        int j = a.length;
        if (integerpolynomial.a.length != j)
        {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        integerpolynomial = d(integerpolynomial);
        if (integerpolynomial.a.length > j)
        {
            for (int i = j; i < integerpolynomial.a.length; i++)
            {
                int ai[] = integerpolynomial.a;
                int k = i - j;
                ai[k] = ai[k] + integerpolynomial.a[i];
            }

            integerpolynomial.a = Arrays.a(integerpolynomial.a, j);
        }
        return integerpolynomial;
    }

    public IntegerPolynomial a(IntegerPolynomial integerpolynomial, int i)
    {
        integerpolynomial = a(integerpolynomial);
        integerpolynomial.c(i);
        return integerpolynomial;
    }

    public final byte[] a(int i)
    {
        return ArrayEncoder.a(a, i);
    }

    public final void b(int i)
    {
        c(i);
        d(i);
    }

    public final void b(IntegerPolynomial integerpolynomial)
    {
        if (integerpolynomial.a.length > a.length)
        {
            a = Arrays.a(a, integerpolynomial.a.length);
        }
        for (int i = 0; i < integerpolynomial.a.length; i++)
        {
            int ai[] = a;
            ai[i] = ai[i] + integerpolynomial.a[i];
        }

    }

    public final void c(int i)
    {
        for (int j = 0; j < a.length; j++)
        {
            int ai[] = a;
            ai[j] = ai[j] % i;
        }

    }

    public final void c(IntegerPolynomial integerpolynomial)
    {
        if (integerpolynomial.a.length > a.length)
        {
            a = Arrays.a(a, integerpolynomial.a.length);
        }
        for (int i = 0; i < integerpolynomial.a.length; i++)
        {
            int ai[] = a;
            ai[i] = ai[i] - integerpolynomial.a[i];
        }

    }

    public Object clone()
    {
        return new IntegerPolynomial((int[])a.clone());
    }

    public final void d()
    {
        for (int i = 0; i < a.length; i++)
        {
            int ai[] = a;
            ai[i] = ai[i] * 3;
        }

    }

    public final void d(int i)
    {
        for (int j = 0; j < a.length; j++)
        {
            int ai[];
            for (; a[j] < 0; ai[j] = ai[j] + i)
            {
                ai = a;
            }

        }

    }

    public final void e()
    {
        for (int i = 0; i < a.length; i++)
        {
            int ai[] = a;
            ai[i] = ai[i] % 3;
            if (a[i] > 1)
            {
                int ai1[] = a;
                ai1[i] = ai1[i] - 3;
            }
            if (a[i] < -1)
            {
                int ai2[] = a;
                ai2[i] = ai2[i] + 3;
            }
        }

    }

    public final void e(int i)
    {
        for (int j = 0; j < a.length; j++)
        {
            int ai[];
            for (; a[j] < -i / 2; ai[j] = ai[j] + i)
            {
                ai = a;
            }

            int ai1[];
            for (; a[j] > i / 2; ai1[j] = ai1[j] - i)
            {
                ai1 = a;
            }

        }

    }

    public boolean equals(Object obj)
    {
        if (obj instanceof IntegerPolynomial)
        {
            return Arrays.a(a, ((IntegerPolynomial)obj).a);
        } else
        {
            return false;
        }
    }

    public final int f(int i)
    {
        int j = 0;
        int k;
        int l;
        for (k = 0; j != a.length; k = l)
        {
            l = k;
            if (a[j] == i)
            {
                l = k + 1;
            }
            j++;
        }

        return k;
    }

    static 
    {
        c = new ArrayList();
        for (int i = 0; i != b.length; i++)
        {
            c.add(BigInteger.valueOf(b[i]));
        }

    }
}
