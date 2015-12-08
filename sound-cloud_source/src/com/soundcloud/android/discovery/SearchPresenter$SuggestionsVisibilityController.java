// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.database.DataSetObserver;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchPresenter

private class <init> extends DataSetObserver
{

    final SearchPresenter this$0;

    public void onChanged()
    {
        super.onChanged();
        if (!SearchPresenter.access$1600(SearchPresenter.this).isEmpty())
        {
            SearchPresenter.access$2200(SearchPresenter.this);
            return;
        } else
        {
            SearchPresenter.access$2300(SearchPresenter.this);
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
