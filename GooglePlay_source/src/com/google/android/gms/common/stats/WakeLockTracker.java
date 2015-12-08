// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.DeviceStateUtils;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            WakeLockEvent, LoggingConstants

public final class WakeLockTracker
{

    private static String TAG = "WakeLockTracker";
    private static WakeLockTracker sInstance = new WakeLockTracker();
    private static Integer sLogLevel;

    public WakeLockTracker()
    {
    }

    public static WakeLockTracker getInstance()
    {
        return sInstance;
    }

    private static int getLogLevel()
    {
        return 0;
    }

    public static void registerEvent(Context context, String s, int i, String s1, String s2, int j, List list)
    {
        registerEvent(context, s, i, s1, s2, j, list, 0L);
    }

    public static void registerEvent(Context context, String s, int i, String s1, String s2, int j, List list, long l)
    {
        if (sLogLevel == null)
        {
            sLogLevel = Integer.valueOf(getLogLevel());
        }
        boolean flag;
        if (sLogLevel.intValue() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (TextUtils.isEmpty(s))
            {
                Log.e(TAG, (new StringBuilder("missing wakeLock key. ")).append(s).toString());
                return;
            }
            l = System.currentTimeMillis();
            if (7 == i || 8 == i || 10 == i || 11 == i)
            {
                s = new WakeLockEvent(l, i, s1, j, list, s, SystemClock.elapsedRealtime(), DeviceStateUtils.getDeviceState(context), s2, context.getPackageName(), DeviceStateUtils.getPowerPercentage(context), 0L);
                try
                {
                    context.startService((new Intent()).setComponent(LoggingConstants.STATS_SERVICE_COMPONENT_NAME).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", s));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.wtf(TAG, context);
                }
                return;
            }
        }
    }

}
