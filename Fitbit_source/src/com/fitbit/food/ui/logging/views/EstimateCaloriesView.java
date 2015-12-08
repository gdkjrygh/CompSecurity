// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fitbit.util.bh;
import com.fitbit.util.format.e;

public class EstimateCaloriesView extends LinearLayout
{
    public static interface a
    {

        public abstract void a(EstimateCaloriesView estimatecaloriesview);
    }


    protected View a;
    protected View b;
    protected SeekBar c;
    protected LinearLayout d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected TextView h;
    private double i;
    private double j;
    private double k;
    private double l;
    private a m;

    public EstimateCaloriesView(Context context)
    {
        super(context);
        i = 0.0D;
        j = 0.0D;
        k = 0.0D;
        l = 0.0D;
    }

    public EstimateCaloriesView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = 0.0D;
        j = 0.0D;
        k = 0.0D;
        l = 0.0D;
    }

    public EstimateCaloriesView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = 0.0D;
        j = 0.0D;
        k = 0.0D;
        l = 0.0D;
    }

    static double a(EstimateCaloriesView estimatecaloriesview, double d1)
    {
        estimatecaloriesview.k = d1;
        return d1;
    }

    static a a(EstimateCaloriesView estimatecaloriesview)
    {
        return estimatecaloriesview.m;
    }

    private void a(int i1)
    {
        f.setText(bh.a(getContext(), 0x7f0804d4, new String[] {
            com.fitbit.util.format.e.h(l)
        }));
    }

    static double b(EstimateCaloriesView estimatecaloriesview)
    {
        return estimatecaloriesview.i;
    }

    protected void a()
    {
        c.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

            final EstimateCaloriesView a;

            public void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
            {
                if (flag)
                {
                    EstimateCaloriesView.a(a, (double)i1 / 100D + EstimateCaloriesView.b(a));
                }
            }

            public void onStartTrackingTouch(SeekBar seekbar)
            {
            }

            public void onStopTrackingTouch(SeekBar seekbar)
            {
                if (EstimateCaloriesView.a(a) != null)
                {
                    EstimateCaloriesView.a(a).a(a);
                }
            }

            
            {
                a = EstimateCaloriesView.this;
                super();
            }
        });
    }

    public void a(double d1)
    {
        k = d1;
    }

    public void a(a a1)
    {
        m = a1;
    }

    public a b()
    {
        return m;
    }

    public void b(double d1)
    {
        i = d1;
    }

    public double c()
    {
        return k;
    }

    public void c(double d1)
    {
        j = d1;
    }

    public void d()
    {
        g.setText(com.fitbit.util.format.e.h(i));
        h.setText(com.fitbit.util.format.e.h(j));
        int i1 = (int)((j - i) * 100D);
        if (i1 > 0)
        {
            c.setMax(i1);
        }
        i1 = (int)((k - i) * 100D);
        c.setProgress(i1);
        a((int)((l - i) * 100D));
    }

    public void d(double d1)
    {
        l = d1;
    }

    public double e()
    {
        return l;
    }
}
