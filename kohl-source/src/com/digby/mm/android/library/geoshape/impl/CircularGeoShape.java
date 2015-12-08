// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geoshape.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.services.impl.GeofenceTransitionsService;
import com.digby.mm.android.library.utils.Logger;
import com.google.android.gms.location.Geofence;
import java.util.Locale;
import org.json.JSONObject;

public class CircularGeoShape
    implements IGeoShape
{

    private static final float ENTRY_RADIUS_DELTA = 500F;
    private static final int LOITERING_DELAY_MS = 0x493e0;
    private static final String mTypeID = "CIRCLE";
    private Context mContext;
    private double mLatitude;
    private double mLongitude;
    private IGeoFence mParent;
    private float mRadius;
    private boolean trackingGeoShape;

    public CircularGeoShape(double d, double d1, float f)
    {
        trackingGeoShape = false;
        mLatitude = d;
        mLongitude = d1;
        mRadius = f;
    }

    private CircularGeoShape(double d, double d1, float f, IGeoFence igeofence, Context context)
    {
        trackingGeoShape = false;
        mLatitude = d;
        mLongitude = d1;
        mRadius = f;
        mParent = igeofence;
        mContext = context;
    }

    public CircularGeoShape(JSONObject jsonobject, IGeoFence igeofence, Context context)
    {
        trackingGeoShape = false;
        try
        {
            mLatitude = jsonobject.getDouble("latitude");
            mLongitude = jsonobject.getDouble("longitude");
            mRadius = (float)jsonobject.getDouble("radius");
            mParent = igeofence;
            mContext = context;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Logger.Error("CircularGeoShape", jsonobject);
        }
    }

    private PendingIntent createProximityIntent()
    {
        Logger.Debug((new StringBuilder()).append("Creating new proximity intent for Geofence (").append(getRequestId()).append("; ").append(mParent.getName()).append(")").toString(), mContext);
        Object obj;
        int i;
        long l;
        long l1;
        try
        {
            l1 = mParent.getID();
        }
        catch (Exception exception)
        {
            Logger.Error("createProximityIntent", exception);
            return null;
        }
        l = l1;
        if (isTrackingGeoShape())
        {
            l = l1 * -1L;
        }
        i = (int)(l % 0x7fffffffL);
        obj = new Intent(mContext, com/digby/mm/android/library/services/impl/GeofenceTransitionsService);
        ((Intent) (obj)).setAction("Action_Proximity_Alert_Received");
        ((Intent) (obj)).putExtra("RequestId", getRequestId());
        obj = PendingIntent.getService(mContext.getApplicationContext(), i, ((Intent) (obj)), 0x10000000);
        return ((PendingIntent) (obj));
    }

    private float getRadiusForEntryTracking()
    {
        return mRadius + 500F;
    }

    public static String getTypeID()
    {
        return "CIRCLE";
    }

    private final boolean isTrackingGeoShape()
    {
        return trackingGeoShape;
    }

    public void addProximityAlert()
    {
        try
        {
            Logger.Debug("Adding Proximity Alert", mContext);
            PendingIntent pendingintent = createProximityIntent();
            ((LocationManager)mContext.getSystemService("location")).addProximityAlert(mLatitude, mLongitude, mRadius, -1L, pendingintent);
            Logger.Debug((new StringBuilder()).append("Added proximity alert for Geofence (").append(mParent.getID()).append("; ").append(mParent.getName()).append(")").toString(), mContext);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("addProximityAlert", exception);
        }
    }

    public Geofence asGeofence()
    {
        com.google.android.gms.location.Geofence.Builder builder = (new com.google.android.gms.location.Geofence.Builder()).setCircularRegion(mLatitude, mLongitude, mRadius).setExpirationDuration(-1L).setRequestId(getRequestId()).setLoiteringDelay(0x493e0);
        if (isTrackingGeoShape())
        {
            builder.setTransitionTypes(1);
        } else
        {
            builder.setTransitionTypes(3);
        }
        return builder.build();
    }

    public float distanceFromLocation(Location location)
    {
        float f;
        try
        {
            Location location1 = new Location("network");
            location1.setLatitude(getLatitude());
            location1.setLongitude(getLongitude());
            f = location1.distanceTo(location);
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            Logger.Error("distanceFromLocation", location);
            return -1F;
        }
        return f;
    }

    public float distanceToBoundary(Location location)
    {
        float f1 = distanceFromLocation(location);
        float f = -1F;
        if (f1 > 0.0F)
        {
            f = Math.abs(mRadius - f1);
        }
        return f;
    }

    public IGeoShape getGeoShapeForEntryTracking()
    {
        CircularGeoShape circulargeoshape = new CircularGeoShape(mLatitude, mLongitude, getRadiusForEntryTracking(), mParent, mContext);
        circulargeoshape.trackingGeoShape = true;
        return circulargeoshape;
    }

    public double getLatitude()
    {
        return mLatitude;
    }

    public double getLongitude()
    {
        return mLongitude;
    }

    public float getRadius()
    {
        return mRadius;
    }

    public final String getRequestId()
    {
        long l = mParent.getID();
        if (isTrackingGeoShape())
        {
            return (new StringBuilder()).append("T-").append(l).toString();
        } else
        {
            return String.valueOf(l);
        }
    }

    public boolean isLocationInside(Location location)
    {
        float f;
        float f1;
        float f2;
        try
        {
            Location location1 = new Location("network");
            location1.setLatitude(getLatitude());
            location1.setLongitude(getLongitude());
            f = location1.distanceTo(location);
            f1 = location.getAccuracy();
            f2 = getRadius();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            Logger.Error("isLocationInside", location);
            return false;
        }
        return f1 + f < f2;
    }

    public boolean isLocationOutside(Location location)
    {
        float f;
        float f1;
        float f2;
        try
        {
            Location location1 = new Location("network");
            location1.setLatitude(getLatitude());
            location1.setLongitude(getLongitude());
            f = location1.distanceTo(location);
            f1 = location.getAccuracy();
            f2 = getRadius();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            Logger.Error("isLocationInside", location);
            return false;
        }
        return f - f1 > f2;
    }

    public void removeProximityAlert()
    {
        try
        {
            Logger.Debug("Removing Proximity Alert", mContext);
            PendingIntent pendingintent = createProximityIntent();
            ((LocationManager)mContext.getSystemService("location")).removeProximityAlert(pendingintent);
            Logger.Debug((new StringBuilder()).append("Removed proximity alert for Geofence (").append(mParent.getID()).append("; ").append(mParent.getName()).append(")").toString(), mContext);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("removeProximityAlert", exception);
        }
    }

    public String toString()
    {
        return String.format(Locale.US, "{latitude: %f, longitude: %f}", new Object[] {
            Double.valueOf(mLatitude), Double.valueOf(mLongitude)
        });
    }
}
