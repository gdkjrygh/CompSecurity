// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.activity.user.view.UserFollowedInterestsView;
import com.pinterest.adapter.InterestsGridAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.model.MyUser;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment, MyUserInterestsGridAdapter

class se extends com.pinterest.api.remote.eedApiResponse
{

    final UserFollowedFragment this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (getView() == null)
        {
            return;
        }
        InterestsFeed interestsfeed;
        boolean flag;
        if (feed.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(_seeAllInterestsBt, flag);
        interestsfeed = (InterestsFeed)feed;
        if (MyUser.isUserMe(UserFollowedFragment.access$200(UserFollowedFragment.this)) && feed.getCount() == 0)
        {
            feed = new MyUserInterestsGridAdapter();
        } else
        {
            feed = new InterestsGridAdapter();
        }
        feed.setDataSource(interestsfeed);
        _followedInterests.setAdapter(feed);
    }

    ter()
    {
        this$0 = UserFollowedFragment.this;
        super();
    }
}
