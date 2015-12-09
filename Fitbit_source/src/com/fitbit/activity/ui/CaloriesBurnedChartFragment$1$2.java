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
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.t;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.CaloriesBurned;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.livedata.LiveDataState;
import com.fitbit.multipledevice.a;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.savedstate.l;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.chart.Filter;
import com.fitbit.util.format.PostfixDecimalFormat;
import com.fitbit.util.o;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui:
//            CaloriesBurnedChartFragment, FitbitActivityChartActivity

class a
    implements t
{

    final a a;

    public j a(Object obj, j j1)
    {
        return new j((j)obj);
    }

    public volatile Object a(Object obj, Object obj1)
    {
        return a(obj, (j)obj1);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/fitbit/activity/ui/CaloriesBurnedChartFragment$1

/* anonymous class */
    class CaloriesBurnedChartFragment._cls1
        implements android.support.v4.app.LoaderManager.LoaderCallbacks
    {

        final CaloriesBurnedChartFragment a;

        public void a(Loader loader, AbsActivityChartFragment.a a1)
        {
            AbsActivityChartFragment.a a2 = a.a;
            a.a = null;
            if (!LoadSavedState.d(a.k()))
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
            if (com.fitbit.multipledevice.a.a().j().a())
            {
                Iterator iterator = a1.a.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    j j1 = (j)iterator.next();
                    if (o.i(new Date((long)j1.a())))
                    {
                        LiveDataPacket livedatapacket = l.h();
                        if (livedatapacket != null && livedatapacket.b() != -1)
                        {
                            j1.a(j1.a(), livedatapacket.b());
                        }
                    }
                } while (true);
            }
            a.a = a1;
            com.fitbit.activity.ui.CaloriesBurnedChartFragment.a(a);
            a.a(a1.c);
            Object obj = new PostfixDecimalFormat(a.getString(0x7f0800b9));
            ((DecimalFormat) (obj)).setMaximumFractionDigits(1);
            a.h().a(((java.text.Format) (obj)));
            a.h().p();
            obj = (ChartSeries)a.h().h().a("MAIN_SERIES");
            boolean flag = CaloriesBurnedChartFragment.b(a);
            ((ChartSeries) (obj)).F().clear();
            ((ChartSeries) (obj)).F().a(a1.a, new CaloriesBurnedChartFragment._cls1._cls2(this));
            ChartAxisScale chartaxisscale = ((com.artfulbits.aiCharts.Base.a)a.h().g().get(0)).e().a();
            chartaxisscale.b(Double.valueOf(a1.f));
            if (a1.i || a2 == null || a.s())
            {
                a.h().t();
                chartaxisscale.c(a1.g, a1.h);
            }
            int i = a1.a.size();
            loader = (com.fitbit.weight.ui.a)loader;
            a.b(loader.l().a());
            com.fitbit.util.chart.a.b(a.h(), loader.h(), loader.i(), loader.l().a(), flag, new List[] {
                ((ChartSeries) (obj)).I()
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
            CaloriesBurnedChartFragment.c(a);
        }

        public Loader onCreateLoader(int i, Bundle bundle)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.fibit.data.bl.BROADCAST_CHART_UPDATE");
            intentfilter.addAction("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED");
            intentfilter.addAction("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_STREAM_STARTED");
            intentfilter.addAction("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_STREAM_STOPPED");
            return new CaloriesBurnedChartFragment._cls1._cls1(a.getActivity(), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE"), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE"), Filter.a(a.k()), intentfilter);
        }

        public void onLoadFinished(Loader loader, Object obj)
        {
            a(loader, (AbsActivityChartFragment.a)obj);
        }

        public void onLoaderReset(Loader loader)
        {
        }

            
            {
                a = caloriesburnedchartfragment;
                super();
            }

        // Unreferenced inner class com/fitbit/activity/ui/CaloriesBurnedChartFragment$1$1

/* anonymous class */
        class CaloriesBurnedChartFragment._cls1._cls1 extends com.fitbit.weight.ui.a
        {

            final CaloriesBurnedChartFragment._cls1 a;

            public Object f_()
            {
                return g_();
            }

            public AbsActivityChartFragment.a g_()
            {
                Date date = h();
                Object obj1 = i();
                if (date == null || obj1 == null)
                {
                    return null;
                }
                AbsActivityChartFragment.a a1 = new AbsActivityChartFragment.a();
                fs fs1 = fs.a();
                double d;
                double d3;
                double d7;
                Object obj;
                if (l().a() == com.fitbit.util.chart.Filter.Type.t)
                {
                    obj = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY;
                } else
                {
                    obj = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES;
                }
                obj = fs1.a(((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj)), date, ((Date) (obj1)));
                a1.c = com.fitbit.data.bl.t.a().a(com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL, ((Date) (obj1)));
                d = ValueGoal.a(a1.c);
                d3 = Math.max(5D, 1.6180000000000001D * d);
                d7 = 0.0D;
                obj1 = new ArrayList();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Object obj2 = (CaloriesBurned)((Iterator) (obj)).next();
                    double d1 = ((CaloriesBurned) (obj2)).c().doubleValue();
                    obj2 = new j(((CaloriesBurned) (obj2)).a().getTime(), new double[] {
                        d1
                    });
                    if (d1 > 0.0D)
                    {
                        ((List) (obj1)).add(obj2);
                    }
                } while (true);
                com.fitbit.util.chart.a.a(((List) (obj1)));
                obj = obj1;
                if (l() != null)
                {
                    obj = new com.fitbit.ui.l(a.a.getResources().getColor(0x7f0f004b));
                    obj = l().a(((List) (obj1)), new CaloriesBurnedChartFragment._cls1._cls1._cls1(this, d, ((Drawable) (obj))));
                }
                double d9 = 0.0D;
                double d6 = 0.0D;
                obj1 = com.fitbit.util.chart.a.a(l().a(), i());
                int i = ((List) (obj)).size() - 1;
                d = d3;
                double d5 = 0.0D;
                double d4 = d3;
                while (i >= 0) 
                {
                    j j1 = (j)((List) (obj)).get(i);
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
                    i--;
                    d4 = d2;
                }
                if (a1.c != null)
                {
                    d = d3;
                }
                if (a.a.k() == com.fitbit.util.chart.Filter.Type.t)
                {
                    a1.b = d9;
                } else
                {
                    if (d6 == 0.0D)
                    {
                        d2 = 1.0D;
                    } else
                    {
                        d2 = d6;
                    }
                    a1.b = d9 / d2;
                }
                a1.a = ((List) (obj));
                a1.e = Math.max(0.0D, d5);
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
                        a = CaloriesBurnedChartFragment._cls1.this;
                        super(context, date, date1, filter, intentfilter);
                    }
        }


        // Unreferenced inner class com/fitbit/activity/ui/CaloriesBurnedChartFragment$1$1$1

/* anonymous class */
        class CaloriesBurnedChartFragment._cls1._cls1._cls1
            implements com.fitbit.util.chart.Filter.a
        {

            final double a;
            final Drawable b;
            final CaloriesBurnedChartFragment._cls1._cls1 c;

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
        }

    }

}
