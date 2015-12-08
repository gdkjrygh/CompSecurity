// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder.ec;


// Referenced classes of package com.google.zxing.pdf417.decoder.ec:
//            ModulusPoly

public final class ModulusGF
{

    public static final ModulusGF PDF417_GF = new ModulusGF(929, 3);
    private final int expTable[];
    private final int logTable[];
    private final int modulus;
    private final ModulusPoly one = new ModulusPoly(this, new int[] {
        1
    });
    private final ModulusPoly zero = new ModulusPoly(this, new int[] {
        0
    });

    private ModulusGF(int i, int j)
    {
        modulus = i;
        expTable = new int[i];
        logTable = new int[i];
        int k = 0;
        int l = 1;
        for (; k < i; k++)
        {
            expTable[k] = l;
            l = (l * j) % i;
        }

        for (j = 0; j < i - 1; j++)
        {
            logTable[expTable[j]] = j;
        }

    }

    int add(int i, int j)
    {
        return (i + j) % modulus;
    }

    ModulusPoly buildMonomial(int i, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException();
        }
        if (j == 0)
        {
            return zero;
        } else
        {
            int ai[] = new int[i + 1];
            ai[0] = j;
            return new ModulusPoly(this, ai);
        }
    }

    int exp(int i)
    {
        return expTable[i];
    }

    ModulusPoly getOne()
    {
        return one;
    }

    int getSize()
    {
        return modulus;
    }

    ModulusPoly getZero()
    {
        return zero;
    }

    int inverse(int i)
    {
        if (i == 0)
        {
            throw new ArithmeticException();
        } else
        {
            return expTable[modulus - logTable[i] - 1];
        }
    }

    int log(int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return logTable[i];
        }
    }

    int multiply(int i, int j)
    {
        if (i == 0 || j == 0)
        {
            return 0;
        } else
        {
            return expTable[(logTable[i] + logTable[j]) % (modulus - 1)];
        }
    }

    int subtract(int i, int j)
    {
        return ((modulus + i) - j) % modulus;
    }

}
