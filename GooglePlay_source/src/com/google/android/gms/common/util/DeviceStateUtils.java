// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.common.util:
//            PlatformVersion

public final class DeviceStateUtils
{

    private static IntentFilter sFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static float sPowerPercentage = (0.0F / 0.0F);
    private static long sTimeStampPowerPercentage;

    public static int getDeviceState(Context context)
    {
        boolean flag = true;
        if (context == null || context.getApplicationContext() == null)
        {
            return -1;
        }
        Intent intent = context.getApplicationContext().registerReceiver(null, sFilter);
        int i;
        int j;
        boolean flag1;
        if (intent == null)
        {
            i = 0;
        } else
        {
            i = intent.getIntExtra("plugged", 0);
        }
        if ((i & 7) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (PlatformVersion.checkVersion(20))
        {
            flag1 = ((PowerManager)context.getSystemService("power")).isInteractive();
        } else
        {
            flag1 = ((PowerManager)context.getSystemService("power")).isScreenOn();
        }
        if (flag1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        return j << 1 | i;
    }

    public static float getPowerPercentage(Context context)
    {
        com/google/android/gms/common/util/DeviceStateUtils;
        JVM INSTR monitorenter ;
        if (SystemClock.elapsedRealtime() - sTimeStampPowerPercentage >= 60000L || sPowerPercentage == (0.0F / 0.0F)) goto _L2; else goto _L1
_L1:
        float f = sPowerPercentage;
_L4:
        com/google/android/gms/common/util/DeviceStateUtils;
        JVM INSTR monitorexit ;
        return f;
_L2:
        context = context.getApplicationContext().registerReceiver(null, sFilter);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        int i = context.getIntExtra("level", -1);
        int j = context.getIntExtra("scale", -1);
        sPowerPercentage = (float)i / (float)j;
        sTimeStampPowerPercentage = SystemClock.elapsedRealtime();
        f = sPowerPercentage;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

}
