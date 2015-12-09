// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import com.fitbit.data.domain.BodyFatGoal;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.DistanceGoal;
import com.fitbit.data.domain.FloorsGoal;
import com.fitbit.data.domain.SleepGoal;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.data.domain.VeryActiveMinutesGoal;
import com.fitbit.data.domain.WaterGoal;
import com.fitbit.data.domain.WeightGoal;

// Referenced classes of package com.fitbit.settings.ui:
//            GoalsActivity

public static class sGoal
{

    private StepsGoal a;
    private DistanceGoal b;
    private SleepGoal c;
    private CaloriesBurnedGoal d;
    private VeryActiveMinutesGoal e;
    private FloorsGoal f;
    private WaterGoal g;
    private WeightGoal h;
    private BodyFatGoal i;

    static BodyFatGoal a(sGoal sgoal, BodyFatGoal bodyfatgoal)
    {
        sgoal.i = bodyfatgoal;
        return bodyfatgoal;
    }

    static CaloriesBurnedGoal a(al al, CaloriesBurnedGoal caloriesburnedgoal)
    {
        al.d = caloriesburnedgoal;
        return caloriesburnedgoal;
    }

    static DistanceGoal a(d d1, DistanceGoal distancegoal)
    {
        d1.b = distancegoal;
        return distancegoal;
    }

    static FloorsGoal a(b b1, FloorsGoal floorsgoal)
    {
        b1.f = floorsgoal;
        return floorsgoal;
    }

    static SleepGoal a(f f1, SleepGoal sleepgoal)
    {
        f1.c = sleepgoal;
        return sleepgoal;
    }

    static StepsGoal a(c c1)
    {
        return c1.a;
    }

    static StepsGoal a(a a1, StepsGoal stepsgoal)
    {
        a1.a = stepsgoal;
        return stepsgoal;
    }

    static VeryActiveMinutesGoal a(sGoal sgoal, VeryActiveMinutesGoal veryactiveminutesgoal)
    {
        sgoal.e = veryactiveminutesgoal;
        return veryactiveminutesgoal;
    }

    static WaterGoal a(e e1, WaterGoal watergoal)
    {
        e1.g = watergoal;
        return watergoal;
    }

    static WeightGoal a(g g1, WeightGoal weightgoal)
    {
        g1.h = weightgoal;
        return weightgoal;
    }

    static CaloriesBurnedGoal b(h h1)
    {
        return h1.d;
    }

    static VeryActiveMinutesGoal c(d d1)
    {
        return d1.e;
    }

    static FloorsGoal d(e e1)
    {
        return e1.f;
    }

    static WaterGoal e(f f1)
    {
        return f1.g;
    }

    static DistanceGoal f(g g1)
    {
        return g1.b;
    }

    static WeightGoal g(b b1)
    {
        return b1.h;
    }

    static BodyFatGoal h(h h1)
    {
        return h1.i;
    }

    static SleepGoal i(i j)
    {
        return j.c;
    }

    public sGoal()
    {
    }
}
