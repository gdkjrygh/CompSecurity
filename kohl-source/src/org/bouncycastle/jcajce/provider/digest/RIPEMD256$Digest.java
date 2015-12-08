// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.RIPEMD256Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest, RIPEMD256

public static class init> extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
        throws CloneNotSupportedException
    {
        init> init> = (init>)super.clone();
        init>.digest = new RIPEMD256Digest((RIPEMD256Digest)digest);
        return init>;
    }

    public ()
    {
        super(new RIPEMD256Digest());
    }
}
