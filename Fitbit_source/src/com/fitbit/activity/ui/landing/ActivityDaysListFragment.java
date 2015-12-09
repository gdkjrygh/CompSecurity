// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.fitbit.FitBitApplication;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.details.ActivityDetailsActivity;
import com.fitbit.activity.ui.i;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.savedstate.l;
import com.fitbit.ui.charts.OnboardingCellView;
import com.fitbit.ui.endless.DaysListFragment;
import com.fitbit.ui.endless.a;
import com.fitbit.ui.endless.b;
import com.fitbit.util.bi;
import com.fitbit.util.o;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            ActivityDaysListFragment_, BabyChartFragment, b

public class ActivityDaysListFragment extends DaysListFragment
{

    public static final String a = "com.fitbit.activity.ui.landing.ActivityDaysListFragment.HEADER_FRAGMENT_TAG";
    private static final String c = "Details Screen - %s";
    protected ActivityType b;
    private i h;
    private double i;

    public ActivityDaysListFragment()
    {
        h = new i() {

            final ActivityDaysListFragment a;

            protected void a(LiveDataPacket livedatapacket)
            {
                com.fitbit.activity.ui.landing.ActivityDaysListFragment.a(a, livedatapacket);
            }

            
            {
                a = ActivityDaysListFragment.this;
                super();
            }
        };
    }

    public static ActivityDaysListFragment a(ActivityType activitytype)
    {
        return ActivityDaysListFragment_.c().a(activitytype).a();
    }

    private void a(double d1)
    {
        Object obj = getChildFragmentManager();
        if (obj != null)
        {
            obj = ((FragmentManager) (obj)).findFragmentByTag("com.fitbit.activity.ui.landing.ActivityDaysListFragment.HEADER_FRAGMENT_TAG");
            if (obj instanceof BabyChartFragment)
            {
                ((BabyChartFragment)obj).a(d1);
            }
        }
    }

    static void a(ActivityDaysListFragment activitydayslistfragment, LiveDataPacket livedatapacket)
    {
        activitydayslistfragment.a(livedatapacket);
    }

    private void a(LiveDataPacket livedatapacket)
    {
        if (livedatapacket == null) goto _L2; else goto _L1
_L1:
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[ActivityType.values().length];
                try
                {
                    a[ActivityType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[ActivityType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ActivityType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ActivityType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ActivityType.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.activity.ui.landing._cls2.a[b.ordinal()];
        JVM INSTR tableswitch 1 5: default 48
    //                   1 101
    //                   2 49
    //                   3 82
    //                   4 48
    //                   5 93;
           goto _L2 _L3 _L4 _L5 _L2 _L6
_L2:
        return;
_L4:
        double d1 = livedatapacket.b();
_L8:
        if (g instanceof a)
        {
            ((com.fitbit.activity.ui.landing.b)g).a(d1);
        }
        a(d1);
        return;
_L5:
        d1 = com.fitbit.util.a.a(livedatapacket.d());
        continue; /* Loop/switch isn't completed */
_L6:
        d1 = livedatapacket.c();
        continue; /* Loop/switch isn't completed */
_L3:
        d1 = livedatapacket.a();
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String c()
    {
        switch (com.fitbit.activity.ui.landing._cls2.a[b.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "STEPS";

        case 2: // '\002'
            return "CALORIES";

        case 3: // '\003'
            return "DISTANCE";

        case 4: // '\004'
            return "ACTIVE_MINUTES";

        case 5: // '\005'
            return "FLOORS";
        }
    }

    private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType d()
    {
        return b.a();
    }

    protected a a()
    {
        return new com.fitbit.activity.ui.landing.b(getActivity(), b, i);
    }

    protected b a(int j, int k)
    {
        Object obj = (TimeSeriesObject)m();
        Date date;
        if (obj == null)
        {
            date = o.f(o.b());
            obj = new Date(date.getTime() - (long)k * 0x5265c00L);
        } else
        {
            date = new Date(((TimeSeriesObject) (obj)).a().getTime() - 0x5265c00L);
            obj = new Date(date.getTime() - (long)k * 0x5265c00L);
        }
        return new com.fitbit.heartrate.a(getActivity(), d(), ((Date) (obj)), date);
    }

    protected List a(List list)
    {
        if (ActivityType.c.equals(b) && list != null)
        {
            com.fitbit.util.a.a(list);
            return list;
        } else
        {
            return super.a(list);
        }
    }

    protected View b()
    {
        LinearLayout linearlayout = new LinearLayout(getActivity());
        linearlayout.setOrientation(1);
        FrameLayout framelayout = new FrameLayout(getActivity());
        framelayout.setId(0x7f110009);
        FragmentManager fragmentmanager = getChildFragmentManager();
        if (fragmentmanager.findFragmentByTag("com.fitbit.activity.ui.landing.ActivityDaysListFragment.HEADER_FRAGMENT_TAG") == null)
        {
            BabyChartFragment babychartfragment = com.fitbit.activity.ui.landing.BabyChartFragment.a(b);
            fragmentmanager.beginTransaction().add(framelayout.getId(), babychartfragment, "com.fitbit.activity.ui.landing.ActivityDaysListFragment.HEADER_FRAGMENT_TAG").commit();
        }
        linearlayout.addView(framelayout);
        if (false | ActivityType.a.equals(b) | ActivityType.b.equals(b))
        {
            com.fitbit.ui.charts.OnboardingCellView.TileType tiletype;
            if (ActivityType.a.equals(b))
            {
                tiletype = com.fitbit.ui.charts.OnboardingCellView.TileType.a;
            } else
            {
                tiletype = com.fitbit.ui.charts.OnboardingCellView.TileType.b;
            }
            if (UISavedState.a(tiletype))
            {
                OnboardingCellView onboardingcellview = OnboardingCellView.a(getActivity());
                onboardingcellview.a(tiletype);
                linearlayout.addView(onboardingcellview);
            }
        }
        return linearlayout;
    }

    protected bi b(int j, int k)
    {
        return a(j, k);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i = com.fitbit.util.a.a(b.c());
        h.a(new IntentFilter("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED"));
    }

    public void onDestroy()
    {
        h.d();
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l1)
    {
        super.onItemClick(adapterview, view, j, l1);
        adapterview = (TimeSeriesObject)adapterview.getItemAtPosition(j);
        if (adapterview != null)
        {
            getActivity().startActivity(ActivityDetailsActivity.a(getActivity(), b, adapterview.a()));
        }
    }

    public void onResume()
    {
        super.onResume();
        FitBitApplication.a(getActivity()).c().a(0x7f11000a).a(String.format("Details Screen - %s", new Object[] {
            c()
        }));
    }

    public void onStart()
    {
        super.onStart();
        a(l.h());
    }
}
