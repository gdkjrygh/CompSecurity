// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.j;
import com.fitbit.data.repo.greendao.Goal;
import com.fitbit.e.a;
import com.fitbit.e.b;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class GoalMapper
    implements EntityMapper
{

    private static final String TAG = "GoalMapper";

    public GoalMapper()
    {
    }

    private double unboxDouble(Double double1, double d)
    {
        if (double1 == null)
        {
            a.a("GoalMapper", "Trying to unbox null Double. Applying default value: [%s]", new Object[] {
                Double.valueOf(d)
            });
            b.a(7, "From here", new Object[0]);
            return d;
        } else
        {
            return double1.doubleValue();
        }
    }

    public com.fitbit.data.domain.Goal fromDbEntity(Goal goal)
    {
        if (goal == null)
        {
            return null;
        }
        Object obj = com.fitbit.data.domain.Goal.GoalType.valueOf(goal.getGoalType());
        com.fitbit.data.domain.Goal goal1 = j.a(((com.fitbit.data.domain.Goal.GoalType) (obj)));
        if (goal1 == null)
        {
            throw new RuntimeException((new StringBuilder()).append("No entry in GaolFactory for this GoalType: [").append(obj).append("]. Add corresponded switch case").toString());
        }
        goal1.setUuid(UUID.fromString(goal.getUuid()));
        goal1.setTimeUpdated(goal.getTimeUpdated());
        goal1.setTimeCreated(goal.getTimeCreated());
        goal1.setServerId(goal.getServerId().longValue());
        goal1.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.valueOf(goal.getEntityStatus().intValue()));
        goal1.setEntityId(goal.getId());
        goal1.a(goal.getStatus().intValue());
        double d = unboxDouble(goal.getTarget(), 0.0D);
        double d1 = unboxDouble(goal.getResult(), 0.0D);
        double d2 = unboxDouble(goal.getStart(), 0.0D);
        Object obj1 = goal.getTargetMeasurement();
        Object obj2 = goal.getResultMeasurement();
        String s = goal.getStartMeasurement();
        obj1 = j.a(((com.fitbit.data.domain.Goal.GoalType) (obj)), ((String) (obj1)), d);
        obj2 = j.a(((com.fitbit.data.domain.Goal.GoalType) (obj)), ((String) (obj2)), d1);
        obj = j.a(((com.fitbit.data.domain.Goal.GoalType) (obj)), s, d2);
        if (obj1 == null || obj2 == null || obj == null)
        {
            a.a("GoalMapper", "Null goal value target[%s] result[%s] start[%s]", new Object[] {
                obj1, obj2, obj
            });
        }
        goal1.b(obj1);
        goal1.a(obj2);
        goal1.c(obj);
        goal1.a(goal.getStartDate());
        goal1.b(goal.getDueDate());
        return goal1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((Goal)obj);
    }

    public Goal toDbEntity(com.fitbit.data.domain.Goal goal)
    {
        return toDbEntity(goal, new Goal());
    }

    public Goal toDbEntity(com.fitbit.data.domain.Goal goal, Goal goal1)
    {
        if (goal == null)
        {
            return null;
        }
        Goal goal2 = goal1;
        if (goal1 == null)
        {
            goal2 = new Goal();
        }
        if (goal2.getId() == null)
        {
            goal2.setId(goal.getEntityId());
        }
        goal2.setUuid(goal.getUuid().toString());
        goal2.setTimeUpdated(goal.getTimeUpdated());
        goal2.setTimeCreated(goal.getTimeCreated());
        goal2.setServerId(Long.valueOf(goal.getServerId()));
        goal2.setEntityStatus(Integer.valueOf(goal.getEntityStatus().getCode()));
        goal2.setStatus(Integer.valueOf(goal.i()));
        goal1 = goal.b();
        Object obj = goal.j();
        Object obj1 = goal.k();
        Object obj2 = goal.o();
        goal2.setTarget(Double.valueOf(j.a(goal1, obj)));
        goal2.setResult(Double.valueOf(j.a(goal1, obj1)));
        goal2.setStart(Double.valueOf(j.a(goal1, obj2)));
        goal2.setTargetMeasurement(j.b(goal1, obj));
        goal2.setResultMeasurement(j.b(goal1, obj1));
        goal2.setStartMeasurement(j.b(goal1, obj2));
        goal2.setGoalType(goal1.name());
        goal2.setStartDate(goal.m());
        goal2.setDueDate(goal.n());
        return goal2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((com.fitbit.data.domain.Goal)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((com.fitbit.data.domain.Goal)obj, (Goal)obj1);
    }
}
