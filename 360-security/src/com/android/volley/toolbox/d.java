// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.i;
import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class d
{

    public static long a(String s)
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

    public static com.android.volley.a.a a(i j)
    {
        int k = 0;
        long l3 = 0L;
        long l4 = System.currentTimeMillis();
        Map map = j.c;
        Object obj = (String)map.get("Date");
        Object obj1;
        Exception exception;
        long l;
        long l1;
        long l2;
        if (obj != null)
        {
            l1 = a(((String) (obj)));
        } else
        {
            l1 = 0L;
        }
        obj = (String)map.get("Cache-Control");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        obj = ((String) (obj)).split(",");
        k = 0;
        l = 0L;
        if (k < obj.length) goto _L2; else goto _L1
_L1:
        k = 1;
_L8:
        obj = (String)map.get("Expires");
        if (obj != null)
        {
            l2 = a(((String) (obj)));
        } else
        {
            l2 = 0L;
        }
        obj = (String)map.get("ETag");
        if (k != 0)
        {
            l = 1000L * l + l4;
        } else
        {
            l = l3;
            if (l1 > 0L)
            {
                l = l3;
                if (l2 >= l1)
                {
                    l = (l2 - l1) + l4;
                }
            }
        }
        obj1 = new com.android.volley.a.a();
        obj1.a = j.b;
        obj1.b = ((String) (obj));
        obj1.e = l;
        obj1.d = ((com.android.volley.a.a) (obj1)).e;
        obj1.c = l1;
        obj1.f = map;
        return ((com.android.volley.a.a) (obj1));
_L2:
        obj1 = obj[k].trim();
        if (((String) (obj1)).equals("no-cache") || ((String) (obj1)).equals("no-store"))
        {
            return null;
        }
        if (!((String) (obj1)).startsWith("max-age=")) goto _L4; else goto _L3
_L3:
        l2 = Long.parseLong(((String) (obj1)).substring(8));
        l = l2;
_L6:
        k++;
        break MISSING_BLOCK_LABEL_67;
_L4:
        if (((String) (obj1)).equals("must-revalidate") || ((String) (obj1)).equals("proxy-revalidate"))
        {
            l = 0L;
        }
        continue; /* Loop/switch isn't completed */
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        l = 0L;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String a(Map map)
    {
        map = (String)map.get("Content-Type");
        if (map == null) goto _L2; else goto _L1
_L1:
        int j;
        map = map.split(";");
        j = 1;
_L5:
        if (j < map.length) goto _L3; else goto _L2
_L2:
        return "ISO-8859-1";
_L3:
        String as[] = map[j].trim().split("=");
        if (as.length == 2 && as[0].equals("charset"))
        {
            return as[1];
        }
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
