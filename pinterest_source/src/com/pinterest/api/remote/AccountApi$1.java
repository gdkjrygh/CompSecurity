// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Events;
import com.pinterest.network.json.PinterestJsonObject;

final class onObject extends ApiResponseHandler
{

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (apiresponse.getCode() == 820)
        {
            Events.post(new viteCodeValidationResult(false));
        }
    }

    public final void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        if (!(apiresponse instanceof PinterestJsonObject))
        {
            return;
        }
        boolean flag;
        if (!((PinterestJsonObject)apiresponse).a("is_accepted", Boolean.valueOf(false)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Events.post(new viteCodeValidationResult(flag));
    }

    onObject()
    {
    }
}
