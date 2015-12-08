// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.eu;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

private class m
    implements CustomEventInterstitialListener
{

    private final MediationInterstitialListener m;
    private final CustomEventAdapter sY;
    final CustomEventAdapter sZ;

    public void onAdClicked()
    {
        eu.z("Custom event adapter called onAdClicked.");
        m.onAdClicked(sY);
    }

    public void onAdClosed()
    {
        eu.z("Custom event adapter called onAdClosed.");
        m.onAdClosed(sY);
    }

    public void onAdFailedToLoad(int i)
    {
        eu.z("Custom event adapter called onFailedToReceiveAd.");
        m.onAdFailedToLoad(sY, i);
    }

    public void onAdLeftApplication()
    {
        eu.z("Custom event adapter called onAdLeftApplication.");
        m.onAdLeftApplication(sY);
    }

    public void onAdLoaded()
    {
        eu.z("Custom event adapter called onReceivedAd.");
        m.onAdLoaded(sZ);
    }

    public void onAdOpened()
    {
        eu.z("Custom event adapter called onAdOpened.");
        m.onAdOpened(sY);
    }

    public alListener(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        sZ = customeventadapter;
        super();
        sY = customeventadapter1;
        m = mediationinterstitiallistener;
    }
}
