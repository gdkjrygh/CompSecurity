// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import android.support.v7.widget.SearchView;

// Referenced classes of package com.soundcloud.android.actionbar:
//            SearchActionBarController

class this._cls0
    implements android.support.v7.widget.er
{

    final SearchActionBarController this$0;

    public boolean onQueryTextChange(String s)
    {
        if (SearchActionBarController.access$000(SearchActionBarController.this).getSuggestionsAdapter() == null)
        {
            SearchActionBarController.access$000(SearchActionBarController.this).setSuggestionsAdapter(SearchActionBarController.access$100(SearchActionBarController.this));
        }
        if (s.length() <= 0)
        {
            SearchActionBarController.access$200(SearchActionBarController.this).exitSearchMode();
        }
        return false;
    }

    public boolean onQueryTextSubmit(String s)
    {
        performSearch(s, false);
        clearFocus();
        SearchActionBarController.access$000(SearchActionBarController.this).setSuggestionsAdapter(null);
        return true;
    }

    archCallback()
    {
        this$0 = SearchActionBarController.this;
        super();
    }
}
