// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.runtrack.Duration;
import com.fitbit.ui.a.c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack.ui:
//            m

public class d extends c
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.fitbit.LoadableListView.a
{
    public static class b
        implements com.fitbit.ui.a.c.d
    {

        private final Date a;
        private final Duration b;
        private final com.fitbit.util.o.b c = new com.fitbit.util.o.b(FitBitApplication.a());

        public View a(int j, View view, ViewGroup viewgroup)
        {
            View view1 = view;
        /* block-local class not found */
        class a {}

            if (view == null)
            {
                view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040155, viewgroup, false);
                view1.setTag(new a(view1));
            }
            view = (a)view1.getTag();
            ((a) (view)).a.setText(c.a(a));
            ((a) (view)).b.setText(DateUtils.formatElapsedTime(b.a(TimeUnit.SECONDS)));
            return view1;
        }

        public b(Date date, Duration duration)
        {
            a = date;
            b = duration;
        }
    }


    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    final LoaderManager a;
    final android.support.v4.app.LoaderManager.LoaderCallbacks b;
    final m c;
    com.fitbit.data.bl.ActivityBusinessLogic.Request d;
    com.fitbit.LoadableListView.Status e;

    public d(m m, LoaderManager loadermanager, android.support.v4.app.LoaderManager.LoaderCallbacks loadercallbacks)
    {
        super(new ArrayList(), false);
        e = com.fitbit.LoadableListView.Status.a;
        c = m;
        a = loadermanager;
        b = loadercallbacks;
    }

    private void c()
    {
        Object obj = new Bundle();
        Bundle bundle;
        if (d == null)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, 1);
            d = new com.fitbit.data.bl.ActivityBusinessLogic.Request(null, calendar.getTime(), getCount(), 30, false);
        } else
        {
            d = d.a();
        }
        ((Bundle) (obj)).putParcelable("request", d);
        a.restartLoader(0x7f11000f, ((Bundle) (obj)), this);
        obj = new com.fitbit.data.bl.ActivityBusinessLogic.Request(null, d.c, getCount(), 40, true);
        bundle = new Bundle();
        bundle.putParcelable("request", ((android.os.Parcelable) (obj)));
        a.restartLoader(0x7f110010, bundle, this);
    }

    public View a(Context context, int j, ViewGroup viewgroup)
    {
        int k = 0x7f040153;
        getItemViewType(j);
        JVM INSTR tableswitch 0 2: default 36
    //                   0 84
    //                   1 84
    //                   2 84;
           goto _L1 _L2 _L2 _L2
_L1:
        j = k;
_L3:
        viewgroup = LayoutInflater.from(context).inflate(j, viewgroup, false);
    /* block-local class not found */
    class a {}

        switch (j)
        {
        default:
            context = new a(viewgroup);
            break;

        case 2130968916: 
            break MISSING_BLOCK_LABEL_100;
        }
_L4:
        viewgroup.setTag(context);
        return viewgroup;
_L2:
        j = k;
        if (c != null)
        {
            j = 0x7f040154;
        }
          goto _L3
    /* block-local class not found */
    class c {}

        context = new c(c, viewgroup);
          goto _L4
    }

    public com.fitbit.LoadableListView.Status a()
    {
        if (e == com.fitbit.LoadableListView.Status.a)
        {
            c();
            e = com.fitbit.LoadableListView.Status.b;
        }
        return e;
    }

    public void a(Loader loader, List list)
    {
        if (loader.getId() != 0x7f110010 || list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        e = com.fitbit.LoadableListView.Status.c;
_L4:
        b.onLoadFinished(loader, list);
        return;
_L2:
        if (list != null && !list.isEmpty())
        {
            e = com.fitbit.LoadableListView.Status.a;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(View view, ViewGroup viewgroup, int j)
    {
    /* block-local class not found */
    class d {}

        ((d)view.getTag()).b((ActivityLogEntry)getItem(j), viewgroup);
    }

    public com.fitbit.LoadableListView.Status b()
    {
        return e;
    }

    public long getItemId(int j)
    {
        return ((ActivityLogEntry)getItem(j)).getEntityId().longValue();
    }

    public int getItemViewType(int j)
    {
        return !((ActivityLogEntry)getItem(j)).f() ? 3 : 0;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a(viewgroup.getContext(), j, viewgroup);
        }
        a(view1, viewgroup, j);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 4;
    }

    public Loader onCreateLoader(int j, Bundle bundle)
    {
        return b.onCreateLoader(j, bundle);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        b.onLoaderReset(loader);
    }
}
