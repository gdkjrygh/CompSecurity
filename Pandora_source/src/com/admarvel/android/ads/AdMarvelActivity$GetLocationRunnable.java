// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.location.Location;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, Utils, AdMarvelLocationManager

private static class mcallback
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private String mLocationResult;
    private final String mcallback;

    public void run()
    {
        Object obj;
        try
        {
            obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return;
        }
        if (obj == null)
        {
            return;
        }
        if (!Utils.isPermissionGranted(((AdMarvelInternalWebView) (obj)).getContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(((AdMarvelInternalWebView) (obj)).getContext(), "android.permission.ACCESS_FINE_LOCATION"))
        {
            ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(mcallback).append("(").append(mLocationResult).append(")").toString());
            return;
        }
        Location location;
        if (!Utils.isFeatureSupported(((AdMarvelInternalWebView) (obj)).getContext(), "location"))
        {
            break MISSING_BLOCK_LABEL_199;
        }
        location = AdMarvelLocationManager.getInstance().getLocation(((AdMarvelInternalWebView) (obj)));
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        mLocationResult = (new StringBuilder(String.valueOf(location.getLatitude()))).append(",").append(location.getLongitude()).append(",").append(location.getAccuracy()).toString();
        ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(mcallback).append("(").append(mLocationResult).append(")").toString());
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, String s)
    {
        mLocationResult = "null";
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        mcallback = s;
    }
}
