// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;
import org.bouncycastle.jce.spec.ElGamalPublicKeySpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyFactory, JCEElGamalPrivateKey, JCEElGamalPublicKey

public static class a extends JDKKeyFactory
{

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof ElGamalPrivateKeySpec)
        {
            return new JCEElGamalPrivateKey((ElGamalPrivateKeySpec)keyspec);
        }
        if (keyspec instanceof DHPrivateKeySpec)
        {
            return new JCEElGamalPrivateKey((DHPrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof ElGamalPublicKeySpec)
        {
            return new JCEElGamalPublicKey((ElGamalPublicKeySpec)keyspec);
        }
        if (keyspec instanceof DHPublicKeySpec)
        {
            return new JCEElGamalPublicKey((DHPublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    public _cls9()
    {
        a = true;
    }
}
