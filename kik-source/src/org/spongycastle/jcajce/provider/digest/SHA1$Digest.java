// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.SHA1Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, SHA1

public static class est extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        est est = (est)super.clone();
        est.a = new SHA1Digest((SHA1Digest)a);
        return est;
    }

    public est()
    {
        super(new SHA1Digest());
    }
}
