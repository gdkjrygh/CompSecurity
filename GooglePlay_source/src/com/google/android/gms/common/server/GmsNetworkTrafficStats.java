// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.TrafficStats;
import android.os.PowerManager;
import android.support.v4.net.TrafficStatsCompat;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.util.PlatformVersion;

public final class GmsNetworkTrafficStats
{

    private static final IntentFilter FILTER = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static Context sContext = null;

    public static void clearThreadStatsTag()
    {
        if (PlatformVersion.checkVersion(14))
        {
            TrafficStats.clearThreadStatsTag();
            TrafficStats.clearThreadStatsUid();
            return;
        } else
        {
            TrafficStatsCompat.clearThreadStatsTag();
            return;
        }
    }

    public static void setThreadStatsTag(int i)
    {
        boolean flag = true;
        if (sContext == null)
        {
            sContext = GmsApplicationContext.getInstance();
        }
        Intent intent = sContext.getApplicationContext().registerReceiver(null, FILTER);
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
            flag1 = ((PowerManager)sContext.getSystemService("power")).isInteractive();
        } else
        {
            flag1 = ((PowerManager)sContext.getSystemService("power")).isScreenOn();
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
        i = (j << 1 | i) << 28 | 0xe01;
        if (PlatformVersion.checkVersion(14))
        {
            TrafficStats.setThreadStatsTag(i);
            TrafficStats.clearThreadStatsUid();
            return;
        } else
        {
            TrafficStatsCompat.setThreadStatsTag(i);
            return;
        }
    }

}
