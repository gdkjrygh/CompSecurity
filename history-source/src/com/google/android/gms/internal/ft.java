// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            gr, gi, fj

public final class ft
{

    private int mOrientation;
    private String pD;
    private String uJ;
    private String uK;
    private List uL;
    private String uM;
    private String uN;
    private List uO;
    private long uP;
    private boolean uQ;
    private final long uR = -1L;
    private long uS;
    private boolean uT;
    private boolean uU;
    private boolean uV;
    private boolean uW;
    private List uo;

    public ft()
    {
        uP = -1L;
        uQ = false;
        uS = -1L;
        mOrientation = -1;
        uT = false;
        uU = false;
        uV = false;
        uW = true;
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
        gr.W((new StringBuilder()).append("Could not parse float from ").append(s1).append(" header: ").append(map).toString());
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
        uJ = a(map, "X-Afma-Ad-Size");
    }

    private void g(Map map)
    {
        map = c(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            uL = map;
        }
    }

    private void h(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            uM = (String)map.get(0);
        }
    }

    private void i(Map map)
    {
        map = c(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            uO = map;
        }
    }

    private void j(Map map)
    {
        long l1 = b(map, "X-Afma-Interstitial-Timeout");
        if (l1 != -1L)
        {
            uP = l1;
        }
    }

    private void k(Map map)
    {
        uN = a(map, "X-Afma-ActiveView");
    }

    private void l(Map map)
    {
        uU = uU | d(map, "X-Afma-Native");
    }

    private void m(Map map)
    {
        uT = uT | d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void n(Map map)
    {
        uQ = uQ | d(map, "X-Afma-Mediation");
    }

    private void o(Map map)
    {
        map = c(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            uo = map;
        }
    }

    private void p(Map map)
    {
        long l1 = b(map, "X-Afma-Refresh-Rate");
        if (l1 != -1L)
        {
            uS = l1;
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
                mOrientation = gi.dv();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = gi.du();
                return;
            }
        }
    }

    private void r(Map map)
    {
        map = (List)map.get("X-Afma-Use-HTTPS");
        if (map != null && !map.isEmpty())
        {
            uV = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void s(Map map)
    {
        map = (List)map.get("X-Afma-Content-Url-Opted-Out");
        if (map != null && !map.isEmpty())
        {
            uW = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    public void a(String s1, Map map, String s2)
    {
        uK = s1;
        pD = s2;
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

    public fj i(long l1)
    {
        return new fj(uK, pD, uL, uO, uP, uQ, -1L, uo, uS, mOrientation, uJ, l1, uM, uN, uT, uU, uV, uW);
    }
}
