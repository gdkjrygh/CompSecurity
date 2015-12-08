// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bq, bp

public class bz extends bu.a
{

    private final com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener a;

    public bz(com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
    {
        a = oncontentadloadedlistener;
    }

    public void a(bp bp)
    {
        a.onContentAdLoaded(b(bp));
    }

    bq b(bp bp)
    {
        return new bq(bp);
    }
}
