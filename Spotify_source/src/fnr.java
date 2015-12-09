// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public final class fnr extends fni
{

    private final fni b;
    private final fni c;
    private Handler d;
    private Runnable e;

    public fnr(fni fni1, fni fni2)
    {
        super("WakeState");
        d = new Handler();
        e = new Runnable() {

            private fnr a;

            public final void run()
            {
                a.c();
            }

            
            {
                a = fnr.this;
                super();
            }
        };
        b = fni1;
        c = fni2;
        fnl fnl = new fnl() {

            private fnr a;

            public final void a()
            {
                fnr.a(a);
                a.J_();
            }

            public final void b()
            {
                if (fnr.b(a).d() && fnr.c(a).d())
                {
                    fnr.d(a);
                }
            }

            
            {
                a = fnr.this;
                super();
            }
        };
        fni1.a(fnl);
        fni2.a(fnl);
    }

    static void a(fnr fnr1)
    {
        fnr1.d.removeCallbacks(fnr1.e);
    }

    static fni b(fnr fnr1)
    {
        return fnr1.b;
    }

    static fni c(fnr fnr1)
    {
        return fnr1.c;
    }

    static void d(fnr fnr1)
    {
        fnr1.d.postDelayed(fnr1.e, 0x1d4c0L);
    }
}
