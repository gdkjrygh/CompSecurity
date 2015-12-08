// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;


// Referenced classes of package com.fitbit.data.bl:
//            ao

static class or
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.values().length];
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.BODY_FAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.BODY_WEIGHT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.CALORIES.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.STEPS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.FLOORS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.CALORIES_IN.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.DISTANCE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.MINUTES_FAIRLY_ACTIVE.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.MINUTES_ASLEEP.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.STEPS_INTRADAY.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.RESTING_HEART_RATE.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.CALORIES_INTRADAY.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.MINUTES_FAIRLY_ACTIVE_INTRADAY.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.FLOORS_INTRADAY.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
