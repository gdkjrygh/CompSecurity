// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cn, ci, bw

public final class cc
{

    private String gX;
    private String gY;
    private List gZ;
    private List ha;
    private long hb;
    private boolean hc;
    private final long hd = -1L;
    private List he;
    private long hf;
    private int hg;

    public cc()
    {
        hb = -1L;
        hc = false;
        hf = -1L;
        hg = -1;
    }

    private static long a(Map map, String s)
    {
        map = (List)map.get(s);
        if (map == null || map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        map = (String)map.get(0);
        float f1 = Float.parseFloat(map);
        return (long)(f1 * 1000F);
        NumberFormatException numberformatexception;
        numberformatexception;
        cn.q((new StringBuilder()).append("Could not parse float from ").append(s).append(" header: ").append(map).toString());
        return -1L;
    }

    private static List b(Map map, String s)
    {
        map = (List)map.get(s);
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if (map != null)
            {
                return Arrays.asList(map.trim().split("\\s+"));
            }
        }
        return null;
    }

    private void e(Map map)
    {
        map = b(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            gZ = map;
        }
    }

    private void f(Map map)
    {
        map = b(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            ha = map;
        }
    }

    private void g(Map map)
    {
        long l = a(map, "X-Afma-Interstitial-Timeout");
        if (l != -1L)
        {
            hb = l;
        }
    }

    private void h(Map map)
    {
        map = (List)map.get("X-Afma-Mediation");
        if (map != null && !map.isEmpty())
        {
            hc = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void i(Map map)
    {
        map = b(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            he = map;
        }
    }

    private void j(Map map)
    {
        long l = a(map, "X-Afma-Refresh-Rate");
        if (l != -1L)
        {
            hf = l;
        }
    }

    private void k(Map map)
    {
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                hg = ci.ao();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                hg = ci.an();
                return;
            }
        }
    }

    public void a(String s, Map map, String s1)
    {
        gX = s;
        gY = s1;
        d(map);
    }

    public bw ak()
    {
        return new bw(gX, gY, gZ, ha, hb, hc, -1L, he, hf, hg);
    }

    public void d(Map map)
    {
        e(map);
        f(map);
        g(map);
        h(map);
        i(map);
        j(map);
        k(map);
    }
}
