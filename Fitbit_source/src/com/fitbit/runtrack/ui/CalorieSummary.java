// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
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
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.ChartBorderStyle;
import com.artfulbits.aiCharts.Types.n;
import com.artfulbits.aiCharts.Types.x;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.util.bf;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalorieSummary extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static class a extends bf
    {

        private static final String a = "CalorieSummary";
        private final Date b;
        private final Date c;
        private final String d;
        private final ExerciseSession e;

        public List a()
        {
            Object obj1;
            obj1 = Collections.emptyList();
            Object obj = obj1;
            b b1;
            Iterator iterator;
            try
            {
                b1 = new b();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                com.fitbit.e.a.f("CalorieSummary", ((ServerCommunicationException) (obj1)).getMessage(), ((Throwable) (obj1)), new Object[0]);
                return ((List) (obj));
            }
            obj = obj1;
            obj1 = fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY, b, c, d);
            obj = obj1;
            if (e == null) goto _L2; else goto _L1
_L1:
            obj = obj1;
            iterator = ((List) (obj1)).iterator();
_L3:
            obj = obj1;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = obj1;
            if (b1.a(((TimeSeriesObject)iterator.next()).a(), e))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = obj1;
            iterator.remove();
            if (true) goto _L3; else goto _L2
_L2:
            return ((List) (obj1));
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
    private static final String d = "calorie_link";
    private static final String e = "total_calories";
    private static final String f = "session";
    private static final int g = 2;
    private static final double h = 1.1000000000000001D;
    private static final String i = "  ";
    private Date j;
    private Date k;
    private String l;
    private int m;
    private TextView n;
    private ChartView o;
    private View p;
    private View q;
    private TextView r;
    private TextView s;
    private ExerciseSession t;

    public CalorieSummary()
    {
    }

    public static Fragment a(ActivityLogEntry activitylogentry, ExerciseSession exercisesession, ExerciseStat exercisestat)
    {
        Bundle bundle = new Bundle();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(activitylogentry.e());
        bundle.putLong("start_time", calendar.getTimeInMillis());
        calendar.add(13, activitylogentry.a(TimeUnit.SECONDS));
        bundle.putLong("end_time", calendar.getTimeInMillis());
        if (exercisestat != null)
        {
            bundle.putLong("duration", exercisestat.c().a(TimeUnit.MILLISECONDS));
        }
        bundle.putString("calorie_link", activitylogentry.r());
        bundle.putInt("total_calories", activitylogentry.n());
        bundle.putParcelable("session", exercisesession);
        activitylogentry = new CalorieSummary();
        activitylogentry.setArguments(bundle);
        return activitylogentry;
    }

    public void a(Loader loader, List list)
    {
        q.setVisibility(8);
        if (list == null || list.isEmpty())
        {
            n.setVisibility(0);
            return;
        }
        p.setVisibility(0);
        loader = new ChartSeries("calories", x.z);
        double d1 = 4.9406564584124654E-324D;
        for (int i1 = 0; i1 < list.size();)
        {
            double d4 = ((TimeSeriesObject)list.get(i1)).b();
            loader.F().a(i1, new double[] {
                d4
            });
            double d2 = d1;
            if (d4 > d1)
            {
                d2 = d4;
            }
            i1++;
            d1 = d2;
        }

        Object obj = NumberFormat.getIntegerInstance();
        r.setText(((NumberFormat) (obj)).format(m));
        double d3 = Math.round(((double)(k.getTime() - j.getTime()) * 1.0D) / 60000D);
        s.setText(com.fitbit.util.format.e.a((double)m / d3));
        obj = getResources().getDrawable(0x7f020102);
        l l1 = loader.F();
        ((j)l1.get(0)).c(((android.graphics.drawable.Drawable) (obj)));
        ((j)l1.get(l1.size() - 1)).c(((android.graphics.drawable.Drawable) (obj)));
        loader.a(Integer.valueOf(getResources().getColor(0x7f0f0035)));
        loader.c(Integer.valueOf(getResources().getColor(0x7f0f0036)));
        loader.d(Integer.valueOf(getResources().getDimensionPixelOffset(0x7f0a0057)));
        loader.a(n.h, ChartBorderStyle.a);
        obj = new com.artfulbits.aiCharts.Base.a("calorie burn");
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().d(false);
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a(false);
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a().a(0.0D, list.size() - 1);
        com.fitbit.util.chart.a.a(getActivity(), ((com.artfulbits.aiCharts.Base.a) (obj)).e());
        d3 = Math.max(Math.floor(d1 / 2D), 0.5D);
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a().c(Double.valueOf(d3));
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a().a(2);
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a().a(0.0D, d1 * 1.1000000000000001D);
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a(new com.artfulbits.aiCharts.Base.ChartAxis.b() {

            final CalorieSummary a;

            public void a(ChartAxis chartaxis, List list1)
            {
                chartaxis = chartaxis.a();
                list1.clear();
                for (int j1 = 0; j1 <= chartaxis.m(); j1++)
                {
                    double d5 = j1;
                    double d6 = chartaxis.i();
                    list1.add(new com.artfulbits.aiCharts.Base.ChartAxis.a((new StringBuilder()).append(com.fitbit.util.format.e.a(d5 * d6)).append("  ").toString(), (double)j1 * chartaxis.i(), 2));
                }

            }

            
            {
                a = CalorieSummary.this;
                super();
            }
        });
        loader.e(((com.artfulbits.aiCharts.Base.a) (obj)).a());
        o.g().add(obj);
        o.h().add(loader);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new a(getActivity(), j, k, l, t);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f040087, viewgroup, false);
        j = new Date(getArguments().getLong("start_time"));
        k = new Date(getArguments().getLong("end_time"));
        l = getArguments().getString("calorie_link");
        m = getArguments().getInt("total_calories");
        t = (ExerciseSession)getArguments().getParcelable("session");
        q = viewgroup.findViewById(0x7f110102);
        p = viewgroup.findViewById(0x7f110255);
        n = (TextView)viewgroup.findViewById(0x7f110254);
        o = (ChartView)viewgroup.findViewById(0x7f110234);
        r = (TextView)viewgroup.findViewById(0x7f110256);
        s = (TextView)viewgroup.findViewById(0x7f110257);
        layoutinflater = (TextView)viewgroup.findViewById(0x7f110159);
        bundle = (TextView)viewgroup.findViewById(0x7f11015b);
        layoutinflater.setText(DateUtils.formatElapsedTime(0L));
        if (getArguments().containsKey("duration"))
        {
            layoutinflater = DateUtils.formatElapsedTime((new Duration(getArguments().getLong("duration"))).a(TimeUnit.SECONDS));
        } else
        {
            layoutinflater = DateUtils.formatElapsedTime(com.fitbit.util.o.a(j, k, TimeUnit.SECONDS));
        }
        bundle.setText(layoutinflater);
        layoutinflater = (TextView)viewgroup.findViewById(0x7f1104a8);
        layoutinflater.setText(0x7f0802bf);
        layoutinflater.setCompoundDrawablesWithIntrinsicBounds(0x7f020258, 0, 0, 0);
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
