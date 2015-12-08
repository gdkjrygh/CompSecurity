// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.DSAKeyPairGenerator;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyPairGenerator, JDKDSAPublicKey, JDKDSAPrivateKey

public static class f extends JDKKeyPairGenerator
{

    DSAKeyGenerationParameters a;
    DSAKeyPairGenerator b;
    int c;
    int d;
    SecureRandom e;
    boolean f;

    public KeyPair generateKeyPair()
    {
        if (!f)
        {
            DSAParametersGenerator dsaparametersgenerator = new DSAParametersGenerator();
            dsaparametersgenerator.init(c, d, e);
            a = new DSAKeyGenerationParameters(e, dsaparametersgenerator.generateParameters());
            b.init(a);
            f = true;
        }
        Object obj = b.generateKeyPair();
        DSAPublicKeyParameters dsapublickeyparameters = (DSAPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (DSAPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new KeyPair(new JDKDSAPublicKey(dsapublickeyparameters), new JDKDSAPrivateKey(((DSAPrivateKeyParameters) (obj))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        if (i < 512 || i > 1024 || i % 64 != 0)
        {
            throw new InvalidParameterException("strength must be from 512 - 1024 and a multiple of 64");
        } else
        {
            c = i;
            e = securerandom;
            return;
        }
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof DSAParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        } else
        {
            algorithmparameterspec = (DSAParameterSpec)algorithmparameterspec;
            a = new DSAKeyGenerationParameters(securerandom, new DSAParameters(algorithmparameterspec.getP(), algorithmparameterspec.getQ(), algorithmparameterspec.getG()));
            b.init(a);
            f = true;
            return;
        }
    }

    public ()
    {
        super("DSA");
        b = new DSAKeyPairGenerator();
        c = 1024;
        d = 20;
        e = new SecureRandom();
        f = false;
    }
}
