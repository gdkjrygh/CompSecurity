// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

final class ang.Object
    implements android.view.nClickListener
{

    private eex a;

    public final void onClick(View view)
    {
        view = eff.c(a.j(), eex.c(a).getClickUrl());
        a.k().startActivity(view);
        ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).a(com.spotify.mobile.android.spotlets.ads.tReporter.Event.a, eex.c(a).getId());
    }

    (eex eex1)
    {
        a = eex1;
        super();
    }
}
