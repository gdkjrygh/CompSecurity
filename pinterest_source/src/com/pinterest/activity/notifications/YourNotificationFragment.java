// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.activity.notifications.adapter.NotificationAdapter;
import com.pinterest.activity.notifications.adapter.StoryAdapter;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.MyUserApi;

// Referenced classes of package com.pinterest.activity.notifications:
//            BaseNotificationFragment, NotificationCount

public class YourNotificationFragment extends BaseNotificationFragment
{

    public YourNotificationFragment()
    {
    }

    protected NotificationAdapter createAdapter()
    {
        return new NotificationAdapter();
    }

    protected volatile StoryAdapter createAdapter()
    {
        return createAdapter();
    }

    protected volatile BaseApiResponseHandler createResponseHandler()
    {
        return createResponseHandler();
    }

    protected com.pinterest.api.remote.MyUserApi.NotificationFeedApiResponse createResponseHandler()
    {
        return new _cls1();
    }

    protected int getEmptyMessageResourceId()
    {
        return 0x7f070268;
    }

    protected void loadData()
    {
        MyUserApi.a((com.pinterest.api.remote.MyUserApi.NotificationFeedApiResponse)_apiResponseHandler, getApiTag());
        updateEmptyContent();
    }

    protected void onActivate()
    {
        super.onActivate();
        if (NotificationCount.getUnseenYourStoryCount() != 0)
        {
            NotificationCount.setUnseenYourStoryCount(0);
            MyUserApi.b(getApiTag());
        }
    }

    private class _cls1 extends com.pinterest.api.remote.MyUserApi.NotificationFeedApiResponse
    {

        final YourNotificationFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            handleApiResponseOnFailure();
        }

        public void onStart()
        {
            super.onStart();
            handleApiResponseOnStart();
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            handleApiResponseOnSuccess((NotificationFeed)feed);
        }

        _cls1()
        {
            this$0 = YourNotificationFragment.this;
            super();
        }
    }

}
