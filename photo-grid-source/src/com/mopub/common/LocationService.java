// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.mopub.common.logging.MoPubLog;
import java.math.BigDecimal;

public class LocationService
{

    public LocationService()
    {
    }

    public static Location getLastKnownLocation(Context context, int i, MoPub.LocationAwareness locationawareness)
    {
        if (locationawareness != MoPub.LocationAwareness.DISABLED) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        Object obj1;
        context = (LocationManager)context.getSystemService("location");
        try
        {
            obj = context.getLastKnownLocation("gps");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MoPubLog.d("Failed to retrieve GPS location: access appears to be disabled.");
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MoPubLog.d("Failed to retrieve GPS location: device has no GPS provider.");
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MoPubLog.d("Failed to retrieve GPS location: device has no GPS provider.");
            obj = null;
        }
        try
        {
            context = context.getLastKnownLocation("network");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("Failed to retrieve network location: access appears to be disabled.");
            context = null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("Failed to retrieve network location: device has no network provider.");
            context = null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("Failed to retrieve GPS location: device has no network provider.");
            context = null;
        }
        if (obj == null && context == null) goto _L1; else goto _L3
_L3:
        if (obj == null || context == null) goto _L5; else goto _L4
_L4:
        if (((Location) (obj)).getTime() > context.getTime())
        {
            obj1 = obj;
        } else
        {
            obj1 = context;
        }
_L7:
        if (locationawareness == MoPub.LocationAwareness.TRUNCATED)
        {
            ((Location) (obj1)).setLatitude(BigDecimal.valueOf(((Location) (obj1)).getLatitude()).setScale(i, 5).doubleValue());
            ((Location) (obj1)).setLongitude(BigDecimal.valueOf(((Location) (obj1)).getLongitude()).setScale(i, 5).doubleValue());
        }
        return ((Location) (obj1));
_L5:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = context;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }
}
