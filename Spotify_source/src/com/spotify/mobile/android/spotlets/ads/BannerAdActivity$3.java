// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.view.View;
import edq;
import fop;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            BannerAdActivity

final class a
    implements android.view.r
{

    private BannerAdActivity a;

    public final void onClick(View view)
    {
        BannerAdActivity.b(a);
        fop.a(a, BannerAdActivity.a(a).a("background", a.f()));
        BannerAdActivity.c(a);
    }

    (BannerAdActivity banneradactivity)
    {
        a = banneradactivity;
        super();
    }
}
