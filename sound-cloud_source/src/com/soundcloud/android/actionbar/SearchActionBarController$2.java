// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;

// Referenced classes of package com.soundcloud.android.actionbar:
//            SearchActionBarController

class val.activity
    implements android.support.v7.widget.ner
{

    final SearchActionBarController this$0;
    final AppCompatActivity val$activity;

    public boolean onSuggestionClick(int i)
    {
        String s = SearchActionBarController.access$000(SearchActionBarController.this).getQuery().toString();
        SearchActionBarController.access$000(SearchActionBarController.this).clearFocus();
        if (SearchActionBarController.access$100(SearchActionBarController.this).isSearchItem(i))
        {
            performSearch(s, true);
            SearchActionBarController.access$000(SearchActionBarController.this).setSuggestionsAdapter(null);
            return true;
        } else
        {
            SearchActionBarController.access$300(SearchActionBarController.this, val$activity, i);
            return true;
        }
    }

    public boolean onSuggestionSelect(int i)
    {
        return false;
    }

    ()
    {
        this$0 = final_searchactionbarcontroller;
        val$activity = AppCompatActivity.this;
        super();
    }
}
