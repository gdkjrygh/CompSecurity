// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.res.Resources;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartCollection;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.ui.g;
import com.fitbit.ui.l;
import com.fitbit.util.ap;
import com.fitbit.util.chart.a;
import com.fitbit.util.format.IntradayChartDateFormat;
import com.fitbit.util.format.StartEndWeekDateFormat;
import com.fitbit.util.format.d;
import com.fitbit.util.format.e;
import com.fitbit.util.y;
import com.fitbit.weight.ui.AbsChartFragment;
import java.util.List;

public abstract class AbsActivityChartFragment extends AbsChartFragment
{
    static class a extends com.fitbit.weight.ui.a.a
    {

        public List a;
        public double b;
        public ValueGoal c;

        public boolean equals(Object obj)
        {
            obj = (a)obj;
            return com.fitbit.util.chart.a.a(a, ((a) (obj)).a);
        }

        a()
        {
        }
    }


    private static y l;
    protected a a;
    protected g b;

    public AbsActivityChartFragment()
    {
    }

    public void a(double d1)
    {
label0:
        {
            k = d1;
            if (f != null && isResumed())
            {
                if (d1 != 1.7976931348623157E+308D)
                {
                    break label0;
                }
                f.setText("--");
            }
            return;
        }
        if (k() == com.fitbit.util.chart.Filter.Type.t)
        {
            f.setText(getString(0x7f080363, new Object[] {
                e.e(d1)
            }));
            return;
        } else
        {
            f.setText(getString(0x7f0802d6, new Object[] {
                e.e(d1)
            }));
            return;
        }
    }

    protected void a(com.artfulbits.aiCharts.Base.e e1, ChartAxis chartaxis)
    {
        if (getActivity() != null)
        {
            long l1 = System.currentTimeMillis();
            e1 = (ChartSeries)e1.c().a("MAIN_SERIES");
            double d1 = chartaxis.a().f();
            double d3 = chartaxis.a().g();
            e1 = e1.I();
            int k = com.fitbit.util.chart.a.d(e1, d1, d3);
            int i1 = com.fitbit.util.chart.a.c(e1, d1, d3);
            if (k != -1 && i1 != -1)
            {
                double d2 = 0.0D;
                for (int i = k; i <= i1; i++)
                {
                    d2 += ((j)e1.get(i)).a(0);
                }

                if (k() != com.fitbit.util.chart.Filter.Type.t)
                {
                    d2 /= (i1 - k) + 1;
                }
                if (this.k != d2)
                {
                    a(Math.round(d2));
                }
            } else
            {
                a(1.7976931348623157E+308D);
            }
            l1 = System.currentTimeMillis() - l1;
            if (l1 > 10L)
            {
                com.fitbit.e.a.a("DEBUG", "onXScaleChanged %s", new Object[] {
                    Long.valueOf(l1)
                });
                return;
            }
        }
    }

    protected void a(ValueGoal valuegoal)
    {
        a(valuegoal, 0);
    }

    protected void a(ValueGoal valuegoal, int i)
    {
        g g1 = b;
        boolean flag;
        if (valuegoal == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1.a(flag);
        b.a(ValueGoal.a(valuegoal));
        b.b(Html.fromHtml(getString(0x7f0802a5, new Object[] {
            e.a(b.d(), 0, i)
        })));
    }

    protected void a(FitbitChartView fitbitchartview)
    {
        fitbitchartview.c(0x7f04012e);
        com.fitbit.util.chart.a.a(fitbitchartview, getActivity());
        ChartSeries chartseries = new ChartSeries("MAIN_SERIES", new com.artfulbits.aiCharts.Types.e());
        chartseries.a(true);
        chartseries.a(new l(getResources().getColor(0x7f0f004a)));
        fitbitchartview.h().add(chartseries);
        ((com.artfulbits.aiCharts.Base.a)fitbitchartview.g().get(0)).d().a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        ((com.artfulbits.aiCharts.Base.a)fitbitchartview.g().get(0)).e().a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        b = com.fitbit.util.chart.a.a(getActivity());
        h().k().add(b);
    }

    public void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        h().setVisibility(byte0);
    }

    protected boolean a()
    {
        if (a != null)
        {
            Object obj = ((com.artfulbits.aiCharts.Base.a)h().g().get(0)).e().a();
            h().t();
            ((ChartAxisScale) (obj)).c(a.g, a.h);
            obj = (ChartSeries)h().h().a("MAIN_SERIES");
            com.fitbit.util.chart.a.b(h(), f(), g(), a.j, true, new List[] {
                ((ChartSeries) (obj)).I()
            });
            return true;
        } else
        {
            return super.a();
        }
    }

    protected boolean a(com.fitbit.util.chart.Filter.Type type)
    {
        return type != com.fitbit.util.chart.Filter.Type.o;
    }

    protected void b(com.fitbit.util.chart.Filter.Type type)
    {
        Object obj = null;
        if (type != com.fitbit.util.chart.Filter.Type.t) goto _L2; else goto _L1
_L1:
        obj = new IntradayChartDateFormat();
_L4:
        h().b(((java.text.Format) (obj)));
        return;
_L2:
        if (type == com.fitbit.util.chart.Filter.Type.l)
        {
            obj = new StartEndWeekDateFormat();
        } else
        if (type == com.fitbit.util.chart.Filter.Type.o)
        {
            obj = d.z(h().getContext());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (l == null)
        {
            l = new y();
        }
        view = h();
        view.a(ap.a(getActivity(), 4F));
        bundle = ((com.artfulbits.aiCharts.Base.a)view.g().get(0)).e();
        bundle.a(true);
        ((com.artfulbits.aiCharts.Base.a)view.g().get(0)).d().a(true);
        bundle.s().setColor(getResources().getColor(0x7f0f004f));
        bundle.s().setPathEffect(new DashPathEffect(new float[] {
            2.0F, 1.0F
        }, 1.0F));
    }
}
