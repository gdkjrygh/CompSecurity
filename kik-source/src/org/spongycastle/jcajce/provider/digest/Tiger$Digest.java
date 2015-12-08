// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.TigerDigest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, Tiger

public static class st extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        st st = (st)super.clone();
        st.a = new TigerDigest((TigerDigest)a);
        return st;
    }

    public st()
    {
        super(new TigerDigest());
    }
}
