// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.common.internal.u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.d:
//            af, x, z, ak, 
//            ai, al, ae, an

public final class ad
{

    private static volatile ad a;
    private final Context b;
    private final List c = new CopyOnWriteArrayList();
    private final x d = new x();
    private final af e = new af(this);
    private volatile al f;
    private Thread.UncaughtExceptionHandler g;

    ad(Context context)
    {
        context = context.getApplicationContext();
        u.a(context);
        b = context;
    }

    public static ad a(Context context)
    {
        u.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/d/ad;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new ad(context);
        }
        com/google/android/gms/d/ad;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/d/ad;
        JVM INSTR monitorexit ;
        throw context;
    }

    static List a(ad ad1)
    {
        return ad1.c;
    }

    static void a(ad ad1, z z1)
    {
        ad1.b(z1);
    }

    static Thread.UncaughtExceptionHandler b(ad ad1)
    {
        return ad1.g;
    }

    private void b(z z1)
    {
        u.c("deliver should be called from worker thread");
        u.b(z1.f(), "Measurement must be submitted");
        Object obj = z1.c();
        if (!((List) (obj)).isEmpty())
        {
            HashSet hashset = new HashSet();
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ak ak1 = (ak)((Iterator) (obj)).next();
                android.net.Uri uri = ak1.a();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    ak1.a(z1);
                }
            }
        }
    }

    public static void d()
    {
        if (!(Thread.currentThread() instanceof ai))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public al a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (f != null) goto _L4; else goto _L3
_L3:
        String s1;
        al al1;
        PackageManager packagemanager;
        al1 = new al();
        packagemanager = b.getPackageManager();
        s1 = b.getPackageName();
        al1.c(s1);
        al1.d(packagemanager.getInstallerPackageName(s1));
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
        al1.a(((String) (obj)));
        al1.b(((String) (obj2)));
        f = al1;
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
        u.a(callable);
        if (Thread.currentThread() instanceof ai)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return e.submit(callable);
        }
    }

    void a(z z1)
    {
        if (z1.j())
        {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (z1.f())
        {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else
        {
            z1 = z1.a();
            z1.g();
            e.execute(new ae(this, z1));
            return;
        }
    }

    public void a(Runnable runnable)
    {
        u.a(runnable);
        e.submit(runnable);
    }

    public void a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        g = uncaughtexceptionhandler;
    }

    public an b()
    {
        DisplayMetrics displaymetrics = b.getResources().getDisplayMetrics();
        an an1 = new an();
        an1.a(r.a(Locale.getDefault()));
        an1.b(displaymetrics.widthPixels);
        an1.c(displaymetrics.heightPixels);
        return an1;
    }

    public Context c()
    {
        return b;
    }
}
