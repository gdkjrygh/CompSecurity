// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.f;
import com.google.android.gms.location.i;
import com.google.android.gms.maps.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

public class FineLocationSource
    implements com.google.android.gms.common.api.c.b, com.google.android.gms.common.api.c.c, h, f, c
{

    private static final Object LOCK = new Object();
    private static final int MAX_INTERVAL_UPDATE = 10000;
    private static final int MIN_INTERVAL_UPDATE = 5000;
    private static final Logger log = Logger.getLogger("FineLocationSource");
    private Set locationListeners;
    private Status locationSettingsStatus;
    private final com.google.android.gms.common.api.c mGoogleApiClient;
    private h settingsResultResultCallback;

    public FineLocationSource(Context context)
    {
        settingsResultResultCallback = null;
        locationListeners = new HashSet();
        mGoogleApiClient = (new com.google.android.gms.common.api.c.a(context)).a(com.google.android.gms.location.h.a).a(this).a(this).b();
    }

    public FineLocationSource(Context context, h h1)
    {
        this(context);
        settingsResultResultCallback = h1;
    }

    private LocationRequest getLocationRequest()
    {
        LocationRequest locationrequest = new LocationRequest();
        locationrequest.b();
        locationrequest.c();
        locationrequest.a();
        return locationrequest;
    }

    private e locationSettingsPendingResult(LocationRequest locationrequest)
    {
        locationrequest = (new com.google.android.gms.location.LocationSettingsRequest.a()).a(locationrequest).a();
        return com.google.android.gms.location.h.d.a(mGoogleApiClient, locationrequest.b());
    }

    public void activate(com.google.android.gms.maps.c.a a)
    {
        if (!mGoogleApiClient.d())
        {
            mGoogleApiClient.b();
        }
        synchronized (LOCK)
        {
            locationListeners.add(a);
        }
        return;
        a;
        obj;
        JVM INSTR monitorexit ;
        throw a;
    }

    public void deactivate()
    {
        if (mGoogleApiClient.d())
        {
            com.google.android.gms.location.h.b.a(mGoogleApiClient, this);
            mGoogleApiClient.c();
        }
        synchronized (LOCK)
        {
            locationListeners.clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Status getLocationSettingsStatus()
    {
        return locationSettingsStatus;
    }

    public void onConnected(Bundle bundle)
    {
        bundle = getLocationRequest();
        com.google.android.gms.location.h.b.a(mGoogleApiClient, bundle, this);
        locationSettingsPendingResult(bundle).a(this);
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        log.info((new StringBuilder("Google client connection failed, reason=")).append(connectionresult.toString()).toString());
    }

    public void onConnectionSuspended(int j)
    {
        log.info((new StringBuilder("Google client connection lost, reason=")).append(j).toString());
    }

    public void onLocationChanged(Location location)
    {
        Object obj = LOCK;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = locationListeners.iterator(); iterator.hasNext(); ((com.google.android.gms.maps.c.a)iterator.next()).onLocationChanged(location)) { }
        break MISSING_BLOCK_LABEL_48;
        location;
        obj;
        JVM INSTR monitorexit ;
        throw location;
        obj;
        JVM INSTR monitorexit ;
    }

    public volatile void onResult(g g)
    {
        onResult((LocationSettingsResult)g);
    }

    public void onResult(LocationSettingsResult locationsettingsresult)
    {
        locationSettingsStatus = locationsettingsresult.getStatus();
        if (settingsResultResultCallback != null)
        {
            settingsResultResultCallback.onResult(locationsettingsresult);
        }
    }

}
