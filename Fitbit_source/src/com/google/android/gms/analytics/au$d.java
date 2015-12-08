// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            au, aa, j, ag, 
//            p, aj, c, y, 
//            n, v

private class b
    implements Runnable
{

    final au a;
    private final Map b;

    private String a(Map map)
    {
        if (map.containsKey("useSecure"))
        {
            if (aa.a((String)map.get("useSecure"), true))
            {
                return "https:";
            } else
            {
                return "http:";
            }
        } else
        {
            return "https:";
        }
    }

    private void b(Map map)
    {
        ao ao = j.a(au.a(a));
        aa.a(map, "&adid", ao);
        aa.a(map, "&ate", ao);
    }

    private void c(Map map)
    {
        ag ag1 = ag.a();
        aa.a(map, "&an", ag1);
        aa.a(map, "&av", ag1);
        aa.a(map, "&aid", ag1);
        aa.a(map, "&aiid", ag1);
        map.put("&v", "1");
    }

    private boolean d(Map map)
    {
        if (map.get("&sf") == null)
        {
            return false;
        }
        double d1 = aa.a((String)map.get("&sf"), 100D);
        if (d1 >= 100D)
        {
            return false;
        }
        if ((double)(au.a((String)map.get("&cid")) % 10000) >= d1 * 100D)
        {
            if (map.get("&t") == null)
            {
                map = "unknown";
            } else
            {
                map = (String)map.get("&t");
            }
            p.c(String.format("%s hit sampled out", new Object[] {
                map
            }));
            return true;
        } else
        {
            return false;
        }
    }

    public void run()
    {
        b(b);
        if (TextUtils.isEmpty((CharSequence)b.get("&cid")))
        {
            b.put("&cid", aj.a().a("&cid"));
        }
        if (com.google.android.gms.analytics.c.a(au.a(a)).c() || d(b))
        {
            return;
        }
        if (!TextUtils.isEmpty(au.b(a)))
        {
            y.a().a(true);
            b.putAll((new init>()).(au.b(a)).());
            y.a().a(false);
            au.a(a, null);
        }
        c(b);
        Map map = n.a(b);
        au.d(a).a(map, Long.valueOf((String)b.get("&ht")).longValue(), a(b), au.c(a));
    }

    (au au1, Map map)
    {
        a = au1;
        super();
        b = new HashMap(map);
        map = (String)map.get("&ht");
        au1 = map;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        Long.valueOf(map);
        au1 = map;
_L2:
        if (au1 == null)
        {
            long l = System.currentTimeMillis();
            b.put("&ht", Long.toString(l));
        }
        return;
        au1;
        au1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
