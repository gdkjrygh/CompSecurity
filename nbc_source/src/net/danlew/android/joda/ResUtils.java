// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.danlew.android.joda;

import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ResUtils
{

    private static final String TZDATA_PREFIX = "joda_time_android_tzdata_";
    private static Map sIdentifierCache = new ConcurrentHashMap();

    public ResUtils()
    {
    }

    private static String convertPathToResource(String s)
    {
        s = new File(s);
        ArrayList arraylist = new ArrayList();
        File file;
        do
        {
            arraylist.add(s.getName());
            file = s.getParentFile();
            s = file;
        } while (file != null);
        s = new StringBuffer();
        for (int i = arraylist.size() - 1; i >= 0; i--)
        {
            if (s.length() > 0)
            {
                s.append("_");
            }
            s.append((String)arraylist.get(i));
        }

        return s.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US);
    }

    public static int getIdentifier(Class class1, String s)
    {
        Object obj;
        int i;
        if (!sIdentifierCache.containsKey(class1))
        {
            obj = new ConcurrentHashMap();
            sIdentifierCache.put(class1, obj);
        } else
        {
            obj = (Map)sIdentifierCache.get(class1);
        }
        if (!((Map) (obj)).containsKey(s)) goto _L2; else goto _L1
_L1:
        i = ((Integer)((Map) (obj)).get(s)).intValue();
_L4:
        return i;
_L2:
        int j;
        try
        {
            j = class1.getField(s).getInt(null);
        }
        catch (Exception exception)
        {
            Log.e("JodaTimeAndroid", (new StringBuilder()).append("Failed to retrieve identifier: type=").append(class1).append(" name=").append(s).toString(), exception);
            return 0;
        }
        i = j;
        if (j == 0) goto _L4; else goto _L3
_L3:
        ((Map) (obj)).put(s, Integer.valueOf(j));
        return j;
    }

    public static String getTzResource(String s)
    {
        return (new StringBuilder()).append("joda_time_android_tzdata_").append(convertPathToResource(s)).toString();
    }

    public static String getZoneInfoMapResource()
    {
        return (new StringBuilder()).append("joda_time_android_tzdata_").append(convertPathToResource("ZoneInfoMap")).toString();
    }

}
