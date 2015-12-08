// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

class zzaR
    implements CustomEventInterstitialListener
{

    private final CustomEventAdapter zzJJ;
    final CustomEventAdapter zzJK;
    private final MediationInterstitialListener zzaR;

    public void onAdClicked()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdClicked.");
        zzaR.onAdClicked(zzJJ);
    }

    public void onAdClosed()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdClosed.");
        zzaR.onAdClosed(zzJJ);
    }

    public void onAdFailedToLoad(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onFailedToReceiveAd.");
        zzaR.onAdFailedToLoad(zzJJ, i);
    }

    public void onAdLeftApplication()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdLeftApplication.");
        zzaR.onAdLeftApplication(zzJJ);
    }

    public void onAdLoaded()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onReceivedAd.");
        zzaR.onAdLoaded(zzJK);
    }

    public void onAdOpened()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Custom event adapter called onAdOpened.");
        zzaR.onAdOpened(zzJJ);
    }

    public Listener(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        zzJK = customeventadapter;
        super();
        zzJJ = customeventadapter1;
        zzaR = mediationinterstitiallistener;
    }
}
