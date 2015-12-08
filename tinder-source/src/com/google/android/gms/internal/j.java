// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public final class j
    implements android.app.Application.ActivityLifecycleCallbacks
{

    Activity a;
    Context b;
    private final Object c;

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

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityDestroyed(Activity activity)
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

    public final void onActivityPaused(Activity activity)
    {
        a(activity);
    }

    public final void onActivityResumed(Activity activity)
    {
        a(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
        a(activity);
    }

    public final void onActivityStopped(Activity activity)
    {
    }
}
