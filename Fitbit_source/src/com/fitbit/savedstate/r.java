// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Date;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class r extends a
{

    private static final r b = new r();
    private static final String c = "LAST_SELECTED_ASLEEP_INTERVAL";
    private static final String d = "LAST_SELECTED_AWAKENING_INTERVAL";
    private static final String e = "LAST_SELECTED_INTERVAL";
    private static final String f = "TIME_ASLEEP_LOADED";
    private static final String g = "TIMES_AWAKENED_LOADED";
    private static final String h = "SLEEP_START_TIME";
    private static final String i = "SLEEP_END_TIME";
    private static final String j = "SLEEP_IS_AWAKE";

    r()
    {
        super("SleepSavedState");
    }

    public static void a(int i1)
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        b.c().putInt("LAST_SELECTED_ASLEEP_INTERVAL", i1).apply();
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(int i1)
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        b.c().putInt("LAST_SELECTED_AWAKENING_INTERVAL", i1).apply();
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected static a g()
    {
        return b;
    }

    public static int h()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        int i1 = b.b().getInt("LAST_SELECTED_ASLEEP_INTERVAL", 1);
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static int i()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        int i1 = b.b().getInt("LAST_SELECTED_AWAKENING_INTERVAL", 1);
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean j()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        long l1 = b.b().getLong("SLEEP_START_TIME", 0L);
        boolean flag;
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void k()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        b.c().putBoolean("SLEEP_IS_AWAKE", false).putLong("SLEEP_START_TIME", (new Date()).getTime()).apply();
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static Date l()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        Date date = new Date(b.b().getLong("SLEEP_START_TIME", 0L));
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return date;
        Exception exception;
        exception;
        throw exception;
    }

    public static Date m()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        Date date = new Date(b.b().getLong("SLEEP_END_TIME", 0L));
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return date;
        Exception exception;
        exception;
        throw exception;
    }

    public static void n()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        b.c().putBoolean("SLEEP_IS_AWAKE", true).putLong("SLEEP_END_TIME", (new Date()).getTime()).apply();
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean o()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean("SLEEP_IS_AWAKE", true);
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean p()
    {
        boolean flag = true;
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        boolean flag1 = b.b().getBoolean("SLEEP_IS_AWAKE", true);
        if (flag1)
        {
            flag = false;
        }
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void q()
    {
        com/fitbit/savedstate/r;
        JVM INSTR monitorenter ;
        b.c().remove("SLEEP_START_TIME").remove("SLEEP_END_TIME").remove("SLEEP_IS_AWAKE").apply();
        com/fitbit/savedstate/r;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i1, j1, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.SleepChartState.LAST_SELECTED_INTERVAL"))
        {
            editor1.remove("SavedState.SleepChartState.LAST_SELECTED_INTERVAL");
        }
        if (context.contains("SavedState.SleepChartState.LAST_SELECTED_CHART"))
        {
            editor1.remove("SavedState.SleepChartState.LAST_SELECTED_CHART");
        }
        if (context.contains("SavedState.AppState.SLEEP_START_TIME"))
        {
            editor.putLong("SLEEP_START_TIME", context.getLong("SavedState.AppState.SLEEP_START_TIME", 0L));
            editor1.remove("SavedState.AppState.SLEEP_START_TIME");
        }
        if (context.contains("SavedState.AppState.SLEEP_END_TIME"))
        {
            editor.putLong("SLEEP_END_TIME", context.getLong("SavedState.AppState.SLEEP_END_TIME", 0L));
            editor1.remove("SavedState.AppState.SLEEP_END_TIME");
        }
        if (context.contains("SavedState.AppState.SLEEP_IS_AWAKE"))
        {
            editor.putBoolean("SLEEP_IS_AWAKE", context.getBoolean("SavedState.AppState.SLEEP_IS_AWAKE", false));
            editor1.remove("SavedState.AppState.SLEEP_IS_AWAKE");
        }
        editor = new String[2][];
        editor[0] = (new String[] {
            "TIME_ASLEEP_LOADED", "SavedState.SleepChartState.TIME_ASLEEP_LOADED"
        });
        editor[1] = (new String[] {
            "TIMES_AWAKENED_LOADED", "SavedState.SleepChartState.TIMES_AWAKENED_LOADED"
        });
        int k1 = editor.length;
        for (i1 = 0; i1 < k1; i1++)
        {
            Object obj = editor[i1];
            com.fitbit.util.chart.Filter.Type atype[] = com.fitbit.util.chart.Filter.Type.values();
            int l1 = atype.length;
            for (j1 = 0; j1 < l1; j1++)
            {
                Object obj1 = atype[j1];
                obj1 = (new StringBuilder()).append(obj[1]).append(((com.fitbit.util.chart.Filter.Type) (obj1)).name()).toString();
                if (context.contains(((String) (obj1))))
                {
                    editor1.remove(((String) (obj1)));
                }
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
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("LAST_SELECTED_ASLEEP_INTERVAL", 1);
        editor.putInt("LAST_SELECTED_AWAKENING_INTERVAL", 1);
        editor.remove("SLEEP_START_TIME");
        editor.remove("SLEEP_END_TIME");
        editor.remove("SLEEP_IS_AWAKE");
        editor.apply();
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
