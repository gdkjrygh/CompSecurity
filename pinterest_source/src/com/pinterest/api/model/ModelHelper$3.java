// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

final class er extends BaseApiResponseHandler
{

    final BaseApiResponseHandler val$handler;
    final String val$pinUid;

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        val$handler.onFailure(throwable, apiresponse);
    }

    public final void onFinish()
    {
        val$handler.onFinish();
    }

    public final void onStart()
    {
        val$handler.onStart();
    }

    public final void onSuccess(ApiResponse apiresponse)
    {
        ModelHelper.deletePin(val$pinUid);
        val$handler.onSuccess(apiresponse);
    }

    er()
    {
        val$pinUid = s;
        val$handler = baseapiresponsehandler;
        super();
    }
}
