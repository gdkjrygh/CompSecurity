// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class BigIntegers
{

    private static final BigInteger a = BigInteger.valueOf(0L);

    public BigIntegers()
    {
    }

    public static BigInteger a(BigInteger biginteger, BigInteger biginteger1, SecureRandom securerandom)
    {
label0:
        {
            int i = biginteger.compareTo(biginteger1);
            if (i >= 0)
            {
                if (i > 0)
                {
                    throw new IllegalArgumentException("'min' may not be greater than 'max'");
                }
            } else
            {
                if (biginteger.bitLength() <= biginteger1.bitLength() / 2)
                {
                    break label0;
                }
                biginteger = a(a, biginteger1.subtract(biginteger), securerandom).add(biginteger);
            }
            return biginteger;
        }
        for (int j = 0; j < 1000; j++)
        {
            BigInteger biginteger2 = new BigInteger(biginteger1.bitLength(), securerandom);
            if (biginteger2.compareTo(biginteger) >= 0 && biginteger2.compareTo(biginteger1) <= 0)
            {
                return biginteger2;
            }
        }

        return (new BigInteger(biginteger1.subtract(biginteger).bitLength() - 1, securerandom)).add(biginteger);
    }

    public static byte[] a(BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (biginteger[0] == 0)
        {
            byte abyte0[] = new byte[biginteger.length - 1];
            System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
            return abyte0;
        } else
        {
            return biginteger;
        }
    }

}
