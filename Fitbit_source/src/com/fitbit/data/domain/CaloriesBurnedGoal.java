// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.an;
import java.util.Date;

// Referenced classes of package com.fitbit.data.domain:
//            ValueGoal

public class CaloriesBurnedGoal extends ValueGoal
{

    private Double cachedResult;

    public CaloriesBurnedGoal()
    {
        cachedResult = null;
    }

    public TimeSeriesObject.TimeSeriesResourceType a()
    {
        return TimeSeriesObject.TimeSeriesResourceType.CALORIES;
    }

    public void a(Double double1)
    {
        cachedResult = null;
        super.a(double1);
    }

    public volatile void a(Object obj)
    {
        a((Double)obj);
    }

    public Goal.GoalType b()
    {
        return Goal.GoalType.CALORIES_BURNED_GOAL;
    }

    public Double c()
    {
        if (cachedResult == null)
        {
            Date date1 = m();
            Date date = date1;
            if (date1 == null)
            {
                a(new Date());
                date = m();
            }
            Date date2 = getTimeUpdated();
            date1 = date2;
            if (date2 == null)
            {
                setTimeUpdated(new Date());
                date1 = getTimeUpdated();
            }
            date2 = date;
            if (date != null)
            {
                date2 = date;
                if (date.before(date1))
                {
                    date2 = date1;
                }
            }
            date1 = new Date();
            date = date1;
            if (n() != null)
            {
                date = date1;
                if (date1.after(n()))
                {
                    date = n();
                }
            }
            if (date2.after(date))
            {
                cachedResult = super.c();
            } else
            {
                Double double1 = super.c();
                if (double1 != null)
                {
                    cachedResult = double1;
                } else
                {
                    cachedResult = Double.valueOf((double)ActivityBusinessLogic.a().a(an.a().b(), date2, date) + 0.0D);
                }
            }
        }
        return cachedResult;
    }

    public Object d()
    {
        return c();
    }
}
