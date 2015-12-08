// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

class val.response extends BackgroundTask
{

    public Board board;
    final val.response this$1;
    final ApiResponse val$response;

    public void onFinish()
    {
        Success(board);
    }

    public void run()
    {
        board = Board.make((PinterestJsonObject)val$response.getData(), false).response();
    }

    ()
    {
        this$1 = final_;
        val$response = ApiResponse.this;
        super();
    }
}
