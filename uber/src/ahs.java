// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ahs
{

    private String a;
    private String b;
    private String c;
    private List d;
    private String e;
    private String f;
    private List g;
    private long h;
    private boolean i;
    private final long j = -1L;
    private List k;
    private long l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private final AdRequestInfoParcel s;

    public ahs(AdRequestInfoParcel adrequestinfoparcel)
    {
        h = -1L;
        i = false;
        l = -1L;
        m = -1;
        n = false;
        o = false;
        p = false;
        q = true;
        r = 0;
        s = adrequestinfoparcel;
    }

    private static String a(Map map, String s1)
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

    private static long b(Map map, String s1)
    {
        map = (List)map.get(s1);
        if (map == null || map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        map = (String)map.get(0);
        float f1 = Float.parseFloat(map);
        return (long)(f1 * 1000F);
        NumberFormatException numberformatexception;
        numberformatexception;
        of.e((new StringBuilder("Could not parse float from ")).append(s1).append(" header: ").append(map).toString());
        return -1L;
    }

    private void b(Map map)
    {
        a = a(map, "X-Afma-Ad-Size");
    }

    private static List c(Map map, String s1)
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

    private void c(Map map)
    {
        map = c(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            d = map;
        }
    }

    private void d(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            e = (String)map.get(0);
        }
    }

    private static boolean d(Map map, String s1)
    {
        map = (List)map.get(s1);
        return map != null && !map.isEmpty() && Boolean.valueOf((String)map.get(0)).booleanValue();
    }

    private void e(Map map)
    {
        map = c(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            g = map;
        }
    }

    private void f(Map map)
    {
        long l1 = b(map, "X-Afma-Interstitial-Timeout");
        if (l1 != -1L)
        {
            h = l1;
        }
    }

    private void g(Map map)
    {
        f = a(map, "X-Afma-ActiveView");
    }

    private void h(Map map)
    {
        o = o | d(map, "X-Afma-Native");
    }

    private void i(Map map)
    {
        n = n | d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void j(Map map)
    {
        i = i | d(map, "X-Afma-Mediation");
    }

    private void k(Map map)
    {
        map = c(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            k = map;
        }
    }

    private void l(Map map)
    {
        long l1 = b(map, "X-Afma-Refresh-Rate");
        if (l1 != -1L)
        {
            l = l1;
        }
    }

    private void m(Map map)
    {
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                m = ot.g().b();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                m = ot.g().a();
                return;
            }
        }
    }

    private void n(Map map)
    {
        map = (List)map.get("X-Afma-Use-HTTPS");
        if (map != null && !map.isEmpty())
        {
            p = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void o(Map map)
    {
        map = (List)map.get("X-Afma-Content-Url-Opted-Out");
        if (map != null && !map.isEmpty())
        {
            q = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void p(Map map)
    {
        map = c(map, "X-Afma-OAuth-Token-Status");
        r = 0;
        if (map != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        map = map.iterator();
        String s1;
        do
        {
            if (!map.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s1 = (String)map.next();
            if ("Clear".equalsIgnoreCase(s1))
            {
                r = 1;
                return;
            }
        } while (!"No-Op".equalsIgnoreCase(s1));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        r = 0;
        return;
    }

    public final AdResponseParcel a(long l1)
    {
        return new AdResponseParcel(s, b, c, d, g, h, i, k, l, m, a, l1, e, f, n, o, p, q, r);
    }

    public final void a(String s1, Map map, String s2)
    {
        b = s1;
        c = s2;
        a(map);
    }

    public final void a(Map map)
    {
        b(map);
        c(map);
        d(map);
        e(map);
        f(map);
        j(map);
        k(map);
        l(map);
        m(map);
        g(map);
        n(map);
        i(map);
        h(map);
        o(map);
        p(map);
    }
}
