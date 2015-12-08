// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class ang.Object
    implements Runnable
{

    private Map a;
    private String b;
    private long c;
    private boolean d;
    private boolean e;
    private String f;
    private bmc g;

    public final void run()
    {
        boolean flag1 = true;
        if (g.c.b())
        {
            a.put("sc", "start");
        }
        Object obj = a;
        Object obj1 = ((bnc) (g)).f.d();
        btl.c("getClientId can not be called from the main thread");
        bmz.b(((Map) (obj)), "cid", ((bod) (obj1)).e.g().b());
        obj = (String)a.get("sf");
        if (obj != null)
        {
            double d1 = bmz.a(((String) (obj)));
            if (bmz.a(d1, (String)a.get("cid")))
            {
                g.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                return;
            }
        }
        ((bnc) (g)).f.f();
        a.remove("ate");
        a.remove("adid");
        obj = ((bnc) (g)).f.h().b();
        bmz.a(a, "an", ((coa) (obj)).a);
        bmz.a(a, "av", ((coa) (obj)).b);
        bmz.a(a, "aid", ((coa) (obj)).c);
        bmz.a(a, "aiid", ((coa) (obj)).d);
        a.put("v", "1");
        a.put("_v", bne.b);
        bmz.a(a, "ul", ((bnc) (g)).f.h.b().a);
        bmz.a(a, "sr", ((bnc) (g)).f.h.c());
        boolean flag;
        if (b.equals("transaction") || b.equals("item"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !g.b.a())
        {
            ((bnc) (g)).f.a().a(a, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long l1 = bmz.b((String)a.get("ht"));
        long l = l1;
        if (l1 == 0L)
        {
            l = c;
        }
        if (d)
        {
            obj = new bmj(g, a, l, e);
            ((bnc) (g)).f.a().c("Dry run enabled. Would have sent hit", obj);
            return;
        }
        obj = (String)a.get("cid");
        obj1 = new HashMap();
        bmz.a(((Map) (obj1)), "uid", a);
        bmz.a(((Map) (obj1)), "an", a);
        bmz.a(((Map) (obj1)), "aid", a);
        bmz.a(((Map) (obj1)), "av", a);
        bmz.a(((Map) (obj1)), "aiid", a);
        String s = f;
        if (TextUtils.isEmpty((CharSequence)a.get("adid")))
        {
            flag1 = false;
        }
        obj = new bnh(((String) (obj)), s, flag1, 0L, ((Map) (obj1)));
        l1 = ((bnc) (g)).f.c().a(((bnh) (obj)));
        a.put("_s", String.valueOf(l1));
        obj = new bmj(g, a, l, e);
        ((bnc) (g)).f.c().a(((bmj) (obj)));
    }

    (bmc bmc1, Map map, String s, long l, boolean flag, boolean flag1, 
            String s1)
    {
        g = bmc1;
        a = map;
        b = s;
        c = l;
        d = flag;
        e = flag1;
        f = s1;
        super();
    }
}
