// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.gr;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

private class m
    implements CustomEventInterstitialListener
{

    private final MediationInterstitialListener m;
    private final CustomEventAdapter xw;
    final CustomEventAdapter xx;

    public void onAdClicked()
    {
        gr.S("Custom event adapter called onAdClicked.");
        m.onAdClicked(xw);
    }

    public void onAdClosed()
    {
        gr.S("Custom event adapter called onAdClosed.");
        m.onAdClosed(xw);
    }

    public void onAdFailedToLoad(int i)
    {
        gr.S("Custom event adapter called onFailedToReceiveAd.");
        m.onAdFailedToLoad(xw, i);
    }

    public void onAdLeftApplication()
    {
        gr.S("Custom event adapter called onAdLeftApplication.");
        m.onAdLeftApplication(xw);
    }

    public void onAdLoaded()
    {
        gr.S("Custom event adapter called onReceivedAd.");
        m.onAdLoaded(xx);
    }

    public void onAdOpened()
    {
        gr.S("Custom event adapter called onAdOpened.");
        m.onAdOpened(xw);
    }

    public alListener(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        xx = customeventadapter;
        super();
        xw = customeventadapter1;
        m = mediationinterstitiallistener;
    }
}
