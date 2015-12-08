// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.app.AlarmManager;
import android.content.Context;
import com.appboy.a.b;
import com.appboy.f;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package a.a:
//            kg, am, w, dh, 
//            cy, cq, aw, ga, 
//            c, ao, an, de, 
//            cr, cz, au, db, 
//            ce, jc, kd, hb, 
//            ko, kl, km, kn, 
//            ks, ai, kt, aj, 
//            ki, at, ar, o, 
//            ad, bt, dd, bc, 
//            aa, aq, bd, df

public final class dn
{

    private static final String l;
    public final dh a;
    public final cy b;
    public final w c;
    public final ki d;
    public final at e;
    public final db f;
    public final o g;
    public final ThreadPoolExecutor h;
    public final dd i;
    public final ga j;
    public final bc k;
    private final c m;
    private final de n;
    private final ko o;
    private final au p;

    public dn(Context context, kg kg1, b b1, aa aa, aq aq, bd bd, df df, 
            boolean flag)
    {
        Object obj = kg1.a();
        am am1 = new am();
        h = new ThreadPoolExecutor(2, 16, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(40), am1);
        c = new w(h);
        if (((String) (obj)).equals(""))
        {
            a = new dh(context, df);
            b = new cy(context);
            kg1 = new cq(context);
        } else
        {
            a = new dh(context, ((String) (obj)), b1.b().toString(), df);
            b = new cy(context, ((String) (obj)), b1.b().toString());
            kg1 = new cq(context, ((String) (obj)));
        }
        aq = new aw(context, aq, bd, b, df);
        j = new ga(b1, aq);
        j.a = ((String) (obj));
        m = new c(a, aq);
        bd = new ao(am1);
        am1.a = new an(c);
        n = new de(kg1);
        kg1 = new cr(n, bd);
        i = new cz(kg1, c);
        bd = (AlarmManager)context.getSystemService("alarm");
        p = new au(i, c, context, bd, b1.a("com_appboy_session_timeout", 10), df);
        f = new db(context, ((String) (obj)));
        aa = new ce(j, new jc(new kd(new hb())), c, aa, h, f, df);
        o = new ko(context, c, new kl(), new km(), bd, new kn(context));
        bd = o;
        obj = c;
        ((w) (obj)).a(new ks(bd), a/a/ai);
        ((w) (obj)).a(new kt(bd), a/a/aj);
        o.a();
        d = new ki(b1, c, aa, m, am1, flag);
        e = new at(p, d, aq, b1);
        if (!flag)
        {
            ((ce)aa).a = e;
        }
        f.e = e;
        k = new ar(context, e, b1, df);
        g = new o(k, kg1, d, p, e, context, a, b, df);
        context = d;
        c.a(((ki) (context)).e, a/a/ad);
    }

    static w a(dn dn1)
    {
        return dn1.c;
    }

    static String a()
    {
        return l;
    }

    static ki b(dn dn1)
    {
        return dn1.d;
    }

    static ko c(dn dn1)
    {
        return dn1.o;
    }

    static de d(dn dn1)
    {
        return dn1.n;
    }

    static 
    {
        l = String.format("%s.%s", new Object[] {
            f.a, a/a/dn.getName()
        });
    }
}
