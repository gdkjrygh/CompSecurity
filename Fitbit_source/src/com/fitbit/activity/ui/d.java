// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Context;
import android.content.Intent;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.charts.b;
import com.fitbit.data.bl.fd;
import com.fitbit.data.bl.fs;
import com.fitbit.util.a;
import com.fitbit.util.bi;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class d extends bi
{

    private final ActivityType a;
    private final Date b;
    private final Date c;
    private final boolean d;
    private boolean e;

    public d(Context context, ActivityType activitytype, Date date, Date date1, boolean flag)
    {
        super(context, fd.d());
        e = false;
        a = activitytype;
        b = date;
        c = date1;
        d = flag;
    }

    protected List a(Date date, Date date1)
    {
        fs fs1 = fs.a();
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = a.a();
        if (d)
        {
            date1 = new Date();
        }
        date = fs1.a(timeseriesresourcetype, date, date1);
        com.fitbit.util.a.a(a, date);
        return date;
    }

    protected Intent[] a()
    {
        java.util.GregorianCalendar gregoriancalendar = o.c();
        gregoriancalendar.setTime(c);
        o.c(gregoriancalendar);
        ArrayList arraylist = new ArrayList();
        Date date = gregoriancalendar.getTime();
        Date date1;
        do
        {
            o.g(gregoriancalendar);
            date1 = gregoriancalendar.getTime();
            arraylist.add(fd.a(getContext(), false, a.a(), date1, date));
            gregoriancalendar.add(2, -1);
            o.f(gregoriancalendar);
            date = gregoriancalendar.getTime();
        } while (b.getTime() < date1.getTime());
        return (Intent[])arraylist.toArray(new Intent[0]);
    }

    public b b()
    {
        b b1 = new b();
        b1.a(e);
        b1.a(a(b, c));
        b1.a(Double.valueOf(com.fitbit.util.a.a(a.c())));
        e = true;
        return b1;
    }

    public Object f_()
    {
        return b();
    }
}
