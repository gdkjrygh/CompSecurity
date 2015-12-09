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
import com.fitbit.data.bl.fs;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.Floors;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.livedata.LiveDataState;
import com.fitbit.multipledevice.a;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.savedstate.l;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.chart.Filter;
import com.fitbit.util.format.PostfixDecimalSinglePluralFormat;
import com.fitbit.util.o;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui:
//            FloorsChartFragment, FitbitActivityChartActivity

class a
    implements android.support.v4.app.llbacks
{

    final FloorsChartFragment a;

    public void a(Loader loader, nt.a a1)
    {
        nt.a a2 = a.a;
        a.a = null;
        if (!LoadSavedState.e(a.k()))
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
                    if (livedatapacket != null && livedatapacket.c() != -1D)
                    {
                        j1.a(j1.a(), livedatapacket.c());
                    }
                }
            } while (true);
        }
        a.a = a1;
        com.fitbit.activity.ui.FloorsChartFragment.a(a);
        a.a(a1.c);
        Object obj = new PostfixDecimalSinglePluralFormat(0x7f0b0001);
        ((DecimalFormat) (obj)).setMaximumFractionDigits(1);
        a.h().a(((java.text.Format) (obj)));
        a.h().p();
        obj = (ChartSeries)a.h().h().a("MAIN_SERIES");
        boolean flag = FloorsChartFragment.b(a);
        ((ChartSeries) (obj)).F().clear();
        ((ChartSeries) (obj)).F().a(a1.a, new com.artfulbits.aiCharts.Base.t() {

            final FloorsChartFragment._cls1 a;

            public j a(Object obj1, j j2)
            {
                return new j((j)obj1);
            }

            public volatile Object a(Object obj1, Object obj2)
            {
                return a(obj1, (j)obj2);
            }

            
            {
                a = FloorsChartFragment._cls1.this;
                super();
            }
        });
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
        FloorsChartFragment.c(a);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fibit.data.bl.BROADCAST_CHART_UPDATE");
        intentfilter.addAction("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED");
        intentfilter.addAction("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_STREAM_STARTED");
        intentfilter.addAction("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_STREAM_STOPPED");
        return new com.fitbit.weight.ui.a(a.getActivity(), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE"), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE"), Filter.a(a.k()), intentfilter) {

            final FloorsChartFragment._cls1 a;

            public Object f_()
            {
                return q_();
            }

            public AbsActivityChartFragment.a q_()
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
                double d2;
                double d7;
                Object obj;
                if (l().a() == com.fitbit.util.chart.Filter.Type.t)
                {
                    obj = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY;
                } else
                {
                    obj = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS;
                }
                obj = fs1.a(((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj)), date, ((Date) (obj1)));
                a1.c = t.a().a(com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL, ((Date) (obj1)));
                d = ValueGoal.a(a1.c);
                d2 = Math.max(5D, 1.6180000000000001D * d);
                d7 = 0.0D;
                obj1 = new ArrayList();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Object obj2 = (Floors)((Iterator) (obj)).next();
                    double d3 = ((Floors) (obj2)).c().doubleValue();
                    obj2 = new j(((Floors) (obj2)).a().getTime(), new double[] {
                        d3
                    });
                    if (d3 > 0.0D)
                    {
                        ((List) (obj1)).add(obj2);
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
                double d5 = 0.0D;
                double d4 = d2;
                while (k >= 0) 
                {
                    j j1 = (j)((List) (obj)).get(k);
                    double d1 = j1.a(0);
                    if (j1.a() >= (double)((Date) (obj1)).getTime())
                    {
                        double d8 = d7;
                        if (d1 < d7)
                        {
                            d8 = d1;
                        }
                        d7 = d2;
                        if (d1 > d2)
                        {
                            d7 = d1;
                        }
                        d6++;
                        d9 += d1;
                        d2 = d7;
                        d7 = d8;
                    }
                    if (d1 < d5)
                    {
                        d5 = d1;
                    }
                    boolean flag;
                    if (d1 <= d4)
                    {
                        d1 = d4;
                    }
                    k--;
                    d4 = d1;
                }
                if (a1.c != null);
                if (a.a.k() == com.fitbit.util.chart.Filter.Type.t)
                {
                    a1.b = d9;
                } else
                {
                    if (d6 == 0.0D)
                    {
                        d1 = 1.0D;
                    } else
                    {
                        d1 = d6;
                    }
                    a1.b = d9 / d1;
                }
                a1.a = ((List) (obj));
                a1.e = Math.max(-0.001D, d5);
                a1.f = d4;
                a1.h = d2;
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
                a = FloorsChartFragment._cls1.this;
                super(context, date, date1, filter, intentfilter);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (nt.a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    _cls2.a(FloorsChartFragment floorschartfragment)
    {
        a = floorschartfragment;
        super();
    }
}
