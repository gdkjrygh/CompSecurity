// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts.a;

import android.content.Context;
import com.fitbit.util.ap;
import com.fitbit.util.chart.a;

public abstract class c
{

    public c()
    {
    }

    public double a()
    {
        return 2D / (double)c();
    }

    public abstract float a(Context context);

    protected int a(int i)
    {
        return com.fitbit.util.chart.a.a(i);
    }

    public Number a(double d1, double d2)
    {
        return Double.valueOf((double)b(d1, d2) / (double)c());
    }

    public double b()
    {
        return 0.90000000000000002D;
    }

    public double b(Context context)
    {
        return (double)ap.b(a(context));
    }

    public int b(double d1, double d2)
    {
        return a((int)Math.ceil((double)c() * Math.max(Math.max(b() * d1, d2), a())));
    }

    public double c(Context context)
    {
        return (double)ap.b((a(context) + 1.0F) / 2.0F);
    }

    public int c()
    {
        return 1;
    }

    public Number c(double d1, double d2)
    {
        return Double.valueOf((double)d(d1, d2) / (double)c());
    }

    public int d(double d1, double d2)
    {
        return a((int)Math.ceil((double)c() * Math.max(Math.max(b() * d1, 1.2D * d2), a())));
    }
}
