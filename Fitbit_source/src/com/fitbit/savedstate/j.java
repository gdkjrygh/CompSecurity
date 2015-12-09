// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class j extends a
{

    private static final j b = new j();
    private static final String c = "REGISTER_INTERVAL";

    j()
    {
        super("GoogleStepsSavedState");
    }

    public static void a(long l)
    {
        com/fitbit/savedstate/j;
        JVM INSTR monitorenter ;
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        com/fitbit/savedstate/j;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.c().putLong("REGISTER_INTERVAL", l).apply();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected static a g()
    {
        return b;
    }

    public static long h()
    {
        com/fitbit/savedstate/j;
        JVM INSTR monitorenter ;
        long l = b.b().getLong("REGISTER_INTERVAL", 50L);
        com/fitbit/savedstate/j;
        JVM INSTR monitorexit ;
        return l;
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

    public volatile void a(Context context, int i, int k, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i, k, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i, int k, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.GoogleStepsServiceState.REGISTER_INTERVAL"))
        {
            editor.putLong("REGISTER_INTERVAL", context.getLong("SavedState.GoogleStepsServiceState.REGISTER_INTERVAL", 0L));
            editor1.remove("SavedState.GoogleStepsServiceState.REGISTER_INTERVAL");
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
