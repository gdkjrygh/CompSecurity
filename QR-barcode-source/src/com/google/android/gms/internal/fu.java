// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            gs, gj, fk

public final class fu
{

    private int mOrientation;
    private String pn;
    private List uA;
    private long uB;
    private boolean uC;
    private final long uD = -1L;
    private long uE;
    private boolean uF;
    private boolean uG;
    private boolean uH;
    private boolean uI;
    private List ua;
    private String uv;
    private String uw;
    private List ux;
    private String uy;
    private String uz;

    public fu()
    {
        uB = -1L;
        uC = false;
        uE = -1L;
        mOrientation = -1;
        uF = false;
        uG = false;
        uH = false;
        uI = false;
    }

    static String a(Map map, String s1)
    {
        map = (List)map.get(s1);
        if (map != null && !map.isEmpty())
        {
            return (String)map.get(0);
        } else
        {
            return null;
        }
    }

    static long b(Map map, String s1)
    {
        map = (List)map.get(s1);
        if (map == null || map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        map = (String)map.get(0);
        float f1 = Float.parseFloat(map);
        return (long)(f1 * 1000F);
        NumberFormatException numberformatexception;
        numberformatexception;
        gs.W((new StringBuilder()).append("Could not parse float from ").append(s1).append(" header: ").append(map).toString());
        return -1L;
    }

    static List c(Map map, String s1)
    {
        map = (List)map.get(s1);
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

    private boolean d(Map map, String s1)
    {
        map = (List)map.get(s1);
        return map != null && !map.isEmpty() && Boolean.valueOf((String)map.get(0)).booleanValue();
    }

    private void f(Map map)
    {
        uv = a(map, "X-Afma-Ad-Size");
    }

    private void g(Map map)
    {
        map = c(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            ux = map;
        }
    }

    private void h(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            uy = (String)map.get(0);
        }
    }

    private void i(Map map)
    {
        map = c(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            uA = map;
        }
    }

    private void j(Map map)
    {
        long l1 = b(map, "X-Afma-Interstitial-Timeout");
        if (l1 != -1L)
        {
            uB = l1;
        }
    }

    private void k(Map map)
    {
        uz = a(map, "X-Afma-ActiveView");
    }

    private void l(Map map)
    {
        uG = uG | d(map, "X-Afma-Native");
    }

    private void m(Map map)
    {
        uF = uF | d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void n(Map map)
    {
        uC = uC | d(map, "X-Afma-Mediation");
    }

    private void o(Map map)
    {
        map = c(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            ua = map;
        }
    }

    private void p(Map map)
    {
        long l1 = b(map, "X-Afma-Refresh-Rate");
        if (l1 != -1L)
        {
            uE = l1;
        }
    }

    private void q(Map map)
    {
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                mOrientation = gj.dm();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = gj.dl();
                return;
            }
        }
    }

    private void r(Map map)
    {
        map = (List)map.get("X-Afma-Use-HTTPS");
        if (map != null && !map.isEmpty())
        {
            uH = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void s(Map map)
    {
        map = (List)map.get("X-Afma-Content-Url-Opted-Out");
        if (map != null && !map.isEmpty())
        {
            uI = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    public void a(String s1, Map map, String s2)
    {
        uw = s1;
        pn = s2;
        e(map);
    }

    public void e(Map map)
    {
        f(map);
        g(map);
        h(map);
        i(map);
        j(map);
        n(map);
        o(map);
        p(map);
        q(map);
        k(map);
        r(map);
        m(map);
        l(map);
        s(map);
    }

    public fk i(long l1)
    {
        return new fk(uw, pn, ux, uA, uB, uC, -1L, ua, uE, mOrientation, uv, l1, uy, uz, uF, uG, uH, uI);
    }
}
