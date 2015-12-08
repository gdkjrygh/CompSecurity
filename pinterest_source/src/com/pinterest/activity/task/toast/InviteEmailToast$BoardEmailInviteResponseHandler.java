// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.base.Application;

class _email extends BaseApiResponseHandler
{

    private String _email;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.forceShowToast(apiresponse.getMessageDetail());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
    }

    public (String s)
    {
        _email = s;
    }
}
