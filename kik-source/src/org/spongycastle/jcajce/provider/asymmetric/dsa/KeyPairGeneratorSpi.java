// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.generators.DSAKeyPairGenerator;
import org.spongycastle.crypto.generators.DSAParametersGenerator;
import org.spongycastle.crypto.params.DSAKeyGenerationParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.dsa:
//            BCDSAPublicKey, BCDSAPrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    DSAKeyGenerationParameters a;
    DSAKeyPairGenerator b;
    int c;
    int d;
    SecureRandom e;
    boolean f;

    public KeyPairGeneratorSpi()
    {
        super("DSA");
        b = new DSAKeyPairGenerator();
        c = 1024;
        d = 20;
        e = new SecureRandom();
        f = false;
    }

    public KeyPair generateKeyPair()
    {
        if (!f)
        {
            DSAParametersGenerator dsaparametersgenerator = new DSAParametersGenerator();
            dsaparametersgenerator.a(c, d, e);
            a = new DSAKeyGenerationParameters(e, dsaparametersgenerator.a());
            b.a(a);
            f = true;
        }
        Object obj = b.a();
        DSAPublicKeyParameters dsapublickeyparameters = (DSAPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).a();
        obj = (DSAPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).b();
        return new KeyPair(new BCDSAPublicKey(dsapublickeyparameters), new BCDSAPrivateKey(((DSAPrivateKeyParameters) (obj))));
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
            b.a(a);
            f = true;
            return;
        }
    }
}
