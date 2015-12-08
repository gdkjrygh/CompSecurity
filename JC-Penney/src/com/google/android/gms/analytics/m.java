// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.ae;
import com.google.android.gms.analytics.internal.am;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.analytics.internal.bf;
import com.google.android.gms.analytics.internal.d;
import com.google.android.gms.analytics.internal.h;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.d.al;
import com.google.android.gms.d.an;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            l, n, f

class m
    implements Runnable
{

    final Map a;
    final boolean b;
    final String c;
    final long d;
    final boolean e;
    final boolean f;
    final String g;
    final l h;

    m(l l1, Map map, boolean flag, String s, long l2, boolean flag1, 
            boolean flag2, String s1)
    {
        h = l1;
        a = map;
        b = flag;
        c = s;
        d = l2;
        e = flag1;
        f = flag2;
        g = s1;
        super();
    }

    public void run()
    {
        boolean flag1 = true;
        if (l.a(h).b())
        {
            a.put("sc", "start");
        }
        r.b(a, "cid", h.s().h());
        Object obj = (String)a.get("sf");
        if (obj != null)
        {
            double d1 = r.a(((String) (obj)), 100D);
            if (r.a(d1, (String)a.get("cid")))
            {
                h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        obj = com.google.android.gms.analytics.l.b(h);
        boolean flag;
        if (b)
        {
            r.a(a, "ate", ((b) (obj)).b());
            r.a(a, "adid", ((b) (obj)).c());
        } else
        {
            a.remove("ate");
            a.remove("adid");
        }
        obj = l.c(h).c();
        r.a(a, "an", ((al) (obj)).a());
        r.a(a, "av", ((al) (obj)).b());
        r.a(a, "aid", ((al) (obj)).c());
        r.a(a, "aiid", ((al) (obj)).d());
        a.put("v", "1");
        a.put("_v", aa.b);
        r.a(a, "ul", com.google.android.gms.analytics.l.d(h).b().f());
        r.a(a, "sr", l.e(h).c());
        if (c.equals("transaction") || c.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !l.f(h).a())
        {
            l.g(h).a(a, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l2 = r.a((String)a.get("ht"));
        long l1 = l2;
        if (l2 == 0L)
        {
            l1 = d;
        }
        if (e)
        {
            obj = new d(h, a, l1, f);
            com.google.android.gms.analytics.l.h(h).c("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)a.get("cid");
        HashMap hashmap = new HashMap();
        r.a(hashmap, "uid", a);
        r.a(hashmap, "an", a);
        r.a(hashmap, "aid", a);
        r.a(hashmap, "av", a);
        r.a(hashmap, "aiid", a);
        String s = g;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new ae(0L, ((String) (obj)), s, flag1, 0L, hashmap);
        l2 = l.i(h).a(((ae) (obj)));
        a.put("_s", String.valueOf(l2));
        obj = new d(h, a, l1, f);
        com.google.android.gms.analytics.l.j(h).a(((d) (obj)));
    }
}
