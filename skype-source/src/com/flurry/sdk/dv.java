// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            dt, do, du

public class dv
{

    private static dv b;
    private final dt a = new dt();

    private dv()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            ((Application)com.flurry.sdk.do.a().b()).registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() {

                final dv a;

                protected void a(Activity activity, du.a a1)
                {
                    for (Iterator iterator = dv.a(a).iterator(); iterator.hasNext(); ((du)iterator.next()).a(activity, a1)) { }
                }

                public void onActivityCreated(Activity activity, Bundle bundle)
                {
                    a(activity, du.a.a);
                }

                public void onActivityDestroyed(Activity activity)
                {
                    a(activity, du.a.b);
                }

                public void onActivityPaused(Activity activity)
                {
                    a(activity, du.a.c);
                }

                public void onActivityResumed(Activity activity)
                {
                    a(activity, du.a.d);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
                {
                    a(activity, du.a.g);
                }

                public void onActivityStarted(Activity activity)
                {
                    a(activity, du.a.e);
                }

                public void onActivityStopped(Activity activity)
                {
                    a(activity, du.a.f);
                }

            
            {
                a = dv.this;
                super();
            }
            });
        }
    }

    public static dv a()
    {
        com/flurry/sdk/dv;
        JVM INSTR monitorenter ;
        dv dv1;
        if (b == null)
        {
            b = new dv();
        }
        dv1 = b;
        com/flurry/sdk/dv;
        JVM INSTR monitorexit ;
        return dv1;
        Exception exception;
        exception;
        throw exception;
    }

    static List a(dv dv1)
    {
        return dv1.c();
    }

    private List c()
    {
        this;
        JVM INSTR monitorenter ;
        List list = a.a();
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(du du)
    {
        this;
        JVM INSTR monitorenter ;
        a.a(du);
        this;
        JVM INSTR monitorexit ;
        return;
        du;
        throw du;
    }

    public boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }
}
