// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.Logging;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAnalyticsAdapterInstances, AdMarvelAnalyticsAdapter, AdMarvelVideoActivity, AdMarvelActivity, 
//            AdMarvelAd

public class AdMarvelInterstitialAdListenerImpl
{

    private AdMarvelInterstitialAds.AdMarvelInterstitialAdListener listener;

    public AdMarvelInterstitialAdListenerImpl()
    {
    }

    public void onAdMarvelVideoActivityLaunched(AdMarvelVideoActivity admarvelvideoactivity)
    {
        if (listener != null)
        {
            listener.onAdMarvelVideoActivityLaunched(admarvelvideoactivity);
        }
    }

    public void onAdmarvelActivityLaunched(AdMarvelActivity admarvelactivity)
    {
        if (listener != null)
        {
            listener.onAdmarvelActivityLaunched(admarvelactivity);
        }
    }

    public void onClickInterstitialAd(Context context, String s, String s1, int i, Map map, String s2)
    {
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context).onAdClick(s1, i, map, s, s2);
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: onAdClick");
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (listener != null)
        {
            listener.onClickInterstitialAd(s);
        }
    }

    public boolean onCloseInterstitialAd()
    {
        if (listener != null)
        {
            listener.onCloseInterstitialAd();
            return true;
        } else
        {
            return false;
        }
    }

    public void onFailedToReceiveInterstitialAd(Context context, AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, int i, AdMarvelUtils.ErrorReason errorreason, String s1, int j, 
            Map map, String s2)
    {
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context).onAdRequest(s1, j, map, s2);
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: onAdRequest");
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (listener != null)
        {
            listener.onFailedToReceiveInterstitialAd(sdkadnetwork, s, i, errorreason);
        }
    }

    public void onReceiveInterstitialAd(Context context, AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, AdMarvelAd admarvelad, String s1, int i, Map map, 
            String s2)
    {
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context).onAdRequest(s1, i, map, s2);
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: onAdRequest");
        }
        catch (Exception exception) { }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context).onAdImpression(s1, i, map, s2);
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: onAdImpression");
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (listener != null)
        {
            listener.onReceiveInterstitialAd(sdkadnetwork, s, admarvelad);
        }
    }

    public void onRequestInterstitialAd()
    {
        if (listener != null)
        {
            listener.onRequestInterstitialAd();
        }
    }

    public void setListener(AdMarvelInterstitialAds.AdMarvelInterstitialAdListener admarvelinterstitialadlistener)
    {
        listener = admarvelinterstitialadlistener;
    }
}
