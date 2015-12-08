// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyPairGenerator, JCERSAPublicKey, JCERSAPrivateCrtKey

public static class b extends JDKKeyPairGenerator
{

    static final BigInteger a = BigInteger.valueOf(0x10001L);
    RSAKeyGenerationParameters b;
    RSAKeyPairGenerator c;

    public KeyPair generateKeyPair()
    {
        Object obj = c.generateKeyPair();
        RSAKeyParameters rsakeyparameters = (RSAKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (RSAPrivateCrtKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new KeyPair(new JCERSAPublicKey(rsakeyparameters), new JCERSAPrivateCrtKey(((RSAPrivateCrtKeyParameters) (obj))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        b = new RSAKeyGenerationParameters(a, securerandom, i, 12);
        c.init(b);
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof RSAKeyGenParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        } else
        {
            algorithmparameterspec = (RSAKeyGenParameterSpec)algorithmparameterspec;
            b = new RSAKeyGenerationParameters(algorithmparameterspec.getPublicExponent(), securerandom, algorithmparameterspec.getKeysize(), 12);
            c.init(b);
            return;
        }
    }


    public ()
    {
        super("RSA");
        c = new RSAKeyPairGenerator();
        b = new RSAKeyGenerationParameters(a, new SecureRandom(), 2048, 12);
        c.init(b);
    }
}
