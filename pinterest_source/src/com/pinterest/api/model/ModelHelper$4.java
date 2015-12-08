// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.activity.create.helper.CreateBoardHelper;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

final class er extends BaseApiResponseHandler
{

    final String val$boardUid;
    final BaseApiResponseHandler val$handler;

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (val$handler != null)
        {
            val$handler.onFailure(throwable, apiresponse);
        }
    }

    public final void onFinish()
    {
        super.onFinish();
        if (val$handler != null)
        {
            val$handler.onFinish();
        }
    }

    public final void onStart()
    {
        super.onStart();
        if (val$handler != null)
        {
            val$handler.onStart();
        }
    }

    public final void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        CreateBoardHelper.removeBoardFromCache(val$boardUid);
        ModelHelper.deleteBoard(val$boardUid);
        if (val$handler != null)
        {
            val$handler.onSuccess(apiresponse);
        }
    }

    er()
    {
        val$handler = baseapiresponsehandler;
        val$boardUid = s;
        super();
    }
}
