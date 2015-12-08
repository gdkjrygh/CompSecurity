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
import com.fitbit.data.domain.WaterIntraday;
import com.fitbit.data.domain.WaterLogDaySummary;
import com.fitbit.data.domain.heartrate.HeartRateIntraday;
import com.fitbit.data.domain.heartrate.RestingHeartRate;
import com.fitbit.data.repo.greendao.TimeSeriesObject;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            AbstractEntityMapper

public class TimeSeriesMapper extends AbstractEntityMapper
{

    public TimeSeriesMapper()
    {
    }

    private com.fitbit.data.domain.TimeSeriesObject createTimeSeriesObjectForDbEntity(TimeSeriesObject timeseriesobject)
    {
        timeseriesobject = (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType)w.a(timeseriesobject.getObjectType().intValue(), com/fitbit/data/domain/TimeSeriesObject$TimeSeriesResourceType);
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
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_IN.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP_INTRADAY.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.RESTING_HEART_RATE.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$TimeSeriesObject$TimeSeriesResourceType[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER_INTRADAY.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[timeseriesobject.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown resource type = ").append(timeseriesobject).toString());

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

        case 20: // '\024'
            return new WaterIntraday();
        }
    }

    public com.fitbit.data.domain.TimeSeriesObject fromDbEntity(TimeSeriesObject timeseriesobject)
    {
        if (timeseriesobject == null)
        {
            return null;
        } else
        {
            com.fitbit.data.domain.TimeSeriesObject timeseriesobject1 = createTimeSeriesObjectForDbEntity(timeseriesobject);
            timeseriesobject1.a(timeseriesobject.getDateTime());
            timeseriesobject1.a(timeseriesobject.getValue().doubleValue());
            timeseriesobject1.setEntityId(timeseriesobject.getId());
            timeseriesobject1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(timeseriesobject.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            timeseriesobject1.a(timeseriesobject.getLevel().intValue());
            timeseriesobject1.a(timeseriesobject.getForeignId().longValue());
            return timeseriesobject1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((TimeSeriesObject)obj);
    }

    public TimeSeriesObject toDbEntity(com.fitbit.data.domain.TimeSeriesObject timeseriesobject)
    {
        return toDbEntity(timeseriesobject, new TimeSeriesObject());
    }

    public TimeSeriesObject toDbEntity(com.fitbit.data.domain.TimeSeriesObject timeseriesobject, TimeSeriesObject timeseriesobject1)
    {
        if (timeseriesobject == null)
        {
            return null;
        }
        TimeSeriesObject timeseriesobject2 = timeseriesobject1;
        if (timeseriesobject1 == null)
        {
            timeseriesobject2 = new TimeSeriesObject();
        }
        timeseriesobject2.setDateTime(timeseriesobject.a());
        timeseriesobject2.setObjectType(Integer.valueOf(timeseriesobject.d().getCode()));
        timeseriesobject2.setValue(Double.valueOf(timeseriesobject.b()));
        timeseriesobject2.setLevel(Integer.valueOf(timeseriesobject.e()));
        if (timeseriesobject.getEntityId() != null)
        {
            timeseriesobject2.setId(timeseriesobject.getEntityId());
        }
        timeseriesobject2.setEntityStatus(Integer.valueOf(timeseriesobject.getEntityStatus().getCode()));
        timeseriesobject2.setForeignId(Long.valueOf(timeseriesobject.f()));
        return timeseriesobject2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((com.fitbit.data.domain.TimeSeriesObject)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((com.fitbit.data.domain.TimeSeriesObject)obj, (TimeSeriesObject)obj1);
    }
}
