// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.concurrent.TimeUnit;

public class PickupOffset
{

    private int offsetMinutes;

    public PickupOffset(int i)
    {
        offsetMinutes = i;
    }

    public static PickupOffset empty()
    {
        return NullPickupOffset.instance;
    }

    public int getOffsetMinutes()
    {
        return offsetMinutes;
    }

    public long getPickupTime()
    {
        return System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(offsetMinutes);
    }

    private class NullPickupOffset extends PickupOffset
    {

        private static PickupOffset instance = new NullPickupOffset();



        private NullPickupOffset()
        {
            super(0);
        }
    }

}
