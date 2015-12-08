// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            CipherParameters

public class AsymmetricCipherKeyPair
{

    private CipherParameters a;
    private CipherParameters b;

    public AsymmetricCipherKeyPair(CipherParameters cipherparameters, CipherParameters cipherparameters1)
    {
        a = cipherparameters;
        b = cipherparameters1;
    }

    public CipherParameters getPrivate()
    {
        return b;
    }

    public CipherParameters getPublic()
    {
        return a;
    }
}
