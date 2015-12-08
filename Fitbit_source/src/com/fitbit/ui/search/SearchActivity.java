// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.search;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.l;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.a.b;
import com.fitbit.ui.choose.c;
import java.util.Date;

public abstract class SearchActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.view.MenuItemCompat.OnActionExpandListener, android.support.v7.widget.SearchView.OnQueryTextListener
{

    private static final String a = "SearchActivity.FILTER";
    protected f A;
    private b b;
    private Runnable c;
    private Handler d;
    protected ListView r;
    protected View s;
    protected View t;
    protected View u;
    protected View v;
    protected View w;
    protected String x;
    protected Date y;
    protected MenuItem z;

    public SearchActivity()
    {
        c = new Runnable() {

            final SearchActivity a;

            public void run()
            {
                a.getSupportLoaderManager().restartLoader(84, SearchActivity.a(a), a);
                com.fitbit.ui.search.SearchActivity.b(a).clear();
                SearchActivity.a(a, true);
            }

            
            {
                a = SearchActivity.this;
                super();
            }
        };
        d = new Handler();
    }

    static Bundle a(SearchActivity searchactivity)
    {
        return searchactivity.g();
    }

    static void a(SearchActivity searchactivity, boolean flag)
    {
        searchactivity.a(flag);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            h();
            w.setVisibility(0);
            t.setVisibility(0);
            u.setVisibility(8);
            v.setVisibility(8);
            return;
        }
        t.setVisibility(8);
        if (TextUtils.isEmpty(x))
        {
            i();
            w.setVisibility(8);
            u.setVisibility(8);
            v.setVisibility(0);
            return;
        } else
        {
            h();
            w.setVisibility(0);
            u.setVisibility(0);
            v.setVisibility(8);
            return;
        }
    }

    static b b(SearchActivity searchactivity)
    {
        return searchactivity.b;
    }

    static void c(SearchActivity searchactivity)
    {
        searchactivity.j();
    }

    private Bundle g()
    {
        Bundle bundle = new Bundle();
        bundle.putString("SearchActivity.FILTER", x);
        return bundle;
    }

    private void j()
    {
        k();
    }

    private void k()
    {
        d.removeCallbacks(c);
        d.postDelayed(c, 500L);
    }

    protected abstract c a(String s1);

    public void a(Loader loader, com.fitbit.ui.choose.c.a a1)
    {
        getSupportLoaderManager().destroyLoader(loader.getId());
        a(false);
        switch (a1.b())
        {
        case -2: 
        default:
            return;

        case -3: 
            A.c();
            A.a(new Exception());
            return;

        case -1: 
            b.clear();
            break;
        }
        b.addAll(a1.a());
        b.notifyDataSetChanged();
    }

    protected void a(CharSequence charsequence)
    {
        A.d();
        if (MenuItemCompat.isActionViewExpanded(z) && (!TextUtils.isEmpty(charsequence) || !TextUtils.isEmpty(x)))
        {
            x = charsequence.toString();
            k();
        }
    }

    protected void f()
    {
        a(false);
        b = l();
        r.setEmptyView(s);
        r.setAdapter(b);
        getSupportLoaderManager().initLoader(84, g(), this);
        A = new l(this, 0x7f1100a4, new com.fitbit.home.ui.l.a() {

            final SearchActivity a;

            public void a(l l1)
            {
                com.fitbit.ui.search.SearchActivity.c(a);
                a.A.d();
            }

            
            {
                a = SearchActivity.this;
                super();
            }
        }, null);
    }

    protected abstract void h();

    protected abstract void i();

    protected abstract b l();

    protected void m_()
    {
        super.m_();
        if (z != null)
        {
            z.setVisible(true);
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return a(bundle.getString("SearchActivity.FILTER"));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        z = menu.findItem(0x7f1104de);
        if (z != null)
        {
            z.setVisible(ServerGateway.a().d());
            ((SearchView)MenuItemCompat.getActionView(z)).setOnQueryTextListener(this);
            MenuItemCompat.setOnActionExpandListener(z, this);
            z.collapseActionView();
        }
        return true;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (com.fitbit.ui.choose.c.a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        d.removeCallbacks(c);
        x = null;
        a(false);
        if (A != null)
        {
            A.d();
        }
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        d.removeCallbacks(c);
    }

    public boolean onQueryTextChange(String s1)
    {
        a(s1);
        return true;
    }

    public boolean onQueryTextSubmit(String s1)
    {
        a(s1);
        return true;
    }

    protected void t_()
    {
        super.t_();
        if (z != null)
        {
            z.setVisible(false);
        }
    }
}
