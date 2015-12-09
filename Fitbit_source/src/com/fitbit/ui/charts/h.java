// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import android.graphics.Paint;
import android.text.format.DateFormat;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.fitbit.util.ap;
import com.fitbit.util.o;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            c

public class h
    implements com.artfulbits.aiCharts.Base.ChartAxis.b
{

    private static final float a = ap.b(2.2F);
    private static final float b = ap.b(1.5F);
    private static final float c = ap.b(15F);
    private static final String d = " ";
    private final Context e;
    private final Date f;
    private final Paint g;
    private final boolean h;

    public h(Context context, Date date, Paint paint)
    {
        this(context, date, paint, false);
    }

    public h(Context context, Date date, Paint paint, boolean flag)
    {
        e = context;
        f = date;
        g = paint;
        h = flag;
    }

    protected String a()
    {
        Context context = e;
        int i;
        if (DateFormat.is24HourFormat(e))
        {
            i = 0x7f0805f5;
        } else
        {
            i = 0x7f0805f4;
        }
        return context.getString(i).toUpperCase();
    }

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        double d1 = o.a(f).getTime();
        double d2 = o.e(f).getTime();
        double d3 = (d2 - d1) / 2D + d1;
        chartaxis = a();
        com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(chartaxis, d1);
        a1.a(new Paint(g));
        a1.c().setTextAlign(android.graphics.Paint.Align.LEFT);
        list.add(a1);
        String s = c();
        com.artfulbits.aiCharts.Base.ChartAxis.a a2 = new com.artfulbits.aiCharts.Base.ChartAxis.a(s, d3);
        a2.a(new Paint(g));
        a2.c().setTextAlign(android.graphics.Paint.Align.CENTER);
        list.add(a2);
        String s1 = b();
        com.artfulbits.aiCharts.Base.ChartAxis.a a3 = new com.artfulbits.aiCharts.Base.ChartAxis.a(s1, d2);
        a3.a(new Paint(g));
        a3.c().setTextAlign(android.graphics.Paint.Align.RIGHT);
        list.add(a3);
        if (h)
        {
            float f1 = g.measureText(chartaxis);
            a1.a(new c(a, g.getColor(), f1 / 2.0F - a, c));
            f1 = g.measureText(s);
            a2.a(new c(a, g.getColor(), f1 / 2.0F, c));
            f1 = g.measureText(s1);
            a3.a(new c(a, g.getColor(), f1 / 2.0F + a, c));
            f1 = g.measureText(" ");
            chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a(" ", d1 + (d3 - d1) / 2D);
            chartaxis.a(new Paint(g));
            chartaxis.c().setTextAlign(android.graphics.Paint.Align.CENTER);
            chartaxis.a(new c(b, g.getColor(), f1 / 2.0F, c));
            list.add(chartaxis);
            chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a(" ", (d2 - d3) / 2D + d3);
            chartaxis.a(new Paint(g));
            chartaxis.c().setTextAlign(android.graphics.Paint.Align.CENTER);
            chartaxis.a(new c(b, g.getColor(), f1 / 2.0F, c));
            list.add(chartaxis);
        }
    }

    protected String b()
    {
        Context context = e;
        int i;
        if (DateFormat.is24HourFormat(e))
        {
            i = 0x7f0805f1;
        } else
        {
            i = 0x7f0805f0;
        }
        return context.getString(i).toUpperCase();
    }

    protected String c()
    {
        Context context = e;
        int i;
        if (DateFormat.is24HourFormat(e))
        {
            i = 0x7f0805f3;
        } else
        {
            i = 0x7f0805f2;
        }
        return context.getString(i).toUpperCase();
    }

}
