// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.activity.search.SearchNagView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.GuidedBoardFeed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedBoardSearchFragment

class _tabIndex extends com.pinterest.api.remote.hFeedResponse
{

    int _tabIndex;
    final GuidedBoardSearchFragment this$0;

    private boolean isValidFeedState()
    {
        return GuidedBoardSearchFragment.access$200(GuidedBoardSearchFragment.this) == _tabIndex;
    }

    public void onStart()
    {
        super.hFeedResponse();
        ViewHelper.setVisibility(_nagView, 8);
    }

    public void onSuccess(Feed feed)
    {
        if (isValidFeedState())
        {
            super.isValidFeedState(feed);
            Object obj;
            HashMap hashmap;
            if (_tabIndex == 1)
            {
                obj = EventType.SEARCH_PLACE_BOARDS;
            } else
            {
                obj = EventType.SEARCH_BOARDS;
            }
            hashmap = new HashMap();
            hashmap.put("query", GuidedBoardSearchFragment.access$300(GuidedBoardSearchFragment.this));
            Pinalytics.a(((EventType) (obj)), "0", hashmap);
            obj = (GuidedBoardFeed)feed;
            updateRelatedQueries(((GuidedBoardFeed) (obj)).getRelatedQueries());
            SearchNagView.showSearchNag(_nagView, feed);
        }
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        if (isValidFeedState())
        {
            super.isValidFeedState(pinterestjsonobject);
        }
    }

    public (FeedApiResponseHandler feedapiresponsehandler, int i)
    {
        this$0 = GuidedBoardSearchFragment.this;
        super(feedapiresponsehandler);
        _tabIndex = -1;
        _tabIndex = i;
    }
}
