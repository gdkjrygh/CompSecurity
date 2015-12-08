// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, AnalyticsTrackInternal

final class AnalyticsTrackCoordinateSpace
{

    private static final String COORDINATE_ACTION_NAME = "Coordinates";
    private static final String COORDINATE_FLOAT_FORMAT = "%.2f";
    private static final String COORDINATE_NAME_KEY = "a.map.name";
    private static final String COORDINATE_X_KEY = "a.map.x";
    private static final String COORDINATE_Y_KEY = "a.map.y";

    AnalyticsTrackCoordinateSpace()
    {
    }

    public static void trackCoordinateSpace(String s, float f, float f1, Map map)
    {
        if (f < 0.0F || f > 1.0F || f1 < 0.0F || f1 > 1.0F)
        {
            StaticMethods.logWarningFormat("Analytics - trackCoordinateSpace failed, the coordinates (x:%.2f, y:%.2f) must be between 0.0f & 1.0f.", new Object[] {
                Float.valueOf(f), Float.valueOf(f1)
            });
            return;
        }
        if (s == null || s.trim().length() == 0)
        {
            StaticMethods.logWarningFormat("Analytics - trackCoordinateSpace failed, the name was empty or only contained whitespace and is required to map the coorindates to a coordinates space.", new Object[0]);
            return;
        }
        String s1 = String.format(Locale.US, "%.2f", new Object[] {
            Float.valueOf(Math.abs(f))
        });
        String s2 = String.format(Locale.US, "%.2f", new Object[] {
            Float.valueOf(Math.abs(f1))
        });
        HashMap hashmap = new HashMap();
        if (map != null)
        {
            hashmap.putAll(map);
        }
        hashmap.put("a.map.name", s);
        hashmap.put("a.map.x", s1);
        hashmap.put("a.map.y", s2);
        AnalyticsTrackInternal.trackInternal("Coordinates", hashmap, StaticMethods.getTimeSince1970());
    }
}
