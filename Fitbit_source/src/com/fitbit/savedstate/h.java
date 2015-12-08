// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class h extends a
{

    private static final h b = new h();
    private static final String c = "USING_FWU_SIMULATION";
    private static final String d = "USING_PFWU_SIMULATION";

    h()
    {
        super("FWUpdateSimulationSavedState");
    }

    private static void a(boolean flag)
    {
        com/fitbit/savedstate/h;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean("USING_FWU_SIMULATION", flag);
        editor.apply();
        com/fitbit/savedstate/h;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static void b(boolean flag)
    {
        com/fitbit/savedstate/h;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean("USING_PFWU_SIMULATION", flag);
        editor.apply();
        com/fitbit/savedstate/h;
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

    public static boolean h()
    {
        com/fitbit/savedstate/h;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean("USING_FWU_SIMULATION", false);
        com/fitbit/savedstate/h;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void i()
    {
        com/fitbit/savedstate/h;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        com/fitbit/savedstate/h;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean j()
    {
        com/fitbit/savedstate/h;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean("USING_PFWU_SIMULATION", false);
        com/fitbit/savedstate/h;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void k()
    {
        com/fitbit/savedstate/h;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!j())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        com/fitbit/savedstate/h;
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

    public volatile void a(Context context, int l, int i1, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, l, i1, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int l, int i1, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.UsingFWUpdateSimulationState.USING_FWU_SIMULATION"))
        {
            editor.putBoolean("USING_FWU_SIMULATION", context.getBoolean("SavedState.UsingFWUpdateSimulationState.USING_FWU_SIMULATION", false));
            editor1.remove("SavedState.UsingFWUpdateSimulationState.USING_FWU_SIMULATION");
        }
        if (context.contains("SavedState.UsingFWUpdateSimulationState.USING_PFWU_SIMULATION"))
        {
            editor.putBoolean("USING_PFWU_SIMULATION", context.getBoolean("SavedState.UsingFWUpdateSimulationState.USING_PFWU_SIMULATION", false));
            editor1.remove("SavedState.UsingFWUpdateSimulationState.USING_PFWU_SIMULATION");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
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
