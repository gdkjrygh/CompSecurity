// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class BackgroundRequestSavedState extends a
{
    public static final class FilterTypes extends Enum
    {

        public static final FilterTypes a;
        public static final FilterTypes b;
        private static final FilterTypes c[];

        public static FilterTypes valueOf(String s)
        {
            return (FilterTypes)Enum.valueOf(com/fitbit/savedstate/BackgroundRequestSavedState$FilterTypes, s);
        }

        public static FilterTypes[] values()
        {
            return (FilterTypes[])c.clone();
        }

        static 
        {
            a = new FilterTypes("DefaultFilter", 0);
            b = new FilterTypes("TrackerFilter", 1);
            c = (new FilterTypes[] {
                a, b
            });
        }

        private FilterTypes(String s, int i)
        {
            super(s, i);
        }
    }


    private static final BackgroundRequestSavedState b = new BackgroundRequestSavedState();
    private static final String c = "MAX_REQUEST_COUNT.";
    private static final String d = "REQUEST_LIMIT_INTERVAL.";
    private static final String e = "BACKGROUND_FILTER_TIMEOUT.";
    private static int f = 30000;

    BackgroundRequestSavedState()
    {
        super("BackgroundRequestSavedState");
    }

    public static int a(FilterTypes filtertypes, int i)
    {
        return b.b().getInt((new StringBuilder()).append("MAX_REQUEST_COUNT.").append(filtertypes.toString()).toString(), i);
    }

    public static long a(FilterTypes filtertypes, long l)
    {
        return b.b().getLong((new StringBuilder()).append("REQUEST_LIMIT_INTERVAL.").append(filtertypes.toString()).toString(), l);
    }

    public static void a(FilterTypes filtertypes, long l, int i)
    {
        com/fitbit/savedstate/BackgroundRequestSavedState;
        JVM INSTR monitorenter ;
        b.c().putLong((new StringBuilder()).append("REQUEST_LIMIT_INTERVAL.").append(filtertypes.toString()).toString(), l).putInt((new StringBuilder()).append("MAX_REQUEST_COUNT.").append(filtertypes.toString()).toString(), i).apply();
        com/fitbit/savedstate/BackgroundRequestSavedState;
        JVM INSTR monitorexit ;
        return;
        filtertypes;
        throw filtertypes;
    }

    protected static a g()
    {
        return b;
    }

    public static int h()
    {
        return b.b().getInt("BACKGROUND_FILTER_TIMEOUT.", f);
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
        if (context.contains("BackgroundRequestFilterSettings.MAX_REQUEST_COUNT."))
        {
            editor.putInt("MAX_REQUEST_COUNT.", context.getInt("BackgroundRequestFilterSettings.MAX_REQUEST_COUNT.", 0));
            editor1.remove("BackgroundRequestFilterSettings.MAX_REQUEST_COUNT.");
        }
        if (context.contains("BackgroundRequestFilterSettings.REQUEST_LIMIT_INTERVAL."))
        {
            editor.putLong("REQUEST_LIMIT_INTERVAL.", context.getLong("BackgroundRequestFilterSettings.REQUEST_LIMIT_INTERVAL.", 0L));
            editor1.remove("BackgroundRequestFilterSettings.REQUEST_LIMIT_INTERVAL.");
        }
        if (context.contains("BackgroundRequestFilterSettings.BACKGROUND_FILTER_TIMEOUT."))
        {
            editor.putInt("BACKGROUND_FILTER_TIMEOUT.", context.getInt("BackgroundRequestFilterSettings.BACKGROUND_FILTER_TIMEOUT.", 0));
            editor1.remove("BackgroundRequestFilterSettings.BACKGROUND_FILTER_TIMEOUT.");
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
