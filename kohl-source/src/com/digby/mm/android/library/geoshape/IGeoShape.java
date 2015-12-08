// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geoshape;

import android.location.Location;
import com.google.android.gms.location.Geofence;

public interface IGeoShape
{

    public static final String PREFIX_GEOFENCE_TRACKING = "T-";

    public abstract void addProximityAlert();

    public abstract Geofence asGeofence();

    public abstract float distanceFromLocation(Location location);

    public abstract float distanceToBoundary(Location location);

    public abstract IGeoShape getGeoShapeForEntryTracking();

    public abstract String getRequestId();

    public abstract boolean isLocationInside(Location location);

    public abstract boolean isLocationOutside(Location location);

    public abstract void removeProximityAlert();
}
