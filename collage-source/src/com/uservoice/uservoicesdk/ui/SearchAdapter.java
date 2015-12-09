// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.widget.BaseAdapter;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTask;
import java.util.ArrayList;
import java.util.List;

public abstract class SearchAdapter extends BaseAdapter
{

    protected Context context;
    protected String currentQuery;
    protected SearchTask currentSearch;
    protected boolean loading;
    protected String pendingQuery;
    protected int scope;
    protected boolean searchActive;
    protected List searchResults;

    public SearchAdapter()
    {
        searchResults = new ArrayList();
        searchActive = false;
    }

    public void performSearch(String s)
    {
        pendingQuery = s;
        if (s.length() == 0)
        {
            searchResults = new ArrayList();
            loading = false;
            notifyDataSetChanged();
            return;
        }
        loading = true;
        notifyDataSetChanged();
    /* block-local class not found */
    class SearchTask {}

        if (currentSearch != null)
        {
            currentSearch.cancel();
        }
        currentSearch = new SearchTask(s);
        currentSearch.run();
    }

    protected RestTask search(String s, Callback callback)
    {
        return null;
    }

    protected void searchResultsUpdated()
    {
    }

    public void setScope(int i)
    {
        scope = i;
        notifyDataSetChanged();
    }

    public void setSearchActive(boolean flag)
    {
        searchActive = flag;
        loading = false;
        notifyDataSetChanged();
    }

    protected boolean shouldShowSearchResults()
    {
        return searchActive && pendingQuery != null && pendingQuery.length() > 0;
    }
}
