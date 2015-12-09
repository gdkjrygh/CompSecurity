// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class ActivityLoggingState extends a
{
    public static final class LoggingType extends Enum
    {

        public static final LoggingType a;
        public static final LoggingType b;
        private static final LoggingType c[];

        public static LoggingType valueOf(String s)
        {
            return (LoggingType)Enum.valueOf(com/fitbit/savedstate/ActivityLoggingState$LoggingType, s);
        }

        public static LoggingType[] values()
        {
            return (LoggingType[])c.clone();
        }

        static 
        {
            a = new LoggingType("Manual", 0);
            b = new LoggingType("LocationTracked", 1);
            c = (new LoggingType[] {
                a, b
            });
        }

        private LoggingType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String b = "LAST_LOGGED_TYPE";
    private static final ActivityLoggingState c = new ActivityLoggingState();

    public ActivityLoggingState()
    {
        super("ActivityLoggingState");
    }

    public static void a(LoggingType loggingtype)
    {
        c.c().putInt("LAST_LOGGED_TYPE", loggingtype.ordinal()).apply();
    }

    public static LoggingType g()
    {
        return LoggingType.values()[c.b().getInt("LAST_LOGGED_TYPE", LoggingType.b.ordinal())];
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
