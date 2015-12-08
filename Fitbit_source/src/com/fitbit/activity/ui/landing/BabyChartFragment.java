// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.View;
import com.fitbit.activity.ui.charts.ActivityChartActivity;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.charts.views.b;
import com.fitbit.activity.ui.charts.views.d;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.ui.charts.ExtendedChartView;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.t;
import com.fitbit.ui.fragments.LoadingFragment;
import com.fitbit.util.bm;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            BabyChartFragment_, a

public class BabyChartFragment extends LoadingFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String f = "BabyChartFragment.KEY_START_DATE";
    private static final String g = "BabyChartFragment.KEY_END_DATE";
    private static Timeframe h;
    protected ActivityType a;
    protected ExtendedChartView b;
    protected View c;
    protected View d;
    protected TimeSeriesObject e[];
    private a i;
    private Double j;
    private List k;

    public BabyChartFragment()
    {
        k = new ArrayList();
        e = new TimeSeriesObject[7];
    }

    private Bundle a(Date date, Date date1)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("BabyChartFragment.KEY_START_DATE", date);
        bundle.putSerializable("BabyChartFragment.KEY_END_DATE", date1);
        return bundle;
    }

    public static BabyChartFragment a(ActivityType activitytype)
    {
        return BabyChartFragment_.h().a(activitytype).a();
    }

    private List a(List list)
    {
        Object obj = list;
        if (j != null)
        {
            obj = new ArrayList(list);
            int l = ((List) (obj)).size() - 1;
            ((List) (obj)).set(l, new b(((d)((List) (obj)).get(l)).a(), j.doubleValue()));
        }
        return ((List) (obj));
    }

    private void a(com.fitbit.ui.endless.d d1)
    {
        if (d1 != null)
        {
            k.clear();
            k.addAll(d1.b());
            bm.a(k);
        }
    }

    protected View a()
    {
        return b;
    }

    public void a(double d1)
    {
        j = Double.valueOf(d1);
        g();
    }

    public void a(Loader loader, com.fitbit.activity.ui.charts.b b1)
    {
        a(((com.fitbit.ui.endless.d) (b1)));
        if (k == null || k.isEmpty())
        {
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.c);
            return;
        } else
        {
            i.a(b1.a().doubleValue());
            g();
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
            return;
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

    protected void f()
    {
        Date date = o.b();
        ActivityChartActivity.a(getActivity(), a, date);
    }

    public void g()
    {
        if (k == null || k.isEmpty())
        {
            return;
        } else
        {
            Object obj = a(bm.a(k, new Date(), 7));
            obj = t.a(((List) (obj)).subList(Math.max(((List) (obj)).size() - 7, 0), ((List) (obj)).size()), h);
            i.a(((t) (obj)), h, false);
            return;
        }
    }

    public Loader onCreateLoader(int l, Bundle bundle)
    {
        Date date = (Date)bundle.getSerializable("BabyChartFragment.KEY_START_DATE");
        bundle = (Date)bundle.getSerializable("BabyChartFragment.KEY_END_DATE");
        return new com.fitbit.activity.ui.d(getActivity(), a, date, bundle, true);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (com.fitbit.activity.ui.charts.b)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b = (ExtendedChartView)view.findViewById(0x7f110234);
        b.a(true);
        b.setLayerType(1, null);
        i = new a(getActivity(), a, b);
        i.a();
        view = new Date();
        bundle = new Date(view.getTime() - 0x240c8400L);
        getLoaderManager().initLoader(135, a(bundle, view), this);
    }

    static 
    {
        h = Timeframe.a;
    }
}
