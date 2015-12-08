// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class RSABlindingFactorGenerator
{

    private static BigInteger ONE = BigInteger.valueOf(1L);
    private static BigInteger ZERO = BigInteger.valueOf(0L);
    private RSAKeyParameters key;
    private SecureRandom random;

    public RSABlindingFactorGenerator()
    {
    }

    public BigInteger generateBlindingFactor()
    {
        if (key == null)
        {
            throw new IllegalStateException("generator not initialised");
        }
        BigInteger biginteger = key.getModulus();
        int i = biginteger.bitLength();
        BigInteger biginteger1;
        BigInteger biginteger2;
        do
        {
            biginteger1 = new BigInteger(i - 1, random);
            biginteger2 = biginteger1.gcd(biginteger);
        } while (biginteger1.equals(ZERO) || biginteger1.equals(ONE) || !biginteger2.equals(ONE));
        return biginteger1;
    }

    public void init(CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            key = (RSAKeyParameters)cipherparameters.getParameters();
            random = cipherparameters.getRandom();
        } else
        {
            key = (RSAKeyParameters)cipherparameters;
            random = new SecureRandom();
        }
        if (key instanceof RSAPrivateCrtKeyParameters)
        {
            throw new IllegalArgumentException("generator requires RSA public key");
        } else
        {
            return;
        }
    }

}
