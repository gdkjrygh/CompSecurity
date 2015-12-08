// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.gs;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

private class m
    implements CustomEventInterstitialListener
{

    private final MediationInterstitialListener m;
    private final CustomEventAdapter xh;
    final CustomEventAdapter xi;

    public void onAdClicked()
    {
        gs.S("Custom event adapter called onAdClicked.");
        m.onAdClicked(xh);
    }

    public void onAdClosed()
    {
        gs.S("Custom event adapter called onAdClosed.");
        m.onAdClosed(xh);
    }

    public void onAdFailedToLoad(int i)
    {
        gs.S("Custom event adapter called onFailedToReceiveAd.");
        m.onAdFailedToLoad(xh, i);
    }

    public void onAdLeftApplication()
    {
        gs.S("Custom event adapter called onAdLeftApplication.");
        m.onAdLeftApplication(xh);
    }

    public void onAdLoaded()
    {
        gs.S("Custom event adapter called onReceivedAd.");
        m.onAdLoaded(xi);
    }

    public void onAdOpened()
    {
        gs.S("Custom event adapter called onAdOpened.");
        m.onAdOpened(xh);
    }

    public alListener(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        xi = customeventadapter;
        super();
        xh = customeventadapter1;
        m = mediationinterstitiallistener;
    }
}
