// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
import p.k.i;

public class e
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

    public static p.k.b.a a(i j)
    {
        int k = 0;
        long l3 = 0L;
        long l4 = System.currentTimeMillis();
        Map map = j.c;
        String s = (String)map.get("Date");
        String as[];
        Object obj;
        Exception exception;
        long l;
        long l1;
        long l2;
        if (s != null)
        {
            l1 = a(s);
        } else
        {
            l1 = 0L;
        }
        s = (String)map.get("Cache-Control");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        as = s.split(",");
        k = 0;
        l = 0L;
        if (k >= as.length) goto _L2; else goto _L1
_L1:
        obj = as[k].trim();
        if (((String) (obj)).equals("no-cache") || ((String) (obj)).equals("no-store"))
        {
            return null;
        }
        if (!((String) (obj)).startsWith("max-age=")) goto _L4; else goto _L3
_L3:
        l2 = Long.parseLong(((String) (obj)).substring(8));
        l = l2;
_L5:
        k++;
        break MISSING_BLOCK_LABEL_67;
_L4:
        if (((String) (obj)).equals("must-revalidate") || ((String) (obj)).equals("proxy-revalidate"))
        {
            l = 0L;
        }
          goto _L5
_L2:
        k = 1;
_L10:
        as = (String)map.get("Expires");
        if (as != null)
        {
            l2 = a(((String) (as)));
        } else
        {
            l2 = 0L;
        }
        as = (String)map.get("ETag");
        if (k == 0) goto _L7; else goto _L6
_L6:
        l = 1000L * l + l4;
_L9:
        obj = new p.k.b.a();
        obj.a = j.b;
        obj.b = as;
        obj.e = l;
        obj.d = ((p.k.b.a) (obj)).e;
        obj.c = l1;
        obj.f = map;
        return ((p.k.b.a) (obj));
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
}
