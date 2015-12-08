// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.a.a;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            t

class 
    implements Runnable
{

    final a a;
    final Date b;
    final t c;

    public void run()
    {
        com.fitbit.data.bl.t.a(c, com.fitbit.data.domain..GoalType.DISTANCE_GOAL, null, a.b());
        com.fitbit.data.bl.t.a(c, com.fitbit.data.domain..GoalType.FLOORS_GOAL, null, a.c());
        com.fitbit.data.bl.t.a(c, com.fitbit.data.domain..GoalType.STEPS_GOAL, null, a.d());
        com.fitbit.data.bl.t.a(c, com.fitbit.data.domain..GoalType.MINUTES_VERY_ACTIVE_GOAL, null, a.e());
        c.a(com.fitbit.data.domain..GoalType.CALORIES_BURNED_GOAL, null, a.a(), b);
    }

    a.a(t t1, a a1, Date date)
    {
        c = t1;
        a = a1;
        b = date;
        super();
    }
}
