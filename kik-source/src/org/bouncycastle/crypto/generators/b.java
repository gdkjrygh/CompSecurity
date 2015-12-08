// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.BigIntegers;

final class b
{

    private static final BigInteger a = BigInteger.valueOf(1L);
    private static final BigInteger b = BigInteger.valueOf(2L);

    b()
    {
    }

    static BigInteger[] generateSafePrimes(int i, int j, SecureRandom securerandom)
    {
        BigInteger biginteger;
        BigInteger biginteger1;
        do
        {
            biginteger = new BigInteger(i - 1, 2, securerandom);
            biginteger1 = biginteger.shiftLeft(1).add(a);
        } while (!biginteger1.isProbablePrime(j) || j > 2 && !biginteger.isProbablePrime(j));
        return (new BigInteger[] {
            biginteger1, biginteger
        });
    }

    static BigInteger selectGenerator(BigInteger biginteger, BigInteger biginteger1, SecureRandom securerandom)
    {
        biginteger1 = biginteger.subtract(b);
        BigInteger biginteger2;
        do
        {
            biginteger2 = BigIntegers.a(b, biginteger1, securerandom).modPow(b, biginteger);
        } while (biginteger2.equals(a));
        return biginteger2;
    }

}
