// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.internal.adapters.c;

// Referenced classes of package com.facebook.ads:
//            NativeAd, ImpressionListener

class <init> extends c
{

    final NativeAd a;

    public boolean a()
    {
        return false;
    }

    public void d()
    {
        if (NativeAd.k(a) != null)
        {
            NativeAd.k(a).onLoggingImpression(a);
        }
        if ((NativeAd.a(a) instanceof ImpressionListener) && NativeAd.a(a) != NativeAd.k(a))
        {
            ((ImpressionListener)NativeAd.a(a)).onLoggingImpression(a);
        }
    }

    public void e()
    {
    }

    private istener(NativeAd nativead)
    {
        a = nativead;
        super();
    }

    apters.c(NativeAd nativead, apters.c c1)
    {
        this(nativead);
    }
}
