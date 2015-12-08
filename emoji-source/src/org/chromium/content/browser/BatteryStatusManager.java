// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

class BatteryStatusManager
{

    private static final String TAG = "BatteryStatusManager";
    private final Context mAppContext;
    private boolean mEnabled;
    private final IntentFilter mFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private long mNativePtr;
    private final Object mNativePtrLock = new Object();
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() {

        final BatteryStatusManager this$0;

        public void onReceive(Context context1, Intent intent)
        {
            BatteryStatusManager.this.onReceive(intent);
        }

            
            {
                this$0 = BatteryStatusManager.this;
                super();
            }
    };

    protected BatteryStatusManager(Context context)
    {
        mEnabled = false;
        mAppContext = context.getApplicationContext();
    }

    static BatteryStatusManager getInstance(Context context)
    {
        return new BatteryStatusManager(context);
    }

    private native void nativeGotBatteryStatus(long l, boolean flag, double d, double d1, 
            double d2);

    protected void gotBatteryStatus(boolean flag, double d, double d1, double d2)
    {
        synchronized (mNativePtrLock)
        {
            if (mNativePtr != 0L)
            {
                nativeGotBatteryStatus(mNativePtr, flag, d, d1, d2);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean ignoreBatteryPresentState()
    {
        return Build.MODEL.equals("Galaxy Nexus");
    }

    void onReceive(Intent intent)
    {
        double d1;
label0:
        {
            if (!intent.getAction().equals("android.intent.action.BATTERY_CHANGED"))
            {
                Log.e("BatteryStatusManager", "Unexpected intent.");
                return;
            }
            int i;
            boolean flag;
            if (ignoreBatteryPresentState())
            {
                flag = true;
            } else
            {
                flag = intent.getBooleanExtra("present", false);
            }
            i = intent.getIntExtra("plugged", -1);
            if (!flag || i == -1)
            {
                gotBatteryStatus(true, 0.0D, (1.0D / 0.0D), 1.0D);
                return;
            }
            double d;
            int j;
            int k;
            if (i != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (intent.getIntExtra("status", -1) == 5)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j = intent.getIntExtra("level", -1);
            k = intent.getIntExtra("scale", -1);
            d1 = (double)j / (double)k;
            if (d1 >= 0.0D)
            {
                d = d1;
                if (d1 <= 1.0D)
                {
                    break label0;
                }
            }
            d = 1.0D;
        }
        if (flag & i)
        {
            d1 = 0.0D;
        } else
        {
            d1 = (1.0D / 0.0D);
        }
        gotBatteryStatus(flag, d1, (1.0D / 0.0D), d);
    }

    boolean start(long l)
    {
        synchronized (mNativePtrLock)
        {
            if (!mEnabled && mAppContext.registerReceiver(mReceiver, mFilter) != null)
            {
                mNativePtr = l;
                mEnabled = true;
            }
        }
        return mEnabled;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void stop()
    {
        synchronized (mNativePtrLock)
        {
            if (mEnabled)
            {
                mAppContext.unregisterReceiver(mReceiver);
                mNativePtr = 0L;
                mEnabled = false;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
