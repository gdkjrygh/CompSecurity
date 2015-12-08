// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Events;
import com.pinterest.network.json.PinterestJsonObject;

public class a extends ApiResponseHandler
{

    private Board a;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        if (a != null)
        {
            apiresponse = (PinterestJsonObject)apiresponse.getData();
            if (apiresponse != null)
            {
                apiresponse = apiresponse.a("layout", "");
                if (apiresponse != null)
                {
                    a.setLayout(apiresponse);
                    Events.post(new com.pinterest.activity.board.dialog.it>(apiresponse));
                    ModelHelper.setBoard(a);
                }
            }
        }
    }

    public Changed(Board board)
    {
        super(false);
        a = board;
    }
}
