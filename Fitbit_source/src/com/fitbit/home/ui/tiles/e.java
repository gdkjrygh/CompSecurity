// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.support.v4.util.LongSparseArray;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.CaloriesEatenGoal;
import com.fitbit.data.domain.DistanceGoal;
import com.fitbit.data.domain.FloorsGoal;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.SleepGoal;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.domain.VeryActiveMinutesGoal;
import com.fitbit.data.domain.WaterGoal;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.water.Water;
import com.fitbit.weight.Fat;
import com.fitbit.weight.Weight;
import java.util.Calendar;
import java.util.List;

public class e
{
    public static class a
    {

        public WeightGoal a;
        public Weight b;
        public Weight c;
        public Fat d;

        public a()
        {
        }
    }

    public static class b
    {

        public final ExerciseSession a;
        public final ExerciseStat b;

        public b(ExerciseSession exercisesession, ExerciseStat exercisestat)
        {
            a = exercisesession;
            b = exercisestat;
        }
    }


    public boolean a;
    public Calendar b;
    public Profile c;
    public boolean d;
    public DistanceGoal e;
    public CaloriesBurnedGoal f;
    public StepsGoal g;
    public FloorsGoal h;
    public VeryActiveMinutesGoal i;
    public WaterGoal j;
    public SleepGoal k;
    public LiveDataPacket l;
    public CaloriesEatenGoal m;
    public a n;
    public Water o;
    public List p;
    public List q;
    public final LongSparseArray r = new LongSparseArray();
    public HeartRateDailySummary s;
    public boolean t;

    public e()
    {
    }

    private static void a(StringBuilder stringbuilder, String s1, ValueGoal valuegoal)
    {
        if (valuegoal != null)
        {
            stringbuilder.append(", ");
            stringbuilder.append(s1);
            stringbuilder.append(" = ");
            stringbuilder.append(valuegoal.c());
            stringbuilder.append("/");
            stringbuilder.append(valuegoal.p());
        }
    }

    public void a(LiveDataPacket livedatapacket)
    {
        if (livedatapacket == null || l == null)
        {
            l = livedatapacket;
            return;
        }
        if (!livedatapacket.h())
        {
            l.b(livedatapacket.b());
            l.b(livedatapacket.d());
            l.a(livedatapacket.c());
            l.a(livedatapacket.a());
            l.c(livedatapacket.e());
            l.b(livedatapacket.g());
            return;
        } else
        {
            l = livedatapacket;
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DashboardData[");
        if (b != null)
        {
            stringbuilder.append("date = ");
            stringbuilder.append(b.getTime());
        }
        a(stringbuilder, "distanceGoal", e);
        a(stringbuilder, "caloriesBurnedGoal", f);
        a(stringbuilder, "stepsGoal", g);
        a(stringbuilder, "floorsGoal", h);
        a(stringbuilder, "minutesVeryActiveGoal", i);
        a(stringbuilder, "waterGoal", j);
        a(stringbuilder, "sleepGoal", k);
        if (m != null)
        {
            stringbuilder.append(", caloriesEatenGoal = ");
            stringbuilder.append(m.c());
            stringbuilder.append("/");
            stringbuilder.append(m.p());
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
