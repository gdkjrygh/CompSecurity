// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.i;
import com.fitbit.data.bl.fd;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.a;
import com.fitbit.util.az;
import com.fitbit.util.o;
import java.util.Date;

// Referenced classes of package com.fitbit.activity.ui.details:
//            ActivitySummaryView, a, ActivityDetailsHeaderFragment

public class ActivityDetailsActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static class a extends az
    {

        private final ActivityType a;
        private final Date b;

        protected boolean a(String s)
        {
            return s.equals(fs.a().c());
        }

        protected void b()
        {
            fs.a().a(this);
        }

        protected void d()
        {
            fs.a().b(this);
        }

        protected com.fitbit.activity.ui.details.a e()
        {
            Object obj = fs.a();
            com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = a.a();
            obj = ((fs) (obj)).a(timeseriesresourcetype, b);
            double d3 = com.fitbit.util.a.a(a.c());
            double d2 = ((TimeSeriesObject) (obj)).b();
            double d1 = d2;
            if (timeseriesresourcetype == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE)
            {
                d1 = com.fitbit.util.a.b(d2);
            }
            return new com.fitbit.activity.ui.details.a(d1, d3);
        }

        protected Intent f()
        {
            return fd.a(getContext(), false, a.a(), b, b);
        }

        protected Object f_()
        {
            return e();
        }

        public a(Context context, ActivityType activitytype, Date date)
        {
            super(context);
            a = activitytype;
            b = date;
        }
    }


    private static final String a = "ACTIVITY_DETAILS_HEADER";
    private static final String b = "ActivityDetailsActivity.ARG_DATE";
    private static final String c = "ActivityDetailsActivity.ARG_ACTIVITY_TYPE";
    private double d;
    private double e;
    private Date f;
    private ActivityType g;
    private ActivityDetailsHeaderFragment h;
    private i i;
    private ActivitySummaryView j;

    public ActivityDetailsActivity()
    {
        d = 0.0D;
        e = (1.0D / 0.0D);
        i = new i() {

            final ActivityDetailsActivity a;

            protected void a(LiveDataPacket livedatapacket)
            {
                double d1 = com.fitbit.util.a.a(livedatapacket, com.fitbit.activity.ui.details.ActivityDetailsActivity.a(a).a());
                if (o.j(ActivityDetailsActivity.b(a)) && d1 > 0.0D)
                {
                    com.fitbit.activity.ui.details.ActivityDetailsActivity.a(a, d1);
                    ActivityDetailsActivity.c(a);
                }
            }

            
            {
                a = ActivityDetailsActivity.this;
                super();
            }
        };
    }

    static double a(ActivityDetailsActivity activitydetailsactivity, double d1)
    {
        activitydetailsactivity.d = d1;
        return d1;
    }

    public static Intent a(Context context, ActivityType activitytype, Date date)
    {
        context = new Intent(context, com/fitbit/activity/ui/details/ActivityDetailsActivity);
        context.putExtra("ActivityDetailsActivity.ARG_ACTIVITY_TYPE", activitytype);
        context.putExtra("ActivityDetailsActivity.ARG_DATE", date);
        return context;
    }

    static ActivityType a(ActivityDetailsActivity activitydetailsactivity)
    {
        return activitydetailsactivity.g;
    }

    private static Date a(Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("ActivityDetailsActivity.ARG_DATE"))
        {
            return (Date)bundle.getSerializable("ActivityDetailsActivity.ARG_DATE");
        } else
        {
            return null;
        }
    }

    private static ActivityType b(Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("ActivityDetailsActivity.ARG_ACTIVITY_TYPE"))
        {
            return (ActivityType)bundle.getSerializable("ActivityDetailsActivity.ARG_ACTIVITY_TYPE");
        } else
        {
            return null;
        }
    }

    static Date b(ActivityDetailsActivity activitydetailsactivity)
    {
        return activitydetailsactivity.f;
    }

    static void c(ActivityDetailsActivity activitydetailsactivity)
    {
        activitydetailsactivity.f();
    }

    private void f()
    {
        boolean flag;
        if (d >= e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(g, d, flag);
    }

    public void a(Loader loader, com.fitbit.activity.ui.details.a a1)
    {
        if (a1 != null)
        {
            d = a1.a();
            e = a1.b();
            double d1 = com.fitbit.util.a.a(g);
            if (o.j(f) && d1 > 0.0D)
            {
                d = d1;
            }
            f();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040002);
        j = (ActivitySummaryView)findViewById(0x7f110084);
        bundle = getIntent().getExtras();
        g = b(bundle);
        f = a(bundle);
        setTitle(getString(g.e()));
        bundle = new Bundle();
        bundle.putSerializable("ActivityDetailsActivity.ARG_DATE", f);
        bundle.putSerializable("ActivityDetailsActivity.ARG_ACTIVITY_TYPE", g);
        getSupportLoaderManager().initLoader(136, bundle, this);
        h = (ActivityDetailsHeaderFragment)getSupportFragmentManager().findFragmentByTag("ACTIVITY_DETAILS_HEADER");
        if (h == null)
        {
            h = com.fitbit.activity.ui.details.ActivityDetailsHeaderFragment.a(g, f);
            getSupportFragmentManager().beginTransaction().add(0x7f110083, h, "ACTIVITY_DETAILS_HEADER").commit();
        }
    }

    public Loader onCreateLoader(int k, Bundle bundle)
    {
        Date date = a(bundle);
        return new a(this, b(bundle), date);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (com.fitbit.activity.ui.details.a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onPause()
    {
        super.onPause();
        i.d();
    }

    protected void onResume()
    {
        super.onResume();
        i.a(new IntentFilter("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED"));
    }
}
