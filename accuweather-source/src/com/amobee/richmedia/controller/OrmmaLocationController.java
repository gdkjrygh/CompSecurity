// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.amobee.richmedia.controller.listeners.LocListener;
import com.amobee.richmedia.view.AmobeeView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController

public class OrmmaLocationController extends OrmmaController
{

    private static final String LOG_TAG = "AmobeeViewLocationController";
    final int INTERVAL = 1000;
    private boolean allowLocationServices;
    private boolean hasPermission;
    private LocListener mGps;
    private int mLocListenerCount;
    private LocationManager mLocationManager;
    private LocListener mNetwork;

    public OrmmaLocationController(AmobeeView amobeeview, Context context)
    {
        super(amobeeview, context);
        hasPermission = false;
        allowLocationServices = false;
        try
        {
            mLocationManager = (LocationManager)context.getSystemService("location");
            if (mLocationManager.getProvider("gps") != null)
            {
                mGps = new LocListener(context, 1000, this, "gps");
            }
            if (mLocationManager.getProvider("network") != null)
            {
                mNetwork = new LocListener(context, 1000, this, "network");
            }
            hasPermission = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AmobeeView amobeeview)
        {
            return;
        }
    }

    private static String formatLocation(Location location)
    {
        return (new StringBuilder("{ lat: ")).append(location.getLatitude()).append(", lon: ").append(location.getLongitude()).append(", acc: ").append(location.getAccuracy()).append("}").toString();
    }

    public void allowLocationServices(boolean flag)
    {
        allowLocationServices = flag;
    }

    public boolean allowLocationServices()
    {
        return allowLocationServices;
    }

    public void fail()
    {
        mOrmmaView.injectJavaScriptRichMedia("window.ormmaview.fireErrorEvent(\"Location cannot be identified\", \"OrmmaLocationController\")");
    }

    public String getLocation()
    {
        Location location;
        Iterator iterator;
        if (!hasPermission)
        {
            return null;
        }
        iterator = mLocationManager.getProviders(true).iterator();
        location = null;
_L4:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Location location1;
        if (location != null)
        {
            return formatLocation(location);
        } else
        {
            return null;
        }
_L2:
        location1 = mLocationManager.getLastKnownLocation((String)iterator.next());
        location = location1;
        if (location1 == null) goto _L4; else goto _L3
_L3:
        location = location1;
          goto _L1
    }

    public void startLocationListener()
    {
        if (mLocListenerCount == 0)
        {
            if (mNetwork != null)
            {
                mNetwork.start();
            }
            if (mGps != null)
            {
                mGps.start();
            }
        }
        mLocListenerCount = mLocListenerCount + 1;
    }

    public void stopAllListeners()
    {
        mLocListenerCount = 0;
        try
        {
            mGps.stop();
        }
        catch (Exception exception1) { }
        try
        {
            mNetwork.stop();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void stopLocationListener()
    {
        mLocListenerCount = mLocListenerCount - 1;
        if (mLocListenerCount == 0)
        {
            if (mNetwork != null)
            {
                mNetwork.stop();
            }
            if (mGps != null)
            {
                mGps.stop();
            }
        }
    }

    public void success(Location location)
    {
        location = (new StringBuilder("window.ormmaview.fireChangeEvent({ location: ")).append(formatLocation(location)).append("})").toString();
        mOrmmaView.injectJavaScriptRichMedia(location);
    }
}
