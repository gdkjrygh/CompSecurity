// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;

public class bnf
{

    private static bnf i;
    public final Context a;
    final Context b;
    public final cnp c = cnq.d();
    final bns d = bng.b(this);
    final bmp e;
    final bnw f;
    final bmt g;
    public final bnv h;
    private final cpf j;
    private final bnb k;
    private final bna l;
    private final blt m;
    private final bno n;
    private final bmh o;
    private final bnm p;

    private bnf(bng bng1)
    {
        Object obj = bng1.a;
        btl.a(obj, "Application context can't be null");
        btl.b(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = bng1.b;
        btl.a(obj1);
        a = ((Context) (obj));
        b = ((Context) (obj1));
        obj1 = new bmp(this);
        ((bmp) (obj1)).n();
        e = ((bmp) (obj1));
        a().d((new StringBuilder("Google Analytics ")).append(bne.a).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        obj1 = bng.f(this);
        ((bmt) (obj1)).n();
        g = ((bmt) (obj1));
        obj1 = new bna(this);
        ((bna) (obj1)).n();
        l = ((bna) (obj1));
        bng1 = new bnb(this, bng1);
        obj1 = bng.a(this);
        bmh bmh1 = new bmh(this);
        bnm bnm1 = new bnm(this);
        bnv bnv1 = new bnv(this);
        obj = cpf.a(((Context) (obj)));
        obj.c = new Thread.UncaughtExceptionHandler() {

            private bnf a;

            public final void uncaughtException(Thread thread, Throwable throwable)
            {
                a.e.e("Job execution failed", throwable);
            }

            
            {
                a = bnf.this;
                super();
            }
        };
        j = ((cpf) (obj));
        obj = new blt(this);
        ((bno) (obj1)).n();
        n = ((bno) (obj1));
        bmh1.n();
        o = bmh1;
        bnm1.n();
        p = bnm1;
        bnv1.n();
        h = bnv1;
        obj1 = bng.e(this);
        ((bnw) (obj1)).n();
        f = ((bnw) (obj1));
        bng1.n();
        k = bng1;
        obj1 = ((bod) (obj)).e.e();
        ((bna) (obj1)).d();
        if (((bna) (obj1)).g())
        {
            obj.c = ((bna) (obj1)).h();
        }
        ((bna) (obj1)).d();
        obj.a = true;
        m = ((blt) (obj));
        ((bnb) (bng1)).a.b();
    }

    public static bnf a(Context context)
    {
        btl.a(context);
        if (i != null) goto _L2; else goto _L1
_L1:
        bnf;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        cnp cnp1 = cnq.d();
        l1 = cnp1.b();
        context = new bnf(new bng(context.getApplicationContext()));
        i = context;
        blt.a();
        l1 = cnp1.b() - l1;
        l2 = ((Long)bnz.E.a).longValue();
        if (l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        context.a().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        bnf;
        JVM INSTR monitorexit ;
_L2:
        return i;
        context;
        bnf;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(bnd bnd1)
    {
        btl.a(bnd1, "Analytics service not created/initialized");
        btl.b(bnd1.l(), "Analytics service not initialized");
    }

    public static void i()
    {
        cpf.b();
    }

    public final bmp a()
    {
        a(((bnd) (e)));
        return e;
    }

    public final cpf b()
    {
        btl.a(j);
        return j;
    }

    public final bnb c()
    {
        a(k);
        return k;
    }

    public final blt d()
    {
        btl.a(m);
        boolean flag;
        if (m.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.b(flag, "Analytics instance not initialized");
        return m;
    }

    public final bna e()
    {
        a(l);
        return l;
    }

    public final bmh f()
    {
        a(o);
        return o;
    }

    public final bno g()
    {
        a(n);
        return n;
    }

    public final bnm h()
    {
        a(p);
        return p;
    }
}
