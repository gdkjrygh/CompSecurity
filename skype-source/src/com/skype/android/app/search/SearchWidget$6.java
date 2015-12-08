// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.search:
//            SearchWidget, ContactSearchResultAdapter

final class this._cls0
    implements AsyncCallback
{

    final SearchWidget this$0;

    public final void done(AsyncResult asyncresult)
    {
        asyncresult = (der.SearchResult)asyncresult.a();
        SearchWidget.access$1200(SearchWidget.this).setData(((der.SearchResult) (asyncresult)).recent, ((der.SearchResult) (asyncresult)).searchTerm);
    }

    sultAdapter()
    {
        this$0 = SearchWidget.this;
        super();
    }
}
