// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.data.bl.bv;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.home.ui.g;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.savedstate.b;
import com.fitbit.savedstate.c;
import com.fitbit.ui.AbsChartActivity;
import com.fitbit.ui.ChartViewPager;
import com.fitbit.util.chart.a;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import com.fitbit.util.p;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

// Referenced classes of package com.fitbit.activity.ui:
//            g, IntradayActivityChartFragment, StepsChartFragment, CaloriesBurnedChartFragment, 
//            DistanceChartFragment, MinutesVeryActiveChartFragment, FloorsChartFragment, i

public class FitbitActivityChartActivity extends AbsChartActivity
{
    private static class a
    {

        boolean a;
        com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges b;
        int c;

        private a()
        {
        }

    }


    public static final String a = "date";
    public static final int b = 999;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    private static final String n = "com.fitbit.activity.ui.ChartFragment.FRAGMENT_STEPS";
    private static final String o = "com.fitbit.activity.ui.ChartFragment.FRAGMENT_CALORIES_BURNED";
    private static final String p = "com.fitbit.activity.ui.ChartFragment.FRAGMENT_DISTANCE";
    private static final String q = "com.fitbit.activity.ui.ChartFragment.FRAGMENT_MINUTES_VERY_ACTIVE";
    private static final String r = "com.fitbit.activity.ui.ChartFragment.FRAGMENT_FLOORS";
    private static final String s = "com.fitbit.activity.ui.ChartFragment.FRAGMENT_INTRADAY";
    private Runnable t;
    private i u;
    private ChartViewPager v;
    private com.fitbit.activity.ui.g w;
    private Handler x;
    private g y;
    private a z;

    public FitbitActivityChartActivity()
    {
        t = new Runnable() {

            final FitbitActivityChartActivity a;

            public void run()
            {
                ((IntradayActivityChartFragment)com.fitbit.activity.ui.FitbitActivityChartActivity.b(a).instantiateItem(com.fitbit.activity.ui.FitbitActivityChartActivity.a(a), com.fitbit.activity.ui.FitbitActivityChartActivity.a(a).getCurrentItem())).m();
            }

            
            {
                a = FitbitActivityChartActivity.this;
                super();
            }
        };
        u = new i() {

            final FitbitActivityChartActivity a;

            protected void a(LiveDataPacket livedatapacket)
            {
                double d1 = com.fitbit.util.a.a(com.fitbit.activity.ui.FitbitActivityChartActivity.c(a));
                if (d1 > 0.0D)
                {
                    com.fitbit.activity.ui.FitbitActivityChartActivity.a(a, d1);
                }
            }

            
            {
                a = FitbitActivityChartActivity.this;
                super();
            }
        };
        y = null;
    }

