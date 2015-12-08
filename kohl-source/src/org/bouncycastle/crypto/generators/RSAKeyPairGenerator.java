// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class RSAKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private RSAKeyGenerationParameters param;

    public RSAKeyPairGenerator()
    {
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        int i = param.getStrength();
        int j = (i + 1) / 2;
        int k = i / 3;
        BigInteger biginteger4 = param.getPublicExponent();
        BigInteger biginteger;
        do
        {
            biginteger = new BigInteger(j, 1, param.getRandom());
        } while (biginteger.mod(biginteger4).equals(ONE) || !biginteger.isProbablePrime(param.getCertainty()) || !biginteger4.gcd(biginteger.subtract(ONE)).equals(ONE));
        do
        {
            BigInteger biginteger1;
            do
            {
                biginteger1 = new BigInteger(i - j, 1, param.getRandom());
            } while (biginteger1.subtract(biginteger).abs().bitLength() < k || biginteger1.mod(biginteger4).equals(ONE) || !biginteger1.isProbablePrime(param.getCertainty()) || !biginteger4.gcd(biginteger1.subtract(ONE)).equals(ONE));
            BigInteger biginteger5 = biginteger.multiply(biginteger1);
            if (biginteger5.bitLength() == param.getStrength())
            {
                if (biginteger.compareTo(biginteger1) < 0)
                {
                    BigInteger biginteger2 = biginteger1;
                    biginteger1 = biginteger;
                    biginteger = biginteger2;
                }
                BigInteger biginteger6 = biginteger.subtract(ONE);
                BigInteger biginteger7 = biginteger1.subtract(ONE);
                BigInteger biginteger3 = biginteger4.modInverse(biginteger6.multiply(biginteger7));
                biginteger6 = biginteger3.remainder(biginteger6);
                biginteger7 = biginteger3.remainder(biginteger7);
                BigInteger biginteger8 = biginteger1.modInverse(biginteger);
                return new AsymmetricCipherKeyPair(new RSAKeyParameters(false, biginteger5, biginteger4), new RSAPrivateCrtKeyParameters(biginteger5, biginteger4, biginteger3, biginteger, biginteger1, biginteger6, biginteger7, biginteger8));
            }
            biginteger = biginteger.max(biginteger1);
        } while (true);
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        param = (RSAKeyGenerationParameters)keygenerationparameters;
    }

}
