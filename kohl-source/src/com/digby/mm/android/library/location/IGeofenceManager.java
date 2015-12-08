// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location;

import android.location.Location;
import com.digby.mm.android.library.geoshape.IGeoShape;
import java.util.List;

public interface IGeofenceManager
{

    public static final String ACTION_GEOFENCE_BREACHED = "Action_Geofence_Breached";
    public static final String ACTION_PROXIMITY_ALERT_RECEIVED = "Action_Proximity_Alert_Received";
    public static final int MAX_ALLOW_GEOFENCES = 99;
    public static final String MONITORING_REGION_REQUEST_ID = "Monitoring-Region-ID";
    public static final int TYPE_GEOFENCE_MONITORING_GEOFENCING = 2;
    public static final int TYPE_GEOFENCE_MONITORING_PROXIMITY_ALERT = 1;
    public static final int TYPE_GEOFENCE_MONITORING_UNKNOWN = -1;

    public abstract void addGeofences(List list, boolean flag);

    public abstract List getGeofences();

    public abstract IGeoShape getNearestGeoShape(Location location);

    public abstract void removeAllGeofences();

    public abstract void removeGeofences(List list);
}
