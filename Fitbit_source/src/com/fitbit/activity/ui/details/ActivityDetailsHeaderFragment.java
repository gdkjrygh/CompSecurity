// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fitbit.activity.ui.FitbitActivityChartActivity;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.data.bl.de;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.r;
import com.fitbit.ui.charts.s;
import com.fitbit.ui.charts.t;
import com.fitbit.ui.fragments.LoadingFragment;
import com.fitbit.util.ae;
import com.fitbit.util.format.e;
import com.fitbit.util.i.c;
import com.fitbit.util.o;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.details:
//            IntradayActivityBabyChartView

public class ActivityDetailsHeaderFragment extends LoadingFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static class a extends ae
    {

        private final Date a;
        private final Date b;
        private final ActivityType c;

        protected boolean a(String s1)
        {
            return s1.equals(fs.a().c());
        }

        protected void b()
        {
            fs.a().a(this);
        }

        protected void d()
        {
            fs.a().b(this);
        }

        protected t e()
        {
            Object obj = fs.a().a(c.b(), a, b);
            if (ActivityType.c.equals(c))
            {
                t t1 = new t();
                TimeSeriesObject timeseriesobject;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); t1.a(new s(timeseriesobject.a().getTime(), com.fitbit.util.a.b(timeseriesobject.b()))))
                {
                    timeseriesobject = (TimeSeriesObject)((Iterator) (obj)).next();
                }

                return t1;
            } else
            {
                return t.a(((List) (obj)));
            }
        }

        protected Intent f()
        {
            return de.a(getContext(), c.b(), a, b, false);
        }

        protected Object g()
        {
            return e();
        }

        public a(Context context, ActivityType activitytype, Date date, Date date1)
        {
            super(context);
            a = date;
            b = date1;
            c = activitytype;
        }
    }


    private static final String a = "ARG_DATE";
    private static final String b = "ARG_ACTIVITY_TYPE";
    private ActivityType c;
    private Date d;
    private View e;
    private View f;
    private View g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private IntradayActivityBabyChartView k;
    private View l;

    public ActivityDetailsHeaderFragment()
    {
    }

    public static ActivityDetailsHeaderFragment a(ActivityType activitytype, Date date)
    {
        Bundle bundle = new Bundle();
        a(bundle, activitytype);
        a(bundle, date);
        activitytype = new ActivityDetailsHeaderFragment();
        activitytype.setArguments(bundle);
        return activitytype;
    }

    private static String a(Context context, ActivityType activitytype)
    {
        int i1 = 0;
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[ActivityType.values().length];
                try
                {
                    a[ActivityType.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[ActivityType.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ActivityType.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ActivityType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ActivityType.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[activitytype.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 50
    //                   2 56
    //                   3 86
    //                   4 92
    //                   5 98;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return context.getString(i1);
_L2:
        i1 = 0x7f0800ae;
        continue; /* Loop/switch isn't completed */
_L3:
        activitytype = r.b();
        if (com.fitbit.data.domain.Length.LengthUnits.MILES == activitytype)
        {
            i1 = 0x7f08003e;
        } else
        if (com.fitbit.data.domain.Length.LengthUnits.KM == activitytype)
        {
            i1 = 0x7f08003c;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 0x7f08003a;
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = 0x7f080032;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0x7f080039;
        if (true) goto _L1; else goto _L7
_L7:
    }

    private static Date a(Bundle bundle)
    {
        return (Date)bundle.getSerializable("ARG_DATE");
    }

    private static void a(Bundle bundle, ActivityType activitytype)
    {
        bundle.putSerializable("ARG_ACTIVITY_TYPE", activitytype);
    }

    private static void a(Bundle bundle, Date date)
    {
        bundle.putSerializable("ARG_DATE", date);
    }

    static void a(ActivityDetailsHeaderFragment activitydetailsheaderfragment)
    {
        activitydetailsheaderfragment.f();
    }

    private static ActivityType b(Bundle bundle)
    {
        return (ActivityType)bundle.getSerializable("ARG_ACTIVITY_TYPE");
    }

    private void f()
    {
        Intent intent = new Intent(getActivity(), com/fitbit/activity/ui/FitbitActivityChartActivity);
        intent.putExtra("date", d);
        intent.addFlags(0x20010000);
        getActivity().startActivity(intent);
    }

    protected View a()
    {
        return k;
    }

    public void a(Loader loader, c c1)
    {
        if (((t)c1.a()).d() > 0)
        {
            boolean flag = ActivityType.c.equals(c);
            k.a((t)c1.a(), flag);
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
            return;
        }
        if (c1.b())
        {
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.c);
            return;
        } else
        {
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.a);
            return;
        }
    }

    protected View d()
    {
        return f;
    }

    protected View e()
    {
        return g;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = new Bundle();
        a(bundle, c);
        a(bundle, o.b(d));
        getLoaderManager().initLoader(310, bundle, this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        c = b(bundle);
        d = a(bundle);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        Date date = a(bundle);
        bundle = b(bundle);
        Date date1 = o.a(date);
        date = o.e(date);
        return new a(getActivity(), bundle, date1, date);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f040080, viewgroup, false);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (c)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        j = (TextView)view.findViewById(0x7f110238);
        i = (TextView)view.findViewById(0x7f11001b);
        k = (IntradayActivityBabyChartView)view.findViewById(0x7f110239);
        h = (ImageView)view.findViewById(0x7f1101ec);
        l = view.findViewById(0x7f110237);
        f = view.findViewById(0x7f11006b);
        g = view.findViewById(0x7f110235);
        e = view.findViewById(0x7f11006c);
        if (e != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final ActivityDetailsHeaderFragment a;

                public void onClick(View view1)
                {
                    ActivityDetailsHeaderFragment.a(a);
                }

            
            {
                a = ActivityDetailsHeaderFragment.this;
                super();
            }
            });
        }
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.a);
        view = a(getActivity(), c);
        i.setText(view);
        j.setText(com.fitbit.util.format.e.p(getActivity(), d));
    }

    protected View v_()
    {
        return l;
    }
}
