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

    private static BigInteger a = BigInteger.valueOf(0L);
    private static BigInteger b = BigInteger.valueOf(1L);
    private RSAKeyParameters c;
    private SecureRandom d;

    public RSABlindingFactorGenerator()
    {
    }

    public BigInteger generateBlindingFactor()
    {
        if (c == null)
        {
            throw new IllegalStateException("generator not initialised");
        }
        BigInteger biginteger = c.getModulus();
        int i = biginteger.bitLength();
        BigInteger biginteger1;
        BigInteger biginteger2;
        do
        {
            biginteger1 = new BigInteger(i - 1, d);
            biginteger2 = biginteger1.gcd(biginteger);
        } while (biginteger1.equals(a) || biginteger1.equals(b) || !biginteger2.equals(b));
        return biginteger1;
    }

    public void init(CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            c = (RSAKeyParameters)cipherparameters.getParameters();
            d = cipherparameters.getRandom();
        } else
        {
            c = (RSAKeyParameters)cipherparameters;
            d = new SecureRandom();
        }
        if (c instanceof RSAPrivateCrtKeyParameters)
        {
            throw new IllegalArgumentException("generator requires RSA public key");
        } else
        {
            return;
        }
    }

}
