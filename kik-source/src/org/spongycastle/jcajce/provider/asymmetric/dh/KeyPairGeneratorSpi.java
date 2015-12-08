// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.spongycastle.crypto.generators.DHParametersGenerator;
import org.spongycastle.crypto.params.DHKeyGenerationParameters;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.dh:
//            BCDHPublicKey, BCDHPrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    private static Hashtable g = new Hashtable();
    DHKeyGenerationParameters a;
    DHBasicKeyPairGenerator b;
    int c;
    int d;
    SecureRandom e;
    boolean f;

    public KeyPairGeneratorSpi()
    {
        super("DH");
        b = new DHBasicKeyPairGenerator();
        c = 1024;
        d = 20;
        e = new SecureRandom();
        f = false;
    }

    public KeyPair generateKeyPair()
    {
        if (!f)
        {
            Object obj = new Integer(c);
            Object obj1;
            if (g.containsKey(obj))
            {
                a = (DHKeyGenerationParameters)g.get(obj);
            } else
            {
                DHParameterSpec dhparameterspec = BouncyCastleProvider.b.b();
                if (dhparameterspec != null && dhparameterspec.getP().bitLength() == c)
                {
                    a = new DHKeyGenerationParameters(e, new DHParameters(dhparameterspec.getP(), dhparameterspec.getG(), dhparameterspec.getL()));
                } else
                {
                    DHParametersGenerator dhparametersgenerator = new DHParametersGenerator();
                    dhparametersgenerator.a(c, d, e);
                    a = new DHKeyGenerationParameters(e, dhparametersgenerator.a());
                    g.put(obj, a);
                }
            }
            b.a(a);
            f = true;
        }
        obj1 = b.a();
        obj = (DHPublicKeyParameters)((AsymmetricCipherKeyPair) (obj1)).a();
        obj1 = (DHPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj1)).b();
        return new KeyPair(new BCDHPublicKey(((DHPublicKeyParameters) (obj))), new BCDHPrivateKey(((DHPrivateKeyParameters) (obj1))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        c = i;
        e = securerandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof DHParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        } else
        {
            algorithmparameterspec = (DHParameterSpec)algorithmparameterspec;
            a = new DHKeyGenerationParameters(securerandom, new DHParameters(algorithmparameterspec.getP(), algorithmparameterspec.getG(), algorithmparameterspec.getL()));
            b.a(a);
            f = true;
            return;
        }
    }

}
