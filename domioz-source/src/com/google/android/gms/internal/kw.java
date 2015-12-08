// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.gms.internal:
//            kx, ku, kz, ky

public final class kw
{

    private static volatile kw a;
    private final Context b;
    private final List c = new CopyOnWriteArrayList();
    private final ku d = new ku();
    private final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor(new kx((byte)0));
    private volatile kz f;

    private kw(Context context)
    {
        context = context.getApplicationContext();
        ap.a(context);
        b = context;
    }

    public static kw a(Context context)
    {
        ap.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/kw;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new kw(context);
        }
        com/google/android/gms/internal/kw;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/internal/kw;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final kz a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (f != null) goto _L4; else goto _L3
_L3:
        String s1;
        kz kz1;
        PackageManager packagemanager;
        kz1 = new kz();
        packagemanager = b.getPackageManager();
        s1 = b.getPackageName();
        kz1.c(s1);
        kz1.d(packagemanager.getInstallerPackageName(s1));
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
        kz1.a(((String) (obj)));
        kz1.b(((String) (obj2)));
        f = kz1;
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return f;
        Object obj1;
        obj1;
        Log.e("GA", (new StringBuilder("Error retrieving package info: appName set to ")).append(s).toString());
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
        ap.a(callable);
        if (Thread.currentThread() instanceof ky)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return e.submit(callable);
        }
    }

    public final Context b()
    {
        return b;
    }
}
