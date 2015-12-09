// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class HeartRateSavedState extends a
{
    public static final class HeartRateChartType extends Enum
    {

        public static final HeartRateChartType a;
        public static final HeartRateChartType b;
        private static final HeartRateChartType c[];

        public static HeartRateChartType valueOf(String s)
        {
            return (HeartRateChartType)Enum.valueOf(com/fitbit/savedstate/HeartRateSavedState$HeartRateChartType, s);
        }

        public static HeartRateChartType[] values()
        {
            return (HeartRateChartType[])c.clone();
        }

        static 
        {
            a = new HeartRateChartType("RESTING", 0);
            b = new HeartRateChartType("EXERCISE", 1);
            c = (new HeartRateChartType[] {
                a, b
            });
        }

        private HeartRateChartType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final HeartRateSavedState b = new HeartRateSavedState();
    private static final String c = "LAST_SELECTED_INTERVAL_";

    HeartRateSavedState()
    {
        super("HeartRateSavedState");
    }

    public static int a(HeartRateChartType heartratecharttype)
    {
        return b.b().getInt(b(heartratecharttype), 1);
    }

    public static void a(int i, HeartRateChartType heartratecharttype)
    {
        b.c().putInt(b(heartratecharttype), i).apply();
    }

    private static String b(HeartRateChartType heartratecharttype)
    {
        return (new StringBuilder()).append("LAST_SELECTED_INTERVAL_").append(heartratecharttype.name()).toString();
    }

    protected static a g()
    {
        return b;
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i, j, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.RestingHeartRateChartState.LAST_SELECTED_INTERVAL"))
        {
            editor.putInt(b(HeartRateChartType.a), context.getInt("SavedState.RestingHeartRateChartState.LAST_SELECTED_INTERVAL", 0));
            editor1.remove("SavedState.RestingHeartRateChartState.LAST_SELECTED_INTERVAL");
        }
        if (context.contains("SavedState.ExerciseHeartRateChartState.LAST_SELECTED_INTERVAL"))
        {
            editor.putInt(b(HeartRateChartType.b), context.getInt("SavedState.ExerciseHeartRateChartState.LAST_SELECTED_INTERVAL", 0));
            editor1.remove("SavedState.ExerciseHeartRateChartState.LAST_SELECTED_INTERVAL");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        b.c().putInt(b(HeartRateChartType.b), 1).putInt(b(HeartRateChartType.a), 1).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

}
