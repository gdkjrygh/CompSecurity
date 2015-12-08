// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.signers.ECGOST3410Signer;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKGOST3410Signer

public static class  extends JDKGOST3410Signer
{

    public ()
    {
        super(new GOST3411Digest(), new ECGOST3410Signer());
    }
}
