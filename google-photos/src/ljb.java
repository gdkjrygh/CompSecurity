// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class ljb
{

    private static volatile ljb d;
    public final Context a;
    public final ljd b = new ljd(this);
    public Thread.UncaughtExceptionHandler c;
    private final List e = new CopyOnWriteArrayList();
    private volatile ljk f;

    private ljb(Context context)
    {
        context = context.getApplicationContext();
        b.d(context);
        a = context;
        new liw();
    }

    static List a(ljb ljb1)
    {
        return ljb1.e;
    }

    public static ljb a(Context context)
    {
        b.d(context);
        if (d != null) goto _L2; else goto _L1
_L1:
        ljb;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new ljb(context);
        }
        ljb;
        JVM INSTR monitorexit ;
_L2:
        return d;
        context;
        ljb;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(ljb ljb1, liy liy1)
    {
        b.q("deliver should be called from worker thread");
        b.b(liy1.c, "Measurement must be submitted");
        Object obj = liy1.i;
        if (!((List) (obj)).isEmpty())
        {
            ljb1 = new HashSet();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ljh ljh1 = (ljh)((Iterator) (obj)).next();
                android.net.Uri uri = ljh1.a();
                if (!ljb1.contains(uri))
                {
                    ljb1.add(uri);
                    ljh1.a(liy1);
                }
            } while (true);
        }
    }

    static Thread.UncaughtExceptionHandler b(ljb ljb1)
    {
        return ljb1.c;
    }

    public static void b()
    {
        if (!(Thread.currentThread() instanceof ljg))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public final Future a(Callable callable)
    {
        b.d(callable);
        if (Thread.currentThread() instanceof ljg)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return b.submit(callable);
        }
    }

    public final ljk a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (f != null) goto _L4; else goto _L3
_L3:
        String s1;
        ljk ljk1;
        PackageManager packagemanager;
        ljk1 = new ljk();
        packagemanager = a.getPackageManager();
        s1 = a.getPackageName();
        ljk1.c = s1;
        ljk1.d = packagemanager.getInstallerPackageName(s1);
        String s;
        Object obj3;
        obj3 = null;
        s = s1;
        PackageInfo packageinfo = packagemanager.getPackageInfo(a.getPackageName(), 0);
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
        ljk1.a = ((String) (obj));
        ljk1.b = ((String) (obj2));
        f = ljk1;
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

    public final void a(Runnable runnable)
    {
        b.d(runnable);
        b.submit(runnable);
    }
}
