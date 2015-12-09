// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.view.MenuItem;
import com.uservoice.uservoicesdk.activity.SearchActivity;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            SearchAdapter

public class SearchExpandListener
    implements android.support.v4.view.MenuItemCompat.OnActionExpandListener
{

    private final SearchActivity searchActivity;

    public SearchExpandListener(SearchActivity searchactivity)
    {
        searchActivity = searchactivity;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        searchActivity.getSearchAdapter().setSearchActive(false);
        searchActivity.hideSearch();
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        searchActivity.getSearchAdapter().setSearchActive(true);
        return true;
    }
}
