// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;


// Referenced classes of package com.google.android.gms.ads.mediation:
//            MediationInterstitialAdapter

public interface MediationInterstitialListener
{

    public abstract void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter);

    public abstract void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter);

    public abstract void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i);

    public abstract void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter);

    public abstract void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter);

    public abstract void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter);
}
