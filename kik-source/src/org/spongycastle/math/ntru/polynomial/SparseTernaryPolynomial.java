// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.polynomial;

import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.math.ntru.polynomial:
//            TernaryPolynomial, IntegerPolynomial

public class SparseTernaryPolynomial
    implements TernaryPolynomial
{

    private int a;
    private int b[];
    private int c[];

    public SparseTernaryPolynomial(int ai[])
    {
        int i;
        int j;
        int k;
        j = 0;
        super();
        a = ai.length;
        b = new int[a];
        c = new int[a];
        k = 0;
        i = 0;
_L9:
        if (j >= a) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        int j1;
        j1 = ai[j];
        l = k;
        i1 = i;
        j1;
        JVM INSTR tableswitch -1 1: default 84
    //                   -1 144
    //                   0 130
    //                   1 114;
           goto _L3 _L4 _L5 _L6
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        throw new IllegalArgumentException((new StringBuilder("Illegal value: ")).append(j1).append(", must be one of {-1, 0, 1}").toString());
_L6:
        b[i] = j;
        i1 = i + 1;
        l = k;
_L7:
        j++;
        k = l;
        i = i1;
        continue; /* Loop/switch isn't completed */
_L4:
        c[k] = j;
        l = k + 1;
        i1 = i;
        if (true) goto _L7; else goto _L2
_L2:
        b = Arrays.a(b, i);
        c = Arrays.a(c, k);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final IntegerPolynomial a(IntegerPolynomial integerpolynomial)
    {
        int ai[];
        int i1;
        boolean flag = false;
        integerpolynomial = integerpolynomial.a;
        if (integerpolynomial.length != a)
        {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        ai = new int[a];
        int k = 0;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (k == b.length)
            {
                break;
            }
            int i = b[k];
            int l1 = a;
            i1 = a;
            i = l1 - 1 - i;
            for (i1--; i1 >= 0; i1--)
            {
                ai[i1] = ai[i1] + integerpolynomial[i];
                int i2 = i - 1;
                i = i2;
                if (i2 < 0)
                {
                    i = a - 1;
                }
            }

            k++;
        } while (true);
_L3:
        if (i1 != c.length)
        {
            int j = c[i1];
            int j1 = a;
            int l = a;
            j = j1 - 1 - j;
            l--;
            while (l >= 0) 
            {
                ai[l] = ai[l] - integerpolynomial[j];
                int k1 = j - 1;
                j = k1;
                if (k1 < 0)
                {
                    j = a - 1;
                }
                l--;
            }
        } else
        {
            return new IntegerPolynomial(ai);
        }
        if (true) goto _L2; else goto _L1
_L2:
        i1++;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public final IntegerPolynomial a(IntegerPolynomial integerpolynomial, int i)
    {
        integerpolynomial = a(integerpolynomial);
        integerpolynomial.c(i);
        return integerpolynomial;
    }

    public final int[] a()
    {
        return b;
    }

    public final int[] b()
    {
        return c;
    }

    public final int c()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SparseTernaryPolynomial)obj;
            if (a != ((SparseTernaryPolynomial) (obj)).a)
            {
                return false;
            }
            if (!Arrays.a(c, ((SparseTernaryPolynomial) (obj)).c))
            {
                return false;
            }
            if (!Arrays.a(b, ((SparseTernaryPolynomial) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((a + 31) * 31 + Arrays.a(c)) * 31 + Arrays.a(b);
    }
}
