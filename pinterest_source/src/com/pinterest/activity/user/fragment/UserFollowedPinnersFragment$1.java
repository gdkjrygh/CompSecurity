// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedPinnersFragment

class this._cls0 extends com.pinterest.api.remote.sFragment._cls1
{

    final UserFollowedPinnersFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.Failure(throwable, apiresponse);
        UserFollowedPinnersFragment.access$000(UserFollowedPinnersFragment.this, throwable, apiresponse);
    }

    public void onSuccess(Feed feed)
    {
        super.Success(feed);
        onPeopleLoaded((UserFeed)feed);
    }

    ()
    {
        this$0 = UserFollowedPinnersFragment.this;
        super();
    }
}
