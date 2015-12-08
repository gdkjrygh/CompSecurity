// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
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

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyPairGenerator, JCEDHPublicKey, JCEDHPrivateKey

public static class f extends JDKKeyPairGenerator
{

    private static Hashtable g = new Hashtable();
    DHKeyGenerationParameters a;
    DHBasicKeyPairGenerator b;
    int c;
    int d;
    SecureRandom e;
    boolean f;

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
                DHParametersGenerator dhparametersgenerator = new DHParametersGenerator();
                dhparametersgenerator.init(c, d, e);
                a = new DHKeyGenerationParameters(e, dhparametersgenerator.generateParameters());
                g.put(obj, a);
            }
            b.init(a);
            f = true;
        }
        obj1 = b.generateKeyPair();
        obj = (DHPublicKeyParameters)((AsymmetricCipherKeyPair) (obj1)).getPublic();
        obj1 = (DHPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj1)).getPrivate();
        return new KeyPair(new JCEDHPublicKey(((DHPublicKeyParameters) (obj))), new JCEDHPrivateKey(((DHPrivateKeyParameters) (obj1))));
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
            a = new DHKeyGenerationParameters(securerandom, new DHParameters(algorithmparameterspec.getP(), algorithmparameterspec.getG(), null, algorithmparameterspec.getL()));
            b.init(a);
            f = true;
            return;
        }
    }


    public rator()
    {
        super("DH");
        b = new DHBasicKeyPairGenerator();
        c = 1024;
        d = 20;
        e = new SecureRandom();
        f = false;
    }
}
