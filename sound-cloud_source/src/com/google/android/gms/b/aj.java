// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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

// Referenced classes of package com.google.android.gms.b:
//            ae, ag, am, an, 
//            al

public final class aj
{
    private final class a extends ThreadPoolExecutor
    {

        final aj a;

        protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
        {
            return new al(this, runnable, obj);
        }

        public a()
        {
            a = aj.this;
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


    private static volatile aj d;
    public final Context a;
    public final a b = new a();
    public Thread.UncaughtExceptionHandler c;
    private final List e = new CopyOnWriteArrayList();
    private final ae f = new ae();
    private volatile an g;

    private aj(Context context)
    {
        context = context.getApplicationContext();
        zzx.zzv(context);
        a = context;
    }

    public static aj a(Context context)
    {
        zzx.zzv(context);
        if (d != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/b/aj;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new aj(context);
        }
        com/google/android/gms/b/aj;
        JVM INSTR monitorexit ;
_L2:
        return d;
        context;
        com/google/android/gms/b/aj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static List a(aj aj1)
    {
        return aj1.e;
    }

    static void a(ag ag1)
    {
        zzx.zzci("deliver should be called from worker thread");
        zzx.zzb(ag1.c, "Measurement must be submitted");
        Object obj = ag1.i;
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
                am am1 = (am)((Iterator) (obj)).next();
                android.net.Uri uri = am1.a();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    am1.a(ag1);
                }
            } while (true);
        }
    }

    static Thread.UncaughtExceptionHandler b(aj aj1)
    {
        return aj1.c;
    }

    public static void b()
    {
        if (!(Thread.currentThread() instanceof c))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public final an a()
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        String s1;
        an an1;
        PackageManager packagemanager;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        an1 = new an();
        packagemanager = a.getPackageManager();
        s1 = a.getPackageName();
        an1.c = s1;
        an1.d = packagemanager.getInstallerPackageName(s1);
        String s;
        Object obj2;
        obj2 = null;
        s = s1;
        PackageInfo packageinfo = packagemanager.getPackageInfo(a.getPackageName(), 0);
        Object obj;
        Object obj1;
        obj1 = obj2;
        obj = s1;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        s = s1;
        obj1 = packagemanager.getApplicationLabel(packageinfo.applicationInfo);
        obj = s1;
        s = s1;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = s1;
        obj = ((CharSequence) (obj1)).toString();
        s = ((String) (obj));
        Exception exception;
        try
        {
            obj1 = packageinfo.versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            obj1 = obj2;
            namenotfoundexception = s;
        }
        an1.a = ((String) (obj));
        an1.b = ((String) (obj1));
        g = an1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return g;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Future a(Callable callable)
    {
        zzx.zzv(callable);
        if (Thread.currentThread() instanceof c)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return b.submit(callable);
        }
    }

    public final void a(Runnable runnable)
    {
        zzx.zzv(runnable);
        b.submit(runnable);
    }
}
