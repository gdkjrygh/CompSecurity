// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.KeySpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyFactory, JDKDSAPrivateKey, JDKDSAPublicKey

public static class  extends JDKKeyFactory
{

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof DSAPrivateKeySpec)
        {
            return new JDKDSAPrivateKey((DSAPrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof DSAPublicKeySpec)
        {
            return new JDKDSAPublicKey((DSAPublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    public ()
    {
    }
}
