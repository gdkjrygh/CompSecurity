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
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.common.internal.y;
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
//            ja, jb, jf, jh, 
//            jj, jd

public final class je
{
    private final class a extends ThreadPoolExecutor
    {

        final je a;

        protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
        {
            return new FutureTask(this, runnable, obj) {

                final a a;

                protected final void setException(Throwable throwable)
                {
                    Thread.UncaughtExceptionHandler uncaughtexceptionhandler = je.b(a.a);
                    if (uncaughtexceptionhandler == null) goto _L2; else goto _L1
_L1:
                    uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), throwable);
_L4:
                    super.setException(throwable);
                    return;
_L2:
                    if (Log.isLoggable("GAv4", 6))
                    {
                        Log.e("GAv4", (new StringBuilder("MeasurementExecutor: job failed with ")).append(throwable).toString());
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
            a = je.this;
            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            setThreadFactory(new b((byte)0));
        }
    }

    private static final class b
        implements ThreadFactory
    {

        private static final AtomicInteger a = new AtomicInteger();

        public final Thread newThread(Runnable runnable)
        {
            return new c(runnable, (new StringBuilder("measurement-")).append(a.incrementAndGet()).toString());
        }


        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    private static final class c extends Thread
    {

        public final void run()
        {
            Process.setThreadPriority(10);
            super.run();
        }

        c(Runnable runnable, String s)
        {
            super(runnable, s);
        }
    }


    private static volatile je a;
    private final Context b;
    private final List c = new CopyOnWriteArrayList();
    private final ja d = new ja();
    private final a e = new a();
    private volatile jh f;
    private Thread.UncaughtExceptionHandler g;

    private je(Context context)
    {
        context = context.getApplicationContext();
        y.a(context);
        b = context;
    }

    public static je a(Context context)
    {
        y.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/je;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new je(context);
        }
        com/google/android/gms/internal/je;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/internal/je;
        JVM INSTR monitorexit ;
        throw context;
    }

    static List a(je je1)
    {
        return je1.c;
    }

    static Thread.UncaughtExceptionHandler b(je je1)
    {
        return je1.g;
    }

    static void b(jb jb1)
    {
        y.c("deliver should be called from worker thread");
        y.b(jb1.f(), "Measurement must be submitted");
        Object obj = jb1.c();
        if (!((List) (obj)).isEmpty())
        {
            HashSet hashset = new HashSet();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                jf jf1 = (jf)((Iterator) (obj)).next();
                android.net.Uri uri = jf1.a();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    jf1.a(jb1);
                }
            } while (true);
        }
    }

    public static void d()
    {
        if (!(Thread.currentThread() instanceof c))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public final jh a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (f != null) goto _L4; else goto _L3
_L3:
        String s1;
        jh jh1;
        PackageManager packagemanager;
        jh1 = new jh();
        packagemanager = b.getPackageManager();
        s1 = b.getPackageName();
        jh1.c(s1);
        jh1.d(packagemanager.getInstallerPackageName(s1));
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
        jh1.a(((String) (obj)));
        jh1.b(((String) (obj2)));
        f = jh1;
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return f;
        Object obj1;
        obj1;
        Log.e("GAv4", (new StringBuilder("Error retrieving package info: appName set to ")).append(s).toString());
        obj2 = obj3;
        obj1 = s;
          goto _L5
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final Future a(Callable callable)
    {
        y.a(callable);
        if (Thread.currentThread() instanceof c)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return e.submit(callable);
        }
    }

    final void a(jb jb1)
    {
        if (jb1.i())
        {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (jb1.f())
        {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else
        {
            jb1 = jb1.a();
            jb1.g();
            e.execute(new Runnable(jb1) {

                final jb a;
                final je b;

                public final void run()
                {
                    a.h().a(a);
                    for (Iterator iterator = je.a(b).iterator(); iterator.hasNext(); iterator.next()) { }
                    je.b(a);
                }

            
            {
                b = je.this;
                a = jb1;
                super();
            }
            });
            return;
        }
    }

    public final void a(Runnable runnable)
    {
        y.a(runnable);
        e.submit(runnable);
    }

    public final void a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        g = uncaughtexceptionhandler;
    }

    public final jj b()
    {
        DisplayMetrics displaymetrics = b.getResources().getDisplayMetrics();
        jj jj1 = new jj();
        jj1.a(m.a(Locale.getDefault()));
        jj1.b = displaymetrics.widthPixels;
        jj1.c = displaymetrics.heightPixels;
        return jj1;
    }

    public final Context c()
    {
        return b;
    }
}
