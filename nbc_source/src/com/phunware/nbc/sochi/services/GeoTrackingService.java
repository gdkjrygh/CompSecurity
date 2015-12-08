// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.services;

import android.app.IntentService;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.gson.Gson;
import com.nbcsports.liveextra.library.tve.NbcGeoService;
import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.location.TotalCastAsyncRequest;
import com.phunware.nbc.sochi.location.TotalCastResponseListener;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.okhttp.OkHttpClient;
import timber.log.Timber;

public class GeoTrackingService extends IntentService
    implements LocationListener
{

    boolean isGPSEnabled;
    boolean isNetworkEnabled;
    Location location;
    protected LocationManager locationManager;
    NbcGeoService nbcGeoService;

    public GeoTrackingService()
    {
        super("GeoTrackingService");
        isGPSEnabled = false;
        isNetworkEnabled = false;
        nbcGeoService = new NbcGeoService(new Gson(), new OkHttpClient());
    }

    private void updateRsnDma(Location location1)
    {
        TotalCastAsyncRequest totalcastasyncrequest = new TotalCastAsyncRequest();
        totalcastasyncrequest.setRequest(location1.getLatitude(), location1.getLongitude());
        totalcastasyncrequest.addTotalCastResponseListener(new TotalCastResponseListener() {

            final GeoTrackingService this$0;

            public void onResponse(GeoRequestResponse georequestresponse)
            {
                if (georequestresponse != null)
                {
                    NBCSystem.LAST_KNOWN_GEO_LOCATION = georequestresponse;
                    Timber.d((new StringBuilder()).append("TotalCast updated:").append(georequestresponse.toString()).toString(), new Object[0]);
                }
            }

            
            {
                this$0 = GeoTrackingService.this;
                super();
            }
        });
        totalcastasyncrequest.execute();
    }

    public Location getLocation()
    {
        locationManager = (LocationManager)getSystemService("location");
        isGPSEnabled = locationManager.isProviderEnabled("gps");
        isNetworkEnabled = locationManager.isProviderEnabled("network");
        if (isGPSEnabled || isNetworkEnabled) goto _L2; else goto _L1
_L1:
        NBCSystem.IS_GEO_LOCATION_ENABLED = false;
        Timber.d("LOCATION SERVICES ARE DISABLED", new Object[0]);
_L7:
        return location;
_L2:
        NBCSystem.IS_GEO_LOCATION_ENABLED = true;
        if (!isNetworkEnabled) goto _L4; else goto _L3
_L3:
        locationManager.requestSingleUpdate("network", this, Looper.getMainLooper());
        if (locationManager == null) goto _L4; else goto _L5
_L5:
        Location location1 = locationManager.getLastKnownLocation("network");
        if (location1 == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        location = location1;
        NBCSystem.GEO_LOCATION_RETRY = false;
        NBCSystem.IS_GEO_LOCATION_ENABLED = true;
        updateRsnDma(location1);
_L4:
        if (!isGPSEnabled || location != null) goto _L7; else goto _L6
_L6:
        locationManager.requestSingleUpdate("gps", this, Looper.getMainLooper());
        if (locationManager == null) goto _L7; else goto _L8
_L8:
        location1 = locationManager.getLastKnownLocation("gps");
        if (location1 == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        try
        {
            location = location1;
            NBCSystem.GEO_LOCATION_RETRY = false;
            NBCSystem.IS_GEO_LOCATION_ENABLED = true;
            updateRsnDma(location1);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
          goto _L7
        NBCSystem.IS_GEO_LOCATION_ENABLED = false;
          goto _L4
        NBCSystem.IS_GEO_LOCATION_ENABLED = false;
          goto _L7
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    protected void onHandleIntent(Intent intent)
    {
        getLocation();
    }

    public void onLocationChanged(Location location1)
    {
        if (location1 == null || location != null && location1.distanceTo(location) < 25F)
        {
            return;
        } else
        {
            location = location1;
            NBCSystem.IS_GEO_LOCATION_ENABLED = true;
            Timber.d((new StringBuilder()).append("Location changed: lat=").append(location1.getLatitude()).append(" lon=").append(location1.getLongitude()).toString(), new Object[0]);
            updateRsnDma(location1);
            return;
        }
    }

    public void onProviderDisabled(String s)
    {
        if (locationManager != null)
        {
            locationManager.removeUpdates(this);
            NBCSystem.IS_GEO_LOCATION_ENABLED = false;
        }
    }

    public void onProviderEnabled(String s)
    {
        NBCSystem.IS_GEO_LOCATION_ENABLED = true;
        if (locationManager == null)
        {
            getLocation();
        }
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }
}
