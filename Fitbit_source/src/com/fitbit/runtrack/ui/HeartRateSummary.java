// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.ChartView;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.heartrate.HeartRateZone;
import com.fitbit.heartrate.charts.a;
import com.fitbit.heartrate.charts.views.HeartRateZonesChartView;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.ui.charts.g;
import com.fitbit.util.ag;
import com.fitbit.util.bf;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HeartRateSummary extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static class a extends bf
    {

        private static final String a = "HeartRateSummaryLoader";
        private final Date b;
        private final Date c;
        private final String d;
        private final ExerciseSession e;

        public List a()
        {
            List list;
            b b1;
            ServerCommunicationException servercommunicationexception;
            try
            {
                b1 = new b();
                list = fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY, b, c, d);
                break MISSING_BLOCK_LABEL_30;
            }
            // Misplaced declaration of an exception variable
            catch (ServerCommunicationException servercommunicationexception)
            {
                list = null;
            }
              goto _L1
            servercommunicationexception;
_L3:
            com.fitbit.e.a.f("HeartRateSummaryLoader", servercommunicationexception.getMessage(), servercommunicationexception, new Object[0]);
            return list;
            if (e != null)
            {
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (!b1.a(((TimeSeriesObject)iterator.next()).a(), e))
                    {
                        iterator.remove();
                    }
                } while (true);
            }
            return list;
_L1:
            if (true) goto _L3; else goto _L2
