// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.RIPEMD128Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest, RIPEMD128

public static class init> extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
        throws CloneNotSupportedException
    {
        init> init> = (init>)super.clone();
        init>.digest = new RIPEMD128Digest((RIPEMD128Digest)digest);
        return init>;
    }

    public ()
    {
        super(new RIPEMD128Digest());
    }
}
