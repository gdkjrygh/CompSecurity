// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiClient;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

final class <init> extends BaseApiResponseHandler
{

    private BaseApiResponseHandler a;

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (a != null)
        {
            a.onFailure(throwable, apiresponse);
        }
        a = null;
    }

    public final void onFinish()
    {
        if (a != null)
        {
            a.onFinish();
        }
    }

    public final void onStart()
    {
        if (a != null)
        {
            a.onStart();
        }
    }

    public final void onSuccess(ApiResponse apiresponse)
    {
        try
        {
            if (apiresponse.getData() != null)
            {
                ApiClient.a(((PinterestJsonObject)apiresponse.getData()).a("access_token", ""));
            }
        }
        catch (Exception exception) { }
        if (a != null)
        {
            a.onSuccess(apiresponse);
        }
        a = null;
    }

    private (BaseApiResponseHandler baseapiresponsehandler)
    {
        a = baseapiresponsehandler;
    }

    a(BaseApiResponseHandler baseapiresponsehandler, byte byte0)
    {
        this(baseapiresponsehandler);
    }
}
