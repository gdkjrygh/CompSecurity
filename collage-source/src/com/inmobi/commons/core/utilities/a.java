// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.commons.core.utilities;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.inmobi.commons.core.utilities:
//            Logger

public class a
{

    private static final String a = com/inmobi/commons/core/utilities/a.getSimpleName();
    private static List b = new ArrayList();
    private static boolean c = false;
    private static HandlerThread d = null;
    private static Application e;
    private static final Object f = new Object();
    private static volatile a g;

    private a()
    {
        e = (Application)com.inmobi.commons.a.a.b();
    }

    public static a a()
    {
        Object obj;
        obj = g;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        Object obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        a a1 = g;
        obj = a1;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = new a();
        g = ((a) (obj));
        obj1;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        return ((a) (obj));
    }

    static void a(boolean flag)
    {
        b(flag);
    }

    public static void b()
    {
        c = true;
    }

    private static void b(boolean flag)
    {
        (new Handler(com.inmobi.commons.a.a.b().getMainLooper())).post(new _cls2(flag));
    }

    public static void c()
    {
        c = false;
    }

    static HandlerThread d()
    {
        return d;
    }

    static List e()
    {
        return b;
    }

    static boolean f()
    {
        return c;
    }

    static String g()
    {
        return a;
    }

    private void h()
    {
        Class class1;
        Object obj1;
        d = new HandlerThread("ApplicationFocusChangeObserverHandler");
        d.start();
        Class aclass[] = android/app/Application.getDeclaredClasses();
        class1 = null;
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            Class class2 = aclass[i];
            if (class2.getSimpleName().equalsIgnoreCase("ActivityLifecycleCallbacks"))
            {
                class1 = class2;
            }
        }

        obj1 = class1.getClassLoader();
        _cls1 _lcls1 = new _cls1();
        obj1 = Proxy.newProxyInstance(((ClassLoader) (obj1)), new Class[] {
            class1
        }, _lcls1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        android/app/Application.getMethod("registerActivityLifecycleCallbacks", new Class[] {
            class1
        }).invoke(e, new Object[] {
            obj1
        });
        return;
        Object obj;
        obj;
        Logger.a(Logger.InternalLogLevel.INTERNAL, a, "Error while registering activity life cycle listener.", ((Throwable) (obj)));
        return;
        obj;
        Logger.a(Logger.InternalLogLevel.INTERNAL, a, "Error while registering activity life cycle listener.", ((Throwable) (obj)));
        return;
        obj;
        Logger.a(Logger.InternalLogLevel.INTERNAL, a, "Error while registering activity life cycle listener.", ((Throwable) (obj)));
        return;
    }

    public void a(b b1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b.add(b1);
            if (b.size() == 1)
            {
                h();
                return;
            }
        }
    }


    // Unreferenced inner class com/inmobi/commons/core/utilities/a$a
    /* block-local class not found */
    class a {}


    // Unreferenced inner class com/inmobi/commons/core/utilities/a$b
    /* block-local class not found */
    class b {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
