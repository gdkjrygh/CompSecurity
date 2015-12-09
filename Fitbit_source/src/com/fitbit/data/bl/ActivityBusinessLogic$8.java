// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.CaloriesBurned;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.CaloriesEatenGoal;
import com.fitbit.data.domain.DistanceGoal;
import com.fitbit.data.domain.FloorsGoal;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.savedstate.l;
import com.fitbit.util.o;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            ActivityBusinessLogic, t, fs

class b
    implements Runnable
{

    final ActivityLogEntry a;
    final ActivityLogEntry b;
    final ActivityBusinessLogic c;

    public void run()
    {
        Object obj;
        t t1 = t.a();
        LiveDataPacket livedatapacket = l.h();
        if (livedatapacket == null)
        {
            livedatapacket = new LiveDataPacket();
            livedatapacket.a(t1.e(a.getLogDate()).c().intValue());
            livedatapacket.a(t1.f(a.getLogDate()).c().intValue());
        }
        obj = t1.a(a.getLogDate());
        if (obj != null)
        {
            int j = c.b(a);
            CaloriesBurned caloriesburned = (CaloriesBurned)fs.a().a(com.fitbit.data.domain.iesResourceType.CALORIES, o.e(a.getLogDate()));
            if (a.getEntityStatus() == com.fitbit.data.domain.ING_DELETE)
            {
                if (caloriesburned != null)
                {
                    caloriesburned.a(Double.valueOf(caloriesburned.c().doubleValue() - (double)j));
                }
                ((CaloriesBurnedGoal) (obj)).a(Double.valueOf(((CaloriesBurnedGoal) (obj)).q().doubleValue() - (double)j));
            } else
            if (a.getEntityStatus() == com.fitbit.data.domain.ING_OPERATION)
            {
                int i;
                if (b == null)
                {
                    i = 0;
                } else
                {
                    i = c.b(b);
                }
                if (caloriesburned != null)
                {
                    caloriesburned.a(Double.valueOf(caloriesburned.c().doubleValue() - (double)i));
                    caloriesburned.a(Double.valueOf(caloriesburned.c().doubleValue() + (double)j));
                }
                ((CaloriesBurnedGoal) (obj)).a(Double.valueOf(((CaloriesBurnedGoal) (obj)).q().doubleValue() - (double)i));
                ((CaloriesBurnedGoal) (obj)).a(Double.valueOf(((CaloriesBurnedGoal) (obj)).q().doubleValue() + (double)j));
            } else
            {
                throw new IllegalArgumentException("Unsupported entity status for goal update");
            }
            ((CaloriesBurnedGoal) (obj)).setTimeUpdated(new Date());
            livedatapacket.b(((CaloriesBurnedGoal) (obj)).c().intValue());
            t1.a(((com.fitbit.data.domain.Goal) (obj)));
            if (caloriesburned != null)
            {
                fs.a().a(caloriesburned);
            }
        }
        obj = t1.b(a.getLogDate());
        if (obj != null)
        {
            if (a.getEntityStatus() == com.fitbit.data.domain.ING_DELETE)
            {
                ((CaloriesEatenGoal) (obj)).b(Double.valueOf(Math.max(0.0D, ValueGoal.a(((ValueGoal) (obj))) - (double)a.i())));
            } else
            if (a.getEntityStatus() == com.fitbit.data.domain.ING_OPERATION)
            {
                if (b != null)
                {
                    ((CaloriesEatenGoal) (obj)).b(Double.valueOf(ValueGoal.a(((ValueGoal) (obj))) - (double)b.i()));
                }
                ((CaloriesEatenGoal) (obj)).b(Double.valueOf(Math.max(0.0D, ValueGoal.a(((ValueGoal) (obj))) + (double)a.i())));
            } else
            {
                throw new IllegalArgumentException("Unsupported entity status for goal update");
            }
            ((CaloriesEatenGoal) (obj)).setTimeUpdated(new Date());
            t1.a(((com.fitbit.data.domain.Goal) (obj)));
        }
        obj = t1.c(a.getLogDate());
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (a.getEntityStatus() != com.fitbit.data.domain.ING_DELETE) goto _L4; else goto _L3
_L3:
        if (a.b() != null)
        {
            ((DistanceGoal) (obj)).a(Double.valueOf(Math.max(0.0D, ((DistanceGoal) (obj)).q().doubleValue() - a.b().a(com.fitbit.data.domain.ING_DELETE).b())));
        }
_L6:
        ((DistanceGoal) (obj)).setTimeUpdated(new Date());
        livedatapacket.b(((DistanceGoal) (obj)).c().doubleValue() * 1000000D);
        t1.a(((com.fitbit.data.domain.Goal) (obj)));
_L2:
        l.a(livedatapacket);
        return;
_L4:
        if (a.getEntityStatus() != com.fitbit.data.domain.ING_OPERATION)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b != null && b.b() != null)
        {
            ((DistanceGoal) (obj)).a(Double.valueOf(((DistanceGoal) (obj)).q().doubleValue() - b.b().a(com.fitbit.data.domain.ING_OPERATION).b()));
        }
        if (a.b() != null)
        {
            ((DistanceGoal) (obj)).a(Double.valueOf(Math.max(0.0D, ((DistanceGoal) (obj)).q().doubleValue() + a.b().a(com.fitbit.data.domain.ING_OPERATION).b())));
        }
        if (true) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException("Unsupported entity status for goal update");
    }

    eSeriesResourceType(ActivityBusinessLogic activitybusinesslogic, ActivityLogEntry activitylogentry, ActivityLogEntry activitylogentry1)
    {
        c = activitybusinesslogic;
        a = activitylogentry;
        b = activitylogentry1;
        super();
    }
}
