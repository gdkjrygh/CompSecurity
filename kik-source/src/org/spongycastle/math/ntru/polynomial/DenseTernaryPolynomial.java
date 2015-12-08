// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.polynomial;

import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.math.ntru.polynomial:
//            IntegerPolynomial, TernaryPolynomial, LongPolynomial5

public class DenseTernaryPolynomial extends IntegerPolynomial
    implements TernaryPolynomial
{

    public DenseTernaryPolynomial(IntegerPolynomial integerpolynomial)
    {
        this(integerpolynomial.a);
    }

    public DenseTernaryPolynomial(int ai[])
    {
        super(ai);
        for (int i = 0; i != a.length; i++)
        {
            int j = a[i];
            if (j < -1 || j > 1)
            {
                throw new IllegalStateException((new StringBuilder("Illegal value: ")).append(j).append(", must be one of {-1, 0, 1}").toString());
            }
        }

    }

    public final IntegerPolynomial a(IntegerPolynomial integerpolynomial, int i)
    {
        if (i == 2048)
        {
            integerpolynomial = (IntegerPolynomial)integerpolynomial.clone();
            integerpolynomial.b(2048);
            return (new LongPolynomial5(integerpolynomial)).a(this).a();
        } else
        {
            return super.a(integerpolynomial, i);
        }
    }

    public final int[] a()
    {
        int l = a.length;
        int ai[] = new int[l];
        int j = 0;
        int i = 0;
        for (; j < l; j++)
        {
            if (a[j] == 1)
            {
                int k = i + 1;
                ai[i] = j;
                i = k;
            }
        }

        return Arrays.a(ai, i);
    }

    public final int[] b()
    {
        int l = a.length;
        int ai[] = new int[l];
        int j = 0;
        int i = 0;
        for (; j < l; j++)
        {
            if (a[j] == -1)
            {
                int k = i + 1;
                ai[i] = j;
                i = k;
            }
        }

        return Arrays.a(ai, i);
    }

    public final int c()
    {
        return a.length;
    }
}
