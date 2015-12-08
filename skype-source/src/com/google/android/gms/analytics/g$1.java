// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.c;
import com.google.android.gms.analytics.internal.e;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.internal.jh;
import com.google.android.gms.internal.jj;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            g, c

final class g
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

    public final void run()
    {
        boolean flag1 = true;
        if (com.google.android.gms.analytics.g.a(h).c())
        {
            a.put("sc", "start");
        }
        m.b(a, "cid", h.q().g());
        Object obj = (String)a.get("sf");
        if (obj != null)
        {
            double d1 = m.a(((String) (obj)));
            if (m.a(d1, (String)a.get("cid")))
            {
                h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        obj = com.google.android.gms.analytics.g.b(h);
        boolean flag;
        if (b)
        {
            m.a(a, "ate", ((a) (obj)).b());
            m.a(a, "adid", ((a) (obj)).c());
        } else
        {
            a.remove("ate");
            a.remove("adid");
        }
        obj = com.google.android.gms.analytics.g.c(h).b();
        m.a(a, "an", ((jh) (obj)).a());
        m.a(a, "av", ((jh) (obj)).b());
        m.a(a, "aid", ((jh) (obj)).c());
        m.a(a, "aiid", ((jh) (obj)).d());
        a.put("v", "1");
        a.put("_v", r.b);
        m.a(a, "ul", com.google.android.gms.analytics.g.d(h).b().a());
        m.a(a, "sr", com.google.android.gms.analytics.g.e(h).c());
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
        long l1 = m.b((String)a.get("ht"));
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
        m.a(hashmap, "uid", a);
        m.a(hashmap, "an", a);
        m.a(hashmap, "aid", a);
        m.a(hashmap, "av", a);
        m.a(hashmap, "aiid", a);
        String s = g;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new u(((String) (obj)), s, flag1, 0L, hashmap);
        l1 = com.google.android.gms.analytics.g.i(h).a(((u) (obj)));
        a.put("_s", String.valueOf(l1));
        obj = new c(h, a, l, f);
        com.google.android.gms.analytics.g.j(h).a(((c) (obj)));
    }

    rnal.o(com.google.android.gms.analytics.g g1, Map map, boolean flag, String s, long l, boolean flag1, 
            boolean flag2, String s1)
    {
        h = g1;
        a = map;
        b = flag;
        c = s;
        d = l;
        e = flag1;
        f = flag2;
        g = s1;
        super();
    }
}
