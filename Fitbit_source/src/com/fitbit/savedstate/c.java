// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class c extends a
{

    private static final c b = new c();
    private static final String c = "CURRENT_APP_DATE";

    c()
    {
        super("AppDateSavedState");
    }

    public static void a(Calendar calendar)
    {
        calendar = (Calendar)calendar.clone();
        calendar.clear(14);
        calendar.clear(13);
        calendar.clear(12);
        calendar.clear(11);
        b.c().putLong("CURRENT_APP_DATE", calendar.getTime().getTime()).apply();
    }

    public static void a(Date date)
    {
        com/fitbit/savedstate/c;
        JVM INSTR monitorenter ;
        Date date2 = o.a(new Date(), -14, 6);
        Date date1 = date;
        if (date.before(date2))
        {
            date1 = date2;
        }
        date = Calendar.getInstance();
        date.setTime(date1);
        a(((Calendar) (date)));
        com/fitbit/savedstate/c;
        JVM INSTR monitorexit ;
        return;
        date;
        throw date;
    }

    protected static a g()
    {
        return b;
    }

    public static Date h()
    {
        com/fitbit/savedstate/c;
        JVM INSTR monitorenter ;
        Date date1 = new Date(b.b().getLong("CURRENT_APP_DATE", 0L));
        Date date = date1;
        if (date1.getTime() == 0L)
        {
            date = o.a().getTime();
        }
        com/fitbit/savedstate/c;
        JVM INSTR monitorexit ;
        return date;
        Exception exception;
        exception;
        throw exception;
    }

    public static Calendar i()
    {
        com/fitbit/savedstate/c;
        JVM INSTR monitorenter ;
        Calendar calendar;
        calendar = Calendar.getInstance();
        calendar.setTime(h());
        com/fitbit/savedstate/c;
        JVM INSTR monitorexit ;
        return calendar;
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
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        b.c().remove("CURRENT_APP_DATE").apply();
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
