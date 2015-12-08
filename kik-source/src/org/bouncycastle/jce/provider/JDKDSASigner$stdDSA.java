// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.signers.DSASigner;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKDSASigner

public static class  extends JDKDSASigner
{

    public ()
    {
        super(new SHA1Digest(), new DSASigner());
    }
}
