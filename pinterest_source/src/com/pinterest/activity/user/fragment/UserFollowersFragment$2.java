// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowersFragment

class this._cls0 extends com.pinterest.api.remote.nse
{

    final UserFollowersFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        UserFollowersFragment.access$100(UserFollowersFragment.this, throwable, apiresponse);
    }

    public void onFinish()
    {
        super.onFinish();
        if (_swipeVw != null)
        {
            _swipeVw.setRefreshing(false);
        }
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        onPeopleLoaded((UserFeed)feed);
    }

    ()
    {
        this$0 = UserFollowersFragment.this;
        super();
    }
}
