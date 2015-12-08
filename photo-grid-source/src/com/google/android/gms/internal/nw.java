// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            qd

public final class nw
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
    private String s;
    private boolean t;
    private final AdRequestInfoParcel u;

    public nw(AdRequestInfoParcel adrequestinfoparcel)
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
        s = "";
        t = false;
        u = adrequestinfoparcel;
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
        zzb.zzaH((new StringBuilder("Could not parse float from ")).append(s1).append(" header: ").append(map).toString());
        return -1L;
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

    private static boolean d(Map map, String s1)
    {
        map = (List)map.get(s1);
        return map != null && !map.isEmpty() && Boolean.valueOf((String)map.get(0)).booleanValue();
    }

    public final AdResponseParcel a(long l1)
    {
        return new AdResponseParcel(u, b, c, d, g, h, i, -1L, k, l, m, a, l1, e, f, n, o, p, q, false, r, s, t);
    }

    public final void a(String s1, Map map, String s2)
    {
        b = s1;
        c = s2;
        a(map);
    }

    public final void a(Map map)
    {
        String s1;
        a = a(map, "X-Afma-Ad-Size");
        Object obj = c(map, "X-Afma-Click-Tracking-Urls");
        if (obj != null)
        {
            d = ((List) (obj));
        }
        obj = (List)map.get("X-Afma-Debug-Dialog");
        if (obj != null && !((List) (obj)).isEmpty())
        {
            e = (String)((List) (obj)).get(0);
        }
        obj = c(map, "X-Afma-Tracking-Urls");
        if (obj != null)
        {
            g = ((List) (obj));
        }
        long l1 = b(map, "X-Afma-Interstitial-Timeout");
        if (l1 != -1L)
        {
            h = l1;
        }
        i = i | d(map, "X-Afma-Mediation");
        obj = c(map, "X-Afma-Manual-Tracking-Urls");
        if (obj != null)
        {
            k = ((List) (obj));
        }
        l1 = b(map, "X-Afma-Refresh-Rate");
        if (l1 != -1L)
        {
            l = l1;
        }
        obj = (List)map.get("X-Afma-Orientation");
        if (obj != null && !((List) (obj)).isEmpty())
        {
            obj = (String)((List) (obj)).get(0);
            if ("portrait".equalsIgnoreCase(((String) (obj))))
            {
                m = zzp.zzbx().b();
            } else
            if ("landscape".equalsIgnoreCase(((String) (obj))))
            {
                m = zzp.zzbx().a();
            }
        }
        f = a(map, "X-Afma-ActiveView");
        obj = (List)map.get("X-Afma-Use-HTTPS");
        if (obj != null && !((List) (obj)).isEmpty())
        {
            p = Boolean.valueOf((String)((List) (obj)).get(0)).booleanValue();
        }
        n = n | d(map, "X-Afma-Custom-Rendering-Allowed");
        o = "native".equals(a(map, "X-Afma-Ad-Format"));
        obj = (List)map.get("X-Afma-Content-Url-Opted-Out");
        if (obj != null && !((List) (obj)).isEmpty())
        {
            q = Boolean.valueOf((String)((List) (obj)).get(0)).booleanValue();
        }
        obj = c(map, "X-Afma-OAuth-Token-Status");
        r = 0;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L4:
        if (((Iterator) (obj)).hasNext())
        {
            s1 = (String)((Iterator) (obj)).next();
            if (!"Clear".equalsIgnoreCase(s1))
            {
                continue; /* Loop/switch isn't completed */
            }
            r = 1;
        }
_L2:
        obj = (List)map.get("X-Afma-Gws-Query-Id");
        if (obj != null && !((List) (obj)).isEmpty())
        {
            s = (String)((List) (obj)).get(0);
        }
        map = a(map, "X-Afma-Fluid");
        if (map != null && map.equals("height"))
        {
            t = true;
        }
        return;
        if (!"No-Op".equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
        r = 0;
          goto _L2
        if (true) goto _L4; else goto _L5
_L5:
    }
}
