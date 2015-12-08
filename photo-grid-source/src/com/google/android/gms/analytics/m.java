// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.ad;
import com.google.android.gms.analytics.internal.al;
import com.google.android.gms.analytics.internal.as;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.analytics.internal.bd;
import com.google.android.gms.analytics.internal.d;
import com.google.android.gms.analytics.internal.h;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.z;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wu;
import com.google.android.gms.internal.ww;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            l, n, f

final class m
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

    m(l l1, Map map, boolean flag, String s1, long l2, boolean flag1, 
            boolean flag2, String s2)
    {
        h = l1;
        a = map;
        b = flag;
        c = s1;
        d = l2;
        e = flag1;
        f = flag2;
        g = s2;
        super();
    }

    public final void run()
    {
        boolean flag1 = true;
        if (l.a(h).b())
        {
            a.put("sc", "start");
        }
        Object obj = a;
        Object obj1 = h.q();
        bl.c("getClientId can not be called from the main thread");
        q.b(((Map) (obj)), "cid", ((f) (obj1)).f().o().b());
        obj = (String)a.get("sf");
        if (obj != null)
        {
            double d1 = q.a(((String) (obj)));
            if (q.a(d1, (String)a.get("cid")))
            {
                h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        obj = com.google.android.gms.analytics.l.b(h);
        boolean flag;
        if (b)
        {
            q.a(a, "ate", ((b) (obj)).b());
            q.a(a, "adid", ((b) (obj)).c());
        } else
        {
            a.remove("ate");
            a.remove("adid");
        }
        obj = l.c(h).b();
        q.a(a, "an", ((wu) (obj)).a());
        q.a(a, "av", ((wu) (obj)).b());
        q.a(a, "aid", ((wu) (obj)).c());
        q.a(a, "aiid", ((wu) (obj)).d());
        a.put("v", "1");
        a.put("_v", z.b);
        q.a(a, "ul", com.google.android.gms.analytics.l.d(h).b().a());
        q.a(a, "sr", l.e(h).c());
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
        long l2 = q.b((String)a.get("ht"));
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
        obj1 = new HashMap();
        q.a(((Map) (obj1)), "uid", a);
        q.a(((Map) (obj1)), "an", a);
        q.a(((Map) (obj1)), "aid", a);
        q.a(((Map) (obj1)), "av", a);
        q.a(((Map) (obj1)), "aiid", a);
        String s1 = g;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new ad(((String) (obj)), s1, flag1, 0L, ((Map) (obj1)));
        l2 = l.i(h).a(((ad) (obj)));
        a.put("_s", String.valueOf(l2));
        obj = new d(h, a, l1, f);
        com.google.android.gms.analytics.l.j(h).a(((d) (obj)));
    }
}
