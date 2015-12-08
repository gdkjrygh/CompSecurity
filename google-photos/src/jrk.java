// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;

public class jrk
{

    private static jrk i;
    final Context a;
    final Context b;
    public final kdh c = kdj.c();
    final jsh d = jrm.b(this);
    final jso e;
    final jsj f;
    final jss g;
    public final jsi h;
    private final ljb j;
    private final jre k;
    private final jsv l;
    private final jqp m;
    private final jsc n;
    private final jrd o;
    private final jrv p;

    private jrk(jrm jrm1)
    {
        Object obj = jrm1.a;
        b.f(obj, "Application context can't be null");
        b.b(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = jrm1.b;
        b.d(obj1);
        a = ((Context) (obj));
        b = ((Context) (obj1));
        obj1 = new jso(this);
        ((jso) (obj1)).s();
        e = ((jso) (obj1));
        jrd jrd1;
        jrv jrv1;
        jsi jsi1;
        if (kbe.a)
        {
            a().d((new StringBuilder("Google Analytics ")).append(jsx.a).append(" is starting up.").toString());
        } else
        {
            a().d((new StringBuilder("Google Analytics ")).append(jsx.a).append(" is starting up. To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        }
        obj1 = jrm.f(this);
        ((jss) (obj1)).s();
        g = ((jss) (obj1));
        obj1 = new jsv(this);
        ((jsv) (obj1)).s();
        l = ((jsv) (obj1));
        jrm1 = new jre(this, jrm1);
        obj1 = jrm.a(this);
        jrd1 = new jrd(this);
        jrv1 = new jrv(this);
        jsi1 = new jsi(this);
        obj = ljb.a(((Context) (obj)));
        obj.c = new jrl(this);
        j = ((ljb) (obj));
        obj = new jqp(this);
        ((jsc) (obj1)).s();
        n = ((jsc) (obj1));
        jrd1.s();
        o = jrd1;
        jrv1.s();
        p = jrv1;
        jsi1.s();
        h = jsi1;
        obj1 = jrm.e(this);
        ((jsj) (obj1)).s();
        f = ((jsj) (obj1));
        jrm1.s();
        k = jrm1;
        if (kbe.a)
        {
            a().b("Device AnalyticsService version", jsx.a);
        }
        obj1 = ((jqe) (obj)).a.e();
        if (((jsv) (obj1)).d())
        {
            jtj.a().a(((jsv) (obj1)).e());
        }
        if (((jsv) (obj1)).o())
        {
            obj.d = ((jsv) (obj1)).p();
        }
        if (((jsv) (obj1)).d())
        {
            jqs jqs1 = jtj.a();
            if (jqs1 != null)
            {
                jqs1.a(((jsv) (obj1)).e());
            }
        }
        obj.c = true;
        m = ((jqp) (obj));
        ((jre) (jrm1)).a.b();
    }

    public static jrk a(Context context)
    {
        b.d(context);
        if (i != null) goto _L2; else goto _L1
_L1:
        jrk;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        kdh kdh1 = kdj.c();
        l1 = kdh1.b();
        context = new jrk(new jrm(context.getApplicationContext()));
        i = context;
        jqp.b();
        l1 = kdh1.b() - l1;
        l2 = ((Long)jsl.E.a()).longValue();
        if (l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        context.a().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        jrk;
        JVM INSTR monitorexit ;
_L2:
        return i;
        context;
        jrk;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(jsw jsw1)
    {
        b.f(jsw1, "Analytics service not created/initialized");
        b.b(jsw1.q(), "Analytics service not initialized");
    }

    public static void i()
    {
        ljb.b();
    }

    public final jso a()
    {
        a(((jsw) (e)));
        return e;
    }

    public final ljb b()
    {
        b.d(j);
        return j;
    }

    public final jre c()
    {
        a(k);
        return k;
    }

    public final jqp d()
    {
        b.d(m);
        boolean flag;
        if (m.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, "Analytics instance not initialized");
        return m;
    }

    public final jsv e()
    {
        a(l);
        return l;
    }

    public final jrd f()
    {
        a(o);
        return o;
    }

    public final jsc g()
    {
        a(n);
        return n;
    }

    public final jrv h()
    {
        a(p);
        return p;
    }
}
