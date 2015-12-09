// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.VideoList;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.SimilarItemsGridViewAdapter;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchQueryDetailsActivity

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final SearchQueryDetailsActivity this$0;

    public void onSimilarVideosFetched(VideoList videolist, int i)
    {
        super.onSimilarVideosFetched(videolist, i);
        if (requestId != SearchQueryDetailsActivity.access$300(SearchQueryDetailsActivity.this) || AndroidUtils.isActivityFinishedOrDestroyed(SearchQueryDetailsActivity.this))
        {
            Log.v("SearchQueryDetailsActivity", "Ignoring stale callback");
            return;
        }
        SearchQueryDetailsActivity.access$402(SearchQueryDetailsActivity.this, false);
        if (i != 0)
        {
            Log.w("SearchQueryDetailsActivity", "Invalid status code");
            SearchQueryDetailsActivity.access$500(SearchQueryDetailsActivity.this);
            return;
        }
        if (videolist == null || videolist.size() < 1)
        {
            Log.v("SearchQueryDetailsActivity", "No details in response");
            SearchQueryDetailsActivity.access$500(SearchQueryDetailsActivity.this);
            return;
        } else
        {
            SearchQueryDetailsActivity.access$600(SearchQueryDetailsActivity.this).setData(videolist, PlayContext.EMPTY_CONTEXT);
            SearchQueryDetailsActivity.access$700(SearchQueryDetailsActivity.this);
            return;
        }
    }

    public (long l)
    {
        this$0 = SearchQueryDetailsActivity.this;
        super("SearchQueryDetailsActivity");
        requestId = l;
    }
}
