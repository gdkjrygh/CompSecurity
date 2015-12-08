// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.fitbit.ui.fragments.FitbitFragment;

public abstract class SearchFragment extends FitbitFragment
    implements android.support.v4.view.MenuItemCompat.OnActionExpandListener, android.support.v7.widget.SearchView.OnQueryTextListener
{

    private MenuItem a;

    public SearchFragment()
    {
    }

    protected abstract void a(String s);

    public boolean o()
    {
        if (a != null)
        {
            return a.collapseActionView();
        } else
        {
            return false;
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        a = menu.findItem(0x7f1104de);
        if (a != null)
        {
            ((SearchView)MenuItemCompat.getActionView(a)).setOnQueryTextListener(this);
            MenuItemCompat.setOnActionExpandListener(a, this);
            a.collapseActionView();
        }
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return true;
    }

    public boolean onQueryTextChange(String s)
    {
        a(s);
        return true;
    }

    public boolean onQueryTextSubmit(String s)
    {
        a(s);
        return true;
    }

    public boolean p()
    {
        if (a != null)
        {
            return a.isActionViewExpanded();
        } else
        {
            return false;
        }
    }
}
