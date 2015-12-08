// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.location.Address;
import android.location.Location;
import com.pinterest.activity.place.LocationProvider;
import com.pinterest.base.Application;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class LocationUtils
{

    public LocationUtils()
    {
    }

    public static float distanceFromMe(double d, double d1)
    {
        Location location = LocationProvider.getLastLocation(Application.context());
        if (location != null)
        {
            float af[] = new float[1];
            af[0] = 0.0F;
            Location.distanceBetween(d, d1, location.getLatitude(), location.getLongitude(), af);
            return af[0];
        } else
        {
            return -1F;
        }
    }

    public static String generalDisplay(Address address)
    {
        if (address == null)
        {
            return null;
        }
        String s = address.getSubAdminArea();
        String s1 = address.getAdminArea();
        address = address.getCountryName();
        ArrayList arraylist = new ArrayList();
        if (StringUtils.isNotBlank(s))
        {
            arraylist.add(s);
        }
        if (StringUtils.isNotBlank(s1))
        {
            arraylist.add(s1);
        }
        if (StringUtils.isNotBlank(address))
        {
            arraylist.add(address);
        }
        return StringUtils.join(arraylist, ", ");
    }
}
