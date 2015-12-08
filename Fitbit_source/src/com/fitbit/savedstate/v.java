// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class v extends a
{

    private static final v b = new v();
    private static final String c = "LAST_SELECTED_INTERVAL";
    private static final String d = "LAST_SELECTED_CHART";
    private static final String e = "WEIGHT_LOADED";
    private static final String f = "FAT_LOADED";

    v()
    {
        super("WeightSavedState");
    }

    public static void a(int j)
    {
        b.c().putInt("LAST_SELECTED_INTERVAL", j).apply();
    }

    public static void a(com.fitbit.util.chart.Filter.Type type, boolean flag)
    {
        b.c().putBoolean((new StringBuilder()).append("WEIGHT_LOADED").append(type.name()).toString(), flag).apply();
    }

    public static void a(boolean flag)
    {
        com.fitbit.util.chart.Filter.Type atype[] = com.fitbit.util.chart.Filter.Type.values();
        int k = atype.length;
        for (int j = 0; j < k; j++)
        {
            a(atype[j], flag);
        }

    }

    public static boolean a(com.fitbit.util.chart.Filter.Type type)
    {
        com/fitbit/savedstate/v;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean((new StringBuilder()).append("WEIGHT_LOADED").append(type.name()).toString(), false);
        com/fitbit/savedstate/v;
        JVM INSTR monitorexit ;
        return flag;
        type;
        throw type;
    }

    public static void b(int j)
    {
        b.c().putInt("LAST_SELECTED_CHART", j).apply();
    }

    public static void b(com.fitbit.util.chart.Filter.Type type, boolean flag)
    {
        b.c().putBoolean((new StringBuilder()).append("FAT_LOADED").append(type.name()).toString(), flag).apply();
    }

    public static void b(boolean flag)
    {
        com.fitbit.util.chart.Filter.Type atype[] = com.fitbit.util.chart.Filter.Type.values();
        int k = atype.length;
        for (int j = 0; j < k; j++)
        {
            b(atype[j], flag);
        }

    }

    public static boolean b(com.fitbit.util.chart.Filter.Type type)
    {
        com/fitbit/savedstate/v;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean((new StringBuilder()).append("FAT_LOADED").append(type.name()).toString(), false);
        com/fitbit/savedstate/v;
        JVM INSTR monitorexit ;
        return flag;
        type;
        throw type;
    }

    protected static a g()
    {
        return b;
    }

    public static int h()
    {
        return b.b().getInt("LAST_SELECTED_INTERVAL", 0);
    }

    public static int i()
    {
        return b.b().getInt("LAST_SELECTED_CHART", 0);
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int j, int k, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, j, k, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int j, int k, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.SleepChartState.LAST_SELECTED_INTERVAL"))
        {
            editor.putInt("LAST_SELECTED_INTERVAL", context.getInt("SavedState.SleepChartState.LAST_SELECTED_INTERVAL", 0));
            editor1.remove("SavedState.SleepChartState.LAST_SELECTED_INTERVAL");
        }
        if (context.contains("SavedState.SleepChartState.LAST_SELECTED_CHART"))
        {
            editor.putInt("LAST_SELECTED_CHART", context.getInt("SavedState.SleepChartState.LAST_SELECTED_CHART", 0));
            editor1.remove("SavedState.SleepChartState.LAST_SELECTED_CHART");
        }
        com.fitbit.util.chart.Filter.Type atype[] = com.fitbit.util.chart.Filter.Type.values();
        k = atype.length;
        for (j = 0; j < k; j++)
        {
            Object obj = atype[j];
            String s = (new StringBuilder()).append("SavedState.ChartState.WEIGHT_LOADED").append(((com.fitbit.util.chart.Filter.Type) (obj)).name()).toString();
            String s1 = (new StringBuilder()).append("WEIGHT_LOADED").append(((com.fitbit.util.chart.Filter.Type) (obj)).name()).toString();
            if (context.contains(s))
            {
                editor.putBoolean(s1, context.getBoolean(s, false));
                editor1.remove(s);
            }
            s = (new StringBuilder()).append("SavedState.ChartState.FAT_LOADED").append(((com.fitbit.util.chart.Filter.Type) (obj)).name()).toString();
            obj = (new StringBuilder()).append("WEIGHT_LOADED").append(((com.fitbit.util.chart.Filter.Type) (obj)).name()).toString();
            if (context.contains(s))
            {
                editor.putBoolean(((String) (obj)), context.getBoolean(s, false));
                editor1.remove(s);
            }
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
        a(false);
        b(false);
        b.c().putInt("LAST_SELECTED_CHART", 0).putInt("LAST_SELECTED_INTERVAL", 0).apply();
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
