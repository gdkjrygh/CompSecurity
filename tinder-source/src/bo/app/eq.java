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
//            m, bk, aw, ei, 
//            ea, ds, bu, by, 
//            bv, h, x, bm, 
//            bl, ef, dt, eb, 
//            bs, ec, dg, k, 
//            l, i, s, q, 
//            r, u, bg, v, 
//            bh, o, br, bp, 
//            ao, cs, ee, cb, 
//            az, bo, cc, eg

public final class eq
{

    private static final String l;
    public final ei a;
    public final ea b;
    public final aw c;
    public final o d;
    public final br e;
    public final ec f;
    public final ao g;
    public final ThreadPoolExecutor h;
    public final ee i;
    public final h j;
    public final cb k;
    private final x m;
    private final ef n;
    private final s o;
    private final bs p;
    private final by q;

    public eq(Context context, m m1, XmlAppConfigurationProvider xmlappconfigurationprovider, az az, bo bo, cc cc, eg eg, 
            boolean flag)
    {
        Object obj = m1.a();
        bk bk1 = new bk();
        h = new ThreadPoolExecutor(2, 16, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(40), bk1);
        c = new aw(h);
        if (((String) (obj)).equals(""))
        {
            a = new ei(context, eg);
            b = new ea(context);
            m1 = ds.a(context, null);
        } else
        {
            a = new ei(context, ((String) (obj)), xmlappconfigurationprovider.getAppboyApiKey().toString(), eg);
            b = new ea(context, ((String) (obj)), xmlappconfigurationprovider.getAppboyApiKey().toString());
            m1 = ds.a(context, ((String) (obj)));
        }
        q = new bu(context);
        q.b();
        bo = new bv(context, bo, cc, b, eg, q);
        j = new h(xmlappconfigurationprovider, bo);
        j.a = ((String) (obj));
        m = new x(a, bo);
        cc = new bm(bk1);
        bk1.a = new bl(c);
        n = new ef(m1);
        m1 = new dt(n, cc);
        i = new eb(m1, c);
        cc = (AlarmManager)context.getSystemService("alarm");
        p = new bs(i, c, context, cc, xmlappconfigurationprovider.getSessionTimeoutSeconds(), eg);
        f = new ec(context, ((String) (obj)));
        az = new dg(j, new k(new l(new i())), c, az, h, f, eg);
        o = new s(context, c, new q(), cc, new r(context));
        cc = o;
        obj = c;
        ((aw) (obj)).a(new u(cc), bo/app/bg);
        ((aw) (obj)).a(new v(cc), bo/app/bh);
        o.a();
        d = new o(xmlappconfigurationprovider, c, az, m, bk1, flag);
        e = new br(p, d, bo, xmlappconfigurationprovider, context);
        if (!flag)
        {
            ((dg)az).a = e;
        }
        f.e = e;
        m.b = e;
        k = new bp(context, e, xmlappconfigurationprovider, eg);
        g = new ao(k, m1, d, p, e, context, a, b, eg);
    }

    static aw a(eq eq1)
    {
        return eq1.c;
    }

    static String a()
    {
        return l;
    }

    static o b(eq eq1)
    {
        return eq1.d;
    }

    static s c(eq eq1)
    {
        return eq1.o;
    }

    static ef d(eq eq1)
    {
        return eq1.n;
    }

    static 
    {
        l = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/eq.getName()
        });
    }
}
