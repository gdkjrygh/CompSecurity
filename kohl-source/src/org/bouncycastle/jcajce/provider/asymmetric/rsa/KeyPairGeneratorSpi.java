// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.rsa:
//            BCRSAPublicKey, BCRSAPrivateCrtKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    static final BigInteger defaultPublicExponent = BigInteger.valueOf(0x10001L);
    static final int defaultTests = 12;
    RSAKeyPairGenerator engine;
    RSAKeyGenerationParameters param;

    public KeyPairGeneratorSpi()
    {
        super("RSA");
        engine = new RSAKeyPairGenerator();
        param = new RSAKeyGenerationParameters(defaultPublicExponent, new SecureRandom(), 2048, 12);
        engine.init(param);
    }

    public KeyPairGeneratorSpi(String s)
    {
        super(s);
    }

    public KeyPair generateKeyPair()
    {
        Object obj = engine.generateKeyPair();
        RSAKeyParameters rsakeyparameters = (RSAKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (RSAPrivateCrtKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new KeyPair(new BCRSAPublicKey(rsakeyparameters), new BCRSAPrivateCrtKey(((RSAPrivateCrtKeyParameters) (obj))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        param = new RSAKeyGenerationParameters(defaultPublicExponent, securerandom, i, 12);
        engine.init(param);
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidAlgorithmParameterException
    {
        if (!(algorithmparameterspec instanceof RSAKeyGenParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        } else
        {
            algorithmparameterspec = (RSAKeyGenParameterSpec)algorithmparameterspec;
            param = new RSAKeyGenerationParameters(algorithmparameterspec.getPublicExponent(), securerandom, algorithmparameterspec.getKeysize(), 12);
            engine.init(param);
            return;
        }
    }

}
