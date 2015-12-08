// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.signers.ECNRSigner;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            SignatureSpi

public static class it> extends SignatureSpi
{

    public ()
    {
        super(new SHA1Digest(), new ECNRSigner(), new it>((byte)0));
    }
}
