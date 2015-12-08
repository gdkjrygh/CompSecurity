// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.ActivitySummaryItem;
import com.fitbit.data.domain.a.b;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            t

class 
    implements Runnable
{

    final ActivitySummaryItem a;
    final b b;
    final Date c;
    final t d;

    public void run()
    {
        Double double1;
        Double double2;
        if (a != null)
        {
            double1 = a.b();
        } else
        {
            double1 = null;
        }
        if (b != null)
        {
            double2 = b.b();
        } else
        {
            double2 = null;
        }
        d.a(com.fitbit.data.domain..GoalType.CALORIES_BURNED_GOAL, double1, double2, c);
        if (a != null)
        {
            d.a(com.fitbit.data.domain..GoalType.STEPS_GOAL, a.f(), null, c);
            d.a(com.fitbit.data.domain..GoalType.DISTANCE_GOAL, a.i(), null, c);
            d.a(com.fitbit.data.domain..GoalType.FLOORS_GOAL, a.h(), null, c);
            double1 = a.g();
            Double double3 = a.c();
            double2 = double1;
            if (double3 != null)
            {
                double2 = double1;
                if (double1 == null)
                {
                    double2 = Double.valueOf(0.0D);
                }
                double d1 = double2.doubleValue();
                double2 = Double.valueOf(double3.doubleValue() + d1);
            }
            d.a(com.fitbit.data.domain..GoalType.MINUTES_VERY_ACTIVE_GOAL, double2, null, c);
        }
    }

    a.b(t t1, ActivitySummaryItem activitysummaryitem, b b1, Date date)
    {
        d = t1;
        a = activitysummaryitem;
        b = b1;
        c = date;
        super();
    }
}
