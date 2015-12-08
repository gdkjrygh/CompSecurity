// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.details;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import com.fitbit.heartrate.charts.b;
import com.fitbit.heartrate.charts.views.IntradayHeartRateBabyChartView;
import com.fitbit.heartrate.intraday.IntradayHeartRateChartActivity;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.heartrate.details:
//            HeartRateDetailsHeaderFragment_

public class HeartRateDetailsHeaderFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static final class VisibilityState extends Enum
    {

        public static final VisibilityState a;
        public static final VisibilityState b;
        public static final VisibilityState c;
        private static final VisibilityState d[];

        public static VisibilityState valueOf(String s)
        {
            return (VisibilityState)Enum.valueOf(com/fitbit/heartrate/details/HeartRateDetailsHeaderFragment$VisibilityState, s);
        }

        public static VisibilityState[] values()
        {
            return (VisibilityState[])d.clone();
        }

        static 
        {
            a = new VisibilityState("PROGRESS", 0);
            b = new VisibilityState("CONTENT", 1);
            c = new VisibilityState("PLACEHOLDER", 2);
            d = (new VisibilityState[] {
                a, b, c
            });
        }

        private VisibilityState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String g = "DATE";
    protected Date a;
    protected View b;
    protected View c;
    protected View d;
    protected TextView e;
    protected IntradayHeartRateBabyChartView f;

    public HeartRateDetailsHeaderFragment()
    {
    }

    public static HeartRateDetailsHeaderFragment a(Date date)
    {
        return HeartRateDetailsHeaderFragment_.d().a(date).a();
    }

    private void a(VisibilityState visibilitystate)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[VisibilityState.values().length];
                try
                {
                    a[com.fitbit.heartrate.details.VisibilityState.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[VisibilityState.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[VisibilityState.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[visibilitystate.ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            b.setVisibility(0);
            d.setVisibility(8);
            c.setVisibility(8);
            return;

        case 2: // '\002'
            b.setVisibility(8);
            d.setVisibility(8);
            c.setVisibility(0);
            return;

        case 3: // '\003'
            b.setVisibility(8);
            break;
        }
        d.setVisibility(0);
        c.setVisibility(8);
    }

    private static Bundle b(Date date)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("DATE", date);
        return bundle;
    }

    protected void a()
    {
        e.setText(com.fitbit.util.format.e.p(getActivity(), a));
        a(VisibilityState.a);
    }

    public void a(Loader loader, com.fitbit.heartrate.charts.b.a a1)
    {
        if (a1 == null)
        {
            return;
        }
        loader = a1.b();
        if (a1.a() == null || loader == null || loader.size() == 0)
        {
            a(VisibilityState.c);
            return;
        } else
        {
            a(com.fitbit.heartrate.details.VisibilityState.b);
            f.a(a1);
            return;
        }
    }

    protected void b()
    {
        IntradayHeartRateChartActivity.a(getActivity(), a);
    }

    protected void c()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getResources().getString(0x7f080248))));
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(305, b(a), this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        Date date;
        if (bundle != null)
        {
            bundle = (Date)bundle.getSerializable("DATE");
        } else
        {
            bundle = null;
        }
        date = o.d(bundle);
        bundle = o.f(bundle);
        return new b(getActivity(), date, bundle);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (com.fitbit.heartrate.charts.b.a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
