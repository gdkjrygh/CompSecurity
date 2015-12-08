// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView, Utils

class AdMarvelLocationManager
{
    class AdMarvelLocationListener
        implements LocationListener
    {

        private boolean isRunning;
        LocationManager mLocationManager;
        final AdMarvelLocationManager this$0;

        public void initListener()
        {
            if (!isRunning)
            {
                mLocationManager.requestLocationUpdates(mProvider, 0L, 0.0F, this);
                isRunning = true;
            }
        }

        public void onLocationChanged(Location location)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && mCallback != null)
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(").append(location.getLatitude()).append(",").append(location.getLongitude()).append(",").append(location.getAccuracy()).append(")").toString());
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

        public AdMarvelLocationListener(String s, LocationManager locationmanager)
        {
            this$0 = AdMarvelLocationManager.this;
            super();
            isRunning = false;
            mLocationManager = locationmanager;
            mProvider = s;
        }
    }


    private static AdMarvelLocationManager mAdMarvelLocationManager = null;
    private static AdMarvelLocationListener mGpsListener = null;
    private static AdMarvelLocationListener mNetworkListener = null;
    private WeakReference adMarvelInternalWebViewReference;
    private String mCallback;
    private String mProvider;

    private AdMarvelLocationManager()
    {
    }

    public static AdMarvelLocationManager getInstance()
    {
        if (mAdMarvelLocationManager == null)
        {
            mAdMarvelLocationManager = new AdMarvelLocationManager();
        }
        return mAdMarvelLocationManager;
    }

    private boolean isProviderSupported(Context context, String s)
    {
        context = (LocationManager)context.getSystemService("location");
        int i;
        try
        {
            context = context.getAllProviders();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        i = 0;
        do
        {
            if (i >= context.size())
            {
                return false;
            }
            if (s.equals((String)context.get(i)))
            {
                return true;
            }
            i++;
        } while (true);
    }

    public Location getLocation(AdMarvelInternalWebView admarvelinternalwebview)
    {
        Object obj = null;
        if (!Utils.isPermissionGranted(admarvelinternalwebview.getContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(admarvelinternalwebview.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
        {
            return null;
        }
        LocationManager locationmanager = (LocationManager)admarvelinternalwebview.getContext().getSystemService("location");
        List list = locationmanager.getProviders(true);
        int i = list.size() - 1;
        admarvelinternalwebview = obj;
        do
        {
            if (i < 0)
            {
                return admarvelinternalwebview;
            }
            admarvelinternalwebview = locationmanager.getLastKnownLocation((String)list.get(i));
            if (admarvelinternalwebview != null)
            {
                return admarvelinternalwebview;
            }
            i--;
        } while (true);
    }

    public void init(AdMarvelInternalWebView admarvelinternalwebview, String s)
    {
        if (Utils.isPermissionGranted(admarvelinternalwebview.getContext(), "android.permission.ACCESS_COARSE_LOCATION") || Utils.isPermissionGranted(admarvelinternalwebview.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
        {
            LocationManager locationmanager = (LocationManager)admarvelinternalwebview.getContext().getSystemService("location");
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            mCallback = s;
            try
            {
                if (isProviderSupported(admarvelinternalwebview.getContext(), "gps") && locationmanager.getProvider("gps") != null)
                {
                    mGpsListener = new AdMarvelLocationListener("gps", locationmanager);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                if (isProviderSupported(admarvelinternalwebview.getContext(), "network") && locationmanager.getProvider("network") != null)
                {
                    mNetworkListener = new AdMarvelLocationListener("network", locationmanager);
                }
            }
            // Misplaced declaration of an exception variable
            catch (AdMarvelInternalWebView admarvelinternalwebview) { }
            if (mNetworkListener != null)
            {
                mNetworkListener.initListener();
            }
            if (mGpsListener != null)
            {
                mGpsListener.initListener();
                return;
            }
        }
    }

    public void stopLocationService(Context context)
    {
        context = (LocationManager)context.getSystemService("location");
        if (mNetworkListener != null)
        {
            context.removeUpdates(mNetworkListener);
        }
        if (mGpsListener != null)
        {
            context.removeUpdates(mGpsListener);
        }
        mNetworkListener = null;
        mGpsListener = null;
    }





}
