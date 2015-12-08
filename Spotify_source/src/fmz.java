// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public final class fmz extends fni
{

    private final fni b;
    private final fni c;
    private final fni d;
    private final fme e;
    private final fni f;
    private final fmn g;
    private final fni h;
    private long i;
    private Handler j;
    private Runnable k;
    private Runnable l;

    public fmz(fni fni1, fni fni2, fmt fmt, fme fme1, fmx fmx, fmn fmn1, fni fni3)
    {
        super("Idle");
        i = 0x927c0L;
        j = new Handler();
        k = new Runnable() {

            private fmz a;

            public final void run()
            {
                a.J_();
            }

            
            {
                a = fmz.this;
                super();
            }
        };
        l = new Runnable() {

            private fmz a;

            public final void run()
            {
                a.c();
            }

            
            {
                a = fmz.this;
                super();
            }
        };
        b = fni1;
        c = fni2;
        d = fmt;
        e = fme1;
        f = fmx;
        g = fmn1;
        h = fni3;
        fni1 = new fnl() {

            private fmz a;

            private void c()
            {
                if (fmz.a(a).a || fmz.b(a).a || fmz.c(a).a || ((fni) (fmz.d(a))).a || fmz.e(a).a || ((fni) (fmz.f(a))).a || fmz.g(a).a)
                {
                    fmz.h(a);
                    return;
                } else
                {
                    fmz.i(a);
                    return;
                }
            }

            public final void a()
            {
                c();
            }

            public final void b()
            {
                c();
            }

            
            {
                a = fmz.this;
                super();
            }
        };
        b.a(fni1);
        c.a(fni1);
        d.a(fni1);
        e.a(fni1);
        f.a(fni1);
        g.a(fni1);
        h.a(fni1);
    }

    static fni a(fmz fmz1)
    {
        return fmz1.b;
    }

    static fni b(fmz fmz1)
    {
        return fmz1.c;
    }

    static fni c(fmz fmz1)
    {
        return fmz1.d;
    }

    static fme d(fmz fmz1)
    {
        return fmz1.e;
    }

    static fni e(fmz fmz1)
    {
        return fmz1.f;
    }

    static fmn f(fmz fmz1)
    {
        return fmz1.g;
    }

    static fni g(fmz fmz1)
    {
        return fmz1.h;
    }

    static void h(fmz fmz1)
    {
        fmz1.j.removeCallbacks(fmz1.k);
        fmz1.j.post(fmz1.l);
    }

    static void i(fmz fmz1)
    {
        fmz1.j.removeCallbacks(fmz1.l);
        fmz1.j.postDelayed(fmz1.k, fmz1.i);
    }
}
