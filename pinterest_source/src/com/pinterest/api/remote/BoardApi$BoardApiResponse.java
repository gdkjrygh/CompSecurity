// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;

public abstract class _cls1 extends ApiResponseHandler
{

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            public Board a;
            final ApiResponse b;
            final BoardApi.BoardApiResponse c;

            public void onFinish()
            {
                c.onSuccess(a);
            }

            public void run()
            {
                a = Board.make((PinterestJsonObject)b.getData(), true).getBoard();
            }

            _cls1(ApiResponse apiresponse)
            {
                c = BoardApi.BoardApiResponse.this;
                b = apiresponse;
                super();
            }
        }

        (new _cls1(apiresponse)).execute();
    }

    public void onSuccess(Board board)
    {
    }

    public _cls1()
    {
    }

    public _cls1(boolean flag)
    {
        super(flag);
    }
}
