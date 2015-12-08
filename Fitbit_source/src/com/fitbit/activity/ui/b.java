// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.ui.a.c;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class com.fitbit.activity.ui.b extends com.fitbit.ui.a.c
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.fitbit.LoadableListView.a
{
    public static class a
        implements com.fitbit.ui.a.c.d
    {

        private final Date a;
        private final double b;
        private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType c;
        private final com.fitbit.util.o.b d;

        public View a(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040117, viewgroup, false);
                view1.setTag(new a(view1));
            }
            Context context = view1.getContext();
            view = (a)view1.getTag();
            ((a) (view)).a.setText(d.a(a));
            viewgroup = String.format(context.getString(0x7f080465), new Object[] {
                com.fitbit.util.format.e.a(b), com.fitbit.activity.ui.b.a(c, viewgroup.getContext()).toLowerCase(Locale.getDefault())
            });
            ((a) (view)).b.setText(viewgroup);
            return view1;
        }

        public a(Date date, double d1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, com.fitbit.util.o.b b1)
        {
            a = date;
            b = d1;
            c = timeseriesresourcetype;
            d = b1;
        }
    }

    private static class a.a
    {

        public final TextView a;
        public final TextView b;

        public a.a(View view)
        {
            a = (TextView)view.findViewById(0x7f110391);
            b = (TextView)view.findViewById(0x7f11006b);
        }
    }

    private static class b
    {

        Date a;
        Date b;

        private b()
        {
        }

    }

    private static class c
    {

        private final String a;
        private final TextView b;
        private final TextView c;
        private final TextView d;
        private final View e;
        private final double f;
        private final com.fitbit.util.o.a g;

        public final void a(TimeSeriesObject timeseriesobject, ViewGroup viewgroup)
        {
            b.setText(g.a(timeseriesobject.a()));
            c.setText(com.fitbit.util.format.e.b(timeseriesobject.b()));
            d.setText(a.toLowerCase(Locale.getDefault()));
            if (timeseriesobject.b() >= f)
            {
                e.setVisibility(0);
                return;
            } else
            {
                e.setVisibility(8);
                return;
            }
        }

        public c(View view, String s, double d1)
        {
            f = d1;
            a = s;
            b = (TextView)view.findViewById(0x7f11036c);
            c = (TextView)view.findViewById(0x7f110371);
            d = (TextView)view.findViewById(0x7f110353);
            e = view.findViewById(0x7f11035b);
            g = new com.fitbit.util.o.a(b.getContext());
        }
    }


    private static final int a = 14;
    private final LoaderManager b;
    private final android.support.v4.app.LoaderManager.LoaderCallbacks c;
    private b d;
    private com.fitbit.LoadableListView.Status e;
    private final double f;

    public com.fitbit.activity.ui.b(LoaderManager loadermanager, android.support.v4.app.LoaderManager.LoaderCallbacks loadercallbacks, double d1)
    {
        super(new ArrayList(), false);
        e = com.fitbit.LoadableListView.Status.a;
        b = loadermanager;
        c = loadercallbacks;
        f = d1;
    }

    static String a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Context context)
    {
        return b(timeseriesresourcetype, context);
    }

    private static String b(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Context context)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values().length];
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[timeseriesresourcetype.ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return context.getString(0x7f0804ef);

        case 2: // '\002'
            return context.getString(0x7f0800ac);

        case 3: // '\003'
            return an.a().b().t().getDisplayName();

        case 4: // '\004'
            return context.getString(0x7f080032);

        case 5: // '\005'
            return context.getString(0x7f0801c7);
        }
    }

    private void c()
    {
        Bundle bundle = new Bundle();
        if (d == null)
        {
            Calendar calendar = Calendar.getInstance();
            d = new b(null);
            d.b = o.e(calendar.getTime());
            calendar.add(5, -14);
            d.a = o.a(calendar.getTime());
        } else
        {
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(d.a);
            calendar1.add(5, -1);
            d.b = o.e(calendar1.getTime());
            calendar1.add(5, -14);
            d.a = o.a(calendar1.getTime());
        }
        bundle.putLong("startDate", d.a.getTime());
        bundle.putLong("endDate", d.b.getTime());
        b.restartLoader(0x7f11000f, bundle, this);
        b.restartLoader(0x7f110010, bundle, this);
    }

    public View a(Context context, int i, ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f040116, viewgroup, false);
        viewgroup.setTag(new c(viewgroup, b(((TimeSeriesObject)getItem(i)).d(), context), f));
        return viewgroup;
    }

    public com.fitbit.LoadableListView.Status a()
    {
        if (e == com.fitbit.LoadableListView.Status.a)
        {
            e = com.fitbit.LoadableListView.Status.b;
            c();
        }
        return e;
    }

    public void a(Loader loader, List list)
    {
        if (list != null && !list.isEmpty())
        {
            e = com.fitbit.LoadableListView.Status.a;
            c.onLoadFinished(loader, list);
        }
    }

    public void a(View view, ViewGroup viewgroup, int i)
    {
        ((c)view.getTag()).a((TimeSeriesObject)getItem(i), viewgroup);
    }

    public com.fitbit.LoadableListView.Status b()
    {
        return e;
    }

    public long getItemId(int i)
    {
        return ((TimeSeriesObject)getItem(i)).getServerId();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a(viewgroup.getContext(), i, viewgroup);
        }
        a(view1, viewgroup, i);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return c.onCreateLoader(i, bundle);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        c.onLoaderReset(loader);
    }
}
