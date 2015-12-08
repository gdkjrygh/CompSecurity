// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import com.pinterest.adapter.PinPicksAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.PinPicksFeed;
import com.pinterest.api.model.PinPicksSections;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Events;
import com.pinterest.ui.PinPickHeroCell;

// Referenced classes of package com.pinterest.fragment:
//            PinPicksFragment

class andler extends com.pinterest.api.remote.dler
{

    final PinPicksFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        PinPicksFragment.access$500(PinPicksFragment.this, _adapter);
    }

    public void onStart()
    {
        super.onStart();
    }

    public void onSuccess(Feed feed)
    {
        if (feed != null && feed.getCode() == 0)
        {
            PinPicksFragment.access$402(PinPicksFragment.this, (PinPicksFeed)feed);
            if (PinPicksFragment.access$400(PinPicksFragment.this).getCount() > 0)
            {
                ((PinPicksAdapter)_adapter).setDataSource(PinPicksFragment.access$400(PinPicksFragment.this));
                PinPicksSections pinpickssections = (PinPicksSections)PinPicksFragment.access$400(PinPicksFragment.this).get(0);
                if (pinpickssections != null && pinpickssections.getType().equals("hero"))
                {
                    heroCell.updateUI(pinpickssections.getMobileImageUrl(), pinpickssections.getTitle(), pinpickssections.getDetail());
                }
            }
            Events.post(new com.pinterest.api.remote.>());
            super.onSuccess(feed);
        }
    }

    public andler()
    {
        this$0 = PinPicksFragment.this;
        super();
    }

    public andler(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = PinPicksFragment.this;
        super(feedapiresponsehandler);
    }
}