_L2:
        }

        public Object f_()
        {
            return a();
        }

        public a(Context context, Date date, Date date1, String s1, ExerciseSession exercisesession)
        {
            super(context);
            b = date;
            c = date1;
            d = s1;
            e = exercisesession;
        }
    }


    private static final String a = "start_time";
    private static final String b = "end_time";
    private static final String c = "duration";
    private static final String d = "hr_link";
    private static final String e = "cardio";
    private static final String f = "fat";
    private static final String g = "peak";
    private static final String h = "session";
    private static final String i = "  ";
    private TextView j;
    private ChartView k;
    private HeartRateZonesChartView l;
    private Date m;
    private Date n;
    private String o;
    private int p;
    private int q;
    private int r;
    private View s;
    private View t;
    private TextView u;
    private ImageView v;
    private ExerciseSession w;

    public HeartRateSummary()
    {
    }

    public static Fragment a(ActivityLogEntry activitylogentry, ExerciseSession exercisesession, ExerciseStat exercisestat)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("start_time", activitylogentry.e().getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(activitylogentry.e());
        calendar.add(13, activitylogentry.a(TimeUnit.SECONDS));
        bundle.putLong("end_time", calendar.getTimeInMillis());
        if (exercisestat != null)
        {
            bundle.putLong("duration", exercisestat.c().a(TimeUnit.MILLISECONDS));
        }
        bundle.putString("hr_link", activitylogentry.q());
        bundle.putInt("cardio", activitylogentry.t());
        bundle.putInt("fat", activitylogentry.s());
        bundle.putInt("peak", activitylogentry.u());
        bundle.putParcelable("session", exercisesession);
        activitylogentry = new HeartRateSummary();
        activitylogentry.setArguments(bundle);
        return activitylogentry;
    }

    private q a()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        com.fitbit.ui.charts.g.a a1 = new com.fitbit.ui.charts.g.a();
        a1.c = fragmentactivity.getResources().getColor(0x7f0f00c9);
        a1.d = fragmentactivity.getResources().getColor(0x7f0f00cf);
        a1.a = com.fitbit.heartrate.charts.a.a(m);
        a1.b = com.fitbit.heartrate.charts.a.b(n);
        g g1 = new g();
        g1.a(fragmentactivity.getResources().getDimension(0x7f0a00ee));
        g1.a(false);
        g1.a(a1);
        return g1;
    }

    public void a(Loader loader, List list)
    {
        t.setVisibility(8);
        if (list == null || list.isEmpty())
        {
            j.setVisibility(0);
            return;
        }
        u.setText(Integer.toString(q + r + p));
        s.setVisibility(0);
        loader = new ChartSeries("hr", a());
        Object obj = loader.F();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            ((l) (obj)).a(i1, new double[] {
                ((TimeSeriesObject)list.get(i1)).b()
            });
        }

        obj = new com.artfulbits.aiCharts.Base.a("heart rate");
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a(false);
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a().a(0.0D, list.size() - 1);
        com.fitbit.util.chart.a.a(getActivity(), ((com.artfulbits.aiCharts.Base.a) (obj)).e());
        list = ag.b();
        int j1 = (list.b() + 30) / 2;
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a().a(30D, ag.a());
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a(new com.artfulbits.aiCharts.Base.ChartAxis.b(j1, list) {

            final int a;
            final HeartRateZone b;
            final HeartRateSummary c;

            public void a(ChartAxis chartaxis, List list1)
            {
                list1.clear();
                list1.add(new com.artfulbits.aiCharts.Base.ChartAxis.a("30  ", 30D, 2));
                list1.add(new com.artfulbits.aiCharts.Base.ChartAxis.a((new StringBuilder()).append(a).append("  ").toString(), a, 2));
                list1.add(new com.artfulbits.aiCharts.Base.ChartAxis.a((new StringBuilder()).append(b.b()).append("  ").toString(), b.b(), 2));
            }

            
            {
                c = HeartRateSummary.this;
                a = i1;
                b = heartratezone;
                super();
            }
        });
        loader.e(((com.artfulbits.aiCharts.Base.a) (obj)).a());
        k.g().add(obj);
        k.h().add(loader);
        loader = new ArrayList();
        loader.add(new com.fitbit.heartrate.charts.views.HeartRateZonesChartView.a(getString(0x7f080333), p, 0x7f02024d));
        loader.add(new com.fitbit.heartrate.charts.views.HeartRateZonesChartView.a(getString(0x7f0802c3), q, 0x7f020241));
        loader.add(new com.fitbit.heartrate.charts.views.HeartRateZonesChartView.a(getString(0x7f0802ed), r, 0x7f020249));
        l.a(loader);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new a(getActivity(), m, n, o, w);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0400a8, viewgroup, false);
        m = new Date(getArguments().getLong("start_time"));
        n = new Date(getArguments().getLong("end_time"));
        o = getArguments().getString("hr_link");
        q = getArguments().getInt("cardio");
        r = getArguments().getInt("fat");
        p = getArguments().getInt("peak");
        w = (ExerciseSession)getArguments().getParcelable("session");
        t = viewgroup.findViewById(0x7f110102);
        s = viewgroup.findViewById(0x7f110255);
        j = (TextView)viewgroup.findViewById(0x7f110254);
        k = (ChartView)viewgroup.findViewById(0x7f110234);
        k.setLayerType(1, null);
        l = (HeartRateZonesChartView)viewgroup.findViewById(0x7f11012b);
        u = (TextView)viewgroup.findViewById(0x7f1102b1);
        v = (ImageView)viewgroup.findViewById(0x7f1102b0);
        v.setOnClickListener(new android.view.View.OnClickListener() {

            final HeartRateSummary a;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse(a.getResources().getString(0x7f08024e)));
                a.startActivity(view);
            }

            
            {
                a = HeartRateSummary.this;
                super();
            }
        });
        layoutinflater = (TextView)viewgroup.findViewById(0x7f1104a8);
        layoutinflater.setText(0x7f080244);
        layoutinflater.setCompoundDrawablesWithIntrinsicBounds(0x7f02024f, 0, 0, 0);
        layoutinflater = (TextView)viewgroup.findViewById(0x7f1102b2);
        layoutinflater.setText(0x7f080242);
        layoutinflater.setCompoundDrawablesWithIntrinsicBounds(0x7f020232, 0, 0, 0);
        layoutinflater = (TextView)viewgroup.findViewById(0x7f110159);
        bundle = (TextView)viewgroup.findViewById(0x7f11015b);
        layoutinflater.setText(DateUtils.formatElapsedTime(0L));
        if (getArguments().containsKey("duration"))
        {
            layoutinflater = DateUtils.formatElapsedTime((new Duration(getArguments().getLong("duration"))).a(TimeUnit.SECONDS));
        } else
        {
            layoutinflater = DateUtils.formatElapsedTime(com.fitbit.util.o.a(m, n, TimeUnit.SECONDS));
        }
        bundle.setText(layoutinflater);
        return viewgroup;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getLoaderManager().initLoader(0, bundle, this);
    }
}
