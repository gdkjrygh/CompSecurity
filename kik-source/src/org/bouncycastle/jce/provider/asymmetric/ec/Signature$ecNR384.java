// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.asymmetric.ec;

import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.signers.ECNRSigner;

// Referenced classes of package org.bouncycastle.jce.provider.asymmetric.ec:
//            Signature

public static class  extends Signature
{

    public ()
    {
        super(new SHA384Digest(), new ECNRSigner(), new ((byte)0));
    }
}
