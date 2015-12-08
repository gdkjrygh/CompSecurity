// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.impl.DownloadGeoFencesEvent;
import com.digby.mm.android.library.events.impl.GeoFenceEntryEvent;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.geoshape.impl.CircularGeoShape;
import com.digby.mm.android.library.location.IActivityManager;
import com.digby.mm.android.library.location.IDownloadGeofenceAlarmManager;
import com.digby.mm.android.library.location.IGeofenceManager;
import com.digby.mm.android.library.location.ILocationManager;
import com.digby.mm.android.library.location.impl.ActivityManager;
import com.digby.mm.android.library.location.impl.DownloadGeofenceAlarmManager;
import com.digby.mm.android.library.location.impl.GeofenceManager;
import com.digby.mm.android.library.services.IGeofenceTransitionsService;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import com.digby.mm.android.library.utils.StatusCodesUtils;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public final class GeofenceTransitionsService extends Service
    implements IGeofenceTransitionsService
{

    private DetectedActivity lastActivity;
    private Location lastLocation;
    private IActivityManager mActivityManager;
    private IDownloadGeofenceAlarmManager mAlarmManager;
    private IDigbyController mController;
    private IGeofenceManager mGeofenceManager;
    private Handler mHandler;
    private ILocationManager mLocationManager;
    private boolean stillNeedActivityUpdate;
    private boolean stillNeedLocationUpdate;
    private Runnable stopServiceRunnable;

    public GeofenceTransitionsService()
    {
        mHandler = new Handler();
        stopServiceRunnable = new Runnable() {

            final GeofenceTransitionsService this$0;

            public void run()
            {
                Logger.Debug("MAX_SERVICE_LIVE_TIME exceed, stop service.", GeofenceTransitionsService.this);
                stopAll();
            }

            
            {
                this$0 = GeofenceTransitionsService.this;
                super();
            }
        };
        lastLocation = null;
        lastActivity = null;
        stillNeedActivityUpdate = false;
        stillNeedLocationUpdate = true;
    }

    private final boolean alreadyInGeoFence(String s)
    {
        Logger.Debug((new StringBuilder()).append("GTS_alreadyInGeoFence:").append(s).toString(), this);
        boolean flag1 = false;
        JSONArray jsonarray;
        int i;
        boolean flag;
        try
        {
            jsonarray = mController.getSharedPrefsManager().getGeoFencesInside();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                Logger.Error("", s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Logger.Error("Error in alreadyInGeoFence", s);
                return false;
            }
            return false;
        }
        i = 0;
        flag = flag1;
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        flag = s.equals(String.valueOf(jsonarray.getLong(i)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        flag = true;
        return flag;
        for (i++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_43;
    }

    private void handleActivityDetected(Intent intent)
    {
        Logger.Debug("GTS_onStartCommand, activity", this);
        intent = ActivityRecognitionResult.extractResult(intent).getMostProbableActivity();
        Logger.Debug((new StringBuilder()).append("Activity Detected - activityType: ").append(StatusCodesUtils.getActivityName(intent.getType())).append(", confidence: ").append(intent.getConfidence()).toString(), this);
        lastActivity = intent;
        if (!stillNeedLocationUpdate)
        {
            scheduleNextUpdates();
        }
    }

    private void handleDownloadGeofenceWakeupAlarm()
    {
        Logger.Debug("GTS_onStartCommand, alarm. ", this);
        IDownloadInfo idownloadinfo = mController.getSharedPrefsManager().getLastDownloadInfo();
        if (idownloadinfo != null)
        {
            long l = idownloadinfo.getLastDownloadDate().getTime();
            if (System.currentTimeMillis() - l >= 0x240c8400L)
            {
                Logger.Debug("Device hasn't call home more than one day, fire download geofence event", this);
                sendDownloadGeofenceEvent();
            }
        }
        mAlarmManager.setDailyDownloadGeofenceAlarm();
    }

    private void handleGeofenceBreach(Intent intent)
    {
        int i = LocationClient.getGeofenceTransition(intent);
        Logger.Debug((new StringBuilder()).append("GTS_onStartCommand, geofence: ").append(StatusCodesUtils.getTransitionString(i)).toString(), this);
        intent = LocationClient.getTriggeringGeofences(intent);
        if (intent != null && !intent.isEmpty())
        {
            if (i == 1)
            {
                handleEntry(intent);
            } else
            {
                if (i == 2)
                {
                    handleExit(intent);
                    return;
                }
                if (i != 4)
                {
                    Logger.Debug("GTS_onStartCommand invalid transition type", this);
                    return;
                }
            }
        }
    }

    private void handleLocationProviderChanged()
    {
        Logger.Debug("GTS_onStartCommand, providerChanged", this);
        LocationManager locationmanager = (LocationManager)getSystemService("location");
        boolean flag = locationmanager.isProviderEnabled("gps");
        boolean flag1 = locationmanager.isProviderEnabled("network");
        Logger.Debug((new StringBuilder()).append("GPSProviderEnabled: ").append(flag).toString(), this);
        Logger.Debug((new StringBuilder()).append("networkProviderEnabled: ").append(flag1).toString(), this);
        if (!flag && !flag1)
        {
            Logger.Debug("GPS & Network provider both disabled, nothing to do.", this);
            return;
        } else
        {
            mGeofenceManager = GeofenceManager.getInstance(this);
            return;
        }
    }

    private void handleLocationUpdates(Intent intent)
    {
        mLocationManager.stopMontioring();
        Logger.Debug("GTS_onStartCommand, location", this);
        intent = (Location)intent.getExtras().get("com.google.android.location.LOCATION");
        Logger.Debug((new StringBuilder()).append("Location Updated: ").append(intent).toString(), this);
        lastLocation = intent;
        if (isEntryOrExitGeofence(intent))
        {
            sendEvent(intent);
        }
        scheduleNextUpdates();
    }

    private void handleProximityAlertReceived(Intent intent)
    {
        Logger.Debug("GTS_onStartCommand, proximity alert.", this);
        if (intent.getBooleanExtra("entering", false))
        {
            handleEntry(null);
            return;
        }
        if (intent.getStringExtra("RequestId").startsWith("Monitoring-Region-ID"))
        {
            mGeofenceManager.addGeofences(null, true);
            return;
        } else
        {
            handleExit(null);
            return;
        }
    }

    private final boolean isEntryOrExitGeofence(Location location)
    {
        if (location != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        HashSet hashset;
        Object obj;
        Object obj1;
        JSONException jsonexception;
        String s;
        int i;
        try
        {
            obj = mGeofenceManager.getGeofences();
            obj1 = mController.getSharedPrefsManager().getGeoFencesInside();
            hashset = new HashSet();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            Logger.Error("Error in isEntryOrExitGeofence", location);
            return false;
        }
        i = 0;
        if (i >= ((JSONArray) (obj1)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(String.valueOf(((JSONArray) (obj1)).getLong(i)));
        i++;
        continue; /* Loop/switch isn't completed */
        jsonexception;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_43;
_L3:
        Logger.Debug((new StringBuilder()).append("Ids already inside: ").append(hashset).toString(), this);
        obj = ((List) (obj)).iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L1; else goto _L5
_L5:
        jsonexception = (IGeoShape)((Iterator) (obj)).next();
        s = jsonexception.getRequestId();
        if (s.startsWith("T-")) goto _L7; else goto _L6
_L6:
        if (!hashset.contains(s) || !jsonexception.isLocationOutside(location))
        {
            continue; /* Loop/switch isn't completed */
        }
        Logger.Debug((new StringBuilder()).append("Exit confirmed: ").append(s).toString(), this);
        return true;
        if (!jsonexception.isLocationInside(location) || alreadyInGeoFence(s)) goto _L7; else goto _L8
_L8:
        Logger.Debug((new StringBuilder()).append("Entry confirmed: ").append(s).toString(), this);
        return true;
    }

    private final void scheduleNextUpdates()
    {
        Logger.Debug("GTS_scheduleNextUpdates", this);
        Object obj;
        if (lastLocation == null)
        {
            Logger.Debug("scheduleNextUpdates, Location is null? request it again.", this);
        }
        obj = mGeofenceManager.getGeofences();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (!((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Logger.Debug("scheduleNextUpdates, no geofence is monitered.", this);
        stopAll();
        return;
        float f;
        float f1;
        float f2;
        f2 = 3.402823E+38F;
        f1 = -1F;
        f = f1;
        if (lastLocation == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        obj = mGeofenceManager.getNearestGeoShape(lastLocation);
        if (obj == null)
        {
            try
            {
                Logger.Debug("scheduleNextUpdates, no nearest geofence?? This should not happen..", this);
                stopAll();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.Error("Error in schedualNextLocationRequest", ((Exception) (obj)));
            }
            return;
        }
        f = f1;
        if (obj instanceof CircularGeoShape)
        {
            f = ((CircularGeoShape)obj).getRadius();
        }
        f2 = ((IGeoShape) (obj)).distanceToBoundary(lastLocation);
        stillNeedActivityUpdate = false;
        stillNeedLocationUpdate = true;
        byte byte0;
        long l;
        byte0 = 102;
        l = 5000L;
        if (lastActivity != null && lastActivity.getConfidence() >= 50) goto _L2; else goto _L1
_L22:
        if (f < 100F)
        {
            byte0 = 100;
        } else
        {
            byte0 = 102;
        }
        l = 5000L;
        stillNeedActivityUpdate = true;
_L9:
        if (!stillNeedActivityUpdate) goto _L4; else goto _L3
_L3:
        if (!mActivityManager.isMonitoring())
        {
            mActivityManager.startMonitoring();
        }
_L21:
        if (!stillNeedLocationUpdate) goto _L6; else goto _L5
_L5:
        Logger.Debug("stillNeedLocationUpdate, request location updates", this);
        locationrequest = new LocationRequest();
        locationmanager = (LocationManager)getSystemService("location");
        flag = locationmanager.isProviderEnabled("network");
        flag1 = locationmanager.isProviderEnabled("gps");
        if (!flag && !flag1) goto _L6; else goto _L7
_L7:
        l1 = l;
        byte1 = byte0;
        if (byte0 == 102)
        {
            l1 = l;
            byte1 = byte0;
            if (!flag)
            {
                l1 = l;
                byte1 = byte0;
                if (flag1)
                {
                    byte1 = 100;
                    l1 = l * 2L;
                }
            }
        }
        l = l1;
        byte0 = byte1;
        if (byte1 != 100)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        l = l1;
        byte0 = byte1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        l = l1;
        byte0 = byte1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        byte0 = 102;
        l = l1 / 2L;
        locationrequest.setPriority(byte0);
        locationrequest.setInterval(l);
        locationrequest.setFastestInterval(300L);
        mLocationManager.requestLocationUpdates(locationrequest);
_L6:
        if (!stillNeedActivityUpdate && !stillNeedLocationUpdate)
        {
            Logger.Debug("!stillNeedActivityUpdate && !stillNeedLocationUpdate stop all", this);
            stopAll();
            return;
        }
          goto _L8
_L25:
        stillNeedLocationUpdate = false;
          goto _L9
_L2:
        lastActivity.getType();
        JVM INSTR tableswitch 1 8: default 761
    //                   1 573
    //                   2 527
    //                   3 514
    //                   4 472
    //                   5 514
    //                   6 472
    //                   7 527
    //                   8 527;
           goto _L10 _L11 _L12 _L13 _L10 _L13 _L10 _L12 _L12
_L10:
        f1 = f2 / 26.82F;
        l = (long)Math.max(3000F, Math.min(120000F, f1));
        if (f1 >= 100F) goto _L15; else goto _L14
_L14:
        stillNeedActivityUpdate = true;
        byte0 = 100;
          goto _L9
_L13:
        stillNeedLocationUpdate = false;
        stillNeedActivityUpdate = true;
          goto _L9
_L12:
        f1 = f2 / 1.39F;
        l = (long)Math.max(10000F, Math.min(120000F, f1));
        if (f1 >= 100F) goto _L17; else goto _L16
_L16:
        stillNeedActivityUpdate = true;
          goto _L18
_L11:
        f1 = f2 / 6.71F;
        l = (long)Math.max(5000F, Math.min(120000F, f1));
        if (f1 >= 50F) goto _L20; else goto _L19
_L19:
        stillNeedActivityUpdate = true;
        byte0 = 100;
          goto _L9
_L4:
        Logger.Debug("activityRecognitionStarted && !stillNeedActivityUpdate, stop activity updates", this);
        mActivityManager.stopMontioring();
          goto _L21
_L8:
        return;
_L1:
        if (f2 >= 700F) goto _L23; else goto _L22
_L23:
        if (f2 >= 1500F)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte0 = 102;
        l = 20000L;
          goto _L9
        if (f2 >= 2500F) goto _L25; else goto _L24
_L24:
        byte0 = 104;
        l = 0x1d4c0L;
          goto _L9
_L18:
        if (f >= 50F);
        byte0 = 102;
          goto _L9
_L17:
        if (f1 < 800F)
        {
            byte0 = 104;
        } else
        {
            byte0 = 105;
        }
          goto _L9
_L20:
        if (f1 < 400F)
        {
            if (f < 50F)
            {
                byte0 = 100;
            } else
            {
                byte0 = 102;
            }
        } else
        if (f1 < 1500F)
        {
            byte0 = 104;
        } else
        {
            byte0 = 105;
        }
          goto _L9
_L15:
        if (f1 < 1000F)
        {
            if (f < 200F)
            {
                byte0 = 100;
            } else
            {
                byte0 = 102;
            }
        } else
        if (f1 < 3000F)
        {
            byte0 = 104;
        } else
        {
            byte0 = 105;
        }
          goto _L9
    }

    private final void sendDownloadGeofenceEvent()
    {
        Logger.Debug("GTS_sendDownloadEvent", this);
        try
        {
            DownloadGeoFencesEvent downloadgeofencesevent = new DownloadGeoFencesEvent(this);
            mController.sendEvent(downloadgeofencesevent, null);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("Error in sendDownloadEvent", exception);
        }
    }

    private final void sendEvent(Location location)
    {
        Logger.Debug("GTS_sendEvent", this);
        Logger.Debug("Entry or Exit event confirmed, fire entry event.", this);
        try
        {
            GeoFenceEntryEvent geofenceentryevent = new GeoFenceEntryEvent(this);
            geofenceentryevent.setEventLocation(location);
            mController.sendEvent(geofenceentryevent, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            Logger.Error("Error in sendEvent", location);
        }
    }

    private void stopAll()
    {
        Logger.Debug((new StringBuilder()).append("GTS_stopAll, intsance - ").append(this).toString(), this);
        try
        {
            mHandler.removeCallbacks(stopServiceRunnable);
            if (mLocationManager.isMonitoring())
            {
                mLocationManager.stopMontioring();
            }
            if (mActivityManager.isMonitoring())
            {
                mActivityManager.stopMontioring();
            }
            stopSelf();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("Error in stopAll", exception);
        }
    }

    public final void handleEntry(List list)
    {
        Logger.Debug("GTS_handleEntry", this);
        try
        {
            mLocationManager.startMonitoring();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Logger.Error("Error in handleEntry", list);
        }
    }

    public final void handleExit(List list)
    {
        Logger.Debug("GTS_handleExit", this);
        boolean flag1 = false;
        boolean flag = flag1;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        Iterator iterator;
        try
        {
            iterator = list.iterator();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Logger.Error("Error in handleExit", list);
            return;
        }
        flag = flag1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (!"Monitoring-Region-ID".equals(((Geofence)iterator.next()).getRequestId()))
        {
            break MISSING_BLOCK_LABEL_24;
        }
        flag = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        DigbyController.getInstance(this).sendEvent(new DownloadGeoFencesEvent(this), null);
        if (!flag || list == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (list.size() == 1)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        mLocationManager.startMonitoring();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        Logger.Debug((new StringBuilder()).append("GTS_onCreate, intsance - ").append(this).toString(), this);
        super.onCreate();
        try
        {
            mController = DigbyController.getInstance(this);
            mGeofenceManager = GeofenceManager.getInstance(this);
            mLocationManager = new com.digby.mm.android.library.location.impl.LocationManager(this);
            mActivityManager = new ActivityManager(this);
            mAlarmManager = new DownloadGeofenceAlarmManager(this);
            mHandler.postDelayed(stopServiceRunnable, 60000L);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("Error in onCreate", exception);
        }
    }

    public void onDestroy()
    {
        Logger.Debug((new StringBuilder()).append("GTS_onDestroy, intsance - ").append(this).toString(), this);
        super.onDestroy();
        try
        {
            if (mLocationManager.isMonitoring())
            {
                mLocationManager.stopMontioring();
            }
            mLocationManager = null;
            if (mActivityManager.isMonitoring())
            {
                mActivityManager.stopMontioring();
            }
            mActivityManager = null;
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("Error in onDestroy", exception);
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Logger.Debug((new StringBuilder()).append("GTS_onStartCommand, intsance - ").append(this).toString(), this);
        String s;
        s = intent.getAction();
        Logger.Debug((new StringBuilder()).append("action: ").append(s).toString(), this);
        if (!LocationClient.hasError(intent))
        {
            break MISSING_BLOCK_LABEL_156;
        }
        i = LocationClient.getErrorCode(intent);
        intent = StatusCodesUtils.getLocationStatus(i);
        Logger.Debug((new StringBuilder()).append("GTS_onStartCommand, hasError: ").append(intent).append("code:").append(i).toString(), this);
        if (i == 1000)
        {
            try
            {
                Logger.Debug("GEOFENCE_NOT_AVAILABLE Error, switch to proximity alert.", this);
                mGeofenceManager = GeofenceManager.getInstance(this);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Logger.Error("Error in onStartCommand", intent);
            }
            break MISSING_BLOCK_LABEL_276;
        }
        Logger.Debug("Stop all", this);
        stopAll();
        break MISSING_BLOCK_LABEL_276;
        if ("Action_Geofence_Breached".equals(s))
        {
            handleGeofenceBreach(intent);
            break MISSING_BLOCK_LABEL_276;
        }
        if ("Action_Proximity_Alert_Received".equals(s))
        {
            handleProximityAlertReceived(intent);
            break MISSING_BLOCK_LABEL_276;
        }
        if ("Action_Location_Updated".equals(s))
        {
            handleLocationUpdates(intent);
            break MISSING_BLOCK_LABEL_276;
        }
        if ("Action_Action_Detected".equals(s))
        {
            handleActivityDetected(intent);
            break MISSING_BLOCK_LABEL_276;
        }
        if ("Action_Wakeup_Alarm".equals(s))
        {
            handleDownloadGeofenceWakeupAlarm();
            break MISSING_BLOCK_LABEL_276;
        }
        if ("providerEnabled".equals(s) || "android.location.PROVIDERS_CHANGED".equals(s))
        {
            handleLocationProviderChanged();
        }
        return 1;
    }

}
