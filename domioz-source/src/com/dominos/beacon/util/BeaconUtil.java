// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.util;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class BeaconUtil
{

    private static final int MAX_ADDRESS_RESULTS = 1;
    private static final String PROD_UUID = "d8db1b53-006f-453a-b832-0f8d6bc3b35f";
    private static final String TAG = com/dominos/beacon/util/BeaconUtil.getSimpleName();
    private static final String TEST_UUID = "6e64f8d0-c4a6-48d1-9519-ac2a601622b8";

    public BeaconUtil()
    {
    }

    public static Address createAddressFromLocation(Context context, Double double1, Double double2)
    {
        context = new Geocoder(context, Locale.getDefault());
        context = context.getFromLocation(double1.doubleValue(), double2.doubleValue(), 1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (context.isEmpty())
        {
            return null;
        }
        try
        {
            context = (Address)context.get(0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            LogUtil.e(TAG, context.getMessage(), new Object[0]);
            context = null;
        }
        return context;
        return null;
    }

    public static List createAddressListFromLocationNames(Context context, List list)
    {
        Geocoder geocoder;
        if (list == null || list.isEmpty())
        {
            return null;
        }
        geocoder = new Geocoder(context);
        context = new ArrayList();
        list = list.iterator();
_L2:
        List list1;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_108;
            }
            list1 = geocoder.getFromLocationName((String)list.next(), 1);
        } while (list1 == null);
        if (list1.isEmpty()) goto _L2; else goto _L1
_L1:
        context.add(list1.get(0));
          goto _L2
        list;
        LogUtil.e(TAG, list.getMessage(), new Object[0]);
        return context;
    }

    public static List createGeofenceDataFromLocation(List list)
    {
        if (list == null || list.isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        com.dominos.beacon.model.BeaconConfig.StoreLocationInfo storelocationinfo;
        for (list = list.iterator(); list.hasNext(); arraylist.add((new com.dominos.beacon.model.GeofenceData.Builder()).setLatitude(storelocationinfo.getLatitude()).setLongitude(storelocationinfo.getLongitude()).build()))
        {
            storelocationinfo = (com.dominos.beacon.model.BeaconConfig.StoreLocationInfo)list.next();
        }

        return arraylist;
    }

    public static String getCustomerLastInitial(String s)
    {
        if (!StringHelper.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return "";
_L2:
        if (StringHelper.length(s = StringHelper.trim(s)) <= 1 || !s.contains(" ")) goto _L1; else goto _L3
_L3:
        s = StringHelper.split(s, " ");
        if (s.length <= 1) goto _L1; else goto _L4
_L4:
        s = s[s.length - 1];
        if (StringHelper.length(s) > 1)
        {
            return s.substring(0, 1).toUpperCase();
        }
        if (StringHelper.length(s) != 1) goto _L1; else goto _L5
_L5:
        s = s.toUpperCase();
        return s;
        s;
        return "";
    }

    public static String getFormattedFirstName(String s)
    {
        String s1 = "";
        if (!StringHelper.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = "";
_L4:
        return s;
_L2:
        String s2;
        s2 = StringHelper.trim(s);
        if (StringHelper.length(s2) == 1 && Character.isLetter(s2.charAt(0)))
        {
            return s2.toUpperCase();
        }
        s = s1;
        if (StringHelper.length(s2) <= 1) goto _L4; else goto _L3
_L3:
        if (!StringHelper.contains(s2, " "))
        {
            break MISSING_BLOCK_LABEL_118;
        }
        s1 = StringHelper.split(s2, " ")[0];
_L6:
        s = s1;
        if (StringHelper.length(s1) <= 1) goto _L4; else goto _L5
_L5:
        s = (new StringBuilder()).append(s1.substring(0, 1).toUpperCase()).append(s1.substring(1).toLowerCase()).toString();
        return s;
        s1 = s2;
          goto _L6
        s;
        return "";
    }

    public static String getZipCodeFromLocation(Context context, double d, double d1)
    {
        context = new Geocoder(context, Locale.getDefault());
        try
        {
            context = context.getFromLocation(d, d1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            LogUtil.e(TAG, context.getMessage(), new Object[0]);
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (context.isEmpty())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        context = ((Address)context.get(0)).getPostalCode();
        return context;
        return null;
    }

    public static boolean isRegisteredBeacon(String s)
    {
        if (App.isDebugMode())
        {
            return StringHelper.equalsIgnoreCase(s, "6e64f8d0-c4a6-48d1-9519-ac2a601622b8");
        } else
        {
            return StringHelper.equalsIgnoreCase(s, "d8db1b53-006f-453a-b832-0f8d6bc3b35f");
        }
    }

}
