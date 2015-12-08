// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Story;
import com.pinterest.api.remote.NetworkStoryApi;
import com.pinterest.fragment.PeopleListFragment;

public class StoryPinnersFragment extends PeopleListFragment
{

    private Story _story;

    public StoryPinnersFragment()
    {
    }

    protected void loadData()
    {
        super.loadData();
        NetworkStoryApi.a(_navigation.getId(), 2, new _cls1(), getApiTag());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03010e;
        _menuId = 0x7f10000a;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(_story.getRelatedHeader());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _story = (Story)navigation.getCachedModel();
    }


    private class _cls1 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final StoryPinnersFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            onLoadFailed(throwable, apiresponse);
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            onPeopleLoaded((UserFeed)feed);
        }

        _cls1()
        {
            this$0 = StoryPinnersFragment.this;
            super();
        }
    }

}
