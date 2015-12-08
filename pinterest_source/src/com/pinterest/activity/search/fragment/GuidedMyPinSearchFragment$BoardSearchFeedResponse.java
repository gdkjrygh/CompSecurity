// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.activity.search.adapter.GuidedSearchMyBoardAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedMyPinSearchFragment

class this._cls0 extends com.pinterest.api.remote.hFeedResponse
{

    final GuidedMyPinSearchFragment this$0;

    public void onSuccess(Feed feed)
    {
        byte byte2 = 8;
        _myBoardAdapter.setDataSource(feed);
        byte byte0;
        byte byte1;
        if (_myBoardAdapter == null || _myBoardAdapter.getCount() == 0)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        feed = GuidedMyPinSearchFragment.access$200(GuidedMyPinSearchFragment.this);
        if (byte0 != 0)
        {
            byte1 = 8;
        } else
        {
            byte1 = 0;
        }
        ViewHelper.setVisibility(feed, byte1);
        feed = GuidedMyPinSearchFragment.access$300(GuidedMyPinSearchFragment.this);
        if (byte0 != 0)
        {
            byte0 = byte2;
        } else
        {
            byte0 = 0;
        }
        ViewHelper.setVisibility(feed, byte0);
    }

    public (FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = GuidedMyPinSearchFragment.this;
        super(feedapiresponsehandler);
    }
}
