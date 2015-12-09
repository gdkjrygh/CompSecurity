// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.os.Handler;
import bem;
import com.spotify.mobile.android.ui.view.LoadingView;
import dnd;
import edq;
import fop;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            BannerAdActivity

final class a extends bem
{

    private BannerAdActivity a;

    public final void a()
    {
        super.a();
        BannerAdActivity.e(a).removeCallbacks(BannerAdActivity.d(a));
        BannerAdActivity.g();
        a.d.b();
        BannerAdActivity.b(a);
        BannerAdActivity banneradactivity = a;
        edq edq1 = BannerAdActivity.a(a);
        long l = a.f();
        fop.a(banneradactivity, new dnd(edq1.a, null, "event_viewed", "", edq1.b, l));
    }

    public final void a(int i)
    {
        super.a(i);
        BannerAdActivity.e(a).removeCallbacks(BannerAdActivity.d(a));
        i;
        JVM INSTR tableswitch 0 3: default 52
    //                   0 98
    //                   1 107
    //                   2 116
    //                   3 125;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s;
        String s1;
        s1 = "ERROR_CODE_UNKNOWN";
        s = "This error code was not listed on developer.android.com/reference/com/google/android/gms/ads/AdRequest.html";
_L7:
        s = (new StringBuilder()).append(s1).append(" ").append(s).toString();
        BannerAdActivity.a(a, s);
        BannerAdActivity.c(a);
        return;
_L2:
        s1 = "ERROR_CODE_INTERNAL_ERROR";
        s = "Something happened internally; for instance, an invalid response was received from the ad server.";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "ERROR_CODE_INVALID_REQUEST";
        s = "The ad request was invalid; for instance, the ad unit ID was incorrect.";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "ERROR_CODE_NETWORK_ERROR";
        s = "The ad request was unsuccessful due to network connectivity.";
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = "ERROR_CODE_NO_FILL";
        s = "The ad request was successful, but no ad was returned due to lack of ad inventory.";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b()
    {
        super.b();
        BannerAdActivity.b(a);
        BannerAdActivity banneradactivity = a;
        edq edq1 = BannerAdActivity.a(a);
        long l = a.f();
        fop.a(banneradactivity, new dnd(edq1.a, null, "event_clicked", "", edq1.b, l));
    }

    public final void c()
    {
        super.c();
    }

    public final void d()
    {
        super.d();
    }

    (BannerAdActivity banneradactivity)
    {
        a = banneradactivity;
        super();
    }
}
