// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.signers.DSASigner;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dsa:
//            DSASigner

public static class  extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner
{

    public ()
    {
        super(new SHA1Digest(), new DSASigner());
    }
}
