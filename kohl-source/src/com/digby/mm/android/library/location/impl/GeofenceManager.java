// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.GeoFenceDBHelper;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.location.IGeofenceManager;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import com.digby.mm.android.library.utils.impl.SharedPrefsManager;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.digby.mm.android.library.location.impl:
//            GeofencingGeofenceManager, ProximityAlertGeofenceManager

public abstract class GeofenceManager
    implements IGeofenceManager
{

    private static IGeofenceManager geofencingGeofenceManager = null;
    private static IGeofenceManager proximityAlertGeofenceManager = null;
    protected List allGeoshapes;
    protected Context mContext;

    GeofenceManager(Context context)
    {
        allGeoshapes = new ArrayList();
        mContext = context;
    }

    private static int getGeofenceMonitoringType(Context context)
    {
        while (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0 || !((LocationManager)context.getSystemService("location")).isProviderEnabled("network")) 
        {
            return 1;
        }
        return 2;
    }

    private List getGeoshapeFromDatabase()
    {
        ArrayList arraylist = new ArrayList();
        try
        {
            Object obj = (new GeoFenceDBHelper(new DigbyDBHelper(mContext))).getGeoFences();
            if (((List) (obj)).size() > 0)
            {
                IGeoFence igeofence;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(igeofence.getGeoShape().getGeoShapeForEntryTracking()))
                {
                    igeofence = (IGeoFence)((Iterator) (obj)).next();
                    arraylist.add(igeofence.getGeoShape());
                }

            }
        }
        catch (Exception exception)
        {
            Logger.Error("Error in getGeoshapeFromDatabase", exception);
        }
        return arraylist;
    }

    public static IGeofenceManager getInstance(Context context)
    {
        Logger.Debug("GeofenceManager_getInstance", context);
        int i = getGeofenceMonitoringType(context);
        switchGeofenceManagerIfNeed(context, i);
        if (2 == i)
        {
            if (geofencingGeofenceManager == null)
            {
                geofencingGeofenceManager = new GeofencingGeofenceManager(context);
            }
            return geofencingGeofenceManager;
        }
        if (proximityAlertGeofenceManager == null)
        {
            proximityAlertGeofenceManager = new ProximityAlertGeofenceManager(context);
        }
        return proximityAlertGeofenceManager;
    }

    private static void switchGeofenceManagerIfNeed(Context context, int i)
    {
        SharedPrefsManager sharedprefsmanager = new SharedPrefsManager(context);
        int j = sharedprefsmanager.getCurrentGeofenceManager();
        if (j == i)
        {
            Logger.Debug("Nothing to switch, just returns based on currentGeofenceMonitoringType", context);
            return;
        }
        Logger.Debug("Type changes, need do the \"switch\"", context);
        if (j == -1)
        {
            Logger.Debug("Nothing to do here, just need call sharedPrefsManager.setCurrentGeofenceManager(newGeofenceMonitoringType);", context);
        } else
        if (j == 1)
        {
            Logger.Debug("Switch from Proximity alert to Geofencing API", context);
            if (proximityAlertGeofenceManager == null)
            {
                proximityAlertGeofenceManager = new ProximityAlertGeofenceManager(context);
            }
            proximityAlertGeofenceManager.removeAllGeofences();
            if (geofencingGeofenceManager == null)
            {
                geofencingGeofenceManager = new GeofencingGeofenceManager(context);
            }
            geofencingGeofenceManager.addGeofences(geofencingGeofenceManager.getGeofences(), true);
        } else
        if (j == 2)
        {
            Logger.Debug("Switch from Geofencing API to Proximity alert", context);
            if (proximityAlertGeofenceManager == null)
            {
                proximityAlertGeofenceManager = new ProximityAlertGeofenceManager(context);
            }
            proximityAlertGeofenceManager.addGeofences(proximityAlertGeofenceManager.getGeofences(), true);
        } else
        {
            Logger.Debug((new StringBuilder()).append("Switch from ").append(j).append(" to ").append(i).append(", this should NOT happen").toString(), context);
        }
        sharedprefsmanager.setCurrentGeofenceManager(i);
    }

    public List getGeofences()
    {
        try
        {
            if (allGeoshapes.isEmpty())
            {
                allGeoshapes = getGeoshapeFromDatabase();
            }
        }
        catch (Exception exception)
        {
            Logger.Error("Error in getGeoshapeFromDatabase", exception);
        }
        return allGeoshapes;
    }

    public IGeoShape getNearestGeoShape(Location location)
    {
        if (location != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((IGeoShape) (obj));
_L2:
        float f;
        float f1;
        IGeoShape igeoshape;
        Iterator iterator;
        String s;
        try
        {
            obj = getGeofences();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            Logger.Error("Error in getNearestGeoShape", location);
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        f = 3.402823E+38F;
        igeoshape = null;
        iterator = ((List) (obj)).iterator();
_L6:
        obj = igeoshape;
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj = (IGeoShape)iterator.next();
        s = ((IGeoShape) (obj)).getRequestId();
        if (!StringUtils.isNotBlank(s) || !s.startsWith("T-")) goto _L6; else goto _L5
_L5:
        f1 = ((IGeoShape) (obj)).distanceToBoundary(location);
        if (f1 < f)
        {
            f = f1;
            igeoshape = ((IGeoShape) (obj));
        }
          goto _L6
        return null;
    }

    public void removeAllGeofences()
    {
        removeGeofences(getGeofences());
    }

}
