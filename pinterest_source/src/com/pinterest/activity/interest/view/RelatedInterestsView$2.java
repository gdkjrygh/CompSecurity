// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.view;

import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.InterestsFeed;

// Referenced classes of package com.pinterest.activity.interest.view:
//            RelatedInterestsView

class se extends com.pinterest.api.remote.eedApiResponse
{

    final RelatedInterestsView this$0;

    public void onSuccess(Feed feed)
    {
        RelatedInterestsView.access$102(RelatedInterestsView.this, (InterestsFeed)feed);
        RelatedInterestsView.access$000(RelatedInterestsView.this).setDataSource(RelatedInterestsView.access$100(RelatedInterestsView.this));
        if (RelatedInterestsView.access$100(RelatedInterestsView.this).getCount() != 0)
        {
            setVisibility(0);
        }
    }

    se()
    {
        this$0 = RelatedInterestsView.this;
        super();
    }
}
