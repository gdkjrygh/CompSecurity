// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.activity.ui.landing.ActivityStickyHeaderView;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.r;
import com.fitbit.ui.endless.d;
import com.fitbit.util.al;
import com.fitbit.util.bt;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import com.fitbit.water.Water;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.water.ui:
//            b, TodayWaterItemView

public class com.fitbit.water.ui.a extends com.fitbit.ui.endless.a
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.fitbit.LoadableListView.a
{
    private static class a
    {

        private final TextView a;
        private final TextView b;
        private final View c;
        private final TextView d;
        private final double e;
        private final com.fitbit.util.o.a f;

        public final void a(WaterLogEntry waterlogentry)
        {
            com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits = r.e();
            double d1 = waterlogentry.e().a(waterunits).b();
            a.setText(com.fitbit.util.format.e.b(d1));
            View view = c;
            int i;
            if (d1 >= e)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            b.setText(waterunits.getQuantityDisplayName(com.fitbit.util.format.e.b(d1)));
            d.setText(f.a(waterlogentry.getLogDate()));
        }

        public a(View view, double d1)
        {
            a = (TextView)view.findViewById(0x7f110371);
            b = (TextView)view.findViewById(0x7f110353);
            c = view.findViewById(0x7f11035b);
            d = (TextView)view.findViewById(0x7f11036c);
            e = d1;
            f = new com.fitbit.util.o.a(d.getContext());
        }
    }


    public static final String a = "WaterListAdapter";
    final LoaderManager b;
    final android.support.v4.app.LoaderManager.LoaderCallbacks c;
    com.fitbit.util.o.b d;
    com.fitbit.LoadableListView.Status e;
    private Calendar f;
    private Water g;

    public com.fitbit.water.ui.a(Context context, LoaderManager loadermanager, android.support.v4.app.LoaderManager.LoaderCallbacks loadercallbacks)
    {
        e = com.fitbit.LoadableListView.Status.a;
        b = loadermanager;
        c = loadercallbacks;
        d = new com.fitbit.util.o.b(context);
    }

    private double a(Date date, Date date1)
    {
        com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits = r.e();
        Iterator iterator = iterator();
        double d1 = 0.0D;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WaterLogEntry waterlogentry = (WaterLogEntry)iterator.next();
            if (o.b(waterlogentry.getLogDate(), date, date1))
            {
                d1 = waterlogentry.e().a(waterunits).b() + d1;
            }
        } while (true);
        return d1;
    }

    private void c()
    {
        if (f == null)
        {
            f = o.c();
        }
    }

    private void f()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("WaterListActivity.START_POSITION", getCount());
        bundle.putInt("DayListActivity.RANGE", 40);
        b.restartLoader(304, bundle, this);
    }

    public long a(int i)
    {
        Date date = ((WaterLogEntry)getItem(i)).getLogDate();
        c();
        return (long)o.c(f, date);
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        if (i == 0)
        {
            view = new ActivityStickyHeaderView(viewgroup.getContext());
            view.setVisibility(8);
            return view;
        }
        viewgroup = viewgroup.getContext();
        double d1;
        Date date;
        Date date1;
        if (view == null || i > 0)
        {
            view = ActivityStickyHeaderView.a(viewgroup);
        } else
        {
            view = null;
        }
        viewgroup = new Date(((WaterLogEntry)getItem(i)).getLogDate().getTime());
        date = o.e(o.c(), viewgroup);
        date1 = o.f(o.c(), viewgroup);
        view.a(d.a(viewgroup));
        d1 = a(date, date1);
        view.b(String.format(al.a(), bt.a(d1), new Object[0]));
        return view;
    }

    public View a(Context context, ViewGroup viewgroup, double d1)
    {
        context = LayoutInflater.from(context).inflate(0x7f040114, viewgroup, false);
        context.setTag(new a(context, d1));
        return context;
    }

    public com.fitbit.LoadableListView.Status a()
    {
        if (e == com.fitbit.LoadableListView.Status.a)
        {
            f();
            e = com.fitbit.LoadableListView.Status.b;
        }
        return e;
    }

    public void a(Loader loader, d d1)
    {
        if (d1 != null && !d1.b().isEmpty())
        {
            e = com.fitbit.LoadableListView.Status.a;
            c.onLoadFinished(loader, d1);
        }
        g = (new Water(((b)b.getLoader(304)).h(), com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML)).a(r.e());
    }

    public void a(View view, int i)
    {
        ((a)view.getTag()).a((WaterLogEntry)getItem(i));
    }

    public View b(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
label0:
        {
            obj = (WaterLogEntry)getItem(i);
            boolean flag = o.j(new Date(), ((WaterLogEntry) (obj)).getLogDate());
            if (g == null)
            {
                g = new Water(t.a().a(com.fitbit.data.domain.Goal.GoalType.WATER_GOAL).intValue(), com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
            }
            double d1 = g.a(r.e()).b();
            if (flag)
            {
                return new TodayWaterItemView(viewgroup.getContext(), ((WaterLogEntry) (obj)).e(), d1);
            }
            if (view != null)
            {
                obj = view;
                if (view.getTag() != null)
                {
                    break label0;
                }
            }
            obj = a(viewgroup.getContext(), viewgroup, d1);
        }
        a(((View) (obj)), i);
        return ((View) (obj));
    }

    public com.fitbit.LoadableListView.Status b()
    {
        return e;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return c.onCreateLoader(i, bundle);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (d)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        c.onLoaderReset(loader);
    }
}
