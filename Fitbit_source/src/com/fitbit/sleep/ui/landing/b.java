// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.landing;

import com.fitbit.data.domain.SleepGoal;
import com.fitbit.data.domain.SleepLogEntry;

public class b
{

    private SleepLogEntry a;
    private boolean b;

    public b(SleepLogEntry sleeplogentry, SleepGoal sleepgoal)
    {
        boolean flag1 = false;
        super();
        b = false;
        a = sleeplogentry;
        if (sleepgoal != null && sleepgoal.s() != null && sleeplogentry != null)
        {
            boolean flag = flag1;
            if ((double)sleeplogentry.g() >= sleepgoal.p().doubleValue())
            {
                flag = flag1;
                if (sleepgoal.p().doubleValue() != 0.0D)
                {
                    flag = true;
                }
            }
            b = flag;
        }
    }

    public SleepLogEntry a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }
}
