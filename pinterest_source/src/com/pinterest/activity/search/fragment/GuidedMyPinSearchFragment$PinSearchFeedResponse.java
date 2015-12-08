// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.activity.search.SearchNagView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.BevelTitleDivider;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedMyPinSearchFragment

class this._cls0 extends com.pinterest.api.remote.hFeedResponse
{

    final GuidedMyPinSearchFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.hFeedResponse(throwable, apiresponse);
        class _cls1 extends BackgroundTask
        {

            public PinFeed feed;
            final GuidedMyPinSearchFragment.PinSearchFeedResponse this$1;

            public void onFinish()
            {
                super.onFinish();
                onSuccess(feed);
            }

            public void run()
            {
                feed = new PinFeed();
                feed.setItems(ModelHelper.searchUserPins(MyUser.getUid(), _lastQuery));
            }

            _cls1()
            {
                this$1 = GuidedMyPinSearchFragment.PinSearchFeedResponse.this;
                super();
            }
        }

        (new _cls1()).execute();
    }

    public void onStart()
    {
        super.hFeedResponse();
        ViewHelper.setVisibility(_nagView, 8);
    }

    public void onSuccess(Feed feed)
    {
        byte byte0 = 0;
        super.hFeedResponse(feed);
        Object obj = new HashMap();
        ((HashMap) (obj)).put("query", _lastQuery);
        Pinalytics.a(EventType.SEARCH_MY_PINS, "0", ((HashMap) (obj)));
        boolean flag;
        if (feed == null || feed.getCount() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = GuidedMyPinSearchFragment.access$400(GuidedMyPinSearchFragment.this);
        if (flag)
        {
            byte0 = 8;
        }
        ((BevelTitleDivider) (obj)).setVisibility(byte0);
        SearchNagView.showSearchNag(_nagView, feed);
    }

    public _cls1()
    {
        this$0 = GuidedMyPinSearchFragment.this;
        super();
    }

    public this._cls0(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = GuidedMyPinSearchFragment.this;
        super(feedapiresponsehandler);
    }
}
