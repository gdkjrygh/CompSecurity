// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.bluetooth:
//            d

public abstract class e
{

    private final com.fitbit.util.threading.FitbitHandlerThread.ThreadName a;
    private final boolean b;

    public e()
    {
        this(((com.fitbit.util.threading.FitbitHandlerThread.ThreadName) (null)));
    }

    public e(com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname)
    {
        this(threadname, false);
    }

    public e(com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname, boolean flag)
    {
        a = threadname;
        b = flag;
    }

    public e(boolean flag)
    {
        this(null, flag);
    }

    private void b(Runnable runnable)
    {
        if (a != null)
        {
            FitbitHandlerThread.a(a, runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    protected void a()
    {
    }

    protected void b()
    {
    }

    public final void c()
    {
        com.fitbit.bluetooth.d.a().a(this);
    }

    public final void d()
    {
        com.fitbit.bluetooth.d.a().b(this);
    }

    protected final boolean e()
    {
        return b;
    }

    protected final void f()
    {
        b(new Runnable() {

            final e a;

            public void run()
            {
                a.b();
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    protected final void g()
    {
        b(new Runnable() {

            final e a;

            public void run()
            {
                a.k();
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    protected final void h()
    {
        b(new Runnable() {

            final e a;

            public void run()
            {
                a.a();
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    protected final void i()
    {
        b(new Runnable() {

            final e a;

            public void run()
            {
                a.l();
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    protected final void j()
    {
        b(new Runnable() {

            final e a;

            public void run()
            {
                a.m();
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    protected void k()
    {
    }

    protected void l()
    {
    }

    protected void m()
    {
    }
}
