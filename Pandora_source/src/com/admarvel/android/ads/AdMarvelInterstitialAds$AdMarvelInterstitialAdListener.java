// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInterstitialAds, AdMarvelVideoActivity, AdMarvelActivity, AdMarvelAd

public static interface 
{

    public abstract void onAdMarvelVideoActivityLaunched(AdMarvelVideoActivity admarvelvideoactivity);

    public abstract void onAdmarvelActivityLaunched(AdMarvelActivity admarvelactivity);

    public abstract void onClickInterstitialAd(String s);

    public abstract void onCloseInterstitialAd();

    public abstract void onFailedToReceiveInterstitialAd( , String s, int i,  1);

    public abstract void onReceiveInterstitialAd( , String s, AdMarvelAd admarvelad);

    public abstract void onRequestInterstitialAd();
}
