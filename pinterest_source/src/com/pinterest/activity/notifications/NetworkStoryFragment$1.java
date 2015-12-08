// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.StoryFeed;
import com.pinterest.ui.grid.AdapterEmptyView;

// Referenced classes of package com.pinterest.activity.notifications:
//            NetworkStoryFragment

class nse extends com.pinterest.api.remote.FeedApiResponse
{

    final NetworkStoryFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        handleApiResponseOnFailure();
    }

    public void onStart()
    {
        super.onStart();
        handleApiResponseOnStart();
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        handleApiResponseOnSuccess((StoryFeed)feed);
        if (NetworkStoryFragment.access$100(NetworkStoryFragment.this).getState() == 1 && feed.getCount() == 0)
        {
            NetworkStoryFragment.access$200(NetworkStoryFragment.this);
        }
    }

    nse()
    {
        this$0 = NetworkStoryFragment.this;
        super();
    }
}
