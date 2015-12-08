// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.g;
import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class e
{

    public e()
    {
    }

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

    public static com.android.volley.b.a a(g g1)
    {
        Map map;
        String as[];
        boolean flag;
        int i;
        long l;
        long l1;
        long l2;
        long l5;
        l5 = System.currentTimeMillis();
        map = g1.c;
        l2 = 0L;
        l1 = 0L;
        l = 0L;
        String s = (String)map.get("Date");
        if (s != null)
        {
            l2 = a(s);
        }
        s = (String)map.get("Cache-Control");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        as = s.split(",");
        i = 0;
        flag = false;
        l = 0L;
        l1 = 0L;
_L5:
        if (i >= as.length) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = as[i].trim();
        if (s2.equals("no-cache") || s2.equals("no-store"))
        {
            return null;
        }
        if (!s2.startsWith("max-age=")) goto _L4; else goto _L3
_L3:
        long l4 = Long.parseLong(s2.substring(8));
        long l3 = l;
_L6:
        i++;
        l = l3;
        l1 = l4;
          goto _L5
_L4:
        if (!s2.startsWith("stale-while-revalidate="))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        l3 = Long.parseLong(s2.substring(23));
        l4 = l1;
          goto _L6
        if (s2.equals("must-revalidate")) goto _L8; else goto _L7
_L7:
        l3 = l;
        l4 = l1;
        if (!s2.equals("proxy-revalidate")) goto _L6; else goto _L8
_L8:
        flag = true;
        l3 = l;
        l4 = l1;
          goto _L6
_L2:
        boolean flag1 = true;
_L9:
        String s1 = (String)map.get("Expires");
        Exception exception;
        if (s1 != null)
        {
            l4 = a(s1);
        } else
        {
            l4 = 0L;
        }
        s1 = (String)map.get("Last-Modified");
        if (s1 != null)
        {
            l3 = a(s1);
        } else
        {
            l3 = 0L;
        }
        s1 = (String)map.get("ETag");
        if (flag1)
        {
            l1 = l5 + 1000L * l1;
            com.android.volley.b.a a1;
            if (flag)
            {
                l = l1;
            } else
            {
                l = 1000L * l + l1;
            }
        } else
        if (l2 > 0L && l4 >= l2)
        {
            l = (l4 - l2) + l5;
            l1 = l;
        } else
        {
            l = 0L;
            l1 = 0L;
        }
        a1 = new com.android.volley.b.a();
        a1.a = g1.b;
        a1.b = s1;
        a1.f = l1;
        a1.e = l;
        a1.c = l2;
        a1.d = l3;
        a1.g = map;
        return a1;
        exception;
        l3 = l;
        l4 = l1;
          goto _L6
        exception;
        l3 = l;
        l4 = l1;
          goto _L6
        flag = false;
        flag1 = false;
          goto _L9
    }

    public static String a(Map map)
    {
        return a(map, "ISO-8859-1");
    }

    public static String a(Map map, String s)
    {
        String s1;
        s1 = (String)map.get("Content-Type");
        map = s;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        as = s1.split(";");
        i = 1;
_L7:
        map = s;
        if (i >= as.length) goto _L2; else goto _L3
_L3:
        map = as[i].trim().split("=");
        if (map.length != 2 || !map[0].equals("charset")) goto _L5; else goto _L4
_L4:
        map = map[1];
_L2:
        return map;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
