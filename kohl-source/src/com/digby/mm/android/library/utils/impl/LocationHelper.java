// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.digby.mm.android.library.utils.ILocationHelper;
import com.digby.mm.android.library.utils.Logger;
import java.util.Iterator;
import java.util.List;

public class LocationHelper
    implements ILocationHelper
{

    private static final long TEN_SECONDS = 10000L;
    private Context mContext;
    private Location mFreshLocation;

    public LocationHelper(Context context)
    {
        mContext = context;
    }

    public Location getBestAccurateCachedLocation()
    {
        float f;
        Object obj;
        Object obj1;
        Location location;
        long l;
        location = null;
        obj = null;
        f = 3.402823E+38F;
        l = 0x8000000000000000L;
        obj1 = location;
        LocationManager locationmanager = (LocationManager)mContext.getSystemService("location");
        obj1 = location;
        long l2 = System.currentTimeMillis() - 10000L;
        obj1 = location;
        Object obj2 = locationmanager.getAllProviders();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj1 = location;
        if (!((List) (obj2)).isEmpty()) goto _L3; else goto _L2
_L3:
        obj1 = location;
        obj2 = ((List) (obj2)).iterator();
_L6:
        obj1 = obj;
        if (!((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj1 = obj;
        String s = (String)((Iterator) (obj2)).next();
        obj1 = obj;
        location = locationmanager.getLastKnownLocation(s);
        if (location == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        float f1 = location.getAccuracy();
        obj1 = obj;
        long l1 = location.getTime();
        obj1 = obj;
        Logger.Debug((new StringBuilder()).append("getBestAccurateCachedLocation - provider:").append(s).append(", time:").append(l1).append(", accuracy:").append(f1).toString(), mContext);
        if (l1 > l2 && f1 < f)
        {
            obj = location;
            f = f1;
            l = l1;
        } else
        if (l1 < l2 && f == 3.402823E+38F && l1 > l)
        {
            obj = location;
            l = l1;
        }
        continue; /* Loop/switch isn't completed */
        obj1 = obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        obj1 = obj;
        Logger.Debug((new StringBuilder()).append("Result of getBestAccurateCachedLocation - provider:").append(((Location) (obj)).getProvider()).append(", time:").append(((Location) (obj)).getTime()).append(", accuracy:").append(((Location) (obj)).getAccuracy()).toString(), mContext);
        obj1 = obj;
_L4:
        return ((Location) (obj1));
        obj;
        Logger.Error("getBestLastKnownLocation", ((Exception) (obj)));
        if (true) goto _L4; else goto _L2
_L2:
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Location getBestCachedLocation()
    {
        Object obj = null;
        Location location2 = obj;
        Location location;
        Location location1;
        Location location3;
        LocationManager locationmanager;
        try
        {
            locationmanager = (LocationManager)mContext.getSystemService("location");
        }
        catch (Exception exception)
        {
            Logger.Error("getBestLastKnownLocation", exception);
            return location2;
        }
        location = null;
        location1 = null;
        location2 = obj;
        if (!locationmanager.isProviderEnabled("gps"))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        location2 = obj;
        location3 = locationmanager.getLastKnownLocation("gps");
        location = location3;
        if (location3 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        location2 = obj;
        Logger.Debug((new StringBuilder()).append("getBestCachedLocation - provider:gps, time:").append(location3.getTime()).append(", accuracy:").append(location3.getAccuracy()).toString(), mContext);
        location = location3;
        location2 = obj;
        if (!locationmanager.isProviderEnabled("network"))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        location2 = obj;
        location3 = locationmanager.getLastKnownLocation("network");
        location1 = location3;
        if (location3 == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        location2 = obj;
        Logger.Debug((new StringBuilder()).append("getBestCachedLocation - provider:network, time:").append(location3.getTime()).append(", accuracy:").append(location3.getAccuracy()).toString(), mContext);
        location1 = location3;
        if (location == null || location1 == null) goto _L2; else goto _L1
_L1:
        location2 = obj;
        if (location.getTime() < location1.getTime())
        {
            location = location1;
        }
_L4:
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        location2 = location;
        Logger.Debug((new StringBuilder()).append("Result of getBestCachedLocation - provider:").append(location.getProvider()).append(", time:").append(location.getTime()).append(", accuracy:").append(location.getAccuracy()).toString(), mContext);
        return location;
_L2:
        if (location == null)
        {
            location = location1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
