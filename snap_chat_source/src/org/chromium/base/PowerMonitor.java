// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.Looper;

public class PowerMonitor
    implements ApplicationStatus.b
{

    private static final Runnable b = new Runnable() {

        public final void run()
        {
            PowerMonitor.b();
        }

    };
    private final Handler a = new Handler(Looper.getMainLooper());

    private PowerMonitor()
    {
    }

    public static void a()
    {
    }

    static void b()
    {
        nativeOnMainActivitySuspended();
    }

    private static boolean isBatteryPower()
    {
        return false;
    }

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnMainActivityResumed();

    private static native void nativeOnMainActivitySuspended();

    public final void a(int i)
    {
        if (i == 1)
        {
            a.removeCallbacks(b);
            nativeOnMainActivityResumed();
        } else
        if (i == 2)
        {
            a.postDelayed(b, 60000L);
            return;
        }
    }

}
