// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.net.TrafficStats;
import android.os.Process;

public class AndroidTrafficStats
{

    private AndroidTrafficStats()
    {
    }

    private static long getCurrentUidRxBytes()
    {
        long l = TrafficStats.getUidRxBytes(Process.myUid());
        if (l != -1L)
        {
            return l;
        } else
        {
            return 0L;
        }
    }

    private static long getCurrentUidTxBytes()
    {
        long l = TrafficStats.getUidTxBytes(Process.myUid());
        if (l != -1L)
        {
            return l;
        } else
        {
            return 0L;
        }
    }

    private static long getTotalRxBytes()
    {
        long l = TrafficStats.getTotalRxBytes();
        if (l != -1L)
        {
            return l;
        } else
        {
            return 0L;
        }
    }

    private static long getTotalTxBytes()
    {
        long l = TrafficStats.getTotalTxBytes();
        if (l != -1L)
        {
            return l;
        } else
        {
            return 0L;
        }
    }
}
