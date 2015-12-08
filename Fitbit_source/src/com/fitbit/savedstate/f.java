// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class f extends a
{

    private static final f b = new f();
    private static final String c = "LAST_MAINTANANCE_TIME";
    private static final String d = "MAINTANANCE_INTERVAL";
    private static final String e = "MAINTANANCE_DAYS";
    private static final long f = 0x5265c00L;
    private static final int g = 15;

    f()
    {
        super("DatabaseSavedState");
    }

    public static void a(int k)
    {
        com/fitbit/savedstate/f;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("MAINTANANCE_DAYS", k);
        editor.apply();
        com/fitbit/savedstate/f;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(long l)
    {
        com/fitbit/savedstate/f;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putLong("LAST_MAINTANANCE_TIME", l);
        editor.apply();
        com/fitbit/savedstate/f;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(long l)
    {
        com/fitbit/savedstate/f;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putLong("MAINTANANCE_INTERVAL", l);
        editor.apply();
        com/fitbit/savedstate/f;
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

    public static long h()
    {
        com/fitbit/savedstate/f;
        JVM INSTR monitorenter ;
        long l = b.b().getLong("LAST_MAINTANANCE_TIME", 0L);
        com/fitbit/savedstate/f;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public static long i()
    {
        com/fitbit/savedstate/f;
        JVM INSTR monitorenter ;
        long l = b.b().getLong("MAINTANANCE_INTERVAL", 0x5265c00L);
        com/fitbit/savedstate/f;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public static int j()
    {
        com/fitbit/savedstate/f;
        JVM INSTR monitorenter ;
        int k = b.b().getInt("MAINTANANCE_DAYS", 15);
        com/fitbit/savedstate/f;
        JVM INSTR monitorexit ;
        return k;
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

    public volatile void a(Context context, int k, int l, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, k, l, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int k, int l, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.DatabaseState.LAST_MAINTANANCE_TIME"))
        {
            editor.putLong("LAST_MAINTANANCE_TIME", context.getLong("SavedState.DatabaseState.LAST_MAINTANANCE_TIME", 0L));
            editor1.remove("SavedState.DatabaseState.LAST_MAINTANANCE_TIME");
        }
        if (context.contains("SavedState.DatabaseState.MAINTANANCE_INTERVAL"))
        {
            editor.putLong("MAINTANANCE_INTERVAL", context.getLong("SavedState.DatabaseState.MAINTANANCE_INTERVAL", 0L));
            editor1.remove("SavedState.DatabaseState.MAINTANANCE_INTERVAL");
        }
        if (context.contains("SavedState.DatabaseState.MAINTANANCE_DAYS"))
        {
            editor.putInt("MAINTANANCE_DAYS", context.getInt("SavedState.DatabaseState.MAINTANANCE_DAYS", 0));
            editor1.remove("SavedState.DatabaseState.MAINTANANCE_DAYS");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.remove("LAST_MAINTANANCE_TIME");
        editor.remove("MAINTANANCE_INTERVAL");
        editor.remove("MAINTANANCE_DAYS");
        editor.apply();
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
