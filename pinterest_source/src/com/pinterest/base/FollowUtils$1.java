// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.base:
//            Events, FollowUtils

class ler extends ApiResponseHandler
{

    final FollowUtils this$0;
    final boolean val$follow;
    final com.pinterest.api.remote.llowApiResponse val$handler;
    final boolean val$overrideContextLog;
    final User val$user;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        val$handler.onFailure();
    }

    public void onFinish()
    {
        super.onFinish();
        val$handler.onFinish();
    }

    public void onStart()
    {
        super.onStart();
        val$handler.onStart();
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        val$user.setFollowing(val$follow);
        ModelHelper.setUser(val$user);
        if (!val$overrideContextLog)
        {
            if (val$user.getFollowing().booleanValue())
            {
                apiresponse = EventType.USER_FOLLOW;
            } else
            {
                apiresponse = EventType.USER_UNFOLLOW;
            }
            Pinalytics.a(apiresponse, val$user.getUid());
        }
        Events.post(new com.pinterest.api.model.wEvent(val$user));
        val$handler.onSuccess(val$user);
    }

    esponse()
    {
        this$0 = final_followutils;
        val$user = user1;
        val$follow = flag;
        val$overrideContextLog = flag1;
        val$handler = com.pinterest.api.remote.llowApiResponse.this;
        super();
    }
}
