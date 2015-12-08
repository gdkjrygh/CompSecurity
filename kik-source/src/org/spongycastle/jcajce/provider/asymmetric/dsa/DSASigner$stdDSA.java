// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dsa;

import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.signers.DSASigner;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.dsa:
//            DSASigner

public static class  extends org.spongycastle.jcajce.provider.asymmetric.dsa.DSASigner
{

    public ()
    {
        super(new SHA1Digest(), new DSASigner());
    }
}
