// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            dw, dq, cz

public final class df
{

    private int mOrientation;
    private String pN;
    private String pO;
    private String pP;
    private List pQ;
    private String pR;
    private String pS;
    private List pT;
    private long pU;
    private boolean pV;
    private final long pW = -1L;
    private List pX;
    private long pY;

    public df()
    {
        pU = -1L;
        pV = false;
        pY = -1L;
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
        dw.z((new StringBuilder()).append("Could not parse float from ").append(s).append(" header: ").append(map).toString());
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

    private void f(Map map)
    {
        pN = a(map, "X-Afma-Ad-Size");
    }

    private void g(Map map)
    {
        map = c(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            pQ = map;
        }
    }

    private void h(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            pR = (String)map.get(0);
        }
    }

    private void i(Map map)
    {
        map = c(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            pT = map;
        }
    }

    private void j(Map map)
    {
        long l1 = b(map, "X-Afma-Interstitial-Timeout");
        if (l1 != -1L)
        {
            pU = l1;
        }
    }

    private void k(Map map)
    {
        pS = a(map, "X-Afma-ActiveView");
    }

    private void l(Map map)
    {
        map = (List)map.get("X-Afma-Mediation");
        if (map != null && !map.isEmpty())
        {
            pV = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void m(Map map)
    {
        map = c(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            pX = map;
        }
    }

    private void n(Map map)
    {
        long l1 = b(map, "X-Afma-Refresh-Rate");
        if (l1 != -1L)
        {
            pY = l1;
        }
    }

    private void o(Map map)
    {
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                mOrientation = dq.bA();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = dq.bz();
                return;
            }
        }
    }

    public void a(String s, Map map, String s1)
    {
        pO = s;
        pP = s1;
        e(map);
    }

    public void e(Map map)
    {
        f(map);
        g(map);
        h(map);
        i(map);
        j(map);
        l(map);
        m(map);
        n(map);
        o(map);
        k(map);
    }

    public cz g(long l1)
    {
        return new cz(pO, pP, pQ, pT, pU, pV, -1L, pX, pY, mOrientation, pN, l1, pR, pS);
    }
}
