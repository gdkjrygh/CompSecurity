// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public final class eqr extends eqm
{

    public final Runnable a = new Runnable() {

        private eqr a;

        public final void run()
        {
            a.d(new eqq(a.g));
            a.b.c();
        }

            
            {
                a = eqr.this;
                super();
            }
    };
    public final eqm b;
    public Handler f;
    public final long g;

    public eqr(eqm eqm1, long l)
    {
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Timeout must be greater than zero");
        b = eqm1;
        g = l;
        b.a(new eqn() {

            private eqr a;

            public final void a(Object obj)
            {
                a.d();
                a.d(new eqp(obj, a.g));
            }

            public final void b(Object obj)
            {
                a.d();
                a.c(obj);
            }

            
            {
                a = eqr.this;
                super();
            }
        });
    }

    protected final void a()
    {
        b.c();
        d();
    }

    final void d()
    {
        if (f != null)
        {
            f.removeCallbacks(a);
        }
    }
}
