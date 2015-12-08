// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

static final class b
    implements CustomEventBannerListener
{

    private final CustomEventAdapter a;
    private final MediationBannerListener b;

    public void onAdClicked()
    {
        zzb.zzaj("Custom event adapter called onAdClicked.");
        b.onAdClicked(a);
    }

    public void onAdClosed()
    {
        zzb.zzaj("Custom event adapter called onAdClosed.");
        b.onAdClosed(a);
    }

    public void onAdFailedToLoad(int i)
    {
        zzb.zzaj("Custom event adapter called onAdFailedToLoad.");
        b.onAdFailedToLoad(a, i);
    }

    public void onAdLeftApplication()
    {
        zzb.zzaj("Custom event adapter called onAdLeftApplication.");
        b.onAdLeftApplication(a);
    }

    public void onAdLoaded(View view)
    {
        zzb.zzaj("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.zza(a, view);
        b.onAdLoaded(a);
    }

    public void onAdOpened()
    {
        zzb.zzaj("Custom event adapter called onAdOpened.");
        b.onAdOpened(a);
    }

    public ener(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        a = customeventadapter;
        b = mediationbannerlistener;
    }
}
