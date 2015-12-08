// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.UserApi;

public class FollowUtils
{

    private static FollowUtils sInstance = null;

    protected FollowUtils()
    {
    }

    public static FollowUtils getInstance()
    {
        com/pinterest/base/FollowUtils;
        JVM INSTR monitorenter ;
        FollowUtils followutils;
        if (sInstance == null)
        {
            sInstance = new FollowUtils();
        }
        followutils = sInstance;
        com/pinterest/base/FollowUtils;
        JVM INSTR monitorexit ;
        return followutils;
        Exception exception;
        exception;
        throw exception;
    }

    public void followBoard(String s, boolean flag, com.pinterest.api.remote.BoardApi.BoardFollowApiResponse boardfollowapiresponse, String s1)
    {
        followBoard(s, flag, boardfollowapiresponse, s1, false);
    }

    public void followBoard(String s, final boolean follow, final com.pinterest.api.remote.BoardApi.BoardFollowApiResponse handler, String s1, final boolean overrideContextLog)
    {
        final Board board = ModelHelper.getBoard(s);
        if (board != null)
        {
            BoardApi.a(s, follow, new _cls2(), s1);
        }
    }

    public void followUser(String s, boolean flag, com.pinterest.api.remote.UserApi.UserFollowApiResponse userfollowapiresponse, String s1)
    {
        followUser(s, flag, userfollowapiresponse, s1, false);
    }

    public void followUser(String s, final boolean follow, final com.pinterest.api.remote.UserApi.UserFollowApiResponse handler, String s1, final boolean overrideContextLog)
    {
        final User user = ModelHelper.getUser(s);
        if (user != null)
        {
            UserApi.c(s, follow, new _cls1(), s1);
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final FollowUtils this$0;
        final Board val$board;
        final boolean val$follow;
        final com.pinterest.api.remote.BoardApi.BoardFollowApiResponse val$handler;
        final boolean val$overrideContextLog;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            handler.onFailure();
        }

        public void onFinish()
        {
            super.onFinish();
            handler.onFinish();
        }

        public void onStart()
        {
            super.onStart();
            handler.onStart();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            board.setFollowing(Boolean.valueOf(follow));
            ModelHelper.setBoard(board);
            if (!overrideContextLog)
            {
                if (board.getFollowing().booleanValue())
                {
                    apiresponse = EventType.BOARD_FOLLOW;
                } else
                {
                    apiresponse = EventType.BOARD_UNFOLLOW;
                }
                Pinalytics.a(apiresponse, board.getUid());
            }
            handler.onSuccess(board);
        }

        _cls2()
        {
            this$0 = FollowUtils.this;
            board = board1;
            follow = flag;
            overrideContextLog = flag1;
            handler = boardfollowapiresponse;
            super();
        }
    }


    private class _cls1 extends ApiResponseHandler
    {

        final FollowUtils this$0;
        final boolean val$follow;
        final com.pinterest.api.remote.UserApi.UserFollowApiResponse val$handler;
        final boolean val$overrideContextLog;
        final User val$user;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            handler.onFailure();
        }

        public void onFinish()
        {
            super.onFinish();
            handler.onFinish();
        }

        public void onStart()
        {
            super.onStart();
            handler.onStart();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            user.setFollowing(follow);
            ModelHelper.setUser(user);
            if (!overrideContextLog)
            {
                if (user.getFollowing().booleanValue())
                {
                    apiresponse = EventType.USER_FOLLOW;
                } else
                {
                    apiresponse = EventType.USER_UNFOLLOW;
                }
                Pinalytics.a(apiresponse, user.getUid());
            }
            Events.post(new com.pinterest.api.model.User.UserFollowEvent(user));
            handler.onSuccess(user);
        }

        _cls1()
        {
            this$0 = FollowUtils.this;
            user = user1;
            follow = flag;
            overrideContextLog = flag1;
            handler = userfollowapiresponse;
            super();
        }
    }

}
