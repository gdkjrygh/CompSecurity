// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jce.provider.JCEMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            MD5

public static class _cls9 extends JCEMac
{

    public _cls9()
    {
        super(new HMac(new MD5Digest()));
    }
}
