// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartAxis, aa

public static final class <init>
{

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 16;
    public static final int f = 1;
    public static final int g = 18;
    public static final int h = 33;
    public static final int i = 17;
    double j;
    aa k;
    protected boolean l;
    int m;

    public final String a()
    {
        return k.a;
    }

    public final void a(double d1)
    {
        j = d1;
    }

    final void a(double d1, String s, int i1)
    {
        j = d1;
        m = 3;
        k.a = s;
    }

    final void a(float f1, float f2, int i1, ChartAxis chartaxis)
    {
        k.e = i1;
        k.a(f1, f2, chartaxis.r());
    }

    public final void a(int i1)
    {
        k.f = i1;
    }

    final void a(Canvas canvas, ChartAxis chartaxis)
    {
        k.d = ChartAxis.a(chartaxis);
        k.a(canvas, ChartAxis.b(chartaxis));
    }

    public final void a(Paint paint)
    {
        k.c = paint;
    }

    public final void a(Drawable drawable)
    {
        k.b = drawable;
    }

    final void a(ChartAxis chartaxis)
    {
        k.d = ChartAxis.a(chartaxis);
        k.a(ChartAxis.b(chartaxis));
    }

    public final void a(String s)
    {
        k.a = s;
    }

    public final double b()
    {
        return j;
    }

    public final void b(int i1)
    {
        m = i1;
    }

    public final Paint c()
    {
        return k.c;
    }

    public final Drawable d()
    {
        return k.b;
    }

    public final int e()
    {
        return k.f;
    }

    public final int f()
    {
        return m;
    }

    ()
    {
        k = new aa();
        l = true;
        m = 1;
    }

    public m(String s, double d1)
    {
        k = new aa();
        l = true;
        m = 1;
        k.a = s;
        j = d1;
    }

    public j(String s, double d1, int i1)
    {
        k = new aa();
        l = true;
        m = 1;
        k.a = s;
        j = d1;
        m = i1;
    }

    public m(String s, Calendar calendar)
    {
        this(s, calendar.getTimeInMillis());
    }

    public <init>(String s, Date date)
    {
        this(s, date.getTime());
    }
}
