// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.MD4Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jce.provider.JCEMac;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            MD4

public static class _cls9 extends JCEMac
{

    public _cls9()
    {
        super(new HMac(new MD4Digest()));
    }
}
