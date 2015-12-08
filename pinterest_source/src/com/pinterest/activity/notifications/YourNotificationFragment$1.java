// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.NotificationFeed;

// Referenced classes of package com.pinterest.activity.notifications:
//            YourNotificationFragment

class init> extends com.pinterest.api.remote.piResponse
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

    ()
    {
        this$0 = YourNotificationFragment.this;
        super();
    }
}
