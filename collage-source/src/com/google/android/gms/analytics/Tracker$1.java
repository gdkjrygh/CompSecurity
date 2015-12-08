// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.ai;
import com.google.android.gms.analytics.internal.c;
import com.google.android.gms.analytics.internal.e;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.internal.js;
import com.google.android.gms.internal.ju;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            g, c

class g
    implements Runnable
{

    final Map a;
    final boolean b;
    final String c;
    final long d;
    final boolean e;
    final boolean f;
    final String g;
    final com.google.android.gms.analytics.g h;

    public void run()
    {
        boolean flag1 = true;
        if (com.google.android.gms.analytics.g.a(h).h())
        {
            a.put("sc", "start");
        }
        n.b(a, "cid", h.s().h());
        Object obj = (String)a.get("sf");
        if (obj != null)
        {
            double d1 = n.a(((String) (obj)), 100D);
            if (n.a(d1, (String)a.get("cid")))
            {
                h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        obj = com.google.android.gms.analytics.g.b(h);
        boolean flag;
        if (b)
        {
            n.a(a, "ate", ((a) (obj)).b());
            n.a(a, "adid", ((a) (obj)).c());
        } else
        {
            a.remove("ate");
            a.remove("adid");
        }
        obj = com.google.android.gms.analytics.g.c(h).c();
        n.a(a, "an", ((js) (obj)).a());
        n.a(a, "av", ((js) (obj)).b());
        n.a(a, "aid", ((js) (obj)).c());
        n.a(a, "aiid", ((js) (obj)).d());
        a.put("v", "1");
        a.put("_v", s.b);
        n.a(a, "ul", com.google.android.gms.analytics.g.d(h).b().f());
        n.a(a, "sr", com.google.android.gms.analytics.g.e(h).c());
        if (c.equals("transaction") || c.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !com.google.android.gms.analytics.g.f(h).a())
        {
            com.google.android.gms.analytics.g.g(h).a(a, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = n.a((String)a.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = d;
        }
        if (e)
        {
            obj = new c(h, a, l, f);
            com.google.android.gms.analytics.g.h(h).c("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)a.get("cid");
        HashMap hashmap = new HashMap();
        n.a(hashmap, "uid", a);
        n.a(hashmap, "an", a);
        n.a(hashmap, "aid", a);
        n.a(hashmap, "av", a);
        n.a(hashmap, "aiid", a);
        String s1 = g;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new v(0L, ((String) (obj)), s1, flag1, 0L, hashmap);
        l1 = com.google.android.gms.analytics.g.i(h).a(((v) (obj)));
        a.put("_s", String.valueOf(l1));
        obj = new c(h, a, l, f);
        com.google.android.gms.analytics.g.j(h).a(((c) (obj)));
    }

    (com.google.android.gms.analytics.g g1, Map map, boolean flag, String s1, long l, boolean flag1, 
            boolean flag2, String s2)
    {
        h = g1;
        a = map;
        b = flag;
        c = s1;
        d = l;
        e = flag1;
        f = flag2;
        g = s2;
        super();
    }
}
