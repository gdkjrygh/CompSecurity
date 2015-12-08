// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.view.View;
import android.widget.AdapterView;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchPresenter, SuggestionsHelper

private class <init>
    implements android.widget.sultClickListener
{

    final SearchPresenter this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (SearchPresenter.access$1600(SearchPresenter.this).isSearchItem(i))
        {
            SearchPresenter.access$1700(SearchPresenter.this);
            return;
        } else
        {
            SearchPresenter.access$1800(SearchPresenter.this);
            SearchPresenter.access$1900(SearchPresenter.this).launchSuggestion(view.getContext(), i);
            return;
        }
    }

    private ()
    {
        this$0 = SearchPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
