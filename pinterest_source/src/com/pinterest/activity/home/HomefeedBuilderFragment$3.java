// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderFragment

class Response extends com.pinterest.api.remote.ApiResponse
{

    final HomefeedBuilderFragment this$0;

    public void onSuccess(Feed feed)
    {
        if (HomefeedBuilderFragment.access$200(HomefeedBuilderFragment.this) == null || HomefeedBuilderFragment.access$300(HomefeedBuilderFragment.this) == null)
        {
            return;
        }
        int k = HomefeedBuilderFragment.access$400(HomefeedBuilderFragment.this);
        int i = HomefeedBuilderFragment.access$500(HomefeedBuilderFragment.this);
        int l = HomefeedBuilderFragment.access$500(HomefeedBuilderFragment.this) + (k - i % k);
        feed = new ArrayList(feed.getItems());
        InterestsFeed interestsfeed = (InterestsFeed)HomefeedBuilderFragment.access$600(HomefeedBuilderFragment.this).getDataSource();
        ArrayList arraylist = new ArrayList(interestsfeed.getItems());
        int j = 0;
        i = 0;
        while (i < k && j < feed.size()) 
        {
            Interest interest = (Interest)feed.get(j);
            if (!arraylist.contains(interest) && (interest.getFollowing() == null || !interest.getFollowing().booleanValue()))
            {
                if (l >= arraylist.size())
                {
                    arraylist.add(interest);
                } else
                {
                    arraylist.add(l, interest);
                }
                i++;
            }
            j++;
        }
        interestsfeed.setItems(arraylist);
        HomefeedBuilderFragment.access$700(HomefeedBuilderFragment.this).setDataSource(interestsfeed);
        HomefeedBuilderFragment.access$800(HomefeedBuilderFragment.this).notifyDataSetChanged();
    }

    Response(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = HomefeedBuilderFragment.this;
        super(feedapiresponsehandler);
    }
}
