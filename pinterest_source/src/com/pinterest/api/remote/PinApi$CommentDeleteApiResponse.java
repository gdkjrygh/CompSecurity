// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;

public abstract class _cls1 extends ApiResponseHandler
{

    protected String _commentUid;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            final PinApi.CommentDeleteApiResponse a;

            public void run()
            {
                com.pinterest.api.model.Comment comment = ModelHelper.getComment(a._commentUid);
                ModelHelper.deletePinComment(a._commentUid);
                Pinalytics.a(EventType.PIN_DELETE_COMMENT, a._commentUid);
                Events.post(new com.pinterest.api.model.Comment.UpdateEvent(comment, true));
            }

            _cls1()
            {
                a = PinApi.CommentDeleteApiResponse.this;
                super();
            }
        }

        (new _cls1()).execute();
    }

    public void setCommentUid(String s)
    {
        _commentUid = s;
    }

    protected _cls1()
    {
    }

    protected _cls1(int i)
    {
        super(i);
    }

    protected _cls1(boolean flag)
    {
        super(flag);
    }
}
