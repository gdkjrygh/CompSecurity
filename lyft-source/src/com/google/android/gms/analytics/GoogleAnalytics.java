// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zza, Tracker, Logger

public final class GoogleAnalytics extends zza
{

    private static List b = new ArrayList();
    private boolean c;
    private boolean d;
    private Set e;
    private boolean f;
    private boolean g;
    private volatile boolean h;

    public GoogleAnalytics(zzf zzf1)
    {
        super(zzf1);
        e = new HashSet();
    }

    public static GoogleAnalytics a(Context context)
    {
        return zzf.a(context).k();
    }

    public static void d()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
        b = null;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
    }

    private zzb p()
    {
        return k().i();
    }

    private zzan q()
    {
        return k().l();
    }

    public Tracker a(int k)
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker = new Tracker(k(), null, null);
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        zzal zzal1 = (zzal)(new zzak(k())).a(k);
        if (zzal1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        tracker.a(zzal1);
        tracker.E();
        this;
        JVM INSTR monitorexit ;
        return tracker;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        b();
        c = true;
    }

    void a(Activity activity)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((zza)iterator.next()).a(activity)) { }
    }

    public void a(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !f)
        {
            application.registerActivityLifecycleCallbacks(new zzb());
            f = true;
        }
    }

    void a(zza zza1)
    {
        e.add(zza1);
        zza1 = k().b();
        if (zza1 instanceof Application)
        {
            a((Application)zza1);
        }
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    void b()
    {
        zzan zzan1 = q();
        if (zzan1.d())
        {
            g().a(zzan1.e());
        }
        if (zzan1.h())
        {
            a(zzan1.i());
        }
        if (zzan1.d())
        {
            Logger logger = zzae.a();
            if (logger != null)
            {
                logger.a(zzan1.e());
            }
        }
    }

    void b(Activity activity)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((zza)iterator.next()).b(activity)) { }
    }

    void b(zza zza1)
    {
        e.remove(zza1);
    }

    public boolean c()
    {
        return c && !d;
    }

    public boolean e()
    {
        return g;
    }

    public boolean f()
    {
        return h;
    }

    public Logger g()
    {
        return zzae.a();
    }

    public String h()
    {
        zzu.c("getClientId can not be called from the main thread");
        return k().p().b();
    }

    public void i()
    {
        p().c();
    }

    void j()
    {
        p().d();
    }


    private class zza
    {

        public abstract void a(Activity activity);

        public abstract void b(Activity activity);
    }


    private class zzb
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final GoogleAnalytics a;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
        }

        public void onActivityDestroyed(Activity activity)
        {
        }

        public void onActivityPaused(Activity activity)
        {
        }

        public void onActivityResumed(Activity activity)
        {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
            a.a(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            a.b(activity);
        }

        zzb()
        {
            a = GoogleAnalytics.this;
            super();
        }
    }

}
