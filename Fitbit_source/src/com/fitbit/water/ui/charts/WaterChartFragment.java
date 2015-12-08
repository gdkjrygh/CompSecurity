// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui.charts;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.data.domain.r;
import com.fitbit.ui.charts.InteractiveChartView;
import com.fitbit.ui.charts.ScrollableChartFragment;
import com.fitbit.ui.charts.ScrollableInteractiveChartView;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.l;
import com.fitbit.ui.charts.t;
import com.fitbit.util.bt;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import com.fitbit.water.Water;
import com.fitbit.water.ui.b;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.water.ui.charts:
//            WaterScrollableChartView

public class WaterChartFragment extends ScrollableChartFragment
    implements l
{

    public static final String a = "GRAPH_TIMEFRAME";
    private static final double b = 64D;
    private TextView i;
    private TextView j;
    private TextView k;
    private WaterScrollableChartView l;
    private View m;
    private Water n;
    private Timeframe o;

    public WaterChartFragment()
    {
    }

    static Timeframe a(WaterChartFragment waterchartfragment)
    {
        return waterchartfragment.o;
    }

    static Water a(WaterChartFragment waterchartfragment, Water water)
    {
        waterchartfragment.n = water;
        return water;
    }

    static WaterScrollableChartView b(WaterChartFragment waterchartfragment)
    {
        return waterchartfragment.l;
    }

    private void b(com.fitbit.ui.charts.l.a a1)
    {
        Object obj;
        Object obj1;
        Object obj2;
label0:
        {
            long l1 = a1.a().getTime();
            long l2 = a1.b().getTime();
            if (l1 != 0x7fffffffffffffffL && l2 != 0x7fffffffffffffffL)
            {
                obj1 = com.fitbit.util.o.h(new Date(l1));
                obj = new Date(l2);
                a1 = com.fitbit.util.o.e(new Date());
                if (((Date) (obj)).after(a1))
                {
                    obj = a1;
                }
                a1 = Calendar.getInstance();
                a1.setTime(com.fitbit.util.o.d(((Date) (obj1))));
                obj2 = Calendar.getInstance();
                ((Calendar) (obj2)).setTime(com.fitbit.util.o.d(((Date) (obj))));
                if (a1.get(2) != ((Calendar) (obj2)).get(2) || a1.get(1) != ((Calendar) (obj2)).get(1))
                {
                    break label0;
                }
                j.setText(e.d(getActivity(), ((Date) (obj1)), ((Date) (obj))));
            }
            return;
        }
        if (a1.get(1) == ((Calendar) (obj2)).get(1))
        {
            obj1 = e.v(getActivity(), ((Date) (obj1)));
            a1 = e.v(getActivity(), ((Date) (obj)));
        } else
        {
            obj1 = e.g(getActivity(), ((Date) (obj1)));
            a1 = e.g(getActivity(), ((Date) (obj)));
        }
        obj2 = j;
        if (com.fitbit.util.o.j(new Date(), ((Date) (obj))))
        {
            a1 = getActivity().getResources().getText(0x7f080540);
        }
        ((TextView) (obj2)).setText(String.format("%s - %s", new Object[] {
            obj1, a1
        }));
    }

    protected Loader a(Date date, Date date1)
    {
        return new b(getActivity(), date, date1);
    }

    protected void a(View view)
    {
        super.a(view);
        i = (TextView)view.findViewById(0x7f1100fb);
        j = (TextView)view.findViewById(0x7f110287);
        k = (TextView)view.findViewById(0x7f1102ad);
        l = (WaterScrollableChartView)view.findViewById(0x7f1102ae);
        m = view.findViewById(0x7f110084);
    }

    public void a(com.fitbit.ui.charts.l.a a1)
    {
        if (isAdded())
        {
            double d = ((Double)a1.c()).doubleValue();
            i.setText(bt.a(d));
            b(a1);
            d = Math.round(d / (double)(o.a() / 0x5265c00L));
            k.setText(String.format(getString(0x7f080219), new Object[] {
                e.b(d)
            }));
        }
    }

    protected void a(List list)
    {
        if (list.isEmpty())
        {
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.c);
            return;
        } else
        {
            Object obj = r.e();
            obj = n.a(((com.fitbit.data.domain.WaterLogEntry.WaterUnits) (obj)));
            list = t.a(list, o);
            double d = ((Water) (obj)).b();
            l.a(new _cls1(list, d));
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
            return;
        }
    }

    protected ScrollableInteractiveChartView h()
    {
        return l;
    }

    protected Comparator i()
    {
        return bt.a();
    }

    protected InteractiveChartView j()
    {
        return h();
    }

    public void onActivityCreated(Bundle bundle)
    {
    /* block-local class not found */
    class b {}

        getLoaderManager().initLoader(700, null, new b(null));
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        n = new Water(64D, com.fitbit.data.domain.WaterLogEntry.WaterUnits.OZ);
        o = Timeframe.valueOf(getArguments().getString("GRAPH_TIMEFRAME"));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0400a3, viewgroup, false);
    }

    protected void u_()
    {
        super.u_();
        int i1 = getResources().getConfiguration().orientation;
        View view = m;
        if (i1 == 2)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        view.setVisibility(i1);
        l.a(this);
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.a);
    }

    // Unreferenced inner class com/fitbit/water/ui/charts/WaterChartFragment$a
    /* block-local class not found */
    class a {}


    /* member class not found */
    class _cls1 {}

}
