// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzns;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzg, zzl, zzf, 
//            zzh, zzab, zzw

public class zzb extends zzd
{

    private final zzl a;

    public zzb(zzf zzf, zzg zzg1)
    {
        super(zzf);
        zzu.a(zzg1);
        a = zzg1.j(zzf);
    }

    static zzl a(zzb zzb1)
    {
        return zzb1.a;
    }

    public long a(zzh zzh)
    {
        D();
        zzu.a(zzh);
        m();
        long l = a.a(zzh, true);
        if (l == 0L)
        {
            a.a(zzh);
        }
        return l;
    }

    protected void a()
    {
        a.E();
    }

    public void a(zzab zzab)
    {
        zzu.a(zzab);
        D();
        b("Hit delivery requested", zzab);
        r().a(new Runnable(zzab) {

            final zzab a;
            final zzb b;

            public void run()
            {
                zzb.a(b).a(a);
            }

            
            {
                b = zzb.this;
                a = zzab;
                super();
            }
        });
    }

    public void a(zzw zzw)
    {
        D();
        r().a(new Runnable(zzw) {

            final zzw a;
            final zzb b;

            public void run()
            {
                zzb.a(b).a(a);
            }

            
            {
                b = zzb.this;
                a = zzw;
                super();
            }
        });
    }

    public void a(String s, Runnable runnable)
    {
        zzu.a(s, "campaign param can't be empty");
        r().a(new Runnable(s, runnable) {

            final String a;
            final Runnable b;
            final zzb c;

            public void run()
            {
                zzb.a(c).a(a);
                if (b != null)
                {
                    b.run();
                }
            }

            
            {
                c = zzb.this;
                a = s;
                b = runnable;
                super();
            }
        });
    }

    public void a(boolean flag)
    {
        a("Network connectivity status changed", Boolean.valueOf(flag));
        r().a(new Runnable(flag) {

            final boolean a;
            final zzb b;

            public void run()
            {
                zzb.a(b).a(a);
            }

            
            {
                b = zzb.this;
                a = flag;
                super();
            }
        });
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
            a(((zzw) (null)));
            return;
        }
    }

    public boolean d()
    {
        D();
        Future future = r().a(new Callable() {

            final zzb a;

            public Void a()
            {
                zzb.a(a).j();
                return null;
            }

            public Object call()
            {
                return a();
            }

            
            {
                a = zzb.this;
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
        zzns.d();
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
}
