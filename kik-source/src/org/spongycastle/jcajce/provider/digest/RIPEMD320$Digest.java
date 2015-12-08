// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.RIPEMD320Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, RIPEMD320

public static class init> extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        init> init> = (init>)super.clone();
        init>.a = new RIPEMD320Digest((RIPEMD320Digest)a);
        return init>;
    }

    public ()
    {
        super(new RIPEMD320Digest());
    }
}
