// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Application;

// Referenced classes of package com.flurry.sdk:
//            jo

public class js
{

    private static js a;
    private static final String b = com/flurry/sdk/js.getSimpleName();
    private Object c;

    private js()
    {
        e();
    }

    public static js a()
    {
        com/flurry/sdk/js;
        JVM INSTR monitorenter ;
        js js1;
        if (a == null)
        {
            a = new js();
        }
        js1 = a;
        com/flurry/sdk/js;
        JVM INSTR monitorexit ;
        return js1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/js;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.f();
        }
        a = null;
        com/flurry/sdk/js;
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
            if ((context = jo.a().c()) instanceof Application)
            {
                c = new _cls1();
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
            if ((context = jo.a().c()) instanceof Application)
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


    private class _cls1
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final js a;

        protected void a(Activity activity, jr.a a1)
        {
            jr jr1 = new jr();
            jr1.a = activity;
            jr1.b = a1;
            jr1.b();
        }

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
            kc.a(3, js.d(), (new StringBuilder("onActivityCreated for activity:")).append(activity).toString());
            a(activity, jr.a.a);
        }

        public void onActivityDestroyed(Activity activity)
        {
            kc.a(3, js.d(), (new StringBuilder("onActivityDestroyed for activity:")).append(activity).toString());
            a(activity, jr.a.b);
        }

        public void onActivityPaused(Activity activity)
        {
            kc.a(3, js.d(), (new StringBuilder("onActivityPaused for activity:")).append(activity).toString());
            a(activity, jr.a.c);
        }

        public void onActivityResumed(Activity activity)
        {
            kc.a(3, js.d(), (new StringBuilder("onActivityResumed for activity:")).append(activity).toString());
            a(activity, jr.a.d);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
            kc.a(3, js.d(), (new StringBuilder("onActivitySaveInstanceState for activity:")).append(activity).toString());
            a(activity, jr.a.g);
        }

        public void onActivityStarted(Activity activity)
        {
            kc.a(3, js.d(), (new StringBuilder("onActivityStarted for activity:")).append(activity).toString());
            a(activity, jr.a.e);
        }

        public void onActivityStopped(Activity activity)
        {
            kc.a(3, js.d(), (new StringBuilder("onActivityStopped for activity:")).append(activity).toString());
            a(activity, jr.a.f);
        }

        _cls1()
        {
            a = js.this;
            super();
        }
    }

}
