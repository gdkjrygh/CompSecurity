// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Comment;

public abstract class _pinUid extends ApiResponseHandler
{

    private String _pinUid;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            public Comment a;
            final ApiResponse b;
            final PinApi.CommentApiResponse c;

            public void onFinish()
            {
                if (a != null)
                {
                    Events.post(new com.pinterest.api.model.Comment.CreateEvent(a));
                    c.onSuccess(a);
                    Pinalytics.a(EventType.PIN_COMMENT, a.getUid());
                }
            }

            public void run()
            {
                a = Comment.make(c._pinUid, (PinterestJsonObject)b.getData());
            }

            _cls1(ApiResponse apiresponse)
            {
                c = PinApi.CommentApiResponse.this;
                b = apiresponse;
                super();
            }
        }

        (new _cls1(apiresponse)).execute();
    }

    public void onSuccess(Comment comment)
    {
    }


    protected _cls1(String s)
    {
        super(true);
        _pinUid = s;
    }
}
