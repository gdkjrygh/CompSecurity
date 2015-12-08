// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.util.BigIntegers;

public class DSAKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private DSAKeyGenerationParameters param;

    public DSAKeyPairGenerator()
    {
    }

    private static BigInteger calculatePublicKey(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        return biginteger1.modPow(biginteger2, biginteger);
    }

    private static BigInteger generatePrivateKey(BigInteger biginteger, SecureRandom securerandom)
    {
        return BigIntegers.createRandomInRange(ONE, biginteger.subtract(ONE), securerandom);
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        DSAParameters dsaparameters = param.getParameters();
        BigInteger biginteger = generatePrivateKey(dsaparameters.getQ(), param.getRandom());
        return new AsymmetricCipherKeyPair(new DSAPublicKeyParameters(calculatePublicKey(dsaparameters.getP(), dsaparameters.getG(), biginteger), dsaparameters), new DSAPrivateKeyParameters(biginteger, dsaparameters));
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        param = (DSAKeyGenerationParameters)keygenerationparameters;
    }

}
