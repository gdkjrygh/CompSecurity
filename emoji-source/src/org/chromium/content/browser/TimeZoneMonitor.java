// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

class TimeZoneMonitor
{

    private static final String TAG = "TimeZoneMonitor";
    private final Context mAppContext;
    private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {

        final TimeZoneMonitor this$0;

        public void onReceive(Context context1, Intent intent)
        {
            if (!intent.getAction().equals("android.intent.action.TIMEZONE_CHANGED"))
            {
                Log.e("TimeZoneMonitor", "unexpected intent");
                return;
            } else
            {
                nativeTimeZoneChangedFromJava(mNativePtr);
                return;
            }
        }

            
            {
                this$0 = TimeZoneMonitor.this;
                super();
            }
    };
    private final IntentFilter mFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
    private long mNativePtr;

    private TimeZoneMonitor(Context context, long l)
    {
        mAppContext = context.getApplicationContext();
        mNativePtr = l;
        mAppContext.registerReceiver(mBroadcastReceiver, mFilter);
    }

    static TimeZoneMonitor getInstance(Context context, long l)
    {
        return new TimeZoneMonitor(context, l);
    }

    private native void nativeTimeZoneChangedFromJava(long l);

    void stop()
    {
        mAppContext.unregisterReceiver(mBroadcastReceiver);
        mNativePtr = 0L;
    }


}
