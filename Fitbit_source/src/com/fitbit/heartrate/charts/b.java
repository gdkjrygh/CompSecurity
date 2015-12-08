// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts;

import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.da;
import com.fitbit.data.bl.fs;
import com.fitbit.data.bl.u;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.util.az;
import java.util.Date;
import java.util.List;

public class b extends az
{
    public static class a
    {

        private HeartRateDailySummary a;
        private List b;

        public HeartRateDailySummary a()
        {
            return a;
        }

        public List b()
        {
            return b;
        }

        public a(HeartRateDailySummary heartratedailysummary, List list)
        {
            a = heartratedailysummary;
            b = list;
        }
    }


    private Date a;
    private Date b;

    public b(Context context, Date date, Date date1)
    {
        super(context, null);
        a = date;
        b = date1;
    }

    protected boolean a(String s)
    {
        return s.equals(u.a().b()) || s.equals(fs.a().c());
    }

    protected void b()
    {
        u.a().a(this);
        fs.a().a(this);
    }

    protected void d()
    {
        u.a().b(this);
        fs.a().b(this);
    }

    public a e()
    {
        return new a(u.a().a(a), fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY, a, b));
    }

    protected Intent f()
    {
        return da.a(getContext(), a);
    }

    public Object f_()
    {
        return e();
    }
}
