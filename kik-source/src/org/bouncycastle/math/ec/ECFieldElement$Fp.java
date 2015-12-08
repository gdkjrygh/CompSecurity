// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECFieldElement, ECConstants

public static class b extends ECFieldElement
{

    BigInteger a;
    BigInteger b;

    private static BigInteger[] a(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
    {
        int i = biginteger3.bitLength();
        int k = biginteger3.getLowestSetBit();
        BigInteger biginteger6 = ECConstants.g;
        BigInteger biginteger5 = ECConstants.h;
        BigInteger biginteger9 = ECConstants.g;
        BigInteger biginteger10 = ECConstants.g;
        BigInteger biginteger4 = biginteger1;
        i--;
        while (i >= k + 1) 
        {
            biginteger9 = biginteger9.multiply(biginteger10).mod(biginteger);
            BigInteger biginteger7;
            BigInteger biginteger11;
            if (biginteger3.testBit(i))
            {
                biginteger10 = biginteger9.multiply(biginteger2).mod(biginteger);
                biginteger6 = biginteger6.multiply(biginteger4).mod(biginteger);
                biginteger7 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger9)).mod(biginteger);
                biginteger5 = biginteger4.multiply(biginteger4).subtract(biginteger10.shiftLeft(1)).mod(biginteger);
                biginteger4 = biginteger6;
                biginteger6 = biginteger5;
                biginteger5 = biginteger10;
            } else
            {
                biginteger7 = biginteger6.multiply(biginteger5).subtract(biginteger9).mod(biginteger);
                biginteger6 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger9)).mod(biginteger);
                biginteger5 = biginteger5.multiply(biginteger5).subtract(biginteger9.shiftLeft(1)).mod(biginteger);
                biginteger4 = biginteger7;
                biginteger7 = biginteger5;
                biginteger5 = biginteger9;
            }
            i--;
            biginteger11 = biginteger6;
            biginteger10 = biginteger5;
            biginteger6 = biginteger4;
            biginteger4 = biginteger11;
            biginteger5 = biginteger7;
        }
        BigInteger biginteger8 = biginteger9.multiply(biginteger10).mod(biginteger);
        biginteger9 = biginteger8.multiply(biginteger2).mod(biginteger);
        biginteger3 = biginteger6.multiply(biginteger5).subtract(biginteger8).mod(biginteger);
        biginteger2 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger8)).mod(biginteger);
        biginteger1 = biginteger8.multiply(biginteger9).mod(biginteger);
        for (int j = 1; j <= k; j++)
        {
            biginteger3 = biginteger3.multiply(biginteger2).mod(biginteger);
            biginteger2 = biginteger2.multiply(biginteger2).subtract(biginteger1.shiftLeft(1)).mod(biginteger);
            biginteger1 = biginteger1.multiply(biginteger1).mod(biginteger);
        }

        return (new BigInteger[] {
            biginteger3, biginteger2
        });
    }

    public final BigInteger a()
    {
        return a;
    }

    public final ECFieldElement a(ECFieldElement ecfieldelement)
    {
        return new <init>(b, a.add(ecfieldelement.a()).mod(b));
    }

    public final int b()
    {
        return b.bitLength();
    }

    public final ECFieldElement b(ECFieldElement ecfieldelement)
    {
        return new <init>(b, a.subtract(ecfieldelement.a()).mod(b));
    }

    public final ECFieldElement c()
    {
        return new <init>(b, a.negate().mod(b));
    }

    public final ECFieldElement c(ECFieldElement ecfieldelement)
    {
        return new <init>(b, a.multiply(ecfieldelement.a()).mod(b));
    }

    public final ECFieldElement d()
    {
        return new <init>(b, a.multiply(a).mod(b));
    }

    public final ECFieldElement d(ECFieldElement ecfieldelement)
    {
        return new <init>(b, a.multiply(ecfieldelement.a().modInverse(b)).mod(b));
    }

    public final ECFieldElement e()
    {
        return new <init>(b, a.modInverse(b));
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (!b.equals(((b) (obj)).b) || !a.equals(((a) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final ECFieldElement f()
    {
        if (!b.testBit(0))
        {
            throw new RuntimeException("not done yet");
        }
        if (b.testBit(1))
        {
            a a1 = new <init>(b, a.modPow(b.shiftRight(2).add(ECConstants.g), b));
            if (a1.d().equals(this))
            {
                return a1;
            } else
            {
                return null;
            }
        }
        BigInteger biginteger = b.subtract(ECConstants.g);
        BigInteger biginteger2 = biginteger.shiftRight(1);
        if (!a.modPow(biginteger2, b).equals(ECConstants.g))
        {
            return null;
        }
        BigInteger biginteger3 = biginteger.shiftRight(2).shiftLeft(1).add(ECConstants.g);
        BigInteger biginteger4 = a;
        BigInteger biginteger5 = biginteger4.shiftLeft(2).mod(b);
        Random random = new Random();
        BigInteger biginteger6;
        do
        {
            BigInteger biginteger1;
            do
            {
                biginteger1 = new BigInteger(b.bitLength(), random);
            } while (biginteger1.compareTo(b) >= 0 || !biginteger1.multiply(biginteger1).subtract(biginteger5).modPow(biginteger2, b).equals(biginteger));
            BigInteger abiginteger[] = a(b, biginteger1, biginteger4, biginteger3);
            biginteger6 = abiginteger[0];
            abiginteger = abiginteger[1];
            if (abiginteger.multiply(abiginteger).mod(b).equals(biginteger5))
            {
                biginteger = abiginteger;
                if (abiginteger.testBit(0))
                {
                    biginteger = abiginteger.add(b);
                }
                biginteger = biginteger.shiftRight(1);
                return new <init>(b, biginteger);
            }
        } while (biginteger6.equals(ECConstants.g) || biginteger6.equals(biginteger));
        return null;
    }

    public int hashCode()
    {
        return b.hashCode() ^ a.hashCode();
    }

    public (BigInteger biginteger, BigInteger biginteger1)
    {
        a = biginteger1;
        if (biginteger1.compareTo(biginteger) >= 0)
        {
            throw new IllegalArgumentException("x value too large in field element");
        } else
        {
            b = biginteger;
            return;
        }
    }
}
