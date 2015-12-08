// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.net.NetworkInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.lyft.android.common.Strings;

public class DeviceNetworkUtils
{

    private static final Map NETWORK_INFO_NAME_MAP;
    private static final Map TELEPHONY_NETWORK_TYPE_MAP;

    public DeviceNetworkUtils()
    {
    }

    public static String getNetworkType(NetworkInfo networkinfo)
    {
        Object obj;
        if (networkinfo != null)
        {
            networkinfo = networkinfo.getTypeName();
        } else
        {
            networkinfo = "";
        }
        if (Strings.isNullOrEmpty(networkinfo))
        {
            obj = "UNKNOWN";
        } else
        {
            obj = networkinfo;
            if (NETWORK_INFO_NAME_MAP.containsKey(networkinfo))
            {
                return (String)NETWORK_INFO_NAME_MAP.get(networkinfo);
            }
        }
        return ((String) (obj));
    }

    public static String getRadioType(int i)
    {
        if (TELEPHONY_NETWORK_TYPE_MAP.containsKey(Integer.valueOf(i)))
        {
            return (String)TELEPHONY_NETWORK_TYPE_MAP.get(Integer.valueOf(i));
        } else
        {
            return "UNKNOWN";
        }
    }

    static 
    {
        HashMap hashmap = new HashMap(16);
        hashmap.put(Integer.valueOf(7), "1xRTT");
        hashmap.put(Integer.valueOf(4), "CDMA");
        hashmap.put(Integer.valueOf(2), "EDGE");
        hashmap.put(Integer.valueOf(14), "EHRPD");
        hashmap.put(Integer.valueOf(5), "EVDO_0");
        hashmap.put(Integer.valueOf(6), "EVDO_A");
        hashmap.put(Integer.valueOf(12), "EVDO_B");
        hashmap.put(Integer.valueOf(1), "GPRS");
        hashmap.put(Integer.valueOf(8), "HSDPA");
        hashmap.put(Integer.valueOf(10), "HSPA");
        hashmap.put(Integer.valueOf(15), "HSPAP");
        hashmap.put(Integer.valueOf(9), "HSUPA");
        hashmap.put(Integer.valueOf(11), "IDEN");
        hashmap.put(Integer.valueOf(13), "LTE");
        hashmap.put(Integer.valueOf(3), "UMTS");
        TELEPHONY_NETWORK_TYPE_MAP = Collections.unmodifiableMap(hashmap);
        hashmap = new HashMap(2);
        hashmap.put("WIFI", "WiFi");
        hashmap.put("MOBILE", "WWAN");
        NETWORK_INFO_NAME_MAP = Collections.unmodifiableMap(hashmap);
    }
}
