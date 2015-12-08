// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import com.pinterest.activity.explore.adapter.ExploreAdapter;
import com.pinterest.activity.explore.adapter.ExploreBaseAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Hero;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.explore:
//            ExploreFragment

class edApiResponse extends com.pinterest.api.remote.riesFeedApiResponse
{

    final ExploreFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (ExploreFragment.access$1100(ExploreFragment.this) == null || ExploreFragment.access$1200(ExploreFragment.this) == null)
        {
            return;
        } else
        {
            ExploreFragment.access$1300(ExploreFragment.this).setState(com.pinterest.ui.grid.State.LOADED);
            ((ExploreBaseAdapter)ExploreFragment.access$1400(ExploreFragment.this)).setLoading(false);
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        ((ExploreBaseAdapter)ExploreFragment.access$200(ExploreFragment.this)).setLoading(true);
    }

    public void onSuccess(Feed feed, Hero hero)
    {
        super.onSuccess(feed, hero);
        if (ExploreFragment.access$300(ExploreFragment.this) != null)
        {
            ExploreFragment.access$400(ExploreFragment.this).onSuccess(feed);
            ((ExploreBaseAdapter)ExploreFragment.access$500(ExploreFragment.this)).setDataSource(feed);
            ((ExploreBaseAdapter)ExploreFragment.access$600(ExploreFragment.this)).setLoading(false);
            if (ExploreFragment.access$700(ExploreFragment.this) instanceof ExploreAdapter)
            {
                ((ExploreAdapter)ExploreFragment.access$800(ExploreFragment.this)).setHeroHeader(hero);
            }
        } else
        if (ExploreFragment.access$900(ExploreFragment.this) != null)
        {
            ExploreFragment.access$1000(ExploreFragment.this).setState(com.pinterest.ui.grid.State.LOADED);
            return;
        }
    }

    pter(boolean flag, boolean flag1)
    {
        this$0 = ExploreFragment.this;
        super(flag, flag1);
    }
}
