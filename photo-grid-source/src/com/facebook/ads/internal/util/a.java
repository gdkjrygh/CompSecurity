// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a
{

    private static SensorManager a = null;
    private static Sensor b = null;
    private static Sensor c = null;
    private static volatile float d[];
    private static volatile float e[];
    private static Map f = new ConcurrentHashMap();
    private static String g[] = {
        "x", "y", "z"
    };

    public static Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.putAll(f);
        a(((Map) (hashmap)));
        return hashmap;
    }

    private static void a(Map map)
    {
        boolean flag = false;
        float af[] = d;
        float af1[] = e;
        if (af != null)
        {
            int k = Math.min(g.length, af.length);
            for (int i = 0; i < k; i++)
            {
                map.put((new StringBuilder("accelerometer_")).append(g[i]).toString(), Float.valueOf(af[i]));
            }

        }
        if (af1 != null)
        {
            int l = Math.min(g.length, af1.length);
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                map.put((new StringBuilder("rotation_")).append(g[j]).toString(), Float.valueOf(af1[j]));
            }

        }
    }

}
