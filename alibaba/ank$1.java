// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

class ang.Object
    implements Runnable
{

    final Map a;
    final boolean b;
    final String c;
    final long d;
    final boolean e;
    final boolean f;
    final String g;
    final ank h;

    public void run()
    {
        boolean flag1 = true;
        if (ank.a(h).b())
        {
            a.put("sc", "start");
        }
        aob.b(a, "cid", h.s().h());
        Object obj = (String)a.get("sf");
        if (obj != null)
        {
            double d1 = aob.a(((String) (obj)), 100D);
            if (aob.a(d1, (String)a.get("cid")))
            {
                h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        obj = ank.b(h);
        boolean flag;
        if (b)
        {
            aob.a(a, "ate", ((ano) (obj)).b());
            aob.a(a, "adid", ((ano) (obj)).c());
        } else
        {
            a.remove("ate");
            a.remove("adid");
        }
        obj = ank.c(h).c();
        aob.a(a, "an", ((auo) (obj)).a());
        aob.a(a, "av", ((auo) (obj)).b());
        aob.a(a, "aid", ((auo) (obj)).c());
        aob.a(a, "aiid", ((auo) (obj)).d());
        a.put("v", "1");
        a.put("_v", aog.b);
        aob.a(a, "ul", ank.d(h).b().f());
        aob.a(a, "sr", ank.e(h).c());
        if (c.equals("transaction") || c.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !ank.f(h).a())
        {
            ank.g(h).a(a, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = aob.a((String)a.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = d;
        }
        if (e)
        {
            obj = new anq(h, a, l, f);
            ank.h(h).c("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)a.get("cid");
        HashMap hashmap = new HashMap();
        aob.a(hashmap, "uid", a);
        aob.a(hashmap, "an", a);
        aob.a(hashmap, "aid", a);
        aob.a(hashmap, "av", a);
        aob.a(hashmap, "aiid", a);
        String s = g;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new aoj(0L, ((String) (obj)), s, flag1, 0L, hashmap);
        l1 = ank.i(h).a(((aoj) (obj)));
        a.put("_s", String.valueOf(l1));
        obj = new anq(h, a, l, f);
        ank.j(h).a(((anq) (obj)));
    }

    (ank ank1, Map map, boolean flag, String s, long l, boolean flag1, 
            boolean flag2, String s1)
    {
        h = ank1;
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