    private Intent a(UUID uuid, com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges ranges)
    {
        switch (h().getSelectedItemPosition())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown item '").append(h().getSelectedItemPosition()).append("'").toString());

        case 0: // '\0'
            return bv.b(this, ranges, false, uuid);

        case 1: // '\001'
            return bv.d(this, ranges, false, uuid);

        case 2: // '\002'
            return bv.c(this, ranges, false, uuid);

        case 3: // '\003'
            return bv.e(this, ranges, false, uuid);

        case 4: // '\004'
            return bv.f(this, ranges, false, uuid);
        }
    }

    static g a(FitbitActivityChartActivity fitbitactivitychartactivity, g g1)
    {
        fitbitactivitychartactivity.y = g1;
        return g1;
    }

    static ChartViewPager a(FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        return fitbitactivitychartactivity.v;
    }

    private void a(double d1)
    {
        TextView textview;
label0:
        {
            textview = l();
            if (textview != null && v.getAdapter().getCount() - 1 == v.getCurrentItem())
            {
                if (d1 != 0.0D)
                {
                    break label0;
                }
                textview.setText("--");
            }
            return;
        }
        if (q() == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY)
        {
            textview.setText(getString(0x7f080363, new Object[] {
                com.fitbit.util.format.e.a(d1, 0, 2)
            }));
            return;
        } else
        {
            textview.setText(getString(0x7f080363, new Object[] {
                com.fitbit.util.format.e.e(d1)
            }));
            return;
        }
    }

    static void a(FitbitActivityChartActivity fitbitactivitychartactivity, double d1)
    {
        fitbitactivitychartactivity.a(d1);
    }

    static com.fitbit.activity.ui.g b(FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        return fitbitactivitychartactivity.w;
    }

    static ActivityType c(FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        return fitbitactivitychartactivity.r();
    }

    static g d(FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        return fitbitactivitychartactivity.y;
    }

    static void e(FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        fitbitactivitychartactivity.n();
    }

    static void f(FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        fitbitactivitychartactivity.n();
    }

    private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType q()
    {
        switch (h().getSelectedItemPosition())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown item '").append(h().getSelectedItemPosition()).append("'").toString());

        case 0: // '\0'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY;

        case 1: // '\001'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY;

        case 2: // '\002'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY;

        case 3: // '\003'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY;

        case 4: // '\004'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY;
        }
    }

    private ActivityType r()
    {
        switch (h().getSelectedItemPosition())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown item '").append(h().getSelectedItemPosition()).append("'").toString());

        case 0: // '\0'
            return ActivityType.a;

        case 1: // '\001'
            return ActivityType.b;

        case 2: // '\002'
            return ActivityType.c;

        case 3: // '\003'
            return ActivityType.d;

        case 4: // '\004'
            return ActivityType.e;
        }
    }

    protected int a(int j, com.fitbit.util.chart.Filter.Type type)
    {
        j = 0x7f0802d5;
        static class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.util.chart.Filter.Type.values().length];
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.t.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.i.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.l.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.o.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.activity.ui._cls5.a[type.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown filterType '").append(type).append("'").toString());

        case 1: // '\001'
            j = 0x7f080362;
            // fall through

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return j;

        case 5: // '\005'
            return 0x7f0802e6;
        }
    }

    protected void a(ArrayAdapter arrayadapter)
    {
        arrayadapter.add(getString(0x7f080038));
        arrayadapter.add(getString(0x7f080035));
        arrayadapter.add(getString(0x7f080036));
        if (!com.fitbit.util.p.l())
        {
            arrayadapter.add(getString(0x7f080034));
        }
        if (com.fitbit.util.p.a(DeviceFeature.FLOORS))
        {
            arrayadapter.add(getString(0x7f080037));
        }
    }

    protected void a(com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges ranges)
    {
        boolean flag;
label0:
        {
            p();
            m = UUID.randomUUID();
            if (o() != com.fitbit.util.chart.Filter.Type.t)
            {
                flag = com.fitbit.util.p.a(DeviceFeature.FLOORS);
                if (z == null || z.b == null || !z.b.equals(ranges) || z.a != flag || z.c != h().getSelectedItemPosition())
                {
                    break label0;
                }
            }
            return;
        }
        z = new a();
        z.a = flag;
        z.b = ranges;
        z.c = h().getSelectedItemPosition();
        y = new g(this, 124) {

            final FitbitActivityChartActivity a;

            public void a()
            {
                if (FitbitActivityChartActivity.d(a) == this)
                {
                    com.fitbit.activity.ui.FitbitActivityChartActivity.a(a, null);
                }
                com.fitbit.activity.ui.FitbitActivityChartActivity.e(a);
            }

            public void a(Exception exception)
            {
                if (FitbitActivityChartActivity.d(a) == this)
                {
                    com.fitbit.activity.ui.FitbitActivityChartActivity.a(a, null);
                }
                FitbitActivityChartActivity.f(a);
            }

            
            {
                a = FitbitActivityChartActivity.this;
                super(fragmentactivity, j);
            }
        };
        y.a(a(m, com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges.e));
    }

    public void a_(int j)
    {
        double d1;
        Object obj;
label0:
        {
            if (this.j.getCheckedRadioButtonId() == 0x7f11007d)
            {
                IntradayActivityChartFragment intradayactivitychartfragment = (IntradayActivityChartFragment)w.instantiateItem(v, v.getCurrentItem());
                obj = new GregorianCalendar();
                ((GregorianCalendar) (obj)).add(5, -(w.getCount() - j - 1));
                i().setVisibility(0);
                i().setText(com.fitbit.util.format.e.s(getApplicationContext(), ((GregorianCalendar) (obj)).getTime()));
                obj = l();
                if (intradayactivitychartfragment != null && obj != null)
                {
                    d1 = intradayactivitychartfragment.n();
                    if (d1 != 0.0D)
                    {
                        break label0;
                    }
                    ((TextView) (obj)).setText("--");
                }
            }
            return;
        }
        if (q() == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY)
        {
            ((TextView) (obj)).setText(getString(0x7f080363, new Object[] {
                com.fitbit.util.format.e.a(d1, 0, 2)
            }));
            return;
        } else
        {
            ((TextView) (obj)).setText(getString(0x7f080363, new Object[] {
                com.fitbit.util.format.e.e(d1)
            }));
            return;
        }
    }

    protected int b(int j, com.fitbit.util.chart.Filter.Type type)
    {
        return type != com.fitbit.util.chart.Filter.Type.o ? 0 : 4;
    }

    protected Date b(int j)
    {
        return com.fitbit.util.chart.a.a(com.fitbit.util.chart.Filter.Type.q, new Date());
    }

    protected void b()
    {
        if (o() == com.fitbit.util.chart.Filter.Type.t)
        {
            j(999);
            v.setVisibility(0);
            if (w.a() != q())
            {
                int j = v.getCurrentItem();
                w = new com.fitbit.activity.ui.g(getSupportFragmentManager());
                w.a(q());
                v.setAdapter(w);
                v.setCurrentItem(j);
            }
            a_(v.getCurrentItem());
            return;
        }
        v.setVisibility(4);
        x.removeCallbacks(t);
        x.post(t);
        if (m() == 999)
        {
            j(h().getSelectedItemPosition());
        }
        super.b();
    }

    protected String c(int j)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown item '").append(j).append("'").toString());

        case 0: // '\0'
            return "com.fitbit.activity.ui.ChartFragment.FRAGMENT_STEPS";

        case 1: // '\001'
            return "com.fitbit.activity.ui.ChartFragment.FRAGMENT_CALORIES_BURNED";

        case 2: // '\002'
            return "com.fitbit.activity.ui.ChartFragment.FRAGMENT_DISTANCE";

        case 3: // '\003'
            return "com.fitbit.activity.ui.ChartFragment.FRAGMENT_MINUTES_VERY_ACTIVE";

        case 4: // '\004'
            return "com.fitbit.activity.ui.ChartFragment.FRAGMENT_FLOORS";

        case 999: 
            return "com.fitbit.activity.ui.ChartFragment.FRAGMENT_INTRADAY";
        }
    }

    public boolean c()
    {
        return y != null && y.l();
    }

    protected void d()
    {
    }

    protected void d(int j)
    {
        com.fitbit.savedstate.b.a(j);
    }

    protected int e()
    {
        return com.fitbit.savedstate.b.h();
    }

    protected void e(int j)
    {
    }

    protected int f()
    {
        return 0;
    }

    protected com.fitbit.util.chart.Filter.Type f(int j)
    {
        switch (j)
        {
        default:
            return com.fitbit.util.chart.Filter.Type.a;

        case 2131820669: 
            return com.fitbit.util.chart.Filter.Type.t;

        case 2131820670: 
            return com.fitbit.util.chart.Filter.Type.c;

        case 2131820671: 
            return com.fitbit.util.chart.Filter.Type.i;

        case 2131820672: 
            return com.fitbit.util.chart.Filter.Type.l;

        case 2131820673: 
            return com.fitbit.util.chart.Filter.Type.o;
        }
    }

    protected int g()
    {
        return 0x7f040001;
    }

    protected Class g(int j)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown item '").append(j).append("'").toString());

        case 0: // '\0'
            return com/fitbit/activity/ui/StepsChartFragment;

        case 1: // '\001'
            return com/fitbit/activity/ui/CaloriesBurnedChartFragment;

        case 2: // '\002'
            return com/fitbit/activity/ui/DistanceChartFragment;

        case 3: // '\003'
            return com/fitbit/activity/ui/MinutesVeryActiveChartFragment;

        case 4: // '\004'
            return com/fitbit/activity/ui/FloorsChartFragment;

        case 999: 
            return android/support/v4/app/Fragment;
        }
    }

    public void k_()
    {
        a_(v.getCurrentItem());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        x = new Handler();
        if (j != null)
        {
            j.findViewById(0x7f11007d).setVisibility(0);
        }
        bundle = (TextView)findViewById(0x7f1100fb);
        if (bundle != null)
        {
            bundle.setText(0x7f0802d5);
        }
        v = (ChartViewPager)findViewById(0x7f110077);
        v.a(true);
        v.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final FitbitActivityChartActivity a;

            public void onPageScrollStateChanged(int j)
            {
                IntradayActivityChartFragment intradayactivitychartfragment = (IntradayActivityChartFragment)com.fitbit.activity.ui.FitbitActivityChartActivity.b(a).instantiateItem(com.fitbit.activity.ui.FitbitActivityChartActivity.a(a), com.fitbit.activity.ui.FitbitActivityChartActivity.a(a).getCurrentItem());
                if (j != 0 && intradayactivitychartfragment != null)
                {
                    intradayactivitychartfragment.m();
                }
            }

            public void onPageScrolled(int j, float f1, int k)
            {
            }

            public void onPageSelected(int j)
            {
                if (com.fitbit.activity.ui.FitbitActivityChartActivity.b(a) != null)
                {
                    (new GregorianCalendar()).add(5, -(com.fitbit.activity.ui.FitbitActivityChartActivity.b(a).getCount() - j - 1));
                }
                a.a_(j);
            }

            
            {
                a = FitbitActivityChartActivity.this;
                super();
            }
        });
        Object obj = (Date)getIntent().getSerializableExtra("date");
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = com.fitbit.savedstate.c.h();
        }
        long l = com.fitbit.util.o.f(bundle, new Date());
        bundle = v;
        obj = new com.fitbit.activity.ui.g(getSupportFragmentManager());
        w = ((com.fitbit.activity.ui.g) (obj));
        bundle.setAdapter(((PagerAdapter) (obj)));
        v.setCurrentItem(364 - (int)l);
    }

    protected void onPause()
    {
        super.onPause();
        u.d();
    }

    protected void onResume()
    {
        super.onResume();
        u.a(new IntentFilter("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED"));
    }
}
