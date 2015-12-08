// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECFieldElement, ECConstants

public static class q extends ECFieldElement
{

    BigInteger q;
    BigInteger x;

    private static BigInteger[] lucasSequence(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
    {
        int i = biginteger3.bitLength();
        int k = biginteger3.getLowestSetBit();
        BigInteger biginteger6 = ECConstants.ONE;
        BigInteger biginteger5 = ECConstants.TWO;
        BigInteger biginteger8 = ECConstants.ONE;
        BigInteger biginteger7 = ECConstants.ONE;
        i--;
        BigInteger biginteger4 = biginteger1;
        while (i >= k + 1) 
        {
            biginteger8 = biginteger8.multiply(biginteger7).mod(biginteger);
            BigInteger biginteger10;
            BigInteger biginteger11;
            if (biginteger3.testBit(i))
            {
                BigInteger biginteger9 = biginteger8.multiply(biginteger2).mod(biginteger);
                biginteger6 = biginteger6.multiply(biginteger4).mod(biginteger);
                biginteger5 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger8)).mod(biginteger);
                biginteger7 = biginteger4.multiply(biginteger4).subtract(biginteger9.shiftLeft(1)).mod(biginteger);
                biginteger4 = biginteger6;
                biginteger6 = biginteger5;
                biginteger5 = biginteger9;
            } else
            {
                biginteger6 = biginteger6.multiply(biginteger5).subtract(biginteger8).mod(biginteger);
                biginteger7 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger8)).mod(biginteger);
                biginteger5 = biginteger5.multiply(biginteger5).subtract(biginteger8.shiftLeft(1)).mod(biginteger);
                biginteger4 = biginteger6;
                biginteger6 = biginteger5;
                biginteger5 = biginteger8;
            }
            i--;
            biginteger10 = biginteger7;
            biginteger11 = biginteger6;
            biginteger7 = biginteger5;
            biginteger6 = biginteger4;
            biginteger4 = biginteger10;
            biginteger5 = biginteger11;
        }
        biginteger7 = biginteger8.multiply(biginteger7).mod(biginteger);
        biginteger8 = biginteger7.multiply(biginteger2).mod(biginteger);
        biginteger2 = biginteger6.multiply(biginteger5).subtract(biginteger7).mod(biginteger);
        biginteger3 = biginteger4.multiply(biginteger5).subtract(biginteger1.multiply(biginteger7)).mod(biginteger);
        biginteger4 = biginteger7.multiply(biginteger8).mod(biginteger);
        biginteger1 = biginteger2;
        biginteger2 = biginteger3;
        biginteger3 = biginteger4;
        for (int j = 1; j <= k; j++)
        {
            biginteger1 = biginteger1.multiply(biginteger2).mod(biginteger);
            biginteger2 = biginteger2.multiply(biginteger2).subtract(biginteger3.shiftLeft(1)).mod(biginteger);
            biginteger3 = biginteger3.multiply(biginteger3).mod(biginteger);
        }

        return (new BigInteger[] {
            biginteger1, biginteger2
        });
    }

    public ECFieldElement add(ECFieldElement ecfieldelement)
    {
        return new <init>(q, x.add(ecfieldelement.toBigInteger()).mod(q));
    }

    public ECFieldElement divide(ECFieldElement ecfieldelement)
    {
        return new <init>(q, x.multiply(ecfieldelement.toBigInteger().modInverse(q)).mod(q));
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof q))
            {
                return false;
            }
            obj = (q)obj;
            if (!q.equals(((q) (obj)).q) || !x.equals(((x) (obj)).x))
            {
                return false;
            }
        }
        return true;
    }

    public String getFieldName()
    {
        return "Fp";
    }

    public int getFieldSize()
    {
        return q.bitLength();
    }

    public BigInteger getQ()
    {
        return q;
    }

    public int hashCode()
    {
        return q.hashCode() ^ x.hashCode();
    }

    public ECFieldElement invert()
    {
        return new <init>(q, x.modInverse(q));
    }

    public ECFieldElement multiply(ECFieldElement ecfieldelement)
    {
        return new <init>(q, x.multiply(ecfieldelement.toBigInteger()).mod(q));
    }

    public ECFieldElement negate()
    {
        return new <init>(q, x.negate().mod(q));
    }

    public ECFieldElement sqrt()
    {
        q q1 = null;
        if (!q.testBit(0))
        {
            throw new RuntimeException("not done yet");
        }
        if (q.testBit(1))
        {
            q1 = new <init>(q, x.modPow(q.shiftRight(2).add(ECConstants.ONE), q));
            if (!q1.square().equals(this))
            {
                q1 = null;
            }
        } else
        {
            BigInteger biginteger3 = q.subtract(ECConstants.ONE);
            BigInteger biginteger4 = biginteger3.shiftRight(1);
            if (x.modPow(biginteger4, q).equals(ECConstants.ONE))
            {
                BigInteger biginteger = biginteger3.shiftRight(2).shiftLeft(1).add(ECConstants.ONE);
                BigInteger biginteger5 = x;
                BigInteger biginteger6 = biginteger5.shiftLeft(2).mod(q);
                Random random = new Random();
                BigInteger biginteger7;
                do
                {
                    BigInteger biginteger2;
                    do
                    {
                        biginteger2 = new BigInteger(q.bitLength(), random);
                    } while (biginteger2.compareTo(q) >= 0 || !biginteger2.multiply(biginteger2).subtract(biginteger6).modPow(biginteger4, q).equals(biginteger3));
                    BigInteger abiginteger[] = lucasSequence(q, biginteger2, biginteger5, biginteger);
                    biginteger7 = abiginteger[0];
                    abiginteger = abiginteger[1];
                    if (abiginteger.multiply(abiginteger).mod(q).equals(biginteger6))
                    {
                        BigInteger biginteger1 = abiginteger;
                        if (abiginteger.testBit(0))
                        {
                            biginteger1 = abiginteger.add(q);
                        }
                        biginteger1 = biginteger1.shiftRight(1);
                        return new <init>(q, biginteger1);
                    }
                } while (biginteger7.equals(ECConstants.ONE) || biginteger7.equals(biginteger3));
                return null;
            }
        }
        return q1;
    }

    public ECFieldElement square()
    {
        return new <init>(q, x.multiply(x).mod(q));
    }

    public ECFieldElement subtract(ECFieldElement ecfieldelement)
    {
        return new <init>(q, x.subtract(ecfieldelement.toBigInteger()).mod(q));
    }

    public BigInteger toBigInteger()
    {
        return x;
    }

    public (BigInteger biginteger, BigInteger biginteger1)
    {
        x = biginteger1;
        if (biginteger1.compareTo(biginteger) >= 0)
        {
            throw new IllegalArgumentException("x value too large in field element");
        } else
        {
            q = biginteger;
            return;
        }
    }
}
