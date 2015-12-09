// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class w extends a
{

    private static final w b = new w();
    private static final String c = "WIDGET_ENABLED";

    w()
    {
        super("WidgetSavedState");
    }

    public static void a(boolean flag)
    {
        com/fitbit/savedstate/w;
        JVM INSTR monitorenter ;
        b.c().putBoolean("WIDGET_ENABLED", flag).apply();
        com/fitbit/savedstate/w;
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
        com/fitbit/savedstate/w;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean("WIDGET_ENABLED", false);
        com/fitbit/savedstate/w;
        JVM INSTR monitorexit ;
        return flag;
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
        if (context.contains("SavedState.WidgetState.WIDGET_ENABLED"))
        {
            editor.putBoolean("WIDGET_ENABLED", context.getBoolean("SavedState.WidgetState.WIDGET_ENABLED", false));
            editor1.remove("SavedState.WidgetState.WIDGET_ENABLED");
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
