// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelLocationManager, AdMarvelInternalWebView

class mLocationManager
    implements LocationListener
{

    private boolean isRunning;
    LocationManager mLocationManager;
    final AdMarvelLocationManager this$0;

    public void initListener()
    {
        if (!isRunning)
        {
            mLocationManager.requestLocationUpdates(AdMarvelLocationManager.access$3(AdMarvelLocationManager.this), 0L, 0.0F, this);
            isRunning = true;
        }
    }

    public void onLocationChanged(Location location)
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)AdMarvelLocationManager.access$1(AdMarvelLocationManager.this).get();
        if (admarvelinternalwebview != null && AdMarvelLocationManager.access$2(AdMarvelLocationManager.this) != null)
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelLocationManager.access$2(AdMarvelLocationManager.this)).append("(").append(location.getLatitude()).append(",").append(location.getLongitude()).append(",").append(location.getAccuracy()).append(")").toString());
        }
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    public (String s, LocationManager locationmanager)
    {
        this$0 = AdMarvelLocationManager.this;
        super();
        isRunning = false;
        mLocationManager = locationmanager;
        AdMarvelLocationManager.access$0(AdMarvelLocationManager.this, s);
    }
}
