// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.RSAKeyGenerationParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class RSAKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private static final BigInteger a = BigInteger.valueOf(1L);
    private RSAKeyGenerationParameters b;

    public RSAKeyPairGenerator()
    {
    }

    public final AsymmetricCipherKeyPair a()
    {
        int i = b.b();
        int j = (i + 1) / 2;
        int k = i / 3;
        BigInteger biginteger4 = b.c();
        BigInteger biginteger;
        do
        {
            biginteger = new BigInteger(j, 1, b.a());
        } while (biginteger.mod(biginteger4).equals(a) || !biginteger.isProbablePrime(b.d()) || !biginteger4.gcd(biginteger.subtract(a)).equals(a));
        BigInteger biginteger1;
        BigInteger biginteger5;
        do
        {
            do
            {
                biginteger1 = new BigInteger(i - j, 1, b.a());
            } while (biginteger1.subtract(biginteger).abs().bitLength() < k || biginteger1.mod(biginteger4).equals(a) || !biginteger1.isProbablePrime(b.d()) || !biginteger4.gcd(biginteger1.subtract(a)).equals(a));
            biginteger5 = biginteger.multiply(biginteger1);
            if (biginteger5.bitLength() == b.b())
            {
                break;
            }
            biginteger = biginteger.max(biginteger1);
        } while (true);
        if (biginteger.compareTo(biginteger1) < 0)
        {
            BigInteger biginteger2 = biginteger1;
            biginteger1 = biginteger;
            biginteger = biginteger2;
        }
        BigInteger biginteger6 = biginteger.subtract(a);
        BigInteger biginteger7 = biginteger1.subtract(a);
        BigInteger biginteger3 = biginteger4.modInverse(biginteger6.multiply(biginteger7));
        biginteger6 = biginteger3.remainder(biginteger6);
        biginteger7 = biginteger3.remainder(biginteger7);
        BigInteger biginteger8 = biginteger1.modInverse(biginteger);
        return new AsymmetricCipherKeyPair(new RSAKeyParameters(false, biginteger5, biginteger4), new RSAPrivateCrtKeyParameters(biginteger5, biginteger4, biginteger3, biginteger, biginteger1, biginteger6, biginteger7, biginteger8));
    }

    public final void a(KeyGenerationParameters keygenerationparameters)
    {
        b = (RSAKeyGenerationParameters)keygenerationparameters;
    }

}
