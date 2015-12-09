// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;


// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            BannerAdActivity

final class a
    implements Runnable
{

    private BannerAdActivity a;

    public final void run()
    {
        BannerAdActivity.a(a, "TIMED_OUT Load milliseconds exceeded 5000");
        BannerAdActivity.c(a);
    }

    (BannerAdActivity banneradactivity)
    {
        a = banneradactivity;
        super();
    }
}
