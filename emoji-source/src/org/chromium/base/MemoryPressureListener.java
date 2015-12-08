// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;

public class MemoryPressureListener
{

    private static final String ACTION_LOW_MEMORY = "org.chromium.base.ACTION_LOW_MEMORY";
    private static final String ACTION_TRIM_MEMORY = "org.chromium.base.ACTION_TRIM_MEMORY";
    private static final String ACTION_TRIM_MEMORY_MODERATE = "org.chromium.base.ACTION_TRIM_MEMORY_MODERATE";
    private static final String ACTION_TRIM_MEMORY_RUNNING_CRITICAL = "org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL";

    public MemoryPressureListener()
    {
    }

    public static boolean handleDebugIntent(Activity activity, String s)
    {
        if ("org.chromium.base.ACTION_LOW_MEMORY".equals(s))
        {
            simulateLowMemoryPressureSignal(activity);
        } else
        if ("org.chromium.base.ACTION_TRIM_MEMORY".equals(s))
        {
            simulateTrimMemoryPressureSignal(activity, 80);
        } else
        if ("org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL".equals(s))
        {
            simulateTrimMemoryPressureSignal(activity, 60);
        } else
        if ("org.chromium.base.ACTION_TRIM_MEMORY_MODERATE".equals(s))
        {
            simulateTrimMemoryPressureSignal(activity, 15);
        } else
        {
            return false;
        }
        return true;
    }

    public static void maybeNotifyMemoryPresure(int i)
    {
        if (i >= 80)
        {
            nativeOnMemoryPressure(2);
        } else
        if (i >= 40 || i == 15)
        {
            nativeOnMemoryPressure(0);
            return;
        }
    }

    private static native void nativeOnMemoryPressure(int i);

    private static void registerSystemCallback(Context context)
    {
        context.registerComponentCallbacks(new ComponentCallbacks2() {

            public void onConfigurationChanged(Configuration configuration)
            {
            }

            public void onLowMemory()
            {
                MemoryPressureListener.nativeOnMemoryPressure(2);
            }

            public void onTrimMemory(int i)
            {
                MemoryPressureListener.maybeNotifyMemoryPresure(i);
            }

        });
    }

    private static void simulateLowMemoryPressureSignal(Activity activity)
    {
        activity.getApplication().onLowMemory();
        activity.onLowMemory();
    }

    private static void simulateTrimMemoryPressureSignal(Activity activity, int i)
    {
        activity.getApplication().onTrimMemory(i);
        activity.onTrimMemory(i);
    }

}
