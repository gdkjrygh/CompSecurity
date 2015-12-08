// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.ChartBorderStyle;
import com.artfulbits.aiCharts.Types.n;
import com.artfulbits.aiCharts.Types.x;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.util.format.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack.ui:
//            l

public class SpeedSummary extends Fragment
{

    private static final String a = "events";
    private static final String b = "duration";
    private static final String c = "stats";
    private static final int d = 2;
    private static final double e = 1.1000000000000001D;
    private static final String f = "  ";
    private List g;
    private Duration h;
    private ExerciseStat i;
    private ChartView j;

    public SpeedSummary()
    {
    }

    private double a(com.fitbit.data.domain.Length.LengthUnits lengthunits, double d1)
    {
        return (new Length(d1, com.fitbit.data.domain.Length.LengthUnits.KM)).a(lengthunits).b();
    }

    public static Fragment a(List list, ExerciseStat exercisestat)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("events", new ArrayList(list));
        bundle.putLong("duration", exercisestat.c().a(TimeUnit.MILLISECONDS));
        bundle.putParcelable("stats", exercisestat);
        list = new SpeedSummary();
        list.setArguments(bundle);
        return list;
    }

    private void a()
    {
        Object obj = an.a().b();
        ChartSeries chartseries = new ChartSeries("speed", x.z);
        double d1 = 4.9406564584124654E-324D;
        for (int k = 0; k < g.size();)
        {
            ExerciseEvent exerciseevent = (ExerciseEvent)g.get(k);
            double d4 = a(((Profile) (obj)).t(), exerciseevent.location.getSpeed());
            chartseries.F().a(k, new double[] {
                d4
            });
            double d2 = d1;
            if (d4 > d1)
            {
                d2 = d4;
            }
            k++;
            d1 = d2;
        }

        chartseries.a(Integer.valueOf(getResources().getColor(0x7f0f0153)));
        chartseries.c(Integer.valueOf(getResources().getColor(0x7f0f0154)));
        chartseries.d(Integer.valueOf(getResources().getDimensionPixelOffset(0x7f0a0057)));
        chartseries.a(n.h, ChartBorderStyle.a);
        obj = new a("speed graph");
        ((a) (obj)).d().d(false);
        ((a) (obj)).d().a(false);
        ((a) (obj)).d().a().a(0.0D, g.size() - 1);
        com.fitbit.util.chart.a.a(getActivity(), ((a) (obj)).e());
        double d3 = Math.max(Math.floor(d1 / 2D), 0.5D);
        ((a) (obj)).e().a().c(Double.valueOf(d3));
        ((a) (obj)).e().a().a(2);
        ((a) (obj)).e().a().a(0.0D, 1.1000000000000001D * d1);
        ((a) (obj)).e().a(new com.artfulbits.aiCharts.Base.ChartAxis.b() {

            final SpeedSummary a;

            public void a(ChartAxis chartaxis, List list)
            {
                chartaxis = chartaxis.a();
                list.clear();
                for (int i1 = 0; i1 <= chartaxis.m(); i1++)
                {
                    double d5 = i1;
                    double d6 = chartaxis.i();
                    list.add(new com.artfulbits.aiCharts.Base.ChartAxis.a((new StringBuilder()).append(com.fitbit.util.format.e.a(d5 * d6)).append("  ").toString(), (double)i1 * chartaxis.i(), 2));
                }

            }

            
            {
                a = SpeedSummary.this;
                super();
            }
        });
        chartseries.e(((a) (obj)).a());
        j.g().add(obj);
        j.h().add(chartseries);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        g = getArguments().getParcelableArrayList("events");
        h = new Duration(getArguments().getLong("duration"));
        i = (ExerciseStat)getArguments().getParcelable("stats");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400cc, viewgroup, false);
        j = (ChartView)layoutinflater.findViewById(0x7f110234);
        viewgroup = new com.fitbit.runtrack.ui.l(an.a().b());
        ((TextView)layoutinflater.findViewById(0x7f110313)).setText(viewgroup.b(getActivity(), i));
        viewgroup = (TextView)layoutinflater.findViewById(0x7f110159);
        bundle = (TextView)layoutinflater.findViewById(0x7f11015b);
        viewgroup.setText(DateUtils.formatElapsedTime(0L));
        bundle.setText(DateUtils.formatElapsedTime(h.a(TimeUnit.SECONDS)));
        viewgroup = (TextView)layoutinflater.findViewById(0x7f1104a8);
        viewgroup.setText(0x7f0804e4);
        viewgroup.setCompoundDrawablesWithIntrinsicBounds(0x7f020360, 0, 0, 0);
        a();
        return layoutinflater;
    }
}
