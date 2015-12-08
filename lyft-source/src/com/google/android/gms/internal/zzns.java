// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.common.internal.zzu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.internal:
//            zznn, zzno, zznu, zznx, 
//            zznz, zznr, zznt

public final class zzns
{

    private static volatile zzns a;
    private final Context b;
    private final List c = new CopyOnWriteArrayList();
    private final zznn d = new zznn();
    private final zza e = new zza();
    private volatile zznx f;
    private Thread.UncaughtExceptionHandler g;

    zzns(Context context)
    {
        context = context.getApplicationContext();
        zzu.a(context);
        b = context;
    }

    public static zzns a(Context context)
    {
        zzu.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzns;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new zzns(context);
        }
        com/google/android/gms/internal/zzns;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/internal/zzns;
        JVM INSTR monitorexit ;
        throw context;
    }

    static List a(zzns zzns1)
    {
        return zzns1.c;
    }

    static void a(zzns zzns1, zzno zzno1)
    {
        zzns1.b(zzno1);
    }

    static Thread.UncaughtExceptionHandler b(zzns zzns1)
    {
        return zzns1.g;
    }

    private void b(zzno zzno1)
    {
        zzu.c("deliver should be called from worker thread");
        zzu.b(zzno1.f(), "Measurement must be submitted");
        Object obj = zzno1.c();
        if (!((List) (obj)).isEmpty())
        {
            HashSet hashset = new HashSet();
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zznu zznu1 = (zznu)((Iterator) (obj)).next();
                android.net.Uri uri = zznu1.a();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    zznu1.a(zzno1);
                }
            }
        }
    }

    public static void d()
    {
        if (!(Thread.currentThread() instanceof zzc))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public zznx a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (f != null) goto _L4; else goto _L3
_L3:
        String s1;
        zznx zznx1;
        PackageManager packagemanager;
        zznx1 = new zznx();
        packagemanager = b.getPackageManager();
        s1 = b.getPackageName();
        zznx1.c(s1);
        zznx1.d(packagemanager.getInstallerPackageName(s1));
        String s;
        Object obj3;
        obj3 = null;
        s = s1;
        PackageInfo packageinfo = packagemanager.getPackageInfo(b.getPackageName(), 0);
        Object obj;
        Object obj2;
        obj2 = obj3;
        obj = s1;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        s = s1;
        obj2 = packagemanager.getApplicationLabel(packageinfo.applicationInfo);
        obj = s1;
        s = s1;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = s1;
        obj = ((CharSequence) (obj2)).toString();
        s = ((String) (obj));
        obj2 = packageinfo.versionName;
_L5:
        zznx1.a(((String) (obj)));
        zznx1.b(((String) (obj2)));
        f = zznx1;
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return f;
        Object obj1;
        obj1;
        Log.e("GAv4", (new StringBuilder()).append("Error retrieving package info: appName set to ").append(s).toString());
        obj2 = obj3;
        obj1 = s;
          goto _L5
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public Future a(Callable callable)
    {
        zzu.a(callable);
        if (Thread.currentThread() instanceof zzc)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return e.submit(callable);
        }
    }

    void a(zzno zzno1)
    {
        if (zzno1.j())
        {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (zzno1.f())
        {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else
        {
            zzno1 = zzno1.a();
            zzno1.g();
            e.execute(new Runnable(zzno1) {

                final zzno a;
                final zzns b;

                public void run()
                {
                    a.h().a(a);
                    for (Iterator iterator = zzns.a(b).iterator(); iterator.hasNext(); ((zznt)iterator.next()).a(a)) { }
                    zzns.a(b, a);
                }

            
            {
                b = zzns.this;
                a = zzno1;
                super();
            }
            });
            return;
        }
    }

    public void a(Runnable runnable)
    {
        zzu.a(runnable);
        e.submit(runnable);
    }

    public void a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        g = uncaughtexceptionhandler;
    }

    public zznz b()
    {
        DisplayMetrics displaymetrics = b.getResources().getDisplayMetrics();
        zznz zznz1 = new zznz();
        zznz1.a(zzam.a(Locale.getDefault()));
        zznz1.b(displaymetrics.widthPixels);
        zznz1.c(displaymetrics.heightPixels);
        return zznz1;
    }

    public Context c()
    {
        return b;
    }

    private class zza extends ThreadPoolExecutor
    {
        private class zzb
            implements ThreadFactory
        {

            private static final AtomicInteger a = new AtomicInteger();

            public Thread newThread(Runnable runnable)
            {
                return new zzc(runnable, (new StringBuilder()).append("measurement-").append(a.incrementAndGet()).toString());
            }


            private zzb()
            {
            }

        }


        final zzns a;

        protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
        {
            return new FutureTask(runnable, obj) {

                final zza a;

                protected void setException(Throwable throwable)
                {
                    Thread.UncaughtExceptionHandler uncaughtexceptionhandler = zzns.b(a.a);
                    if (uncaughtexceptionhandler == null) goto _L2; else goto _L1
_L1:
                    uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), throwable);
_L4:
                    super.setException(throwable);
                    return;
_L2:
                    if (Log.isLoggable("GAv4", 6))
                    {
                        Log.e("GAv4", (new StringBuilder()).append("MeasurementExecutor: job failed with ").append(throwable).toString());
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

                
                {
                    a = zza.this;
                    super(runnable, obj);
                }
            };
        }

        public zza()
        {
            a = zzns.this;
            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            setThreadFactory(new zzb());
        }
    }


    private class zzc extends Thread
    {

        public void run()
        {
            Process.setThreadPriority(10);
            super.run();
        }

        zzc(Runnable runnable, String s)
        {
            super(runnable, s);
        }
    }

}
