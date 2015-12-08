// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Base.j;
import com.fitbit.util.bj;
import com.fitbit.util.chart.Filter;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b extends bj
{
    public static class a
    {

        public List a;
        public List b;
        public LinkedHashMap c;
        public double d;
        public double e;
        public double f;

        public a()
        {
        }
    }


    private Date a;
    private Date b;

    public b(Context context, Date date, Date date1)
    {
        this(context, date, date1, null);
    }

    public b(Context context, Date date, Date date1, IntentFilter intentfilter)
    {
        super(context, intentfilter);
        a = date;
        b = date1;
    }

    protected Drawable a(j j)
    {
        return null;
    }

    protected com.fitbit.util.chart.Filter.Type c()
    {
        return com.fitbit.util.chart.Filter.Type.e;
    }

    public abstract a d();

    protected Intent f()
    {
        return null;
    }

    public Object f_()
    {
        return m();
    }

    public Date h()
    {
        return a;
    }

    public Date i()
    {
        return b;
    }

    public a m()
    {
        a a1 = d();
        AtomicReference atomicreference = new AtomicReference(Double.valueOf(1.7976931348623157E+308D));
        AtomicReference atomicreference1 = new AtomicReference(Double.valueOf(4.9406564584124654E-324D));
        AtomicReference atomicreference2 = new AtomicReference(Double.valueOf(0.0D));
        a1.a = Filter.a(c()).a(a1.a, new _cls1(atomicreference1, atomicreference, atomicreference2));
        if (((Double)atomicreference1.get()).doubleValue() != 4.9406564584124654E-324D)
        {
            a1.d = ((Double)atomicreference1.get()).doubleValue();
        }
        if (((Double)atomicreference.get()).doubleValue() != 1.7976931348623157E+308D)
        {
            a1.e = ((Double)atomicreference.get()).doubleValue();
        }
        a1.f = ((Double)atomicreference2.get()).doubleValue();
        return a1;
    }

    /* member class not found */
    class _cls1 {}

}
