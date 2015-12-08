// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import ds;

public class PowerMonitor
    implements ds
{

    private PowerMonitor()
    {
        new Handler(Looper.getMainLooper());
    }

    private static boolean isBatteryPower()
    {
        return false;
    }

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnMainActivityResumed();

    private static native void nativeOnMainActivitySuspended();
}
