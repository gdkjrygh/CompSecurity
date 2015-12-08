// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCESecretKeyFactory

public static class BC extends BC
{

    public ()
    {
        super("PBEwithMD5andDES", PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC, true, 0, 0, 64, 64);
    }
}
