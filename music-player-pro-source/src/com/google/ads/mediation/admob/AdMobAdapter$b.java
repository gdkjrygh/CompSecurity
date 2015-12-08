// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.admob;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.ads.mediation.admob:
//            AdMobAdapter

private static final class m extends AdListener
{

    private final AdMobAdapter k;
    private final MediationInterstitialListener m;

    public void onAdClosed()
    {
        m.onAdClosed(k);
    }

    public void onAdFailedToLoad(int i)
    {
        m.onAdFailedToLoad(k, i);
    }

    public void onAdLeftApplication()
    {
        m.onAdLeftApplication(k);
    }

    public void onAdLoaded()
    {
        m.onAdLoaded(k);
    }

    public void onAdOpened()
    {
        m.onAdOpened(k);
    }

    public InterstitialListener(AdMobAdapter admobadapter, MediationInterstitialListener mediationinterstitiallistener)
    {
        k = admobadapter;
        m = mediationinterstitiallistener;
    }
}
