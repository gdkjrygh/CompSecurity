// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;

// Referenced classes of package com.pinterest.activity.notifications:
//            StoryPinnersFragment

class this._cls0 extends com.pinterest.api.remote.onse
{

    final StoryPinnersFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        StoryPinnersFragment.access$000(StoryPinnersFragment.this, throwable, apiresponse);
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        onPeopleLoaded((UserFeed)feed);
    }

    A()
    {
        this$0 = StoryPinnersFragment.this;
        super();
    }
}
