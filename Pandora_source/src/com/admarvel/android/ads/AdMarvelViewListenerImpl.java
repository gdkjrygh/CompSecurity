// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.Logging;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAnalyticsAdapterInstances, AdMarvelAnalyticsAdapter, AdMarvelView

public class AdMarvelViewListenerImpl
{

    private AdMarvelView.AdMarvelViewListener listener;

    public AdMarvelViewListenerImpl()
    {
    }

    public void onClickAd(Context context, AdMarvelView admarvelview, String s, String s1, int i, Map map, String s2)
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
            listener.onClickAd(admarvelview, s);
        }
    }

    public void onClose()
    {
        if (listener != null)
        {
            listener.onClose();
        }
    }

    public void onExpand()
    {
        if (listener != null)
        {
            listener.onExpand();
        }
    }

    public void onFailedToReceiveAd(Context context, AdMarvelView admarvelview, int i, AdMarvelUtils.ErrorReason errorreason, String s, int j, Map map, 
            String s1)
    {
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context).onAdRequest(s, j, map, s1);
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: onAdRequest");
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (listener != null)
        {
            listener.onFailedToReceiveAd(admarvelview, i, errorreason);
        }
    }

    public void onReceiveAd(Context context, AdMarvelView admarvelview, String s, int i, Map map, String s1)
    {
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context).onAdRequest(s, i, map, s1);
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: onAdRequest");
        }
        catch (Exception exception) { }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context).onAdImpression(s, i, map, s1);
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: onAdImpression");
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (listener != null)
        {
            listener.onReceiveAd(admarvelview);
        }
    }

    public void onRequestAd(AdMarvelView admarvelview)
    {
        if (listener != null)
        {
            listener.onRequestAd(admarvelview);
        }
    }

    public void setListener(AdMarvelView.AdMarvelViewListener admarvelviewlistener)
    {
        listener = admarvelviewlistener;
    }
}
