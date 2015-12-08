// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wu;
import com.google.android.gms.internal.ww;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.c:
//            h, a, c, l, 
//            k, g

public final class f
{

    private static volatile f a;
    private final Context b;
    private final List c = new CopyOnWriteArrayList();
    private final a d = new a();
    private final h e = new h(this);
    private volatile wu f;
    private Thread.UncaughtExceptionHandler g;

    private f(Context context)
    {
        context = context.getApplicationContext();
        bl.a(context);
        b = context;
    }

    public static f a(Context context)
    {
        bl.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/c/f;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new f(context);
        }
        com/google/android/gms/c/f;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/c/f;
        JVM INSTR monitorexit ;
        throw context;
    }

    static List a(f f1)
    {
        return f1.c;
    }

    static Thread.UncaughtExceptionHandler b(f f1)
    {
        return f1.g;
    }

    static void b(c c1)
    {
        bl.c("deliver should be called from worker thread");
        bl.b(c1.f(), "Measurement must be submitted");
        Object obj = c1.c();
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
                l l1 = (l)((Iterator) (obj)).next();
                android.net.Uri uri = l1.a();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    l1.a(c1);
                }
            } while (true);
        }
    }

    public static void d()
    {
        if (!(Thread.currentThread() instanceof k))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public final wu a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (f != null) goto _L4; else goto _L3
_L3:
        String s1;
        wu wu1;
        PackageManager packagemanager;
        wu1 = new wu();
        packagemanager = b.getPackageManager();
        s1 = b.getPackageName();
        wu1.c(s1);
        wu1.d(packagemanager.getInstallerPackageName(s1));
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
        wu1.a(((String) (obj)));
        wu1.b(((String) (obj2)));
        f = wu1;
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
        bl.a(callable);
        if (Thread.currentThread() instanceof k)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return e.submit(callable);
        }
    }

    final void a(c c1)
    {
        if (c1.i())
        {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (c1.f())
        {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else
        {
            c1 = c1.a();
            c1.g();
            e.execute(new g(this, c1));
            return;
        }
    }

    public final void a(Runnable runnable)
    {
        bl.a(runnable);
        e.submit(runnable);
    }

    public final void a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        g = uncaughtexceptionhandler;
    }

    public final ww b()
    {
        DisplayMetrics displaymetrics = b.getResources().getDisplayMetrics();
        ww ww1 = new ww();
        ww1.a(q.a(Locale.getDefault()));
        ww1.b = displaymetrics.widthPixels;
        ww1.c = displaymetrics.heightPixels;
        return ww1;
    }

    public final Context c()
    {
        return b;
    }
}
