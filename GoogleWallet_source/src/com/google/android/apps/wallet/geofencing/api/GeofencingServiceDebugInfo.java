// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.api;

import android.content.Context;
import android.location.Location;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.logging.BufferedLog;
import com.google.android.apps.wallet.util.location.SynchronizedLocationClient;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.gms.location.Geofence;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GeofencingServiceDebugInfo
{

    private static final String TAG = com/google/android/apps/wallet/geofencing/api/GeofencingServiceDebugInfo.getSimpleName();
    private boolean allowRemovingGeofencingNotification;
    private final BufferedLog bufferredLog;
    private Location crossBoundaryLocation;
    private long crossBoundaryTimeMillis;
    private String crossBoundaryTransition;
    private List crossBoundaryTriggeredGeoFences;
    private List exitZoneGeofences;
    private Location exitZoneUpdateLocation;
    private long exitZoneUpdateTimeMillis;
    private final FeatureManager featureManager;
    private final DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private com.google.wallet.proto.api.NanoWalletLocation.Zone geofenceRefreshZone;
    private Location geofenceUpdateLocation;
    private long geofenceUpdateTimeMillis;
    private List geofences;
    private Location leaveExitZoneLocation;
    private long leaveExitZoneTimeMillis;
    private List leaveExitZoneTriggeredGeofences;
    private final SynchronizedLocationClient synchronizedLocationClient;

    public GeofencingServiceDebugInfo(SynchronizedLocationClient synchronizedlocationclient, FeatureManager featuremanager)
    {
        synchronizedLocationClient = synchronizedlocationclient;
        featureManager = featuremanager;
        bufferredLog = new BufferedLog(TAG, 50, "yyyy-MM-dd HH:mm:ss.SSS");
    }

    private JSONObject createCrossBoundaryEventJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("location", createLocationJson(crossBoundaryLocation));
            jsonobject.put("time", formatter.format(new Date(crossBoundaryTimeMillis)));
            jsonobject.put("transistion type", crossBoundaryTransition);
            jsonobject.put("triggered geofences", createGeofencesJson(crossBoundaryTriggeredGeoFences));
        }
        catch (JSONException jsonexception)
        {
            bufferredLog.log(com.google.android.apps.wallet.logging.WLog.LogPriority.DEBUG, "Error converting cross boundary event to json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    private static JSONArray createGeofencesJson(List list)
    {
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(((Geofence)list.next()).toString())) { }
        return jsonarray;
    }

    private JSONObject createLeaveExitZoneEventJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("location", createLocationJson(leaveExitZoneLocation));
            jsonobject.put("time", formatter.format(new Date(leaveExitZoneTimeMillis)));
            jsonobject.put("geofences", createGeofencesJson(leaveExitZoneTriggeredGeofences));
        }
        catch (JSONException jsonexception)
        {
            bufferredLog.log(com.google.android.apps.wallet.logging.WLog.LogPriority.DEBUG, "Error converting leave exit zone event to json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    private static JSONObject createLocationJson(Location location)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("lat", location.getLatitude());
        jsonobject.put("long", location.getLongitude());
        return jsonobject;
    }

    private static JSONObject createPhysicalLocationJson(com.google.wallet.proto.NanoWalletEntities.PhysicalLocation physicallocation)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("lat", Protos.valueWithDefault(physicallocation.latitude, 0.0D));
        jsonobject.put("long", Protos.valueWithDefault(physicallocation.longitude, 0.0D));
        return jsonobject;
    }

    private JSONObject createReportHeaderJson(String s, Location location)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("wob id", s);
        s = TimeZone.getDefault();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s = s.getDisplayName();
