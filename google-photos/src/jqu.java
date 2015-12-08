// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class jqu
    implements Runnable
{

    private Map a;
    private boolean b;
    private String c;
    private long d;
    private boolean e;
    private boolean f;
    private String g;
    private jqt h;

    jqu(jqt jqt1, Map map, boolean flag, String s, long l, boolean flag1, 
            boolean flag2, String s1)
    {
        h = jqt1;
        a = map;
        b = flag;
        c = s;
        d = l;
        e = flag1;
        f = flag2;
        g = s1;
        super();
    }

    public final void run()
    {
        boolean flag1 = true;
        if (h.c.b())
        {
            a.put("sc", "start");
        }
        Object obj = a;
        Object obj1 = ((jrj) (h)).d.d();
        b.q("getClientId can not be called from the main thread");
        jtk.b(((Map) (obj)), "cid", ((jqe) (obj1)).a.g().b());
        obj = (String)a.get("sf");
        if (obj != null)
        {
            double d1 = jtk.a(((String) (obj)), 100D);
            if (jtk.a(d1, (String)a.get("cid")))
            {
                h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        obj = jqt.a(h);
        boolean flag;
        if (b)
        {
            jtk.a(a, "ate", ((jrd) (obj)).b());
            jtk.a(a, "adid", ((jrd) (obj)).c());
        } else
        {
            a.remove("ate");
            a.remove("adid");
        }
        obj = jqt.b(h).b();
        jtk.a(a, "an", ((ljk) (obj)).a);
        jtk.a(a, "av", ((ljk) (obj)).b);
        jtk.a(a, "aid", ((ljk) (obj)).c);
        jtk.a(a, "aiid", ((ljk) (obj)).d);
        a.put("v", "1");
        a.put("_v", jsx.b);
        jtk.a(a, "ul", jqt.c(h).b().a);
        jtk.a(a, "sr", jqt.d(h).c());
        if (c.equals("transaction") || c.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !h.b.a())
        {
            jqt.e(h).a(a, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = jtk.a((String)a.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = d;
        }
        if (e)
        {
            obj = new jsn(h, a, l, f);
            jqt.f(h).c("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)a.get("cid");
        obj1 = new HashMap();
        jtk.a(((Map) (obj1)), "uid", a);
        jtk.a(((Map) (obj1)), "an", a);
        jtk.a(((Map) (obj1)), "aid", a);
        jtk.a(((Map) (obj1)), "av", a);
        jtk.a(((Map) (obj1)), "aiid", a);
        String s = g;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new jrn(0L, ((String) (obj)), s, flag1, 0L, ((Map) (obj1)));
        l1 = jqt.g(h).a(((jrn) (obj)));
        a.put("_s", String.valueOf(l1));
        obj = new jsn(h, a, l, f);
        jqt.h(h).a(((jsn) (obj)));
    }
}
