// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

final class a
    implements CustomEventBannerListener
{

    private final CustomEventAdapter a;
    private final MediationBannerListener b;

    public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        a = customeventadapter;
        b = mediationbannerlistener;
    }

    public final void onAdClicked()
    {
        zzb.zzaF("Custom event adapter called onAdClicked.");
        b.onAdClicked(a);
    }

    public final void onAdClosed()
    {
        zzb.zzaF("Custom event adapter called onAdClosed.");
        b.onAdClosed(a);
    }

    public final void onAdFailedToLoad(int i)
    {
        zzb.zzaF("Custom event adapter called onAdFailedToLoad.");
        b.onAdFailedToLoad(a, i);
    }

    public final void onAdLeftApplication()
    {
        zzb.zzaF("Custom event adapter called onAdLeftApplication.");
        b.onAdLeftApplication(a);
    }

    public final void onAdLoaded(View view)
    {
        zzb.zzaF("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.a(a, view);
        b.onAdLoaded(a);
    }

    public final void onAdOpened()
    {
        zzb.zzaF("Custom event adapter called onAdOpened.");
        b.onAdOpened(a);
    }
}
