// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import com.fitbit.e.a;
import com.fitbit.ui.endless.d;
import com.fitbit.util.o;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            InteractiveChartFragment, m, ScrollableInteractiveChartView, InteractiveChartView

public abstract class ScrollableChartFragment extends InteractiveChartFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, m
{

    private static final String a = "KEY_START_DATE";
    private static final String b = "KEY_END_DATE";
    private double i;
    private Date j;
    private boolean k;
    private List l;
    private Comparator m;

    public ScrollableChartFragment()
    {
        i = (1.0D / 0.0D);
        k = false;
        l = new ArrayList();
    }

    static List a(ScrollableChartFragment scrollablechartfragment)
    {
        return scrollablechartfragment.l;
    }

    private Bundle b(Date date, Date date1)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_START_DATE", date);
        bundle.putSerializable("KEY_END_DATE", date1);
        return bundle;
    }

    static Comparator b(ScrollableChartFragment scrollablechartfragment)
    {
        return scrollablechartfragment.o();
    }

    private Comparator o()
    {
        if (m == null)
        {
            m = i();
        }
        return m;
    }

    protected abstract Loader a(Date date, Date date1);

    public void a(double d1)
    {
        if (d1 < i && k && isAdded())
        {
            i = d1;
            k = false;
            Date date = new Date((long)d1 - 0x9a7ec800L);
            Date date1 = new Date(j.getTime() - 0x5265c00L);
            j = date;
            getLoaderManager().restartLoader(135, b(date, date1), this);
            com.fitbit.e.a.a(getTag(), (new StringBuilder()).append("restartLoader with startDate: ").append(date.toString()).toString(), new Object[0]);
        }
    }

    public void a(Loader loader, d d1)
    {
        a(d1);
        k = d1.c();
    }

    protected void a(d d1)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.h, new _cls1(d1));
    }

    protected abstract void a(List list);

    protected abstract ScrollableInteractiveChartView h();

    protected abstract Comparator i();

    protected InteractiveChartView j()
    {
        return h();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = com.fitbit.util.o.d().getTime();
        Date date = new Date(bundle.getTime() - 0x9a7ec800L);
        j = date;
        getLoaderManager().initLoader(135, b(date, bundle), this);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return a((Date)bundle.getSerializable("KEY_START_DATE"), (Date)bundle.getSerializable("KEY_END_DATE"));
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (d)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void u_()
    {
        super.u_();
        h().a(this);
    }

    /* member class not found */
    class _cls1 {}

}
