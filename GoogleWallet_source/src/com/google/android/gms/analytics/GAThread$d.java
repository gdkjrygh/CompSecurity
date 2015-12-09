// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            GAThread, al, a, g, 
//            ac, k, GoogleAnalytics, w, 
//            aa, ai

final class zP
    implements Runnable
{

    final GAThread zO;
    private final Map zP;

    private static String u(Map map)
    {
        if (map.containsKey("useSecure"))
        {
            if (al.f((String)map.get("useSecure"), true))
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

    private void v(Map map)
    {
        q q = a.w(GAThread.a(zO));
        al.a(map, "&adid", q);
        al.a(map, "&ate", q);
    }

    private static void w(Map map)
    {
        g g1 = g.dV();
        al.a(map, "&an", g1);
        al.a(map, "&av", g1);
        al.a(map, "&aid", g1);
        al.a(map, "&aiid", g1);
        map.put("&v", "1");
    }

    private static boolean x(Map map)
    {
        if (map.get("&sf") == null)
        {
            return false;
        }
        double d1 = al.a((String)map.get("&sf"), 100D);
        if (d1 >= 100D)
        {
            return false;
        }
        if ((double)(GAThread.ag((String)map.get("&cid")) % 10000) >= d1 * 100D)
        {
            if (map.get("&t") == null)
            {
                map = "unknown";
            } else
            {
                map = (String)map.get("&t");
            }
            ac.v(String.format("%s hit sampled out", new Object[] {
                map
            }));
            return true;
        } else
        {
            return false;
        }
    }

    public final void run()
    {
        v(zP);
        if (TextUtils.isEmpty((CharSequence)zP.get("&cid")))
        {
            zP.put("&cid", k.eh().getValue("&cid"));
        }
        if (GoogleAnalytics.getInstance(GAThread.a(zO)).getAppOptOut() || x(zP))
        {
            return;
        }
        if (!TextUtils.isEmpty(GAThread.b(zO)))
        {
            com.google.android.gms.analytics.w.eF().D(true);
            zP.putAll((new .HitBuilder()).setCampaignParamsFromUrl(GAThread.b(zO)).build());
            com.google.android.gms.analytics.w.eF().D(false);
            GAThread.a(zO, null);
        }
        w(zP);
        Map map = aa.y(zP);
        GAThread.d(zO).b(map, Long.valueOf((String)zP.get("&ht")).longValue(), u(zP), GAThread.c(zO));
    }

    .HitBuilder(GAThread gathread, Map map)
    {
        zO = gathread;
        super();
        zP = new HashMap(map);
        map = (String)map.get("&ht");
        gathread = map;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        Long.valueOf(map);
        gathread = map;
_L2:
        if (gathread == null)
        {
            long l = System.currentTimeMillis();
            zP.put("&ht", Long.toString(l));
        }
        return;
        gathread;
        gathread = null;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
