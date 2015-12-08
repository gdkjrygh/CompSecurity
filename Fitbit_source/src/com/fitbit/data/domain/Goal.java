// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import java.util.Date;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, a

public abstract class Goal extends Entity
{
    public static final class GoalFreq extends Enum
        implements a
    {

        private static final GoalFreq $VALUES[];
        public static final GoalFreq DAILY_GOAL;
        public static final GoalFreq MONTHLY_GOAL;
        public static final GoalFreq WEEKLY_GOAL;
        private final int code;

        public static GoalFreq valueOf(String s)
        {
            return (GoalFreq)Enum.valueOf(com/fitbit/data/domain/Goal$GoalFreq, s);
        }

        public static GoalFreq[] values()
        {
            return (GoalFreq[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        static 
        {
            DAILY_GOAL = new GoalFreq("DAILY_GOAL", 0, 1);
            WEEKLY_GOAL = new GoalFreq("WEEKLY_GOAL", 1, 2);
            MONTHLY_GOAL = new GoalFreq("MONTHLY_GOAL", 2, 3);
            $VALUES = (new GoalFreq[] {
                DAILY_GOAL, WEEKLY_GOAL, MONTHLY_GOAL
            });
        }

        private GoalFreq(String s, int i1, int j1)
        {
            super(s, i1);
            code = j1;
        }
    }

    public static final class GoalType extends Enum
        implements a
    {

        private static final GoalType $VALUES[];
        public static final GoalType BODY_FAT_GOAL;
        public static final GoalType CALORIES_BURNED_GOAL;
        public static final GoalType CALORIES_CONSUMED_GOAL;
        public static final GoalType DISTANCE_GOAL;
        public static final GoalType FLOORS_GOAL;
        public static final GoalType MINUTES_VERY_ACTIVE_GOAL;
        public static final GoalType SLEEP_GOAL;
        public static final GoalType STEPS_GOAL;
        public static final GoalType WATER_GOAL;
        public static final GoalType WEIGHT_GOAL;
        private final int code;
        private final String publicApiKey;

        public static GoalType valueOf(String s)
        {
            return (GoalType)Enum.valueOf(com/fitbit/data/domain/Goal$GoalType, s);
        }

        public static GoalType[] values()
        {
            return (GoalType[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        public String getPublicApiKey()
        {
            return publicApiKey;
        }

        static 
        {
            WEIGHT_GOAL = new GoalType("WEIGHT_GOAL", 0, 0, null);
            CALORIES_BURNED_GOAL = new GoalType("CALORIES_BURNED_GOAL", 1, 10, "caloriesOut");
            CALORIES_CONSUMED_GOAL = new GoalType("CALORIES_CONSUMED_GOAL", 2, 20, null);
            STEPS_GOAL = new GoalType("STEPS_GOAL", 3, 30, "steps");
            DISTANCE_GOAL = new GoalType("DISTANCE_GOAL", 4, 40, "distance");
            FLOORS_GOAL = new GoalType("FLOORS_GOAL", 5, 180, "floors");
            MINUTES_VERY_ACTIVE_GOAL = new GoalType("MINUTES_VERY_ACTIVE_GOAL", 6, 190, "activeMinutes");
            WATER_GOAL = new GoalType("WATER_GOAL", 7, 200, null);
            BODY_FAT_GOAL = new GoalType("BODY_FAT_GOAL", 8, 210, "fat");
            SLEEP_GOAL = new GoalType("SLEEP_GOAL", 9, 220, "sleep");
            $VALUES = (new GoalType[] {
                WEIGHT_GOAL, CALORIES_BURNED_GOAL, CALORIES_CONSUMED_GOAL, STEPS_GOAL, DISTANCE_GOAL, FLOORS_GOAL, MINUTES_VERY_ACTIVE_GOAL, WATER_GOAL, BODY_FAT_GOAL, SLEEP_GOAL
            });
        }

        private GoalType(String s, int i1, int j1, String s1)
        {
            super(s, i1);
            code = j1;
            publicApiKey = s1;
        }
    }


    private Date dueDate;
    private GoalFreq frequency;
    private Object result;
    private Object start;
    private Date startDate;
    private int status;
    private Object target;

    public Goal()
    {
    }

    public void a(int i1)
    {
        status = i1;
    }

    public void a(GoalFreq goalfreq)
    {
        frequency = goalfreq;
    }

    public void a(Object obj)
    {
        result = obj;
    }

    public void a(Date date)
    {
        startDate = date;
    }

    public abstract GoalType b();

    public void b(Object obj)
    {
        target = obj;
    }

    public void b(Date date)
    {
        dueDate = date;
    }

    public void c(Object obj)
    {
        start = obj;
    }

    public Object d()
    {
        return result;
    }

    public int i()
    {
        return status;
    }

    public Object j()
    {
        return target;
    }

    public Object k()
    {
        return result;
    }

    public GoalFreq l()
    {
        return frequency;
    }

    public Date m()
    {
        return startDate;
    }

    public Date n()
    {
        return dueDate;
    }

    public Object o()
    {
        return start;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" target: ").append(j());
        stringbuilder.append(" result: ").append(d());
        stringbuilder.append(" start: ").append(o());
        stringbuilder.append(" startDate: ").append(m());
        stringbuilder.append(" dueDate: ").append(n());
        stringbuilder.append(" getUuid: ").append(getUuid());
        return stringbuilder.toString();
    }
}
