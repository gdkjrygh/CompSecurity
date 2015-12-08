// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCESecretKeyFactory

public static class leDES_CBC extends leDES_CBC
{

    public ()
    {
        super("PBEwithSHAandDES3Key-CBC", PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, true, 2, 1, 192, 64);
    }
}
