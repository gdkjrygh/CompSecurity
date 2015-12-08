// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import com.uservoice.uservoicesdk.activity.SearchActivity;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            SearchAdapter

public class SearchQueryListener
    implements android.support.v7.widget.SearchView.OnQueryTextListener
{

    private final SearchActivity searchActivity;

    public SearchQueryListener(SearchActivity searchactivity)
    {
        searchActivity = searchactivity;
    }

    public boolean onQueryTextChange(String s)
    {
        searchActivity.getSearchAdapter().performSearch(s);
        if (s.length() > 0)
        {
            searchActivity.showSearch();
        } else
        {
            searchActivity.hideSearch();
        }
        return true;
    }

    public boolean onQueryTextSubmit(String s)
    {
        searchActivity.getSearchAdapter().performSearch(s);
        return true;
    }
}
