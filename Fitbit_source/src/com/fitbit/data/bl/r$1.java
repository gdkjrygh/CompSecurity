// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.CaloriesEatenGoal;
import com.fitbit.data.domain.FoodLogEntry;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            r, t

class 
    implements Runnable
{

    final FoodLogEntry a;
    final FoodLogEntry b;
    final r c;

    public void run()
    {
        CaloriesEatenGoal calorieseatengoal = t.a().b(a.getLogDate());
        if (calorieseatengoal != null)
        {
            if (a.getEntityStatus() == com.fitbit.data.domain.ty.EntityStatus.PENDING_DELETE)
            {
                calorieseatengoal.a(Double.valueOf(Math.max(0.0D, calorieseatengoal.q().doubleValue() - a.getCalories())));
            } else
            if (a.getEntityStatus() == com.fitbit.data.domain.ty.EntityStatus.PENDING_OPERATION)
            {
                if (b != null)
                {
                    calorieseatengoal.a(Double.valueOf(calorieseatengoal.q().doubleValue() - b.getCalories()));
                }
                calorieseatengoal.a(Double.valueOf(Math.max(0.0D, calorieseatengoal.q().doubleValue() + a.getCalories())));
            } else
            {
                throw new IllegalArgumentException("Unsupported entity status for goal update");
            }
            calorieseatengoal.setTimeUpdated(new Date());
            t.a().a(calorieseatengoal);
        }
    }

    FoodLogEntry(r r1, FoodLogEntry foodlogentry, FoodLogEntry foodlogentry1)
    {
        c = r1;
        a = foodlogentry;
        b = foodlogentry1;
        super();
    }
}
