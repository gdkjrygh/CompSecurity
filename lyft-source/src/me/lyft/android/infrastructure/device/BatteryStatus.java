// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.device;

import java.util.concurrent.TimeUnit;

public class BatteryStatus
{

    private static final long UPDATE_INTERVAL_MILLIS;
    private float batteryLevel;
    private boolean isCharging;
    private long timestamp;

    public BatteryStatus(float f, boolean flag, long l)
    {
        batteryLevel = f;
        isCharging = flag;
        timestamp = l;
    }

    public float getBatteryLevel()
    {
        return batteryLevel;
    }

    public boolean isCharging()
    {
        return isCharging;
    }

    public boolean needsRefresh()
    {
        return System.currentTimeMillis() - timestamp > UPDATE_INTERVAL_MILLIS;
    }

    static 
    {
        UPDATE_INTERVAL_MILLIS = TimeUnit.MINUTES.toMillis(1L);
    }
}
