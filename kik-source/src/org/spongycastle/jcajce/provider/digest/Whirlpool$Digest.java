// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.WhirlpoolDigest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, Whirlpool

public static class init> extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        init> init> = (init>)super.clone();
        init>.a = new WhirlpoolDigest((WhirlpoolDigest)a);
        return init>;
    }

    public ()
    {
        super(new WhirlpoolDigest());
    }
}
