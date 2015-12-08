// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.k;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public final class f
{

    private static long a(String s)
    {
        long l;
        try
        {
            l = DateUtils.parseDate(s).getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l;
    }

    public static com.android.volley.b.a a(k k1)
    {
        int i = 0;
        long l3 = 0L;
        long l4 = System.currentTimeMillis();
        Object obj1 = k1.c;
        Object obj = new HashMap();
        Object obj2;
        long l;
        long l1;
        if (obj1 == null || ((Map) (obj1)).entrySet() == null)
        {
            obj = obj1;
        } else
        {
            obj1 = ((Map) (obj1)).entrySet().iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                ((HashMap) (obj)).put(((String)((java.util.Map.Entry) (obj2)).getKey()).toLowerCase(), ((java.util.Map.Entry) (obj2)).getValue());
            }
        }
        obj1 = (String)((Map) (obj)).get("date");
        Exception exception;
        long l2;
        if (obj1 != null)
        {
            l1 = a(((String) (obj1)));
        } else
        {
            l1 = 0L;
        }
        obj1 = (String)((Map) (obj)).get("cache-control");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_392;
        }
        obj1 = ((String) (obj1)).split(",");
        i = 0;
        l = 0L;
        if (i >= obj1.length) goto _L2; else goto _L1
_L1:
        obj2 = obj1[i].trim();
        if (((String) (obj2)).equals("no-cache") || ((String) (obj2)).equals("no-store"))
        {
            return null;
        }
        if (!((String) (obj2)).startsWith("max-age=")) goto _L4; else goto _L3
_L3:
        l2 = Long.parseLong(((String) (obj2)).substring(8));
        l = l2;
_L5:
        i++;
        break MISSING_BLOCK_LABEL_90;
_L4:
        if (((String) (obj2)).equals("must-revalidate") || ((String) (obj2)).equals("proxy-revalidate"))
        {
            l = 0L;
        }
          goto _L5
_L2:
        i = 1;
_L10:
        obj1 = (String)((Map) (obj)).get("expires");
        if (obj1 != null)
        {
            l2 = a(((String) (obj1)));
        } else
        {
            l2 = 0L;
        }
        obj = (String)((Map) (obj)).get("etag");
        if (i == 0) goto _L7; else goto _L6
_L6:
        l = 1000L * l + l4;
_L9:
        obj1 = new com.android.volley.b.a();
        obj1.a = k1.b;
        obj1.b = ((String) (obj));
        obj1.e = l;
        obj1.d = ((com.android.volley.b.a) (obj1)).e;
        obj1.c = l1;
        obj1.f = k1.c;
        return ((com.android.volley.b.a) (obj1));
_L7:
        l = l3;
        if (l1 > 0L)
        {
            l = l3;
            if (l2 >= l1)
            {
                l = (l2 - l1) + l4;
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
        exception;
          goto _L5
        l = 0L;
          goto _L10
    }

    public static String a(Map map)
    {
        map = (String)map.get("Content-Type");
        if (map != null)
        {
            map = map.split(";");
            for (int i = 1; i < map.length; i++)
            {
                String as[] = map[i].trim().split("=");
                if (as.length == 2 && as[0].equals("charset"))
                {
                    return as[1];
                }
            }

        }
        return "ISO-8859-1";
    }
}
