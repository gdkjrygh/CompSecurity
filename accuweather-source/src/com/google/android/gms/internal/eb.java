// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ev, ep, dv

public final class eb
{

    private int mOrientation;
    private String qD;
    private String qE;
    private String qF;
    private List qG;
    private String qH;
    private String qI;
    private List qJ;
    private long qK;
    private boolean qL;
    private final long qM = -1L;
    private List qN;
    private long qO;

    public eb()
    {
        qK = -1L;
        qL = false;
        qO = -1L;
        mOrientation = -1;
    }

    private static String a(Map map, String s)
    {
        map = (List)map.get(s);
        if (map != null && !map.isEmpty())
        {
            return (String)map.get(0);
        } else
        {
            return null;
        }
    }

    private static long b(Map map, String s)
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
        ev.D((new StringBuilder()).append("Could not parse float from ").append(s).append(" header: ").append(map).toString());
        return -1L;
    }

    private static List c(Map map, String s)
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
        qD = a(map, "X-Afma-Ad-Size");
    }

    private void f(Map map)
    {
        map = c(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            qG = map;
        }
    }

    private void g(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            qH = (String)map.get(0);
        }
    }

    private void h(Map map)
    {
        map = c(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            qJ = map;
        }
    }

    private void i(Map map)
    {
        long l1 = b(map, "X-Afma-Interstitial-Timeout");
        if (l1 != -1L)
        {
            qK = l1;
        }
    }

    private void j(Map map)
    {
        qI = a(map, "X-Afma-ActiveView");
    }

    private void k(Map map)
    {
        map = (List)map.get("X-Afma-Mediation");
        if (map != null && !map.isEmpty())
        {
            qL = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void l(Map map)
    {
        map = c(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            qN = map;
        }
    }

    private void m(Map map)
    {
        long l1 = b(map, "X-Afma-Refresh-Rate");
        if (l1 != -1L)
        {
            qO = l1;
        }
    }

    private void n(Map map)
    {
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                mOrientation = ep.bN();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = ep.bM();
                return;
            }
        }
    }

    public void a(String s, Map map, String s1)
    {
        qE = s;
        qF = s1;
        d(map);
    }

    public void d(Map map)
    {
        e(map);
        f(map);
        g(map);
        h(map);
        i(map);
        k(map);
        l(map);
        m(map);
        n(map);
        j(map);
    }

    public dv i(long l1)
    {
        return new dv(qE, qF, qG, qJ, qK, qL, -1L, qN, qO, mOrientation, qD, l1, qH, qI);
    }
}
