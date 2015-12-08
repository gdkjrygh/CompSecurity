// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            a, Goal

public static final class code extends Enum
    implements a
{

    private static final MONTHLY_GOAL $VALUES[];
    public static final MONTHLY_GOAL DAILY_GOAL;
    public static final MONTHLY_GOAL MONTHLY_GOAL;
    public static final MONTHLY_GOAL WEEKLY_GOAL;
    private final int code;

    public static code valueOf(String s)
    {
        return (code)Enum.valueOf(com/fitbit/data/domain/Goal$GoalFreq, s);
    }

    public static code[] values()
    {
        return (code[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    static 
    {
        DAILY_GOAL = new <init>("DAILY_GOAL", 0, 1);
        WEEKLY_GOAL = new <init>("WEEKLY_GOAL", 1, 2);
        MONTHLY_GOAL = new <init>("MONTHLY_GOAL", 2, 3);
        $VALUES = (new .VALUES[] {
            DAILY_GOAL, WEEKLY_GOAL, MONTHLY_GOAL
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
