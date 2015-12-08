// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.BodyFatGoal;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.DistanceGoal;
import com.fitbit.data.domain.FloorsGoal;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.data.domain.VeryActiveMinutesGoal;
import com.fitbit.util.bf;
import java.util.Date;

// Referenced classes of package com.fitbit.settings.ui:
//            GoalsActivity

private static class d extends bf
{

    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    protected d a()
    {
        sGoal sgoal = new <init>();
        Date date = new Date();
        if (a)
        {
            a(sgoal, (StepsGoal)t.a().a(com.fitbit.data.domain.EPS_GOAL, date));
        } else
        {
            a(sgoal, null);
        }
        if (c)
        {
            a(sgoal, (FloorsGoal)t.a().a(com.fitbit.data.domain.OORS_GOAL, date));
        } else
        {
            a(sgoal, null);
        }
        if (b)
        {
            a(sgoal, (DistanceGoal)t.a().a(com.fitbit.data.domain.STANCE_GOAL, date));
        } else
        {
            a(sgoal, null);
        }
        if (d)
        {
            a(sgoal, (VeryActiveMinutesGoal)t.a().a(com.fitbit.data.domain.NUTES_VERY_ACTIVE_GOAL, date));
        } else
        {
            a(sgoal, null);
        }
        a(sgoal, (CaloriesBurnedGoal)t.a().a(com.fitbit.data.domain.LORIES_BURNED_GOAL, date));
        a(sgoal, t.a().g(date));
        a(sgoal, (BodyFatGoal)t.a().a(com.fitbit.data.domain.DY_FAT_GOAL, date));
        a(sgoal, t.a().b());
        a(sgoal, t.a().h(date));
        return sgoal;
    }

    protected Object f_()
    {
        return a();
    }

    public al(Context context, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        super(context);
        a = flag;
        b = flag1;
        c = flag2;
        d = flag3;
    }
}
