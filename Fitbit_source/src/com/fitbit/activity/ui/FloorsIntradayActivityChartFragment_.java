// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.ui.FitbitChartView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.activity.ui:
//            FloorsIntradayActivityChartFragment

public final class FloorsIntradayActivityChartFragment_ extends FloorsIntradayActivityChartFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public FloorsIntradayActivityChartFragment a()
        {
            FloorsIntradayActivityChartFragment_ floorsintradayactivitychartfragment_ = new FloorsIntradayActivityChartFragment_();
            floorsintradayactivitychartfragment_.setArguments(a);
            return floorsintradayactivitychartfragment_;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    private final c d = new c();
    private View e;

    public FloorsIntradayActivityChartFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        c.a(this);
    }

    public static a e()
    {
        return new a();
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        b = (TextView)a1.findViewById(0x1020004);
        a = (FitbitChartView)a1.findViewById(0x7f110234);
        c = (ProgressBar)a1.findViewById(0x102000d);
        j_();
    }

    public View findViewById(int i)
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(d);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        e = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (e == null)
        {
            e = layoutinflater.inflate(0x7f04016b, viewgroup, false);
        }
        return e;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d.a(this);
    }
}
