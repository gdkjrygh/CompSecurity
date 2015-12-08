// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.generators.ElGamalKeyPairGenerator;
import org.spongycastle.crypto.generators.ElGamalParametersGenerator;
import org.spongycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.ElGamalPublicKeyParameters;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ElGamalParameterSpec;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.elgamal:
//            BCElGamalPublicKey, BCElGamalPrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    ElGamalKeyGenerationParameters a;
    ElGamalKeyPairGenerator b;
    int c;
    int d;
    SecureRandom e;
    boolean f;

    public KeyPairGeneratorSpi()
    {
        super("ElGamal");
        b = new ElGamalKeyPairGenerator();
        c = 1024;
        d = 20;
        e = new SecureRandom();
        f = false;
    }

    public KeyPair generateKeyPair()
    {
        if (!f)
        {
            Object obj = BouncyCastleProvider.b.b();
            Object obj1;
            if (obj != null && ((DHParameterSpec) (obj)).getP().bitLength() == c)
            {
                a = new ElGamalKeyGenerationParameters(e, new ElGamalParameters(((DHParameterSpec) (obj)).getP(), ((DHParameterSpec) (obj)).getG(), ((DHParameterSpec) (obj)).getL()));
            } else
            {
                ElGamalParametersGenerator elgamalparametersgenerator = new ElGamalParametersGenerator();
                elgamalparametersgenerator.a(c, d, e);
                a = new ElGamalKeyGenerationParameters(e, elgamalparametersgenerator.a());
            }
            b.a(a);
            f = true;
        }
        obj1 = b.a();
        obj = (ElGamalPublicKeyParameters)((AsymmetricCipherKeyPair) (obj1)).a();
        obj1 = (ElGamalPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj1)).b();
        return new KeyPair(new BCElGamalPublicKey(((ElGamalPublicKeyParameters) (obj))), new BCElGamalPrivateKey(((ElGamalPrivateKeyParameters) (obj1))));
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
        b.a(a);
        f = true;
    }
}
