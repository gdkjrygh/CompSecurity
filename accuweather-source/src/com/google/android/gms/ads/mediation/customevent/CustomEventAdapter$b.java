// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ev;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

private class m
    implements CustomEventInterstitialListener
{

    private final MediationInterstitialListener m;
    private final CustomEventAdapter sV;
    final CustomEventAdapter sW;

    public void onAdClicked()
    {
        ev.z("Custom event adapter called onAdClicked.");
        m.onAdClicked(sV);
    }

    public void onAdClosed()
    {
        ev.z("Custom event adapter called onAdClosed.");
        m.onAdClosed(sV);
    }

    public void onAdFailedToLoad(int i)
    {
        ev.z("Custom event adapter called onFailedToReceiveAd.");
        m.onAdFailedToLoad(sV, i);
    }

    public void onAdLeftApplication()
    {
        ev.z("Custom event adapter called onAdLeftApplication.");
        m.onAdLeftApplication(sV);
    }

    public void onAdLoaded()
    {
        ev.z("Custom event adapter called onReceivedAd.");
        m.onAdLoaded(sW);
    }

    public void onAdOpened()
    {
        ev.z("Custom event adapter called onAdOpened.");
        m.onAdOpened(sV);
    }

    public alListener(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        sW = customeventadapter;
        super();
        sV = customeventadapter1;
        m = mediationinterstitiallistener;
    }
}
