// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.spec.GOST3410PrivateKeySpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeySpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyFactory, JDKGOST3410PrivateKey, JDKGOST3410PublicKey

public static class  extends JDKKeyFactory
{

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof GOST3410PrivateKeySpec)
        {
            return new JDKGOST3410PrivateKey((GOST3410PrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof GOST3410PublicKeySpec)
        {
            return new JDKGOST3410PublicKey((GOST3410PublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    public ()
    {
    }
}
