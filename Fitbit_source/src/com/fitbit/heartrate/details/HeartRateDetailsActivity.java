// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import com.fitbit.data.bl.da;
import com.fitbit.data.bl.u;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.data.domain.heartrate.HeartRateZone;
import com.fitbit.heartrate.charts.views.HeartRateZonesChartView;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.az;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.heartrate.details:
//            HeartRateDetailsActivity_, HeartRateSummaryView, HeartRateDetailsHeaderFragment

public class HeartRateDetailsActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static class a extends az
    {

        private Date a;

        protected boolean a(String s)
        {
            return s.equals(u.a().b());
        }

        protected void b()
        {
            u.a().a(this);
        }

        protected void d()
        {
            u.a().b(this);
        }

        public HeartRateDailySummary e()
        {
            return u.a().a(a);
        }

        protected Intent f()
        {
            return da.a(getContext(), a);
        }

        public Object f_()
        {
            return e();
        }

        public a(Context context, Date date)
        {
            super(context);
            a = date;
        }
    }


    private static final String d = "HR_DETAILS_HEADER";
    private static final String e = "HeartrateDetailsActivity.DATE";
    protected Date a;
    protected HeartRateSummaryView b;
    protected HeartRateZonesChartView c;
    private HeartRateDetailsHeaderFragment f;

    public HeartRateDetailsActivity()
    {
    }

    public static void a(Context context, Date date)
    {
        HeartRateDetailsActivity_.a(context).a(date).b();
    }

    public void a(Loader loader, HeartRateDailySummary heartratedailysummary)
    {
        if (heartratedailysummary != null && heartratedailysummary.d())
        {
            b.a(heartratedailysummary.i());
            b.c(heartratedailysummary.e());
            b.b((int)Math.round(heartratedailysummary.g()));
            loader = new ArrayList();
            loader.add(new com.fitbit.heartrate.charts.views.HeartRateZonesChartView.a(getString(0x7f080333), heartratedailysummary.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.PEAK).e(), 0x7f02024d));
            loader.add(new com.fitbit.heartrate.charts.views.HeartRateZonesChartView.a(getString(0x7f0802c3), heartratedailysummary.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.CARDIO).e(), 0x7f020241));
            loader.add(new com.fitbit.heartrate.charts.views.HeartRateZonesChartView.a(getString(0x7f0802ed), heartratedailysummary.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.FAT_BURN).e(), 0x7f020249));
            c.a(loader);
        }
    }

    protected void c()
    {
        b.a(0);
        b.b(0);
        b.c(0);
        Bundle bundle = new Bundle();
        bundle.putSerializable("HeartrateDetailsActivity.DATE", a);
        getSupportLoaderManager().initLoader(306, bundle, this);
        f = (HeartRateDetailsHeaderFragment)getSupportFragmentManager().findFragmentByTag("HR_DETAILS_HEADER");
        if (f == null)
        {
            f = HeartRateDetailsHeaderFragment.a(a);
            getSupportFragmentManager().beginTransaction().add(0x7f110083, f, "HR_DETAILS_HEADER").commit();
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new a(this, a);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        getSupportLoaderManager().destroyLoader(306);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (HeartRateDailySummary)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
