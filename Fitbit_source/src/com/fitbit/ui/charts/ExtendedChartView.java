// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.artfulbits.aiCharts.ChartView;

public class ExtendedChartView extends ChartView
{
    public static interface a
    {

        public abstract void a(boolean flag, int i, int j, int k, int l);
    }


    a e;

    public ExtendedChartView(Context context)
    {
        super(context);
    }

    public ExtendedChartView(Context context, int i)
    {
        super(context, i);
    }

    public ExtendedChartView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ExtendedChartView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void a(a a1)
    {
        e = a1;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (e != null)
        {
            e.a(flag, i, j, k, l);
        }
        super.onLayout(flag, i, j, k, l);
    }
}
