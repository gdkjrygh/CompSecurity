// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAd

public interface AdMarvelInterstitialAdapterListener
{

    public abstract void onCloseInterstitialAd();

    public abstract void onFailedToReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, int i, AdMarvelUtils.ErrorReason errorreason, AdMarvelAd admarvelad);

    public abstract void onReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, AdMarvelAd admarvelad);

    public abstract void onRequestInterstitialAd();
}
