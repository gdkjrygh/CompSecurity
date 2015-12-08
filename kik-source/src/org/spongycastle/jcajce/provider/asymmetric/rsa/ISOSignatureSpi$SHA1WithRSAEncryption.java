// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            ISOSignatureSpi

public static class  extends ISOSignatureSpi
{

    public ()
    {
        super(new SHA1Digest(), new RSABlindedEngine());
    }
}
