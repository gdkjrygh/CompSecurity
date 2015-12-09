// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.common.internal.zzv;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzkf, zzkg, zzkm, zzkp, 
//            zzkr, zzkj, zzkl

public final class zzkk
{
    private class a extends ThreadPoolExecutor
    {

        final zzkk a;

        protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
        {
            return new FutureTask(this, runnable, obj) {

                final a a;

                protected void setException(Throwable throwable)
                {
                    Thread.UncaughtExceptionHandler uncaughtexceptionhandler = zzkk.zzb(a.a);
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
                a = a1;
                super(runnable, obj);
            }
            };
        }

        public a()
        {
            a = zzkk.this;
            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            setThreadFactory(new b());
        }
    }

    private static class b
        implements ThreadFactory
    {

        private static final AtomicInteger a = new AtomicInteger();

        public Thread newThread(Runnable runnable)
        {
            return new c(runnable, (new StringBuilder()).append("measurement-").append(a.incrementAndGet()).toString());
        }


        private b()
        {
        }

    }

    private static class c extends Thread
    {

        public void run()
        {
            Process.setThreadPriority(10);
            super.run();
        }

        c(Runnable runnable, String s)
        {
            super(runnable, s);
        }
    }


    private static volatile zzkk zzawk;
    private final Context mContext;
    private volatile zzkp zzGq;
    private final List zzawl = new CopyOnWriteArrayList();
    private final zzkf zzawm = new zzkf();
    private final a zzawn = new a();
    private Thread.UncaughtExceptionHandler zzawo;

    zzkk(Context context)
    {
        context = context.getApplicationContext();
        zzv.zzr(context);
        mContext = context;
    }

    static List zza(zzkk zzkk1)
    {
        return zzkk1.zzawl;
    }

    static void zza(zzkk zzkk1, zzkg zzkg1)
    {
        zzkk1.zzb(zzkg1);
    }

    public static zzkk zzak(Context context)
    {
        zzv.zzr(context);
        if (zzawk != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzkk;
        JVM INSTR monitorenter ;
        if (zzawk == null)
        {
            zzawk = new zzkk(context);
        }
        com/google/android/gms/internal/zzkk;
        JVM INSTR monitorexit ;
_L2:
        return zzawk;
        context;
        com/google/android/gms/internal/zzkk;
        JVM INSTR monitorexit ;
        throw context;
    }

    static Thread.UncaughtExceptionHandler zzb(zzkk zzkk1)
    {
        return zzkk1.zzawo;
    }

    private void zzb(zzkg zzkg1)
    {
        zzv.zzbJ("deliver should be called from worker thread");
        zzv.zzb(zzkg1.zzue(), "Measurement must be submitted");
        Object obj = zzkg1.zzub();
        if (!((List) (obj)).isEmpty())
        {
            HashSet hashset = new HashSet();
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zzkm zzkm1 = (zzkm)((Iterator) (obj)).next();
                android.net.Uri uri = zzkm1.zzfR();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    zzkm1.zzb(zzkg1);
                }
            }
        }
    }

    public static void zzgF()
    {
        if (!(Thread.currentThread() instanceof c))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public Context getContext()
    {
        return mContext;
    }

    public void zza(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        zzawo = uncaughtexceptionhandler;
    }

    public Future zzb(Callable callable)
    {
        zzv.zzr(callable);
        if (Thread.currentThread() instanceof c)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return zzawn.submit(callable);
        }
    }

    void zze(zzkg zzkg1)
    {
        if (zzkg1.zzui())
        {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (zzkg1.zzue())
        {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else
        {
            zzkg1 = zzkg1.zztZ();
            zzkg1.zzuf();
            zzawn.execute(new Runnable(zzkg1) {

                final zzkg a;
                final zzkk b;

                public void run()
                {
                    a.zzug().zza(a);
                    for (Iterator iterator = zzkk.zza(b).iterator(); iterator.hasNext(); ((zzkl)iterator.next()).zza(a)) { }
                    zzkk.zza(b, a);
                }

            
            {
                b = zzkk.this;
                a = zzkg1;
                super();
            }
            });
            return;
        }
    }

    public void zze(Runnable runnable)
    {
        zzv.zzr(runnable);
        zzawn.submit(runnable);
    }

    public zzkp zzum()
    {
        if (zzGq != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (zzGq != null) goto _L4; else goto _L3
_L3:
        String s1;
        zzkp zzkp1;
        PackageManager packagemanager;
        zzkp1 = new zzkp();
        packagemanager = mContext.getPackageManager();
        s1 = mContext.getPackageName();
        zzkp1.setAppId(s1);
        zzkp1.setAppInstallerId(packagemanager.getInstallerPackageName(s1));
        String s;
        Object obj3;
        obj3 = null;
        s = s1;
        PackageInfo packageinfo = packagemanager.getPackageInfo(mContext.getPackageName(), 0);
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
        zzkp1.setAppName(((String) (obj)));
        zzkp1.setAppVersion(((String) (obj2)));
        zzGq = zzkp1;
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return zzGq;
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

    public zzkr zzun()
    {
        DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
        zzkr zzkr1 = new zzkr();
        zzkr1.setLanguage(zzal.zza(Locale.getDefault()));
        zzkr1.zzgE(displaymetrics.widthPixels);
        zzkr1.zzgF(displaymetrics.heightPixels);
        return zzkr1;
    }
}
