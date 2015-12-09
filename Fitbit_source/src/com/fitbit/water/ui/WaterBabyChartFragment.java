// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.landing.a;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.r;
import com.fitbit.ui.charts.ExtendedChartView;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.t;
import com.fitbit.ui.fragments.LoadingFragment;
import com.fitbit.util.o;
import com.fitbit.water.Water;
import com.fitbit.water.ui.charts.WaterChartActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WaterBabyChartFragment extends LoadingFragment
{

    private static final int e = 7;
    private static Timeframe f;
    protected ActivityType a;
    protected ExtendedChartView b;
    protected View c;
    protected View d;
    private a g;
    private List h;
    private double i;
    private Water j;

    public WaterBabyChartFragment()
    {
    }

    public static WaterBabyChartFragment f()
    {
        return new WaterBabyChartFragment();
    }

    private void h()
    {
        i = j.a(r.e()).b();
        g.a(i);
        g();
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
    }

    protected View a()
    {
        return b;
    }

    public List a(List list)
    {
        java.util.Date date = o.b();
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            WaterLogEntry waterlogentry;
label0:
            {
                if (list.hasNext())
                {
                    waterlogentry = (WaterLogEntry)list.next();
                    if ((int)o.f(waterlogentry.getLogDate(), date) < 7)
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            arraylist.add(waterlogentry);
        } while (true);
    }

    public void a(List list, double d1)
    {
        i = d1;
        j = new Water(d1, r.e());
        h = a(list);
        if (isResumed())
        {
            h();
        }
    }

    protected View d()
    {
        return d;
    }

    protected View e()
    {
        return c;
    }

    public void g()
    {
        if (h == null || h.isEmpty())
        {
            return;
        } else
        {
            t t1 = t.b(h);
            g.a(t1, f, true);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04007f, viewgroup, false);
        c = layoutinflater.findViewById(0x7f110235);
        d = layoutinflater.findViewById(0x7f11006b);
        a = ActivityType.f;
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b = (ExtendedChartView)view.findViewById(0x7f110234);
        b.a(true);
        b.setLayerType(1, null);
        view.findViewById(0x7f110232).setOnClickListener(new android.view.View.OnClickListener() {

            final WaterBabyChartFragment a;

            public void onClick(View view1)
            {
                view1 = WaterChartActivity.a(view1.getContext());
                a.startActivity(view1);
            }

            
            {
                a = WaterBabyChartFragment.this;
                super();
            }
        });
        g = new a(getActivity(), a, b);
        g.a();
    }

    static 
    {
        f = Timeframe.a;
    }
}
