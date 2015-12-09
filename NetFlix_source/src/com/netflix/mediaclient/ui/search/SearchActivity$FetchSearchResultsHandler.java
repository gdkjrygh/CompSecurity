// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.SearchActionBar;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchActivity

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final SearchActivity this$0;

    public void onSearchResultsFetched(SearchResults searchresults, int i)
    {
        super.onSearchResultsFetched(searchresults, i);
        if (requestId != SearchActivity.access$500(SearchActivity.this))
        {
            Log.v("SearchActivity", "Ignoring stale onSearchResultsFetched callback");
            LogUtils.reportSearchActionEnded(requestId, SearchActivity.this, com.netflix.mediaclient.servicemgr.his._fld0, null);
            return;
        }
        SearchActivity.access$602(SearchActivity.this, false);
        SearchActivity.access$100(SearchActivity.this).hideProgressSpinner();
        com.netflix.mediaclient.util.dler dler = new com.netflix.mediaclient.util.nner(i, ActionOnUIError.displayedError, "", null);
        if (i != 0)
        {
            Log.w("SearchActivity", "Invalid status code");
            SearchActivity.access$700(SearchActivity.this);
            LogUtils.reportSearchActionEnded(requestId, SearchActivity.this, dler._mth0(), dler._mth0());
            return;
        }
        if (searchresults == null || !searchresults.hasResults())
        {
            Log.v("SearchActivity", "No results from server");
            SearchActivity.access$800(SearchActivity.this);
            LogUtils.reportSearchActionEnded(requestId, SearchActivity.this, dler._mth0(), dler._mth0());
            return;
        } else
        {
            Log.d("SearchActivity", String.format("searchResults size %d trackId %d", new Object[] {
                Integer.valueOf(searchresults.getNumResults()), Integer.valueOf(searchresults.getTrackId())
            }));
            SearchActivity.access$900(SearchActivity.this, com.netflix.mediaclient.servicemgr.his._fld0);
            SearchActivity.access$1000(SearchActivity.this, searchresults);
            LogUtils.reportSearchActionEnded(requestId, SearchActivity.this, dler._mth0(), dler._mth0());
            return;
        }
    }

    public (long l)
    {
        this$0 = SearchActivity.this;
        super("SearchActivity");
        requestId = l;
    }
}
