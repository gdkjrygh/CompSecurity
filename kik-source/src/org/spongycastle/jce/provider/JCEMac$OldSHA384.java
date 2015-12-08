// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.macs.OldHMac;

// Referenced classes of package org.spongycastle.jce.provider:
//            JCEMac

public static class nit> extends JCEMac
{

    public ()
    {
        super(new OldHMac(new SHA384Digest()));
    }
}
