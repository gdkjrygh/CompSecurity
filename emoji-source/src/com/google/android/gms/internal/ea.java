// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            eu, eo, du

public final class ea
{

    private int mOrientation;
    private String qG;
    private String qH;
    private String qI;
    private List qJ;
    private String qK;
    private String qL;
    private List qM;
    private long qN;
    private boolean qO;
    private final long qP = -1L;
    private List qQ;
    private long qR;

    public ea()
    {
        qN = -1L;
        qO = false;
        qR = -1L;
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
        eu.D((new StringBuilder()).append("Could not parse float from ").append(s).append(" header: ").append(map).toString());
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
        qG = a(map, "X-Afma-Ad-Size");
    }

    private void f(Map map)
    {
        map = c(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            qJ = map;
        }
    }

    private void g(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            qK = (String)map.get(0);
        }
    }

    private void h(Map map)
    {
        map = c(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            qM = map;
        }
    }

    private void i(Map map)
    {
        long l1 = b(map, "X-Afma-Interstitial-Timeout");
        if (l1 != -1L)
        {
            qN = l1;
        }
    }

    private void j(Map map)
    {
        qL = a(map, "X-Afma-ActiveView");
    }

    private void k(Map map)
    {
        map = (List)map.get("X-Afma-Mediation");
        if (map != null && !map.isEmpty())
        {
            qO = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void l(Map map)
    {
        map = c(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            qQ = map;
        }
    }

    private void m(Map map)
    {
        long l1 = b(map, "X-Afma-Refresh-Rate");
        if (l1 != -1L)
        {
            qR = l1;
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
                mOrientation = eo.bS();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = eo.bR();
                return;
            }
        }
    }

    public void a(String s, Map map, String s1)
    {
        qH = s;
        qI = s1;
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

    public du i(long l1)
    {
        return new du(qH, qI, qJ, qM, qN, qO, -1L, qQ, qR, mOrientation, qG, l1, qK, qL);
    }
}
