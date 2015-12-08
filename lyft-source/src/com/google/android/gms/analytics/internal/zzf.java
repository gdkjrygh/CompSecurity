// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzg, zzaf, zzr, zze, 
//            zzai, zzan, zzn, zza, 
//            zzk, zzu, zzv, zzb, 
//            zzy, zzd

public class zzf
{

    private static zzf a;
    private final Context b;
    private final Context c;
    private final zzlb d;
    private final zzr e;
    private final zzaf f;
    private final zzns g;
    private final zzb h;
    private final zzv i;
    private final zzan j;
    private final zzai k;
    private final GoogleAnalytics l;
    private final zzn m;
    private final zza n;
    private final zzk o;
    private final com.google.android.gms.analytics.internal.zzu p;

    protected zzf(zzg zzg1)
    {
        Object obj = zzg1.a();
        zzu.a(obj, "Application context can't be null");
        zzu.b(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = zzg1.b();
        zzu.a(obj1);
        b = ((Context) (obj));
        c = ((Context) (obj1));
        d = zzg1.h(this);
        e = zzg1.g(this);
        obj1 = zzg1.f(this);
        ((zzaf) (obj1)).E();
        f = ((zzaf) (obj1));
        zzn zzn1;
        zza zza1;
        zzk zzk1;
        com.google.android.gms.analytics.internal.zzu zzu1;
        if (e().a())
        {
            f().d((new StringBuilder()).append("Google Analytics ").append(zze.a).append(" is starting up.").toString());
        } else
        {
            f().d((new StringBuilder()).append("Google Analytics ").append(zze.a).append(" is starting up. ").append("To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n").append("  adb logcat -s GAv4").toString());
        }
        obj1 = zzg1.q(this);
        ((zzai) (obj1)).E();
        k = ((zzai) (obj1));
        obj1 = zzg1.e(this);
        ((zzan) (obj1)).E();
        j = ((zzan) (obj1));
        obj1 = zzg1.l(this);
        zzn1 = zzg1.d(this);
        zza1 = zzg1.c(this);
        zzk1 = zzg1.b(this);
        zzu1 = zzg1.a(this);
        obj = zzg1.a(((Context) (obj)));
        ((zzns) (obj)).a(a());
        g = ((zzns) (obj));
        obj = zzg1.i(this);
        zzn1.E();
        m = zzn1;
        zza1.E();
        n = zza1;
        zzk1.E();
        o = zzk1;
        zzu1.E();
        p = zzu1;
        zzg1 = zzg1.p(this);
        zzg1.E();
        i = zzg1;
        ((zzb) (obj1)).E();
        h = ((zzb) (obj1));
        if (e().a())
        {
            f().b("Device AnalyticsService version", zze.a);
        }
        ((GoogleAnalytics) (obj)).a();
        l = ((GoogleAnalytics) (obj));
        ((zzb) (obj1)).b();
    }

    public static zzf a(Context context)
    {
        zzu.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        zzlb zzlb1 = zzld.c();
        l1 = zzlb1.b();
        context = new zzf(new zzg(context.getApplicationContext()));
        a = context;
        GoogleAnalytics.d();
        l1 = zzlb1.b() - l1;
        l2 = ((Long)zzy.Q.a()).longValue();
        if (l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        context.f().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void a(zzd zzd1)
    {
        zzu.a(zzd1, "Analytics service not created/initialized");
        zzu.b(zzd1.C(), "Analytics service not initialized");
    }

    protected Thread.UncaughtExceptionHandler a()
    {
        return new Thread.UncaughtExceptionHandler() {

            final zzf a;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                thread = a.g();
                if (thread != null)
                {
                    thread.e("Job execution failed", throwable);
                }
            }

            
            {
                a = zzf.this;
                super();
            }
        };
    }

    public Context b()
    {
        return b;
    }

    public Context c()
    {
        return c;
    }

    public zzlb d()
    {
        return d;
    }

    public zzr e()
    {
        return e;
    }

    public zzaf f()
    {
        a(f);
        return f;
    }

    public zzaf g()
    {
        return f;
    }

    public zzns h()
    {
        zzu.a(g);
        return g;
    }

    public zzb i()
    {
        a(h);
        return h;
    }

    public zzv j()
    {
        a(i);
        return i;
    }

    public GoogleAnalytics k()
    {
        zzu.a(l);
        zzu.b(l.c(), "Analytics instance not initialized");
        return l;
    }

    public zzan l()
    {
        a(j);
        return j;
    }

    public zzai m()
    {
        a(k);
        return k;
    }

    public zzai n()
    {
        if (k == null || !k.C())
        {
            return null;
        } else
        {
            return k;
        }
    }

    public zza o()
    {
        a(n);
        return n;
    }

    public zzn p()
    {
        a(m);
        return m;
    }

    public zzk q()
    {
        a(o);
        return o;
    }

    public com.google.android.gms.analytics.internal.zzu r()
    {
        return p;
    }

    public void s()
    {
        zzns.d();
    }
}
