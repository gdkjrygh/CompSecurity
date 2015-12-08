// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.widget.CursorAdapter;

// Referenced classes of package android.support.v7.widget:
//            SearchView, SuggestionsAdapter

class this._cls0
    implements Runnable
{

    final SearchView this$0;

    public void run()
    {
        if (SearchView.access$100(SearchView.this) != null && (SearchView.access$100(SearchView.this) instanceof SuggestionsAdapter))
        {
            SearchView.access$100(SearchView.this).changeCursor(null);
        }
    }

    ()
    {
        this$0 = SearchView.this;
        super();
    }
}
