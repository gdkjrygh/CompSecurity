// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

// Referenced classes of package com.flurry.sdk:
//            fp, fs, gd

public class ft
{

    private static ft a;
    private static final String b = com/flurry/sdk/ft.getSimpleName();
    private Object c;

    private ft()
    {
        e();
    }

    public static ft a()
    {
        com/flurry/sdk/ft;
        JVM INSTR monitorenter ;
        ft ft1;
        if (a == null)
        {
            a = new ft();
        }
        ft1 = a;
        com/flurry/sdk/ft;
        JVM INSTR monitorexit ;
        return ft1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/ft;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.f();
        }
        a = null;
        com/flurry/sdk/ft;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static String d()
    {
        return b;
    }

    private void e()
    {
        android.content.Context context;
        if (android.os.Build.VERSION.SDK_INT >= 14 && c == null)
        {
            if ((context = fp.a().c()) instanceof Application)
            {
                c = new android.app.Application.ActivityLifecycleCallbacks() {

                    final ft a;

                    protected void a(Activity activity, fs.a a1)
                    {
                        fs fs1 = new fs();
                        fs1.a = activity;
                        fs1.b = a1;
                        fs1.b();
                    }

                    public void onActivityCreated(Activity activity, Bundle bundle)
                    {
                        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityCreated for activity:").append(activity).toString());
                        a(activity, fs.a.a);
                    }

                    public void onActivityDestroyed(Activity activity)
                    {
                        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityDestroyed for activity:").append(activity).toString());
                        a(activity, fs.a.b);
                    }

                    public void onActivityPaused(Activity activity)
                    {
                        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityPaused for activity:").append(activity).toString());
                        a(activity, fs.a.c);
                    }

                    public void onActivityResumed(Activity activity)
                    {
                        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityResumed for activity:").append(activity).toString());
                        a(activity, fs.a.d);
                    }

                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
                    {
                        gd.a(3, ft.d(), (new StringBuilder()).append("onActivitySaveInstanceState for activity:").append(activity).toString());
                        a(activity, fs.a.g);
                    }

                    public void onActivityStarted(Activity activity)
                    {
                        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityStarted for activity:").append(activity).toString());
                        a(activity, fs.a.e);
                    }

                    public void onActivityStopped(Activity activity)
                    {
                        gd.a(3, ft.d(), (new StringBuilder()).append("onActivityStopped for activity:").append(activity).toString());
                        a(activity, fs.a.f);
                    }

            
            {
                a = ft.this;
                super();
            }
                };
                ((Application)context).registerActivityLifecycleCallbacks((android.app.Application.ActivityLifecycleCallbacks)c);
                return;
            }
        }
    }

    private void f()
    {
        android.content.Context context;
        if (android.os.Build.VERSION.SDK_INT >= 14 && c != null)
        {
            if ((context = fp.a().c()) instanceof Application)
            {
                ((Application)context).unregisterActivityLifecycleCallbacks((android.app.Application.ActivityLifecycleCallbacks)c);
                c = null;
                return;
            }
        }
    }

    public boolean c()
    {
        return c != null;
    }

}