_L1:
        jsonobject.put("timezone", s);
        jsonobject.put("current time", formatter.format(new Date(System.currentTimeMillis())));
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        jsonobject.put("current location", createLocationJson(location));
        return jsonobject;
        s = "unknown";
          goto _L1
        s;
        bufferredLog.log(com.google.android.apps.wallet.logging.WLog.LogPriority.DEBUG, "Error create report header.", s);
        return jsonobject;
    }

    private JSONObject createUpdateExitZoneEventJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("location", createLocationJson(exitZoneUpdateLocation));
            jsonobject.put("time", formatter.format(new Date(exitZoneUpdateTimeMillis)));
            jsonobject.put("allow removing notification", allowRemovingGeofencingNotification);
            jsonobject.put("geofences", createGeofencesJson(exitZoneGeofences));
        }
        catch (JSONException jsonexception)
        {
            bufferredLog.log(com.google.android.apps.wallet.logging.WLog.LogPriority.DEBUG, "Error converting update exit zone event to json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    private JSONObject createUpdateGeofenceZoneEventJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("location", createLocationJson(geofenceUpdateLocation));
            jsonobject.put("time", formatter.format(new Date(geofenceUpdateTimeMillis)));
            jsonobject.put("refresh zone", createZoneJson(geofenceRefreshZone));
            jsonobject.put("geofences", createGeofencesJson(geofences));
        }
        catch (JSONException jsonexception)
        {
            bufferredLog.log(com.google.android.apps.wallet.logging.WLog.LogPriority.DEBUG, "Error converting update geofence zone event to json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    private JSONObject createZoneJson(com.google.wallet.proto.api.NanoWalletLocation.Zone zone)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (zone.center != null)
        {
            jsonobject.put("center", createPhysicalLocationJson(zone.center));
        }
        jsonobject.put("radius", Protos.valueWithDefault(zone.radiusInMeters, 0.0F));
        jsonobject.put("dwelling duration", Protos.valueWithDefault(zone.dwellingDurationInMs, 0));
        return jsonobject;
    }

    private String formatJson(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.toString(2);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            bufferredLog.log(com.google.android.apps.wallet.logging.WLog.LogPriority.DEBUG, "Error formating json message.", jsonobject);
            return "";
        }
        return jsonobject;
    }

    public final void cacheCrossBoundaryInfo(Location location, String s, List list)
    {
        if (featureManager.isFeatureEnabled(Feature.WOB_NOTIFICATION_FEEDBACK))
        {
            crossBoundaryLocation = location;
            crossBoundaryTimeMillis = System.currentTimeMillis();
            crossBoundaryTransition = s;
            crossBoundaryTriggeredGeoFences = list;
            location = String.valueOf(formatJson(createCrossBoundaryEventJson()));
            if (location.length() != 0)
            {
                location = "Cross boundary\n".concat(location);
            } else
            {
                location = new String("Cross boundary\n");
            }
            logMessage(location);
        }
    }

    public final void cacheLeaveExitZoneInfo(Location location, List list)
    {
        if (featureManager.isFeatureEnabled(Feature.WOB_NOTIFICATION_FEEDBACK))
        {
            leaveExitZoneLocation = location;
            leaveExitZoneTimeMillis = System.currentTimeMillis();
            leaveExitZoneTriggeredGeofences = list;
            list = bufferredLog;
            location = String.valueOf(formatJson(createLeaveExitZoneEventJson()));
            if (location.length() != 0)
            {
                location = "Leave exit zone:\n".concat(location);
            } else
            {
                location = new String("Leave exit zone:\n");
            }
            list.log(location);
        }
    }

    public final void cacheUpdateExitZonesInfo(boolean flag, Location location, List list)
    {
        if (featureManager.isFeatureEnabled(Feature.WOB_NOTIFICATION_FEEDBACK))
        {
            allowRemovingGeofencingNotification = flag;
            exitZoneUpdateLocation = location;
            exitZoneUpdateTimeMillis = System.currentTimeMillis();
            exitZoneGeofences = list;
            location = String.valueOf(formatJson(createUpdateExitZoneEventJson()));
            if (location.length() != 0)
            {
                location = "Update exit zone\n".concat(location);
            } else
            {
                location = new String("Update exit zone\n");
            }
            logMessage(location);
        }
    }

    public final void cacheUpdateGeofencesInfo(Location location, List list, com.google.wallet.proto.api.NanoWalletLocation.Zone zone)
    {
        if (featureManager.isFeatureEnabled(Feature.WOB_NOTIFICATION_FEEDBACK))
        {
            geofenceUpdateLocation = location;
            geofenceUpdateTimeMillis = System.currentTimeMillis();
            geofenceRefreshZone = zone;
            geofences = list;
            location = String.valueOf(formatJson(createUpdateGeofenceZoneEventJson()));
            if (location.length() != 0)
            {
                location = "Update geofences\n".concat(location);
            } else
            {
                location = new String("Update geofences\n");
            }
            logMessage(location);
        }
    }

    public final void logMessage(String s)
    {
        if (featureManager.isFeatureEnabled(Feature.WOB_NOTIFICATION_FEEDBACK))
        {
            bufferredLog.log(s);
        }
    }

    public final void logMessage(String s, Throwable throwable)
    {
        if (featureManager.isFeatureEnabled(Feature.WOB_NOTIFICATION_FEEDBACK))
        {
            bufferredLog.log(s, throwable);
        }
    }

    public final String outputDebugInfo(Context context, String s)
    {
        Object obj;
        Object obj1;
        if (!featureManager.isFeatureEnabled(Feature.WOB_NOTIFICATION_FEEDBACK))
        {
            return "";
        }
        obj1 = null;
        obj = obj1;
        synchronizedLocationClient.connect(context);
        context = synchronizedLocationClient.getLastLocation();
        obj = context;
        synchronizedLocationClient.disconnect();
_L1:
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("header", createReportHeaderJson(s, context));
            if (crossBoundaryLocation != null)
            {
                ((JSONObject) (obj)).put("last cross boundary event", createCrossBoundaryEventJson());
            }
            if (geofenceUpdateLocation != null)
            {
                ((JSONObject) (obj)).put("last update geofence event", createUpdateGeofenceZoneEventJson());
            }
            if (leaveExitZoneLocation != null)
            {
                ((JSONObject) (obj)).put("last leave exit zone event", createLeaveExitZoneEventJson());
            }
            if (exitZoneUpdateLocation != null)
            {
                ((JSONObject) (obj)).put("last update exit zone event", createUpdateExitZoneEventJson());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            bufferredLog.log(com.google.android.apps.wallet.logging.WLog.LogPriority.DEBUG, "Error converting geofencing info to json.", context);
        }
        context = new StringBuilder();
        context.append(formatJson(((JSONObject) (obj))));
        context.append("\n========Log Messages========\n");
        context.append(bufferredLog.getRecentMessages());
        return context.toString();
        context;
        obj = obj1;
        synchronizedLocationClient.disconnect();
        obj = obj1;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            bufferredLog.log(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Unable to get last location.", context);
        }
        context = ((Context) (obj));
          goto _L1
    }

}
