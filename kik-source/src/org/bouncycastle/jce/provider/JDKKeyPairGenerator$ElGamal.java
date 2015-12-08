// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.ElGamalKeyPairGenerator;
import org.bouncycastle.crypto.generators.ElGamalParametersGenerator;
import org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyPairGenerator, JCEElGamalPublicKey, JCEElGamalPrivateKey

public static class f extends JDKKeyPairGenerator
{

    ElGamalKeyGenerationParameters a;
    ElGamalKeyPairGenerator b;
    int c;
    int d;
    SecureRandom e;
    boolean f;

    public KeyPair generateKeyPair()
    {
        if (!f)
        {
            ElGamalParametersGenerator elgamalparametersgenerator = new ElGamalParametersGenerator();
            elgamalparametersgenerator.init(c, d, e);
            a = new ElGamalKeyGenerationParameters(e, elgamalparametersgenerator.generateParameters());
            b.init(a);
            f = true;
        }
        Object obj = b.generateKeyPair();
        ElGamalPublicKeyParameters elgamalpublickeyparameters = (ElGamalPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (ElGamalPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new KeyPair(new JCEElGamalPublicKey(elgamalpublickeyparameters), new JCEElGamalPrivateKey(((ElGamalPrivateKeyParameters) (obj))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        c = i;
        e = securerandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof ElGamalParameterSpec) && !(algorithmparameterspec instanceof DHParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
        }
        if (algorithmparameterspec instanceof ElGamalParameterSpec)
        {
            algorithmparameterspec = (ElGamalParameterSpec)algorithmparameterspec;
            a = new ElGamalKeyGenerationParameters(securerandom, new ElGamalParameters(algorithmparameterspec.a(), algorithmparameterspec.b()));
        } else
        {
            algorithmparameterspec = (DHParameterSpec)algorithmparameterspec;
            a = new ElGamalKeyGenerationParameters(securerandom, new ElGamalParameters(algorithmparameterspec.getP(), algorithmparameterspec.getG(), algorithmparameterspec.getL()));
        }
        b.init(a);
        f = true;
    }

    public ()
    {
        super("ElGamal");
        b = new ElGamalKeyPairGenerator();
        c = 1024;
        d = 20;
        e = new SecureRandom();
        f = false;
    }
}
