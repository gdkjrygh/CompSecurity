// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;
import com.fitbit.ui.fragments.LoadingFragment;
import java.util.Date;

public abstract class ChartFragment extends LoadingFragment
    implements InteractiveChartView.c, InteractiveChartView.d
{
    public static class a
    {

        private Class a;
        private Bundle b;

        public Class a()
        {
            return a;
        }

        public Bundle b()
        {
            return b;
        }

        public a(Class class1, Bundle bundle)
        {
            a = class1;
            b = bundle;
        }
    }

    public static interface b
    {

        public abstract void i();
    }


    public static final String c = "com.fitbit.heartrate.ChartFragment.EXTRA_START_DATE";
    public static final String d = "com.fitbit.heartrate.ChartFragment.EXTRA_END_DATE";
    public static final String e = "com.fitbit.heartrate.ChartFragment.EXTRA_FILTER_TYPE";
    protected static final long f = 100L;
    protected static final float g = 1F;
    protected static final float h = 0.3F;
    private b a;
    private Date b;
    private Date i;
    private com.fitbit.util.chart.Filter.Type j;
    private View k;
    private View l;
    private View m;
    private View n;
    private ImageButton o;

    public ChartFragment()
    {
    }

    protected View a()
    {
        return k;
    }

    protected void a(View view)
    {
        View view1 = view.findViewById(0x7f11043c);
        o = (ImageButton)view.findViewById(0x7f110288);
        l = view.findViewById(0x7f110235);
        m = view.findViewById(0x7f11006b);
        k = view.findViewById(0x7f11006c);
        n = view.findViewById(0x7f110084);
        view = new _cls1();
        if (view1 != null)
        {
            view1.setOnClickListener(view);
        }
        if (o != null)
        {
            o.setOnClickListener(view);
        }
    }

    protected View d()
    {
        return m;
    }

    protected View e()
    {
        return l;
    }

    public void f()
    {
        Object obj = (InteractiveChartView.d)getActivity();
        if (obj != null)
        {
            ((InteractiveChartView.d) (obj)).f();
        }
        obj = new AlphaAnimation(1.0F, 0.3F);
        ((AlphaAnimation) (obj)).setDuration(100L);
        ((AlphaAnimation) (obj)).setFillAfter(true);
        n.startAnimation(((android.view.animation.Animation) (obj)));
    }

    public void g()
    {
        Object obj = (InteractiveChartView.c)getActivity();
        if (obj != null)
        {
            ((InteractiveChartView.c) (obj)).g();
        }
        obj = new AlphaAnimation(0.3F, 1.0F);
        ((AlphaAnimation) (obj)).setDuration(100L);
        ((AlphaAnimation) (obj)).setFillAfter(true);
        n.startAnimation(((android.view.animation.Animation) (obj)));
    }

    protected void k()
    {
        getActivity().finish();
    }

    public final Date l()
    {
        return b;
    }

    public final Date m()
    {
        return i;
    }

    public com.fitbit.util.chart.Filter.Type n()
    {
        return j;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = (Date)getArguments().getSerializable("com.fitbit.heartrate.ChartFragment.EXTRA_START_DATE");
        i = (Date)getArguments().getSerializable("com.fitbit.heartrate.ChartFragment.EXTRA_END_DATE");
        j = (com.fitbit.util.chart.Filter.Type)getArguments().getSerializable("com.fitbit.heartrate.ChartFragment.EXTRA_FILTER_TYPE");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a(view);
        u_();
    }

    protected void u_()
    {
        a = (b)getActivity();
    }

    /* member class not found */
    class _cls1 {}

}
