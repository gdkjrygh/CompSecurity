// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import com.pinterest.adapter.PinPicksAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.PinPicksFeed;
import com.pinterest.api.model.PinPicksSections;
import com.pinterest.api.remote.FeedApiResponseHandler;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.fragment:
//            PinPicksFragment

class ndler extends FeedApiResponseHandler
{

    final PinPicksFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        feed = (PinFeed)feed;
        if (feed.getCount() > 0)
        {
            PinPicksSections pinpickssections;
            for (feed = feed.getItems().iterator(); feed.hasNext(); PinPicksFragment.access$400(PinPicksFragment.this).appendItem(pinpickssections))
            {
                Pin pin = (Pin)feed.next();
                pinpickssections = new PinPicksSections();
                pinpickssections.setPinId(pin.getUid());
                pinpickssections.setType("pins");
            }

            ((PinPicksAdapter)_adapter).setDataSource(PinPicksFragment.access$400(PinPicksFragment.this));
            ((PinPicksAdapter)_adapter).notifyDataSetChanged();
        }
    }

    ndler()
    {
        this$0 = PinPicksFragment.this;
        super();
    }
}
