// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.generators.RSAKeyPairGenerator;
import org.spongycastle.crypto.params.RSAKeyGenerationParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            BCRSAPublicKey, BCRSAPrivateCrtKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    static final BigInteger a = BigInteger.valueOf(0x10001L);
    RSAKeyGenerationParameters b;
    RSAKeyPairGenerator c;

    public KeyPairGeneratorSpi()
    {
        super("RSA");
        c = new RSAKeyPairGenerator();
        b = new RSAKeyGenerationParameters(a, new SecureRandom(), 2048);
        c.a(b);
    }

    public KeyPair generateKeyPair()
    {
        Object obj = c.a();
        RSAKeyParameters rsakeyparameters = (RSAKeyParameters)((AsymmetricCipherKeyPair) (obj)).a();
        obj = (RSAPrivateCrtKeyParameters)((AsymmetricCipherKeyPair) (obj)).b();
        return new KeyPair(new BCRSAPublicKey(rsakeyparameters), new BCRSAPrivateCrtKey(((RSAPrivateCrtKeyParameters) (obj))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        b = new RSAKeyGenerationParameters(a, securerandom, i);
        c.a(b);
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof RSAKeyGenParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        } else
        {
            algorithmparameterspec = (RSAKeyGenParameterSpec)algorithmparameterspec;
            b = new RSAKeyGenerationParameters(algorithmparameterspec.getPublicExponent(), securerandom, algorithmparameterspec.getKeysize());
            c.a(b);
            return;
        }
    }

}
