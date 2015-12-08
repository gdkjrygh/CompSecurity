// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.config.featurecontrol.FeatureSet;
import com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.gms.location.Geofence;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class GeofencingServiceDebugMonitor
{

    private static final String TAG = com/google/android/apps/wallet/geofencing/service/GeofencingServiceDebugMonitor.getSimpleName();
    private final Context application;
    private final FeatureSet featureSet;
    private final GeofencingServiceDebugInfo geofencingServiceDebugInfo;

    GeofencingServiceDebugMonitor(Application application1, FeatureSet featureset, GeofencingServiceDebugInfo geofencingservicedebuginfo)
    {
        application = application1;
        featureSet = featureset;
        geofencingServiceDebugInfo = geofencingservicedebuginfo;
    }

    private Intent createMonitoringBroadcastIntent()
    {
        return InternalIntents.forAction(application, "com.google.android.apps.wallet.services.geofencing.monitor.MONITORING_BROADCAST");
    }

    private static String exitZoneToString(com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.ExitZone exitzone)
    {
        return String.format(Locale.ENGLISH, "%f:%f:%f", new Object[] {
            Double.valueOf(Protos.valueWithDefault(exitzone.center.latitude, 0.0D)), Double.valueOf(Protos.valueWithDefault(exitzone.center.longitude, 0.0D)), Float.valueOf(Protos.valueWithDefault(exitzone.radiusInMeters, 150F))
        });
    }

    private static ArrayList exitZonesToArrayList(List list)
    {
        ArrayList arraylist = Lists.newArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(exitZoneToString((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.ExitZone)list.next()))) { }
        return arraylist;
    }

    private static ArrayList geofencesToArrayList(List list)
    {
        ArrayList arraylist = Lists.newArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(((Geofence)list.next()).getRequestId())) { }
        return arraylist;
    }

    private static String zoneToString(com.google.wallet.proto.api.NanoWalletLocation.Zone zone)
    {
        return String.format(Locale.ENGLISH, "%f:%f:%f", new Object[] {
            Double.valueOf(Protos.valueWithDefault(zone.center.latitude, 0.0D)), Double.valueOf(Protos.valueWithDefault(zone.center.longitude, 0.0D)), Float.valueOf(Protos.valueWithDefault(zone.radiusInMeters, 150F))
        });
    }

    private static ArrayList zonesToArrayList(List list)
    {
        ArrayList arraylist = Lists.newArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(zoneToString((com.google.wallet.proto.api.NanoWalletLocation.Zone)list.next()))) { }
        return arraylist;
    }

    public final void log(String s)
    {
        geofencingServiceDebugInfo.logMessage(s);
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            Intent intent = createMonitoringBroadcastIntent();
            intent.putExtra("MONITORING_MESSAGE_TYPE", "LOG_MESSAGE");
            intent.putExtra("LOG_MESSAGE_KEY", s);
            application.sendBroadcast(intent);
        }
    }

    public final void noNetworkAccess(String s)
    {
        geofencingServiceDebugInfo.logMessage(s);
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            s = createMonitoringBroadcastIntent();
            s.putExtra("MONITORING_MESSAGE_TYPE", "NO_NETWORK_ACCESS");
            application.sendBroadcast(s);
        }
    }

    public final void onCrossBoundary(Location location, int i, List list)
    {
        Object obj;
        if (i == 1)
        {
            obj = "entering";
        } else
        if (i == 4)
        {
            obj = "dwelling";
        } else
        if (i == 2)
        {
            obj = "exiting";
        } else
        {
            obj = "unknown";
        }
        geofencingServiceDebugInfo.cacheCrossBoundaryInfo(location, ((String) (obj)), list);
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            list = geofencesToArrayList(list);
            WLog.dfmt(TAG, "onCrossBoundary: %s - %s %s", new Object[] {
                location, obj, Joiner.on(',').join(list)
            });
            obj = createMonitoringBroadcastIntent();
            ((Intent) (obj)).putExtra("MONITORING_MESSAGE_TYPE", "ON_CROSS_BOUNDARY");
            ((Intent) (obj)).putExtra("LOCATION_KEY", location);
            ((Intent) (obj)).putStringArrayListExtra("GEOFENCES_KEY", list);
            ((Intent) (obj)).putExtra("TRANSITION_KEY", i);
            application.sendBroadcast(((Intent) (obj)));
        }
    }

    public final void onLeaveExitZone(Location location, List list)
    {
        geofencingServiceDebugInfo.cacheLeaveExitZoneInfo(location, list);
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            list = geofencesToArrayList(list);
            WLog.dfmt(TAG, "onLeaveExitZone: %s - %s", new Object[] {
                location, Joiner.on(',').join(list)
            });
            Intent intent = createMonitoringBroadcastIntent();
            intent.putExtra("MONITORING_MESSAGE_TYPE", "ON_LEAVE_EXIT_ZONE");
            intent.putExtra("LOCATION_KEY", location);
            intent.putStringArrayListExtra("GEOFENCES_KEY", list);
            application.sendBroadcast(intent);
        }
    }

    public final void onLocationReady(Location location)
    {
        geofencingServiceDebugInfo.logMessage(String.format("onLocationReady: %s", new Object[] {
            location
        }));
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            Intent intent = createMonitoringBroadcastIntent();
            intent.putExtra("MONITORING_MESSAGE_TYPE", "ON_LOCATION_READY");
            intent.putExtra("LOCATION_KEY", location);
            application.sendBroadcast(intent);
        }
    }

    public final void onRequestLocation()
    {
        geofencingServiceDebugInfo.logMessage("onRequestLocation");
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            Intent intent = createMonitoringBroadcastIntent();
            intent.putExtra("MONITORING_MESSAGE_TYPE", "ON_REQUEST_LOCATION");
            application.sendBroadcast(intent);
        }
    }

    public final void onStart()
    {
        geofencingServiceDebugInfo.logMessage("onStart geofencing service");
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            Intent intent = createMonitoringBroadcastIntent();
            intent.putExtra("MONITORING_MESSAGE_TYPE", "ON_START");
            application.sendBroadcast(intent);
        }
    }

    public final void onStop()
    {
        geofencingServiceDebugInfo.logMessage("onStop geofencing service");
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            Intent intent = createMonitoringBroadcastIntent();
            intent.putExtra("MONITORING_MESSAGE_TYPE", "ON_STOP");
            application.sendBroadcast(intent);
        }
    }

    public final void onUpdateExitZoneGeofences(Location location, boolean flag, List list, List list1)
    {
        geofencingServiceDebugInfo.cacheUpdateExitZonesInfo(flag, location, list1);
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            list1 = geofencesToArrayList(list1);
            list = exitZonesToArrayList(list);
            WLog.dfmt(TAG, "onUpdateExitZoneGeofences: %s - %s %s", new Object[] {
                location, Joiner.on(',').join(list), Joiner.on(',').join(list1)
            });
            Intent intent = createMonitoringBroadcastIntent();
            intent.putExtra("MONITORING_MESSAGE_TYPE", "SEND_EXIT_ZONES");
            intent.putExtra("LOCATION_KEY", location);
            intent.putExtra("ALLOW_REMOVING_NOTIFICATION_KEY", flag);
            intent.putStringArrayListExtra("EXIT_ZONES_KEY", list);
            intent.putStringArrayListExtra("GEOFENCES_KEY", list1);
            application.sendBroadcast(intent);
        }
    }

    public final void onUpdateGeofences(Location location, List list, List list1, com.google.wallet.proto.api.NanoWalletLocation.Zone zone)
    {
        geofencingServiceDebugInfo.cacheUpdateGeofencesInfo(location, list1, zone);
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            list1 = geofencesToArrayList(list1);
            zone = zoneToString(zone);
            list = zonesToArrayList(list);
            WLog.dfmt(TAG, "onUpdateGeofences: %s - %s %s %s", new Object[] {
                location, zone, Joiner.on(',').join(list), Joiner.on(',').join(list1)
            });
            Intent intent = createMonitoringBroadcastIntent();
            intent.putExtra("MONITORING_MESSAGE_TYPE", "SEND_ZONES");
            intent.putExtra("LOCATION_KEY", location);
            intent.putExtra("CACHED_AREA_KEY", zone);
            intent.putStringArrayListExtra("ZONES_KEY", list);
            intent.putStringArrayListExtra("GEOFENCES_KEY", list1);
            application.sendBroadcast(intent);
        }
    }

}
