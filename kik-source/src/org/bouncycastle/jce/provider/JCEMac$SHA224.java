// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.macs.HMac;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEMac

public static class  extends JCEMac
{

    public ()
    {
        super(new HMac(new SHA224Digest()));
    }
}
