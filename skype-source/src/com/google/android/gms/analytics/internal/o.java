// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.je;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            q, t, s, y, 
//            u, aj, c

public final class o extends q
{

    private final com.google.android.gms.analytics.internal.y a;

    public o(s s1, t t1)
    {
        super(s1);
        y.a(t1);
        a = t1.c(s1);
    }

    static com.google.android.gms.analytics.internal.y a(o o1)
    {
        return o1.a;
    }

    public final long a(u u)
    {
        B();
        y.a(u);
        s.r();
        long l = a.b(u);
        if (l == 0L)
        {
            a.a(u);
        }
        return l;
    }

    protected final void a()
    {
        a.C();
    }

    public final void a(aj aj)
    {
        B();
        p().a(new Runnable(aj) {

            final aj a;
            final o b;

            public final void run()
            {
                o.a(b).a(a);
            }

            
            {
                b = o.this;
                a = aj;
                super();
            }
        });
    }

    public final void a(c c1)
    {
        y.a(c1);
        B();
        b("Hit delivery requested", c1);
        p().a(new Runnable(c1) {

            final c a;
            final o b;

            public final void run()
            {
                o.a(b).a(a);
            }

            
            {
                b = o.this;
                a = c1;
                super();
            }
        });
    }

    public final void a(String s1, Runnable runnable)
    {
        y.a(s1, "campaign param can't be empty");
        p().a(new Runnable(s1, runnable) {

            final String a;
            final Runnable b;
            final o c;

            public final void run()
            {
                o.a(c).a(a);
                if (b != null)
                {
                    b.run();
                }
            }

            
            {
                c = o.this;
                a = s1;
                b = runnable;
                super();
            }
        });
    }

    public final void a(boolean flag)
    {
        a("Network connectivity status changed", Boolean.valueOf(flag));
        p().a(new Runnable(flag) {

            final boolean a;
            final o b;

            public final void run()
            {
                o.a(b).h();
            }

            
            {
                b = o.this;
                a = flag;
                super();
            }
        });
    }

    public final void b()
    {
        a.b();
    }

    public final void c()
    {
        B();
        b("setLocalDispatchPeriod (sec)", Integer.valueOf(10));
        p().a(new Runnable() {

            final int a = 10;
            final o b;

            public final void run()
            {
                o.a(b).a((long)a * 1000L);
            }

            
            {
                b = o.this;
                super();
            }
        });
    }

    public final void d()
    {
        B();
        Context context = m();
        if (AnalyticsReceiver.a(context) && AnalyticsService.a(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            a(((aj) (null)));
            return;
        }
    }

    public final boolean e()
    {
        B();
        Future future = p().a(new Callable() {

            final o a;

            public final Object call()
                throws Exception
            {
                o.a(a).g();
                return null;
            }

            
            {
                a = o.this;
                super();
            }
        });
        try
        {
            future.get();
        }
        catch (InterruptedException interruptedexception)
        {
            d("syncDispatchLocalHits interrupted", interruptedexception);
            return false;
        }
        catch (ExecutionException executionexception)
        {
            e("syncDispatchLocalHits failed", executionexception);
            return false;
        }
        return true;
    }

    public final void f()
    {
        B();
        je.d();
        a.f();
    }

    final void g()
    {
        s.r();
        a.e();
    }

    final void h()
    {
        s.r();
        a.d();
    }
}
