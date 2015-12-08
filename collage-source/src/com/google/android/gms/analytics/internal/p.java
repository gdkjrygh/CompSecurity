// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.zzof;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, u, z, t, 
//            v, ak, c

public class p extends r
{

    private final com.google.android.gms.analytics.internal.z a;

    public p(t t, u u1)
    {
        super(t);
        z.a(u1);
        a = u1.j(t);
    }

    static com.google.android.gms.analytics.internal.z a(p p1)
    {
        return p1.a;
    }

    public long a(v v)
    {
        D();
        z.a(v);
        m();
        long l = a.a(v, true);
        if (l == 0L)
        {
            a.a(v);
        }
        return l;
    }

    protected void a()
    {
        a.E();
    }

    public void a(ak ak)
    {
        D();
        r().a(new zzb._cls6(ak));
    }

    public void a(c c1)
    {
        z.a(c1);
        D();
        b("Hit delivery requested", c1);
        r().a(new zzb._cls4(c1));
    }

    public void a(String s, Runnable runnable)
    {
        z.a(s, "campaign param can't be empty");
        r().a(new zzb._cls3(s, runnable));
    }

    public void a(boolean flag)
    {
        a("Network connectivity status changed", Boolean.valueOf(flag));
        r().a(new zzb._cls2(flag));
    }

    public void b()
    {
        a.b();
    }

    public void c()
    {
        D();
        Context context = o();
        if (AnalyticsReceiver.a(context) && AnalyticsService.a(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            a(((ak) (null)));
            return;
        }
    }

    public boolean d()
    {
        D();
        Future future = r().a(new Callable() {

            final p a;

            public Void a()
                throws Exception
            {
                p.a(a).F();
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = p.this;
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

    public void e()
    {
        D();
        zzof.d();
        a.f();
    }

    public void f()
    {
        b("Radio powered up");
        c();
    }

    void g()
    {
        m();
        a.e();
    }

    void h()
    {
        m();
        a.d();
    }

    // Unreferenced inner class com/google/android/gms/analytics/internal/zzb$1

/* anonymous class */
    class zzb._cls1
        implements Runnable
    {

        final int a;
        final p b;

        public void run()
        {
            p.a(b).a((long)a * 1000L);
        }
    }


    // Unreferenced inner class com/google/android/gms/analytics/internal/zzb$2

/* anonymous class */
    class zzb._cls2
        implements Runnable
    {

        final boolean a;
        final p b;

        public void run()
        {
            p.a(b).a(a);
        }

            
            {
                b = p.this;
                a = flag;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/analytics/internal/zzb$3

/* anonymous class */
    class zzb._cls3
        implements Runnable
    {

        final String a;
        final Runnable b;
        final p c;

        public void run()
        {
            p.a(c).a(a);
            if (b != null)
            {
                b.run();
            }
        }

            
            {
                c = p.this;
                a = s;
                b = runnable;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/analytics/internal/zzb$4

/* anonymous class */
    class zzb._cls4
        implements Runnable
    {

        final c a;
        final p b;

        public void run()
        {
            p.a(b).a(a);
        }

            
            {
                b = p.this;
                a = c1;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/analytics/internal/zzb$5

/* anonymous class */
    class zzb._cls5
        implements Runnable
    {

        final p a;

        public void run()
        {
            p.a(a).h();
        }
    }


    // Unreferenced inner class com/google/android/gms/analytics/internal/zzb$6

/* anonymous class */
    class zzb._cls6
        implements Runnable
    {

        final ak a;
        final p b;

        public void run()
        {
            p.a(b).a(a);
        }

            
            {
                b = p.this;
                a = ak;
                super();
            }
    }

}
