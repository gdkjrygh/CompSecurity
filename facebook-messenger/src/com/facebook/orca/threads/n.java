// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.content.Context;
import android.text.format.DateFormat;
import com.facebook.o;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class n
{

    private final SimpleDateFormat a;
    private final SimpleDateFormat b;
    private final SimpleDateFormat c;
    private final SimpleDateFormat d;
    private final SimpleDateFormat e;
    private final Context f;

    public n(Context context)
    {
        f = context;
        a = new SimpleDateFormat(context.getString(o.thread_date_short_day_of_week));
        b = new SimpleDateFormat(context.getString(o.thread_date_short));
        c = new SimpleDateFormat(context.getString(o.thread_date_full));
        d = new SimpleDateFormat(context.getString(o.message_date_no_year));
        e = new SimpleDateFormat(context.getString(o.message_date_with_year));
    }

    private String[] e(long l)
    {
        String as[] = new String[2];
        long l1 = (System.currentTimeMillis() - l) / 0x5265c00L;
        Date date = new Date(l);
        if (l1 < 180L)
        {
            as[0] = d.format(date);
        } else
        {
            as[0] = e.format(date);
        }
        as[1] = DateFormat.getTimeFormat(f).format(date);
        return as;
    }

    public String a(long l)
    {
        int i = (int)((System.currentTimeMillis() - l) / 1000L / 60L / 60L);
        if (i < 24)
        {
            return DateFormat.getTimeFormat(f).format(Long.valueOf(l));
        }
        Date date = new Date(l);
        i /= 24;
        if (i < 4)
        {
            return a.format(date);
        }
        if (i < 180)
        {
            return b.format(date);
        } else
        {
            return c.format(date);
        }
    }

    public boolean b(long l)
    {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTimeInMillis(l);
        Calendar calendar1 = GregorianCalendar.getInstance();
        return calendar.get(1) == calendar1.get(1) && calendar.get(2) == calendar1.get(2) && calendar.get(5) == calendar1.get(5);
    }

    public String c(long l)
    {
        long l1 = System.currentTimeMillis();
        Date date = new Date(l);
        if (b(l))
        {
            return DateFormat.getTimeFormat(f).format(date);
        }
        int i = (int)((l1 - l) / 1000L / 60L / 60L) / 24;
        if (i < 4)
        {
            return f.getString(o.message_date_time_order, new Object[] {
                a.format(date), DateFormat.getTimeFormat(f).format(date)
            });
        }
        if (i < 180)
        {
            return f.getString(o.message_date_time_order, new Object[] {
                b.format(date), DateFormat.getTimeFormat(f).format(date)
            });
        } else
        {
            return f.getString(o.message_date_time_order, new Object[] {
                c.format(date), DateFormat.getTimeFormat(f).format(date)
            });
        }
    }

    public String d(long l)
    {
        String as[] = e(l);
        StringBuilder stringbuilder = new StringBuilder(100);
        stringbuilder.append(as[0]);
        stringbuilder.append(", ");
        stringbuilder.append(as[1]);
        return stringbuilder.toString();
    }
}
