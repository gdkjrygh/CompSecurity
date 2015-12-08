// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import akV;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package org.chromium.base:
//            BaseChromiumApplication, ThreadUtils

public class ApplicationStatus
{
    static final class a
    {

        int a;
        akV b;

        private a()
        {
            a = 6;
            b = new akV();
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static interface b
    {

        public abstract void a(int j);
    }


    private static Application a;
    private static Object b = new Object();
    private static Integer c;
    private static Activity d;
    private static b e;
    private static final Map f = new ConcurrentHashMap();
    private static final akV g = new akV();
    private static final akV h = new akV();
    private static boolean i;

    private ApplicationStatus()
    {
    }

    public static int a(Activity activity)
    {
        activity = (a)f.get(activity);
        if (activity != null)
        {
            return ((a) (activity)).a;
        } else
        {
            return 6;
        }
    }

    public static Activity a()
    {
        return d;
    }

    static void a(int j)
    {
        nativeOnApplicationStateChange(j);
    }

    static void a(Activity activity, int j)
    {
        int k;
        if (activity == null)
        {
            throw new IllegalArgumentException("null activity is not supported");
        }
        if (d == null || j == 1 || j == 3 || j == 2)
        {
            d = activity;
        }
        k = c();
        if (j == 1)
        {
            if (!i && f.containsKey(activity))
            {
                throw new AssertionError();
            }
            f.put(activity, new a((byte)0));
        }
        synchronized (b)
        {
            c = null;
        }
        obj = (a)f.get(activity);
        obj.a = j;
        for (obj = ((a) (obj)).b.iterator(); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).next()) { }
        break MISSING_BLOCK_LABEL_154;
        activity;
        obj;
        JVM INSTR monitorexit ;
        throw activity;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); iterator.next()) { }
        int l = c();
        if (l != k)
        {
            for (Iterator iterator1 = h.iterator(); iterator1.hasNext(); ((b)iterator1.next()).a(l)) { }
        }
        if (j == 6)
        {
            f.remove(activity);
            if (activity == d)
            {
                d = null;
            }
        }
        return;
    }

    public static void a(b b1)
    {
        h.a(b1);
    }

    public static void a(BaseChromiumApplication basechromiumapplication)
    {
        a = basechromiumapplication;
        BaseChromiumApplication.a a1 = new BaseChromiumApplication.a() {

            public final void a(Activity activity, boolean flag)
            {
                int j;
                if (flag && activity != ApplicationStatus.d())
                {
                    if ((j = ApplicationStatus.a(activity)) != 6 && j != 5)
                    {
                        ApplicationStatus.b(activity);
                        return;
                    }
                }
            }

        };
        basechromiumapplication.a.a(a1);
        basechromiumapplication.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() {

            public final void onActivityCreated(Activity activity, Bundle bundle)
            {
                ApplicationStatus.a(activity, 1);
            }

            public final void onActivityDestroyed(Activity activity)
            {
                ApplicationStatus.a(activity, 6);
            }

            public final void onActivityPaused(Activity activity)
            {
                ApplicationStatus.a(activity, 4);
            }

            public final void onActivityResumed(Activity activity)
            {
                ApplicationStatus.a(activity, 3);
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
            {
            }

            public final void onActivityStarted(Activity activity)
            {
                ApplicationStatus.a(activity, 2);
            }

            public final void onActivityStopped(Activity activity)
            {
                ApplicationStatus.a(activity, 5);
            }

        });
    }

    static Activity b(Activity activity)
    {
        d = activity;
        return activity;
    }

    public static Context b()
    {
        if (a != null)
        {
            return a.getApplicationContext();
        } else
        {
            return null;
        }
    }

    public static void b(b b1)
    {
        akV akv = h;
        if (b1 != null)
        {
            int j = akv.a.indexOf(b1);
            if (j != -1)
            {
                if (akv.b == 0)
                {
                    akv.a.remove(j);
                } else
                {
                    akv.d = true;
                    akv.a.set(j, null);
                }
                akv.c = akv.c - 1;
                if (!akV.e && akv.c < 0)
                {
                    throw new AssertionError();
                }
            }
        }
    }

    public static int c()
    {
        int j;
        boolean flag1;
        j = 0;
        flag1 = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (c != null) goto _L2; else goto _L1
_L1:
        Iterator iterator = f.values().iterator();
        boolean flag = false;
_L5:
        int k;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        k = ((a)iterator.next()).a;
        if (k == 4 || k == 5 || k == 6) goto _L4; else goto _L3
_L3:
        j = ((flag1) ? 1 : 0);
_L6:
        c = Integer.valueOf(j);
_L2:
        j = c.intValue();
        obj;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        if (k == 4)
        {
            flag = true;
        } else
        if (k == 5)
        {
            j = 1;
        }
          goto _L5
        if (flag)
        {
            j = 2;
        } else
        if (j != 0)
        {
            j = 3;
        } else
        {
            j = 4;
        }
          goto _L6
    }

    static b c(b b1)
    {
        e = b1;
        return b1;
    }

    static Activity d()
    {
        return d;
    }

    static b e()
    {
        return e;
    }

    private static native void nativeOnApplicationStateChange(int j);

    private static void registerThreadSafeNativeApplicationStateListener()
    {
        ThreadUtils.a(new Runnable() {

            public final void run()
            {
                if (ApplicationStatus.e() != null)
                {
                    return;
                } else
                {
                    ApplicationStatus.c(new b() {

                        public final void a(int j)
                        {
                            ApplicationStatus.a(j);
                        }

                    });
                    ApplicationStatus.a(ApplicationStatus.e());
                    return;
                }
            }

        });
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/ApplicationStatus.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
    }
}
