// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.AwakeningsCount;
import com.fitbit.data.domain.BodyFat;
import com.fitbit.data.domain.BodyWeight;
import com.fitbit.data.domain.CaloriesBurned;
import com.fitbit.data.domain.CaloriesBurnedIntraday;
import com.fitbit.data.domain.Distance;
import com.fitbit.data.domain.DistanceIntraday;
import com.fitbit.data.domain.Floors;
import com.fitbit.data.domain.FloorsIntraday;
import com.fitbit.data.domain.FoodTimeSeries;
import com.fitbit.data.domain.MinutesAsleep;
import com.fitbit.data.domain.MinutesAsleepIntraday;
import com.fitbit.data.domain.MinutesVeryActive;
import com.fitbit.data.domain.MinutesVeryActiveIntraday;
import com.fitbit.data.domain.Steps;
import com.fitbit.data.domain.StepsIntraday;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.WaterLogDaySummary;
import com.fitbit.data.domain.heartrate.HeartRateIntraday;
import com.fitbit.data.domain.heartrate.RestingHeartRate;
import com.fitbit.data.repo.greendao.swap.SwapTimeSeriesObject;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            AbstractEntityMapper

public class SwapTimeSeriesMapper extends AbstractEntityMapper
{

    public SwapTimeSeriesMapper()
    {
    }

    private TimeSeriesObject createTimeSeriesObjectForDbEntity(SwapTimeSeriesObject swaptimeseriesobject)
    {
        swaptimeseriesobject = (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType)w.a(swaptimeseriesobject.getObjectType().intValue(), com/fitbit/data/domain/TimeSeriesObject$TimeSeriesResourceType);
        static class _cls1
        {

            static final int $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[];

            static 
            {
                $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType = new int[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values().length];
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_IN.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP_INTRADAY.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.RESTING_HEART_RATE.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[swaptimeseriesobject.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown resource type = ").append(swaptimeseriesobject).toString());

        case 1: // '\001'
            return new BodyWeight();

        case 2: // '\002'
            return new WaterLogDaySummary();

        case 3: // '\003'
            return new BodyFat();

        case 4: // '\004'
            return new CaloriesBurned();

        case 5: // '\005'
            return new Steps();

        case 6: // '\006'
            return new Floors();

        case 7: // '\007'
            return new FoodTimeSeries();

        case 8: // '\b'
            return new Distance();

        case 9: // '\t'
            return new MinutesVeryActive();

        case 10: // '\n'
            return new MinutesAsleep();

        case 11: // '\013'
            return new MinutesAsleepIntraday();

        case 12: // '\f'
            return new AwakeningsCount();

        case 13: // '\r'
            return new StepsIntraday();

        case 14: // '\016'
            return new CaloriesBurnedIntraday();

        case 15: // '\017'
            return new DistanceIntraday();

        case 16: // '\020'
            return new MinutesVeryActiveIntraday();

        case 17: // '\021'
            return new FloorsIntraday();

        case 18: // '\022'
            return new HeartRateIntraday();

        case 19: // '\023'
            return new RestingHeartRate();
        }
    }

    public TimeSeriesObject fromDbEntity(SwapTimeSeriesObject swaptimeseriesobject)
    {
        if (swaptimeseriesobject == null)
        {
            return null;
        } else
        {
            TimeSeriesObject timeseriesobject = createTimeSeriesObjectForDbEntity(swaptimeseriesobject);
            timeseriesobject.a(swaptimeseriesobject.getDateTime());
            timeseriesobject.a(swaptimeseriesobject.getValue().doubleValue());
            timeseriesobject.setEntityId(swaptimeseriesobject.getId());
            timeseriesobject.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(swaptimeseriesobject.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            timeseriesobject.a(swaptimeseriesobject.getLevel().intValue());
            timeseriesobject.a(swaptimeseriesobject.getForeignId().longValue());
            return timeseriesobject;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((SwapTimeSeriesObject)obj);
    }

    public SwapTimeSeriesObject toDbEntity(TimeSeriesObject timeseriesobject)
    {
        return toDbEntity(timeseriesobject, new SwapTimeSeriesObject());
    }

    public SwapTimeSeriesObject toDbEntity(TimeSeriesObject timeseriesobject, SwapTimeSeriesObject swaptimeseriesobject)
    {
        if (timeseriesobject == null)
        {
            return null;
        }
        SwapTimeSeriesObject swaptimeseriesobject1 = swaptimeseriesobject;
        if (swaptimeseriesobject == null)
        {
            swaptimeseriesobject1 = new SwapTimeSeriesObject();
        }
        swaptimeseriesobject1.setDateTime(timeseriesobject.a());
        swaptimeseriesobject1.setObjectType(Integer.valueOf(timeseriesobject.d().getCode()));
        swaptimeseriesobject1.setValue(Double.valueOf(timeseriesobject.b()));
        swaptimeseriesobject1.setLevel(Integer.valueOf(timeseriesobject.e()));
        if (timeseriesobject.getEntityId() != null)
        {
            swaptimeseriesobject1.setId(timeseriesobject.getEntityId());
        }
        swaptimeseriesobject1.setEntityStatus(Integer.valueOf(timeseriesobject.getEntityStatus().getCode()));
        swaptimeseriesobject1.setForeignId(Long.valueOf(timeseriesobject.f()));
        return swaptimeseriesobject1;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((TimeSeriesObject)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((TimeSeriesObject)obj, (SwapTimeSeriesObject)obj1);
    }
}
