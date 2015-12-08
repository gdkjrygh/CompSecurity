// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.base:
//            FollowUtils

class ler extends ApiResponseHandler
{

    final FollowUtils this$0;
    final Board val$board;
    final boolean val$follow;
    final com.pinterest.api.remote.FollowApiResponse val$handler;
    final boolean val$overrideContextLog;

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
        val$board.setFollowing(Boolean.valueOf(val$follow));
        ModelHelper.setBoard(val$board);
        if (!val$overrideContextLog)
        {
            if (val$board.getFollowing().booleanValue())
            {
                apiresponse = EventType.BOARD_FOLLOW;
            } else
            {
                apiresponse = EventType.BOARD_UNFOLLOW;
            }
            Pinalytics.a(apiresponse, val$board.getUid());
        }
        val$handler.onSuccess(val$board);
    }

    iResponse()
    {
        this$0 = final_followutils;
        val$board = board1;
        val$follow = flag;
        val$overrideContextLog = flag1;
        val$handler = com.pinterest.api.remote.FollowApiResponse.this;
        super();
    }
}
