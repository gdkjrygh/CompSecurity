// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.search:
//            SearchWidget, MessagesSearchResultAdapter

final class this._cls0
    implements AsyncCallback
{

    final SearchWidget this$0;

    public final void done(AsyncResult asyncresult)
    {
        asyncresult = (er.SearchResult)asyncresult.a();
        SearchWidget.access$600(SearchWidget.this).setData(((er.SearchResult) (asyncresult)).recent, ((er.SearchResult) (asyncresult)).searchTerm);
    }

    sultAdapter()
    {
        this$0 = SearchWidget.this;
        super();
    }
}
