// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts;

import com.fitbit.activity.ui.charts.a.a.a;
import com.fitbit.activity.ui.charts.a.a.b;
import com.fitbit.activity.ui.charts.a.a.c;
import com.fitbit.activity.ui.charts.a.a.d;
import com.fitbit.activity.ui.charts.a.a.e;
import com.fitbit.activity.ui.charts.a.a.f;

public final class ActivityType extends Enum
{

    public static final ActivityType a;
    public static final ActivityType b;
    public static final ActivityType c;
    public static final ActivityType d;
    public static final ActivityType e;
    public static final ActivityType f;
    private static final ActivityType g[];
    private final int activityLabelRes;
    private final com.fitbit.data.domain.Goal.GoalType goalType;
    private final com.fitbit.activity.ui.charts.a.b graphMeasurements;
    private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType intradayTimeSeriesResourceType;
    private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeSeriesResourceType;
    private final int unitPluralsResId;

    private ActivityType(String s, int i, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype1, com.fitbit.data.domain.Goal.GoalType goaltype, com.fitbit.activity.ui.charts.a.b b1, int j, 
            int k)
    {
        super(s, i);
        timeSeriesResourceType = timeseriesresourcetype;
        intradayTimeSeriesResourceType = timeseriesresourcetype1;
        goalType = goaltype;
        graphMeasurements = b1;
        activityLabelRes = j;
        unitPluralsResId = k;
    }

    public static ActivityType valueOf(String s)
    {
        return (ActivityType)Enum.valueOf(com/fitbit/activity/ui/charts/ActivityType, s);
    }

    public static ActivityType[] values()
    {
        return (ActivityType[])g.clone();
    }

    public com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType a()
    {
        return timeSeriesResourceType;
    }

    public com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType b()
    {
        return intradayTimeSeriesResourceType;
    }

    public com.fitbit.data.domain.Goal.GoalType c()
    {
        return goalType;
    }

    public com.fitbit.activity.ui.charts.a.b d()
    {
        return graphMeasurements;
    }

    public int e()
    {
        return activityLabelRes;
    }

    public int f()
    {
        return unitPluralsResId;
    }

    static 
    {
        a = new ActivityType("DATA_TYPE_STEPS", 0, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY, com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL, new e(), 0x7f0804ef, 0x7f0b001d);
        b = new ActivityType("DATA_TYPE_CALORIES_BURNED", 1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY, com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL, new b(), 0x7f0800ac, 0x7f0b0003);
        c = new ActivityType("DATA_TYPE_DISTANCE", 2, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY, com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL, new c(), 0x7f080162, 0);
        d = new ActivityType("DATA_TYPE_MINUTES_VERY_ACTIVE", 3, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY, com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL, new a(), 0x7f080032, 0x7f0b0000);
        e = new ActivityType("DATA_TYPE_FLOORS", 4, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY, com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL, new d(), 0x7f0801c7, 0x7f0b000b);
        f = new ActivityType("DATA_TYPE_WATER", 5, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER_INTRADAY, com.fitbit.data.domain.Goal.GoalType.WATER_GOAL, new f(), 0x7f080561, 0);
        g = (new ActivityType[] {
            a, b, c, d, e, f
        });
    }
}
