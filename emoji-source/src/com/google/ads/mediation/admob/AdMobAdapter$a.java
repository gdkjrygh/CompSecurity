// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.admob;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.ads.mediation.admob:
//            AdMobAdapter

private static final class l extends AdListener
{

    private final AdMobAdapter k;
    private final MediationBannerListener l;

    public void onAdClosed()
    {
        l.onAdClosed(k);
    }

    public void onAdFailedToLoad(int i)
    {
        l.onAdFailedToLoad(k, i);
    }

    public void onAdLeftApplication()
    {
        l.onAdLeftApplication(k);
    }

    public void onAdLoaded()
    {
        l.onAdLoaded(k);
    }

    public void onAdOpened()
    {
        l.onAdClicked(k);
        l.onAdOpened(k);
    }

    public BannerListener(AdMobAdapter admobadapter, MediationBannerListener mediationbannerlistener)
    {
        k = admobadapter;
        l = mediationbannerlistener;
    }
}
