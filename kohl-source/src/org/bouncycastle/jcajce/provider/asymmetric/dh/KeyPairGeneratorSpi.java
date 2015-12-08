// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dh:
//            BCDHPublicKey, BCDHPrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    private static Hashtable params = new Hashtable();
    int certainty;
    DHBasicKeyPairGenerator engine;
    boolean initialised;
    DHKeyGenerationParameters param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi()
    {
        super("DH");
        engine = new DHBasicKeyPairGenerator();
        strength = 1024;
        certainty = 20;
        random = new SecureRandom();
        initialised = false;
    }

    public KeyPair generateKeyPair()
    {
        if (!initialised)
        {
            Object obj = new Integer(strength);
            Object obj1;
            if (params.containsKey(obj))
            {
                param = (DHKeyGenerationParameters)params.get(obj);
            } else
            {
                DHParameterSpec dhparameterspec = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters();
                if (dhparameterspec != null && dhparameterspec.getP().bitLength() == strength)
                {
                    param = new DHKeyGenerationParameters(random, new DHParameters(dhparameterspec.getP(), dhparameterspec.getG(), null, dhparameterspec.getL()));
                } else
                {
                    DHParametersGenerator dhparametersgenerator = new DHParametersGenerator();
                    dhparametersgenerator.init(strength, certainty, random);
                    param = new DHKeyGenerationParameters(random, dhparametersgenerator.generateParameters());
                    params.put(obj, param);
                }
            }
            engine.init(param);
            initialised = true;
        }
        obj1 = engine.generateKeyPair();
        obj = (DHPublicKeyParameters)((AsymmetricCipherKeyPair) (obj1)).getPublic();
        obj1 = (DHPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj1)).getPrivate();
        return new KeyPair(new BCDHPublicKey(((DHPublicKeyParameters) (obj))), new BCDHPrivateKey(((DHPrivateKeyParameters) (obj1))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        strength = i;
        random = securerandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidAlgorithmParameterException
    {
        if (!(algorithmparameterspec instanceof DHParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        } else
        {
            algorithmparameterspec = (DHParameterSpec)algorithmparameterspec;
            param = new DHKeyGenerationParameters(securerandom, new DHParameters(algorithmparameterspec.getP(), algorithmparameterspec.getG(), null, algorithmparameterspec.getL()));
            engine.init(param);
            initialised = true;
            return;
        }
    }

}
