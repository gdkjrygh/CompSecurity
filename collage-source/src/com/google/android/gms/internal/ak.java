// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class ak
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private Activity a;
    private Context b;
    private final Object c = new Object();

    public ak(Application application, Activity activity)
    {
        application.registerActivityLifecycleCallbacks(this);
        a(activity);
        b = application.getApplicationContext();
    }

    private void a(Activity activity)
    {
        synchronized (c)
        {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads"))
            {
                a = activity;
            }
        }
        return;
        activity;
        obj;
        JVM INSTR monitorexit ;
        throw activity;
    }

    public Activity a()
    {
        return a;
    }

    public Context b()
    {
        return b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
label0:
        {
            synchronized (c)
            {
                if (a != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (a.equals(activity))
        {
            a = null;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        activity;
        obj;
        JVM INSTR monitorexit ;
        throw activity;
    }

    public void onActivityPaused(Activity activity)
    {
        a(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        a(activity);
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
