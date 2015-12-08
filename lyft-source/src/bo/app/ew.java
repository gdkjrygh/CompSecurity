// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import com.appboy.Constants;
import com.appboy.configuration.XmlAppConfigurationProvider;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package bo.app:
//            m, bq, bb, eo, 
//            eg, dy, ca, ce, 
//            cb, h, ab, bs, 
//            br, el, dz, eh, 
//            by, ei, dm, k, 
//            l, i, u, r, 
//            s, t, y, bm, 
//            z, bn, o, bx, 
//            bv, at, bh, cy, 
//            ek, ch, be, bu, 
//            ci, em

public final class ew
{

    private static final String l;
    public final eo a;
    public final eg b;
    public final bb c;
    public final o d;
    public final bx e;
    public final ei f;
    public final at g;
    public final ThreadPoolExecutor h;
    public final ek i;
    public final h j;
    public final ch k;
    private final ab m;
    private final el n;
    private final u o;
    private final by p;
    private final ce q;

    public ew(Context context, m m1, XmlAppConfigurationProvider xmlappconfigurationprovider, be be, bu bu, ci ci, em em, 
            boolean flag)
    {
        Object obj = m1.a();
        bq bq1 = new bq();
        h = new ThreadPoolExecutor(2, 16, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(40), bq1);
        c = new bb(h);
        if (((String) (obj)).equals(""))
        {
            a = new eo(context, em);
            b = new eg(context);
            m1 = dy.a(context, null);
        } else
        {
            a = new eo(context, ((String) (obj)), xmlappconfigurationprovider.getAppboyApiKey().toString(), em);
            b = new eg(context, ((String) (obj)), xmlappconfigurationprovider.getAppboyApiKey().toString());
            m1 = dy.a(context, ((String) (obj)));
        }
        q = new ca(context);
        q.b();
        bu = new cb(context, bu, ci, b, em, q);
        j = new h(xmlappconfigurationprovider, bu);
        j.a = ((String) (obj));
        m = new ab(a, bu);
        ci = new bs(bq1);
        bq1.a = new br(c);
        n = new el(m1);
        m1 = new dz(n, ci);
        i = new eh(m1, c);
        ci = (AlarmManager)context.getSystemService("alarm");
        p = new by(i, c, context, ci, xmlappconfigurationprovider.getSessionTimeoutSeconds(), em);
        f = new ei(context, ((String) (obj)));
        be = new dm(j, new k(new l(new i())), c, be, h, f, em);
        o = new u(context, c, new r(), new s(), ci, new t(context));
        ci = o;
        obj = c;
        ((bb) (obj)).a(new y(ci), bo/app/bm);
        ((bb) (obj)).a(new z(ci), bo/app/bn);
        o.a();
        d = new o(xmlappconfigurationprovider, c, be, m, bq1, flag);
        e = new bx(p, d, bu, xmlappconfigurationprovider, context);
        if (!flag)
        {
            ((dm)be).a = e;
        }
        f.e = e;
        m.b = e;
        k = new bv(context, e, xmlappconfigurationprovider, em);
        g = new at(k, m1, d, p, e, context, a, b, em);
        context = d;
        c.a(((o) (context)).e, bo/app/bh);
    }

    static bb a(ew ew1)
    {
        return ew1.c;
    }

    static String a()
    {
        return l;
    }

    static o b(ew ew1)
    {
        return ew1.d;
    }

    static u c(ew ew1)
    {
        return ew1.o;
    }

    static el d(ew ew1)
    {
        return ew1.n;
    }

    static 
    {
        l = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ew.getName()
        });
    }
}
