// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TabWidget;
import android.widget.TextView;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;
import java.util.Date;
import java.util.List;

public abstract class ChartActivity extends FitbitActivity
    implements ChartFragment.b, InteractiveChartView.c, InteractiveChartView.d
{

    private static final long a = 100L;
    public static final String b = "startDate";
    public static final String c = "endDate";
    protected Date d;
    protected Date e;
    protected TextView f;
    protected FragmentTabHost g;
    protected TabWidget h;
    private int i;

    public ChartActivity()
    {
    }

    private View a(Context context, int i1)
    {
        context = LayoutInflater.from(context).inflate(0x7f0401ae, null);
        ((TextView)context.findViewById(0x7f110462)).setText(i1);
        return context;
    }

    protected abstract int a();

    protected Bundle a(com.fitbit.util.chart.Filter.Type type)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.fitbit.heartrate.ChartFragment.EXTRA_FILTER_TYPE", type);
        bundle.putSerializable("com.fitbit.heartrate.ChartFragment.EXTRA_START_DATE", j());
        bundle.putSerializable("com.fitbit.heartrate.ChartFragment.EXTRA_END_DATE", k());
        return bundle;
    }

    protected void a(Intent intent)
    {
        d = (Date)intent.getSerializableExtra("startDate");
        e = (Date)intent.getSerializableExtra("endDate");
    }

    protected abstract String b();

    protected abstract void b_(int i1);

    protected abstract List c();

    protected abstract int d();

    protected void e()
    {
        g.setup(this, getSupportFragmentManager(), 0x1020011);
        int ai[] = l();
        List list = c();
        i = d();
        for (int i1 = 0; i1 < list.size() && i1 < ai.length; i1++)
        {
            android.widget.TabHost.TabSpec tabspec = g.newTabSpec(String.valueOf(i1));
            tabspec.setIndicator(a(g.getContext(), ai[i1]));
            ChartFragment.a a1 = (ChartFragment.a)list.get(i1);
            g.addTab(tabspec, a1.a(), a1.b());
            if (i1 == i)
            {
                g.setCurrentTab(i1);
            }
        }

    }

    public void f()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.3F);
        alphaanimation.setDuration(100L);
        alphaanimation.setFillAfter(true);
        h.startAnimation(alphaanimation);
        f.startAnimation(alphaanimation);
    }

    public void g()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.3F, 1.0F);
        alphaanimation.setDuration(100L);
        alphaanimation.setFillAfter(true);
        h.startAnimation(alphaanimation);
        f.startAnimation(alphaanimation);
    }

    protected void h()
    {
        f = (TextView)findViewById(0x7f1100fb);
        h = (TabWidget)findViewById(0x1020013);
        g = (FragmentTabHost)findViewById(0x1020012);
    }

    public void i()
    {
        com.fitbit.e.a.a(b(), "onShrink", new Object[0]);
        finish();
    }

    public Date j()
    {
        return d;
    }

    public Date k()
    {
        return e;
    }

    protected int[] l()
    {
        return (new int[] {
            0x7f08024f, 0x7f080249, 0x7f08024d, 0x7f080250
        });
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(a());
        a(getIntent());
        h();
        e();
    }

    protected void onPause()
    {
        super.onPause();
        b_(g.getCurrentTab());
    }
}
