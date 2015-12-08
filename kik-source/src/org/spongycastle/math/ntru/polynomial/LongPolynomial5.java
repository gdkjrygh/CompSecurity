// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.polynomial;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.math.ntru.polynomial:
//            IntegerPolynomial, TernaryPolynomial

public class LongPolynomial5
{

    private long a[];
    private int b;

    public LongPolynomial5(IntegerPolynomial integerpolynomial)
    {
        b = integerpolynomial.a.length;
        a = new long[(b + 4) / 5];
        int j = 0;
        int i = 0;
        int l;
        for (int k = 0; j < b; k = l)
        {
            long al[] = a;
            al[k] = al[k] | (long)integerpolynomial.a[j] << i;
            int i1 = i + 12;
            i = i1;
            l = k;
            if (i1 >= 60)
            {
                l = k + 1;
                i = 0;
            }
            j++;
        }

    }

    private LongPolynomial5(long al[], int i)
    {
        a = al;
        b = i;
    }

    public final IntegerPolynomial a()
    {
        int ai[] = new int[b];
        int j = 0;
        int i = 0;
        int l;
        for (int k = 0; j < b; k = l)
        {
            ai[j] = (int)(a[k] >> i & 2047L);
            int i1 = i + 12;
            i = i1;
            l = k;
            if (i1 >= 60)
            {
                l = k + 1;
                i = 0;
            }
            j++;
        }

        return new IntegerPolynomial(ai);
    }

    public final LongPolynomial5 a(TernaryPolynomial ternarypolynomial)
    {
        int i = a.length;
        int j = (ternarypolynomial.c() + 4) / 5;
        long al[][] = (long[][])Array.newInstance(Long.TYPE, new int[] {
            5, (i + j) - 1
        });
        int ai[] = ternarypolynomial.a();
        for (i = 0; i != ai.length; i++)
        {
            int k = ai[i];
            int i2 = k / 5;
            int i3 = k - i2 * 5;
            for (int l = 0; l < a.length; l++)
            {
                al[i3][i2] = al[i3][i2] + a[l] & 0x7ff7ff7ff7ff7ffL;
                i2++;
            }

        }

        ternarypolynomial = ternarypolynomial.b();
        for (i = 0; i != ternarypolynomial.length; i++)
        {
            int i1 = ternarypolynomial[i];
            int j2 = i1 / 5;
            int j3 = i1 - j2 * 5;
            for (int j1 = 0; j1 < a.length; j1++)
            {
                al[j3][j2] = (0x800800800800800L + al[j3][j2]) - a[j1] & 0x7ff7ff7ff7ff7ffL;
                j2++;
            }

        }

        ternarypolynomial = Arrays.a(al[0], al[0].length + 1);
        for (i = 1; i <= 4; i++)
        {
            int k2 = i * 12;
            int k3 = 60 - k2;
            int i4 = al[i].length;
            for (int k1 = 0; k1 < i4; k1++)
            {
                long l4 = al[i][k1];
                ternarypolynomial[k1] = ((al[i][k1] & (1L << k3) - 1L) << k2) + ternarypolynomial[k1] & 0x7ff7ff7ff7ff7ffL;
                int j4 = k1 + 1;
                ternarypolynomial[j4] = (l4 >> k3) + ternarypolynomial[j4] & 0x7ff7ff7ff7ff7ffL;
            }

        }

        int l2 = b;
        i = a.length - 1;
        while (i < ternarypolynomial.length) 
        {
            int l1;
            long l5;
            if (i == a.length - 1)
            {
                int l3;
                if (b == 5)
                {
                    l5 = 0L;
                } else
                {
                    l5 = ternarypolynomial[i] >> (l2 % 5) * 12;
                }
                l1 = 0;
            } else
            {
                l5 = ternarypolynomial[i];
                l1 = i * 5 - b;
            }
            l3 = l1 / 5;
            l1 -= l3 * 5;
            ternarypolynomial[l3] = (l5 << l1 * 12) + ternarypolynomial[l3] & 0x7ff7ff7ff7ff7ffL;
            l3++;
            if (l3 < a.length)
            {
                ternarypolynomial[l3] = (l5 >> (5 - l1) * 12) + ternarypolynomial[l3] & 0x7ff7ff7ff7ff7ffL;
            }
            i++;
        }
        return new LongPolynomial5(ternarypolynomial, b);
    }
}
