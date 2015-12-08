// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ViewFlipper;
import com.uservoice.uservoicesdk.compatibility.FragmentListActivity;
import com.uservoice.uservoicesdk.ui.MixedSearchAdapter;
import com.uservoice.uservoicesdk.ui.PortalAdapter;
import com.uservoice.uservoicesdk.ui.SearchAdapter;
import com.uservoice.uservoicesdk.ui.SearchExpandListener;
import com.uservoice.uservoicesdk.ui.SearchQueryListener;

public abstract class SearchActivity extends FragmentListActivity
{

    private int originalNavigationMode;

    public SearchActivity()
    {
        originalNavigationMode = -1;
    }

    public SearchAdapter getSearchAdapter()
    {
        return searchAdapter;
    }

    public void hideSearch()
    {
        ((ViewFlipper)findViewById(com.uservoice.uservoicesdk.R.id.uv_view_flipper)).setDisplayedChild(0);
        if (hasActionBar())
        {
            ActionBar actionbar = actionBar;
            int i;
            if (originalNavigationMode == -1)
            {
                i = 0;
            } else
            {
                i = originalNavigationMode;
            }
            actionbar.setNavigationMode(i);
        }
    }

    protected void setupScopedSearch(Menu menu)
    {
        menu = menu.findItem(com.uservoice.uservoicesdk.R.id.uv_action_search);
        if (hasActionBar())
        {
            MenuItemCompat.setOnActionExpandListener(menu, new SearchExpandListener(this));
            ((SearchView)MenuItemCompat.getActionView(menu)).setOnQueryTextListener(new SearchQueryListener(this));
            searchAdapter = new MixedSearchAdapter(this);
            menu = new ListView(this);
            menu.setAdapter(searchAdapter);
            menu.setOnItemClickListener(searchAdapter);
            getListView();
            ((ViewFlipper)findViewById(com.uservoice.uservoicesdk.R.id.uv_view_flipper)).addView(menu, 1);
            menu = new android.support.v7.app.ActionBar.TabListener() {

                final SearchActivity this$0;

                public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
                {
                }

                public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
                {
                    searchAdapter.setScope(((Integer)tab.getTag()).intValue());
                }

                public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
                {
                }

            
            {
                this$0 = SearchActivity.this;
                super();
            }
            };
            allTab = actionBar.newTab().setText(getString(com.uservoice.uservoicesdk.R.string.uv_all_results_filter)).setTabListener(menu).setTag(Integer.valueOf(PortalAdapter.SCOPE_ALL));
            actionBar.addTab(allTab);
            articlesTab = actionBar.newTab().setText(getString(com.uservoice.uservoicesdk.R.string.uv_articles_filter)).setTabListener(menu).setTag(Integer.valueOf(PortalAdapter.SCOPE_ARTICLES));
            actionBar.addTab(articlesTab);
            ideasTab = actionBar.newTab().setText(getString(com.uservoice.uservoicesdk.R.string.uv_ideas_filter)).setTabListener(menu).setTag(Integer.valueOf(PortalAdapter.SCOPE_IDEAS));
            actionBar.addTab(ideasTab);
            return;
        } else
        {
            menu.setVisible(false);
            return;
        }
    }

    public void showSearch()
    {
        ((ViewFlipper)findViewById(com.uservoice.uservoicesdk.R.id.uv_view_flipper)).setDisplayedChild(1);
        if (hasActionBar())
        {
            if (originalNavigationMode == -1)
            {
                originalNavigationMode = actionBar.getNavigationMode();
            }
            actionBar.setNavigationMode(2);
        }
    }

    public void updateScopedSearch(int i, int j, int k)
    {
        if (hasActionBar())
        {
            allTab.setText(String.format("%s (%d)", new Object[] {
                getString(com.uservoice.uservoicesdk.R.string.uv_all_results_filter), Integer.valueOf(i)
            }));
            articlesTab.setText(String.format("%s (%d)", new Object[] {
                getString(com.uservoice.uservoicesdk.R.string.uv_articles_filter), Integer.valueOf(j)
            }));
            ideasTab.setText(String.format("%s (%d)", new Object[] {
                getString(com.uservoice.uservoicesdk.R.string.uv_ideas_filter), Integer.valueOf(k)
            }));
        }
    }
}
