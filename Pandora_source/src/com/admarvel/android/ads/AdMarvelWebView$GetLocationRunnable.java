// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.location.Location;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView, Utils, AdMarvelLocationManager

private static class mcallback
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private String mLocationResult;
    private final String mcallback;

    public void run()
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview != null)
        {
            if (!Utils.isPermissionGranted(admarvelinternalwebview.getContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(admarvelinternalwebview.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mcallback).append("(").append(mLocationResult).append(")").toString());
                return;
            }
            if (Utils.isFeatureSupported(admarvelinternalwebview.getContext(), "location"))
            {
                Location location = AdMarvelLocationManager.getInstance().getLocation(admarvelinternalwebview);
                if (location != null)
                {
                    mLocationResult = (new StringBuilder(String.valueOf(location.getLatitude()))).append(",").append(location.getLongitude()).append(",").append(location.getAccuracy()).toString();
                }
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mcallback).append("(").append(mLocationResult).append(")").toString());
                return;
            }
        }
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, String s)
    {
        mLocationResult = "null";
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        mcallback = s;
    }
}
