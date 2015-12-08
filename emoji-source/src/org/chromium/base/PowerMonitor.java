// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package org.chromium.base:
//            ApplicationStatus

public class PowerMonitor
    implements ApplicationStatus.ApplicationStateListener
{
    private static class LazyHolder
    {

        private static final PowerMonitor INSTANCE = new PowerMonitor();



        private LazyHolder()
        {
        }
    }


    private static final long SUSPEND_DELAY_MS = 60000L;
    private static PowerMonitor sInstance;
    private static final Runnable sSuspendTask = new Runnable() {

        public void run()
        {
            PowerMonitor.nativeOnMainActivitySuspended();
        }

    };
    private final Handler mHandler;
    private boolean mIsBatteryPower;

    private PowerMonitor()
    {
        mHandler = new Handler(Looper.getMainLooper());
    }


    public static void create(Context context)
    {
        context = context.getApplicationContext();
        if (sInstance == null)
        {
            sInstance = LazyHolder.INSTANCE;
            ApplicationStatus.registerApplicationStateListener(sInstance);
            onBatteryChargingChanged(context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        }
    }

    public static void createForTests(Context context)
    {
        sInstance = LazyHolder.INSTANCE;
    }

    private static boolean isBatteryPower()
    {
        return sInstance.mIsBatteryPower;
    }

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnMainActivityResumed();

    private static native void nativeOnMainActivitySuspended();

    public static void onBatteryChargingChanged(Intent intent)
    {
        boolean flag = true;
        if (sInstance == null)
        {
            return;
        }
        int i = intent.getIntExtra("plugged", -1);
        intent = sInstance;
        if (i == 2 || i == 1)
        {
            flag = false;
        }
        intent.mIsBatteryPower = flag;
        nativeOnBatteryChargingChanged();
    }

    public void onApplicationStateChange(int i)
    {
        if (i == 1)
        {
            mHandler.removeCallbacks(sSuspendTask);
            nativeOnMainActivityResumed();
        } else
        if (i == 2)
        {
            mHandler.postDelayed(sSuspendTask, 60000L);
            return;
        }
    }


}
