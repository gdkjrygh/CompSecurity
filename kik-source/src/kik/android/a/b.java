// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.a;

import android.content.Context;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.n.a.d.a;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import kik.a.e.e;
import kik.a.e.q;
import kik.a.e.v;
import kik.a.j.m;
import kik.a.j.n;
import kik.android.util.ar;
import kik.android.util.d;
import org.c.c;
import org.json.JSONObject;

// Referenced classes of package kik.android.a:
//            c, d, e, a, 
//            f

public final class b
    implements e
{
    private final class a extends TimerTask
    {

        final b a;

        public final void run()
        {
            kik.android.a.b.a(a).b();
        }

        private a()
        {
            a = b.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final org.c.b f = org.c.c.a("MetricsWrapper");
    boolean a;
    boolean b;
    String c;
    private final kik.android.a.a d;
    private final Timer e = new Timer();
    private i g;
    private i h;
    private f i;
    private com.kik.d.a.a j;
    private m k;
    private v l;

    public b(Context context, String s, com.kik.g.e e1, v v1, com.kik.g.e e2, boolean flag, ar ar1, 
            q q1)
    {
        b = false;
        g = new kik.android.a.c(this);
        h = new kik.android.a.d(this);
        i = new f();
        j = new kik.android.a.e(this);
        c = null;
        q1 = q1.a("client-metrics");
        kik.android.util.d.a(context.getDir("client-metrics", 0), q1);
        context = new com.kik.d.b(s, q1, flag);
        s = ar1.c();
        d = new kik.android.a.a(context, j, s);
        long l1 = (new Random()).nextInt(0x1499700);
        e.scheduleAtFixedRate(new a((byte)0), 0xa4cb80L + l1, 0x1499700L);
        l = v1;
        i.a(e1, g);
        i.a(e2, h);
    }

    static kik.android.a.a a(b b1)
    {
        return b1.d;
    }

    static v b(b b1)
    {
        return b1.l;
    }

    public final String a(Map map)
    {
        return (new JSONObject(map)).toString();
    }

    public final void a()
    {
        if (c == null && a)
        {
            String s = l.n("enc_metrics_anon_id");
            if (s != null && !s.equals(""))
            {
                c = s;
                d.c(s);
            } else
            if (!b)
            {
                b = true;
                k.b("enc_metrics_anon_id", com/kik/n/a/d/a).a(new kik.android.a.f(this));
                return;
            }
        }
    }

    public final void a(n n)
    {
        k = (m)n;
    }

    public final void b()
    {
        l.c("enc_metrics_anon_id", c);
        k.a("enc_metrics_anon_id", null, (new com.kik.n.a.d.a()).a(c));
    }

    public final com.kik.d.f c()
    {
        return d;
    }

    public final void d()
    {
        d.d();
    }

    public final void e()
    {
        d.e();
    }

    public final boolean f()
    {
        return d.f();
    }

    public final void g()
    {
        d.b();
        i.a();
    }

}
