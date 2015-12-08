// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import java.util.concurrent.TimeUnit;

public class LocationRequestOptions
{
    public static class Builder
    {

        private float minDistance;
        private long minTime;
        private int priority;

        public LocationRequestOptions create()
        {
            return new LocationRequestOptions(priority, minDistance, minTime);
        }

        public Builder setMinDistance(float f)
        {
            LocationRequestOptions.verifyMinDistance(f);
            minDistance = f;
            return this;
        }

        public Builder setMinTime(long l, TimeUnit timeunit)
        {
            LocationRequestOptions.verifyMinTime(timeunit.toMillis(l));
            minTime = timeunit.toMillis(l);
            return this;
        }

        public Builder setPriority(int i)
        {
            LocationRequestOptions.verifyPriority(i);
            priority = i;
            return this;
        }

        public Builder()
        {
            minTime = LocationRequestOptions.DEFAULT_UPDATE_INTERVAL_MILLISECONDS;
            minDistance = LocationRequestOptions.DEFAULT_UPDATE_INTERVAL_METERS;
            priority = LocationRequestOptions.DEFAULT_REQUEST_PRIORITY;
        }
    }


    public static int DEFAULT_REQUEST_PRIORITY = 0;
    public static float DEFAULT_UPDATE_INTERVAL_METERS = 0F;
    public static long DEFAULT_UPDATE_INTERVAL_MILLISECONDS = 0L;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 2;
    public static final int PRIORITY_HIGH_ACCURACY = 1;
    public static final int PRIORITY_LOW_POWER = 3;
    public static final int PRIORITY_NO_POWER = 4;
    private float minDistance;
    private long minTime;
    private int priority;

    private LocationRequestOptions(int i, float f, long l)
    {
        verifyPriority(i);
        verifyMinDistance(f);
        verifyMinTime(l);
        priority = i;
        minDistance = f;
        minTime = l;
    }

    LocationRequestOptions(int i, float f, long l, _cls1 _pcls1)
    {
        this(i, f, l);
    }

    public static LocationRequestOptions createDefaultOptions()
    {
        return new LocationRequestOptions(DEFAULT_REQUEST_PRIORITY, DEFAULT_UPDATE_INTERVAL_METERS, DEFAULT_UPDATE_INTERVAL_MILLISECONDS);
    }

    private static void verifyMinDistance(float f)
    {
        if (f < 0.0F)
        {
            throw new IllegalArgumentException("minDistance must be greater or equal to 0");
        } else
        {
            return;
        }
    }

    private static void verifyMinTime(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("minTime must be greater or equal to 0");
        } else
        {
            return;
        }
    }

    private static void verifyPriority(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Priority can only be either PRIORITY_HIGH_ACCURACY, PRIORITY_BALANCED_POWER_ACCURACY, PRIORITY_LOW_POWER, or PRIORITY_NO_POWER");

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationRequestOptions)
        {
            if (((LocationRequestOptions) (obj = (LocationRequestOptions)obj)).priority == priority && ((LocationRequestOptions) (obj)).minTime == minTime && ((LocationRequestOptions) (obj)).minDistance == minDistance)
            {
                return true;
            }
        }
        return false;
    }

    public float getMinDistance()
    {
        return minDistance;
    }

    public long getMinTime()
    {
        return minTime;
    }

    public int getPriority()
    {
        return priority;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationRequestOptions: Priority ").append(priority).append(" minTime ").append(minTime).append(" minDistance ").append(minDistance).toString();
    }

    static 
    {
        DEFAULT_UPDATE_INTERVAL_METERS = 800F;
        DEFAULT_UPDATE_INTERVAL_MILLISECONDS = 0x493e0L;
        DEFAULT_REQUEST_PRIORITY = 2;
    }



}
