// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.services.impl.GeofenceTransitionsService;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.Logger;
import com.digby.mm.android.library.utils.impl.LocationHelper;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.digby.mm.android.library.location.impl:
//            GeofenceManager

public class ProximityAlertGeofenceManager extends GeofenceManager
{

    ProximityAlertGeofenceManager(Context context)
    {
        super(context);
    }

    private PendingIntent createIntent()
    {
        int i = (int)(0xffffffff80000000L % 0x7fffffffL);
        Intent intent = new Intent(mContext, com/digby/mm/android/library/services/impl/GeofenceTransitionsService);
        intent.setAction("Action_Proximity_Alert_Received");
        intent.putExtra("RequestId", "Monitoring-Region-ID");
        return PendingIntent.getService(mContext.getApplicationContext(), i, intent, 0x10000000);
    }

    public void addGeofences(List list, boolean flag)
    {
        if (flag)
        {
            Location location1 = (new LocationHelper(mContext)).getBestCachedLocation();
            Location location = location1;
            if (location1 == null)
            {
                location = (new LocationHelper(mContext)).getBestCachedLocation();
            }
            if (location != null)
            {
                int i = Integer.valueOf(DigbyController.getInstance(mContext).getSettings().getSearchRadiusInMeters()).intValue() / 2;
                Logger.Debug((new StringBuilder()).append("Change monitor region ").append(i).append(" to: https://www.google.com/#q=").append(location.getLatitude()).append("%2C%20").append(location.getLongitude()).toString(), mContext);
                ((LocationManager)mContext.getSystemService("location")).addProximityAlert(location.getLatitude(), location.getLongitude(), i, -1L, createIntent());
            }
        }
        if (list == null || list.isEmpty())
        {
            Logger.Debug("geoshapes is empty, nothing to add.", mContext);
        } else
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                IGeoShape igeoshape = (IGeoShape)list.next();
                try
                {
                    igeoshape.addProximityAlert();
                }
                catch (Exception exception)
                {
                    Logger.Error("addGeofences failed", exception);
                }
            }
        }
    }

    public void removeGeofences(List list)
    {
        if (list == null || list.isEmpty())
        {
            Logger.Debug("geoshapes is empty, nothing to remove.", mContext);
        } else
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                IGeoShape igeoshape = (IGeoShape)list.next();
                try
                {
                    igeoshape.removeProximityAlert();
                }
                catch (Exception exception)
                {
                    Logger.Error("removeAllGeofences failed", exception);
                }
            }
        }
    }
}
