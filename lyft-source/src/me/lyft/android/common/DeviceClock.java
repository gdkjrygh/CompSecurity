// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;


// Referenced classes of package me.lyft.android.common:
//            IDeviceClock, Preconditions

public class DeviceClock
{

    private static IDeviceClock deviceClock = new DefaultClock();

    public DeviceClock()
    {
    }

    public static long getCurrentTimeMs()
    {
        return deviceClock.getCurrentTimeMs();
    }

    public static long getElapsedTimeMs()
    {
        return deviceClock.getElapsedTimeMs();
    }

    public static void setDeviceClock(IDeviceClock ideviceclock)
    {
        Preconditions.checkNotNull(ideviceclock);
        deviceClock = ideviceclock;
    }


    private class DefaultClock
        implements IDeviceClock
    {

        public long getCurrentTimeMs()
        {
            return System.currentTimeMillis();
        }

        public long getElapsedTimeMs()
        {
            return System.currentTimeMillis();
        }

        DefaultClock()
        {
        }
    }

}
