// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.crashlytics.android.internal:
//            ci, b, cf, cp, 
//            ck, cl, cj, cn, 
//            bz

public final class cm extends ci
{

    private bz a;
    private AtomicReference b;
    private boolean c;
    private File d;
    private Application e;
    private WeakReference f;
    private String g;
    private int h;
    private ConcurrentHashMap i;

    cm()
    {
        b = new AtomicReference();
        h = 4;
        a = new b(cf.a);
        i = new ConcurrentHashMap();
    }

    public static cm a()
    {
        return cp.a();
    }

    private cm a(Activity activity)
    {
        f = new WeakReference(activity);
        return this;
    }

    static cm a(cm cm1, Activity activity)
    {
        return cm1.a(activity);
    }

    public static transient void a(Context context, cl acl[])
    {
        com/crashlytics/android/internal/cm;
        JVM INSTR monitorenter ;
        boolean flag = cp.a().x();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/crashlytics/android/internal/cm;
        JVM INSTR monitorexit ;
        return;
_L2:
        cm cm1;
        int l;
        cm1 = cp.a();
        cm1.e = ck.b(context);
        cm1 = cm1.a(ck.a(context));
        l = acl.length;
        cl cl1;
        for (int k = 0; k >= l; k++)
        {
            break MISSING_BLOCK_LABEL_87;
        }

        cl1 = acl[k];
        if (!cm1.i.containsKey(acl))
        {
            cm1.i.putIfAbsent(cl1.getClass(), cl1);
        }
        break MISSING_BLOCK_LABEL_101;
        cm1.b(context);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final cl a(Class class1)
    {
        return (cl)i.get(class1);
    }

    public final void a(cj cj1)
    {
        b.set(cj1);
    }

    public final cj b()
    {
        cj cj1 = (cj)b.get();
        Object obj = cj1;
        if (cj1 == null)
        {
            ck ck1 = new ck();
            obj = ck1;
            if (!b.compareAndSet(null, ck1))
            {
                obj = (cj)b.get();
            }
        }
        return ((cj) (obj));
    }

    public final Application c()
    {
        return e;
    }

    public final Activity d()
    {
        if (f != null)
        {
            return (Activity)f.get();
        } else
        {
            return null;
        }
    }

    protected final void e()
    {
        Context context = w();
        d = new File(context.getFilesDir(), "com.crashlytics.sdk.android");
        if (!d.exists())
        {
            d.mkdirs();
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            cn.a(new cn(this, (byte)0), e);
        }
        if (c && Log.isLoggable("CrashlyticsInternal", 3))
        {
            StringBuilder stringbuilder = new StringBuilder();
            ci ci1;
            long l;
            for (Iterator iterator1 = i.values().iterator(); iterator1.hasNext(); stringbuilder.append("sdkPerfStart.").append(ci1.getClass().getName()).append('=').append(System.nanoTime() - l).append('\n'))
            {
                ci1 = (ci)iterator1.next();
                l = System.nanoTime();
                ci1.b(context);
            }

            Log.d("CrashlyticsInternal", stringbuilder.toString());
        } else
        {
            Iterator iterator = i.values().iterator();
            while (iterator.hasNext()) 
            {
                ((ci)iterator.next()).b(context);
            }
        }
    }

    public final String f()
    {
        return "1.1.11.10";
    }

    public final boolean g()
    {
        return c;
    }

    public final int h()
    {
        return h;
    }

    public final File i()
    {
        return d;
    }

    public final String j()
    {
        return g;
    }
}
