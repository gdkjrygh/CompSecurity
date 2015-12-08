// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.fitbit.data.bl.fs;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.MinutesVeryActive;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.chart.Filter;
import com.fitbit.util.format.FitbitTimeFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui:
//            MinutesVeryActiveChartFragment, FitbitActivityChartActivity

class a
    implements android.support.v4.app.a
{

    final MinutesVeryActiveChartFragment a;

    public void a(Loader loader, a a1)
    {
        a a2 = a.a;
        a.a = null;
        if (!LoadSavedState.c(a.k()))
        {
            a.b(true);
            return;
        }
        if (a1 == null)
        {
            a.a(true);
            return;
        }
        if (a1.a.size() == 0 && ((FitbitActivityChartActivity)a.getActivity()).c())
        {
            a.b(true);
            return;
        }
        a.a = a1;
        com.fitbit.activity.ui.MinutesVeryActiveChartFragment.a(a);
        a.a(a1.a);
        a.a(a1.a);
        a.h().a(new FitbitTimeFormat());
        a.h().p();
        ChartSeries chartseries = (ChartSeries)a.h().h().a("MAIN_SERIES");
        boolean flag = MinutesVeryActiveChartFragment.b(a);
        chartseries.F().clear();
        chartseries.F().a(a1.a, new com.artfulbits.aiCharts.Base.t() {

            final MinutesVeryActiveChartFragment._cls1 a;

            public j a(Object obj, j j1)
            {
                return new j((j)obj);
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a(obj, (j)obj1);
            }

            
            {
                a = MinutesVeryActiveChartFragment._cls1.this;
                super();
            }
        });
        ChartAxisScale chartaxisscale = ((a)a.h().g().get(0)).e().a();
        chartaxisscale.b(Double.valueOf(a1.a));
        if (a1.a || a2 == null || a.s())
        {
            a.h().t();
            chartaxisscale.c(a1.a, a1.a);
        }
        int i = a1.a.size();
        loader = (com.fitbit.weight.ui.a)loader;
        a.b(loader.l().a());
        com.fitbit.util.chart.a.b(a.h(), loader.h(), loader.i(), loader.l().a(), flag, new List[] {
            chartseries.I()
        });
        a.h().q();
        a.h().a(5D);
        a.b(false);
        loader = a;
        if (i <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        loader.a(flag);
        MinutesVeryActiveChartFragment.c(a);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new com.fitbit.weight.ui.a(a.getActivity(), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE"), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE"), Filter.a(a.k()), new IntentFilter("com.fibit.data.bl.BROADCAST_CHART_UPDATE")) {

            final MinutesVeryActiveChartFragment._cls1 a;

            public Object f_()
            {
                return r_();
            }

            public AbsActivityChartFragment.a r_()
            {
                Object obj1 = h();
                Object obj = i();
                if (obj1 == null || obj == null)
                {
                    return null;
                }
                AbsActivityChartFragment.a a1 = new AbsActivityChartFragment.a();
                List list = fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE, ((Date) (obj1)), ((Date) (obj)));
                a1.c = t.a().a(com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL, ((Date) (obj)));
                double d = ValueGoal.a(a1.c);
                double d3 = Math.max(5D, 1.6180000000000001D * d);
                double d7 = 0.0D;
                obj1 = new ArrayList();
                obj = list.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    MinutesVeryActive minutesveryactive = (MinutesVeryActive)((Iterator) (obj)).next();
                    double d1 = minutesveryactive.b();
                    if (Double.compare(d1, 1.0D) >= 0)
                    {
                        ((List) (obj1)).add(new j(minutesveryactive.a().getTime(), new double[] {
                            d1
                        }));
                    }
                } while (true);
                com.fitbit.util.chart.a.a(((List) (obj1)));
                obj = obj1;
                if (l() != null)
                {
                    obj = new com.fitbit.ui.l(a.a.getResources().getColor(0x7f0f004b));
                    obj = l().a(((List) (obj1)), new com.fitbit.util.chart.Filter.a(this, d, ((Drawable) (obj))) {

                        final double a;
                        final Drawable b;
                        final _cls1 c;

                        public void a(j j1)
                        {
                            if (a > j1.a(0))
                            {
                                j1.a(b);
                            }
                        }

                        public void a(List list)
                        {
                        }

            
            {
                c = _pcls1;
                a = d;
                b = drawable;
                super();
            }
                    });
                }
                double d9 = 0.0D;
                double d6 = 0.0D;
                obj1 = com.fitbit.util.chart.a.a(l().a(), i());
                int k = ((List) (obj)).size() - 1;
                d = d3;
                double d5 = 0.0D;
                double d4 = d3;
                while (k >= 0) 
                {
                    j j1 = (j)((List) (obj)).get(k);
                    double d2 = j1.a(0);
                    if (j1.a() >= (double)((Date) (obj1)).getTime())
                    {
                        double d8 = d7;
                        if (d2 < d7)
                        {
                            d8 = d2;
                        }
                        d7 = d;
                        if (d2 > d)
                        {
                            d7 = d2;
                        }
                        d6++;
                        d9 += d2;
                        d = d7;
                        d7 = d8;
                    }
                    if (d2 < d5)
                    {
                        d5 = d2;
                    }
                    boolean flag;
                    if (d2 <= d4)
                    {
                        d2 = d4;
                    }
                    k--;
                    d4 = d2;
                }
                if (a1.c != null)
                {
                    d = d3;
                }
                if (d6 == 0.0D)
                {
                    d2 = 1.0D;
                } else
                {
                    d2 = d6;
                }
                a1.b = d9 / d2;
                a1.a = ((List) (obj));
                a1.e = Math.max(-0.001D, d5);
                a1.f = d4;
                a1.h = d;
                a1.g = 0.0D;
                if (c == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a1.i = flag;
                return a1;
            }

            
            {
                a = MinutesVeryActiveChartFragment._cls1.this;
                super(context, date, date1, filter, intentfilter);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    _cls2.a(MinutesVeryActiveChartFragment minutesveryactivechartfragment)
    {
        a = minutesveryactivechartfragment;
        super();
    }
}
