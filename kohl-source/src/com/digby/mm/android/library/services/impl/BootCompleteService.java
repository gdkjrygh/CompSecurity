// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.events.impl.GeoFenceEntryEvent;
import com.digby.mm.android.library.events.impl.GeoFenceExitEvent;
import com.digby.mm.android.library.filter.impl.ValidEventsFilter;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geofence.IGeoFenceListReceiver;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.location.IDownloadGeofenceAlarmManager;
import com.digby.mm.android.library.location.IGeofenceManager;
import com.digby.mm.android.library.location.impl.DownloadGeofenceAlarmManager;
import com.digby.mm.android.library.location.impl.GeofenceManager;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BootCompleteService extends Service
{

    private IGeofenceManager geofenceManager;
    private LocationListener mLocationListener;
    private LocationManager manager;

    public BootCompleteService()
    {
        mLocationListener = new LocationListener() {

            final BootCompleteService this$0;

            public void onLocationChanged(Location location)
            {
                try
                {
                    Logger.Debug("Got fresh location!!", BootCompleteService.this);
                    Logger.Debug("BootCompleteService_onLocationChanged: removing location updates", BootCompleteService.this);
                    manager.removeUpdates(this);
                    DigbyController.getInstance(BootCompleteService.this).startLocationServices();
                    stopSelf();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Location location)
                {
                    Logger.Error("MyLocationListener_onLocationChanged", location);
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

            
            {
                this$0 = BootCompleteService.this;
                super();
            }
        };
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        Object obj = new DownloadGeofenceAlarmManager(this);
        ((IDownloadGeofenceAlarmManager) (obj)).setDailyDownloadGeofenceAlarm();
        geofenceManager = GeofenceManager.getInstance(this);
        obj = DigbyController.getInstance(this);
        if (((IDigbyController) (obj)).getSettings().getAppID().length() > 0 && ((IDigbyController) (obj)).getSharedPrefsManager().getUseLocationServices())
        {
            if (((IDigbyController) (obj)).isDeviceRegistered())
            {
                ((IDigbyController) (obj)).getGeoFences(new ValidEventsFilter(new Class[] {
                    com/digby/mm/android/library/events/impl/GeoFenceEntryEvent, com/digby/mm/android/library/events/impl/GeoFenceExitEvent
                }), new IGeoFenceListReceiver() {

                    final BootCompleteService this$0;

                    public void onReceive(List list)
                    {
                        list = list.iterator();
                        ArrayList arraylist = new ArrayList();
                        IGeoShape igeoshape;
                        for (; list.hasNext(); arraylist.add(igeoshape.getGeoShapeForEntryTracking()))
                        {
                            igeoshape = ((IGeoFence)list.next()).getGeoShape();
                            arraylist.add(igeoshape);
                        }

                        geofenceManager.addGeofences(arraylist, true);
                    }

            
            {
                this$0 = BootCompleteService.this;
                super();
            }
                });
            }
            Logger.Debug("Subscribing to location updates", this);
            manager = (LocationManager)getSystemService("location");
            if (manager.isProviderEnabled("gps"))
            {
                Logger.Debug("BootCompleteService_onCreate: requesting location updates (gps) since gps is enabled.", this);
                manager.requestLocationUpdates("gps", 0L, 0.0F, mLocationListener);
            }
            if (manager.isProviderEnabled("network"))
            {
                Logger.Debug("BootCompleteService_onCreate: requesting location updates (network) since network location is enabled.", this);
                manager.requestLocationUpdates("network", 0L, 0.0F, mLocationListener);
                return;
            }
            break MISSING_BLOCK_LABEL_206;
        }
        stopSelf();
        return;
        Exception exception;
        exception;
_L2:
        Logger.Error("BootCompleteService_onCreate", exception);
        return;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onDestroy()
    {
        try
        {
            Logger.Debug("BootCompleteService_onDestroy", this);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("BootCompleteService_onDestroy", exception);
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return 1;
    }


}
