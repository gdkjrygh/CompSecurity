// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.internal.adapters.k;

// Referenced classes of package com.facebook.ads:
//            NativeAd, f

private class <init> extends k
{

    final NativeAd a;

    public boolean a()
    {
        return false;
    }

    public void b()
    {
        if (NativeAd.i(a) != null)
        {
            NativeAd.i(a).a(a);
        }
        if ((NativeAd.a(a) instanceof f) && NativeAd.a(a) != NativeAd.i(a))
        {
            ((f)NativeAd.a(a)).a(a);
        }
    }

    public void c()
    {
    }

    private apters.k(NativeAd nativead)
    {
        a = nativead;
        super();
    }

    apters.k(NativeAd nativead, apters.k k1)
    {
        this(nativead);
    }
}
