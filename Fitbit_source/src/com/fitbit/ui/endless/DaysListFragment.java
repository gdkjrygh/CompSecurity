// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.endless;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.View;
import android.widget.AdapterView;
import com.fitbit.e.a;
import com.fitbit.util.ar;
import com.fitbit.util.bi;
import com.fitbit.util.bn;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.ui.endless:
//            EndlessStickyHeadersListView, a, d

public abstract class DaysListFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener, EndlessStickyHeadersListView.a, com.fitbit.util.ar.a
{

    private static final String a = "DaysListFragment";
    private static final String b = "DaysListActivity.START_POSITION";
    private static final String c = "DaysListActivity.RANGE";
    private static final int h = 40;
    protected View d;
    protected View e;
    protected EndlessStickyHeadersListView f;
    protected com.fitbit.ui.endless.a g;
    private boolean i;
    private int j;
    private boolean k;
    private final ar l = new ar(this);
    private TimeZone m;

    public DaysListFragment()
    {
        j = 0;
        m = null;
    }

    private Bundle a(int i1, int j1)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("DaysListActivity.START_POSITION", i1);
        bundle.putInt("DaysListActivity.RANGE", j1);
        return bundle;
    }

    private void a(List list, List list1)
    {
        list.removeAll(list1);
        list.addAll(list1);
    }

    private void a(TimeZone timezone, TimeZone timezone1)
    {
        k = false;
        f.a(false);
        f.setVisibility(8);
        f.f(null);
        d.setVisibility(0);
        g.clear();
        g.notifyDataSetChanged();
        getLoaderManager().restartLoader(304, a(0, h()), this);
    }

    private boolean a(d d1)
    {
        return d1.c() && d1.b().isEmpty();
    }

    protected abstract com.fitbit.ui.endless.a a();

    protected List a(List list)
    {
        return list;
    }

    public void a(int i1)
    {
        if (l.a())
        {
            b(i1);
            return;
        } else
        {
            com.fitbit.e.a.a("DaysListFragment", "No connection", new Object[0]);
            k = true;
            f.a(true);
            i = false;
            f.T_();
            return;
        }
    }

    public void a(Loader loader, d d1)
    {
        com.fitbit.e.a.a("DaysListFragment", "onLoadFinished: %s items", new Object[] {
            Integer.valueOf(d1.b().size())
        });
        if (f.getVisibility() != 0)
        {
            d.setVisibility(8);
            f.f(e);
            f.setVisibility(0);
        }
        if (a(d1))
        {
            com.fitbit.e.a.a("DaysListFragment", "achievedEndOfList", new Object[0]);
            k = true;
            f.a(true);
            i = false;
        } else
        {
            g.a(f.c());
            a(((List) (g)), a(d1.b()));
            g.notifyDataSetChanged();
        }
        f.T_();
        if (d1.c())
        {
            i = false;
        }
    }

    protected abstract View b();

    protected abstract bi b(int i1, int j1);

    protected void b(int i1)
    {
        if (!k && !i)
        {
            com.fitbit.e.a.a("DaysListFragment", "loadData from position: %s", new Object[] {
                String.valueOf(i1)
            });
            i = true;
            j = i1;
            getLoaderManager().restartLoader(304, a(i1, i()), this);
        }
    }

    protected int h()
    {
        return 91;
    }

    protected int i()
    {
        return 40;
    }

    public void j()
    {
        k = true;
        f.a(true);
        i = false;
        f.T_();
    }

    protected void l()
    {
        View view = b();
        if (view != null)
        {
            f.b(view);
        }
        g = a();
        f.a(g);
        f.a(0x7f040187);
        f.a(this);
        f.a(this);
        getLoaderManager().initLoader(304, a(j, h()), this);
    }

    public void l_()
    {
        k = false;
        f.a(false);
    }

    protected Object m()
    {
        Object obj1 = null;
        Object obj = obj1;
        if (g != null)
        {
            obj = obj1;
            if (!g.isEmpty())
            {
                obj = g.get(g.size() - 1);
            }
        }
        return obj;
    }

    protected void n()
    {
        k = false;
        f.a(k);
        i = true;
        d.setVisibility(0);
        f.setVisibility(8);
        e.setVisibility(8);
        getLoaderManager().restartLoader(304, a(0, h()), this);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        com.fitbit.e.a.a("DaysListFragment", "onCreateLoader", new Object[0]);
        i = true;
        return b(bundle.getInt("DaysListActivity.START_POSITION"), bundle.getInt("DaysListActivity.RANGE"));
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (d)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        com.fitbit.e.a.a("DaysListFragment", "onLoaderReset", new Object[0]);
    }

    public void onPause()
    {
        super.onPause();
        l.b(getActivity());
    }

    public void onResume()
    {
        super.onResume();
        l.a(getActivity(), true);
        TimeZone timezone = bn.b();
        if (m == null)
        {
            m = timezone;
        } else
        if (!m.equals(timezone))
        {
            a(m, timezone);
            m = timezone;
            return;
        }
    }
}
