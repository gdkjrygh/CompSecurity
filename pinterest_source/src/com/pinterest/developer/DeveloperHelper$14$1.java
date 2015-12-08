// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;

class a extends ApiResponseHandler
{

    final s a;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Application.showToast((new StringBuilder("loadWidgetAvailability: ")).append(apiresponse).toString());
    }

    ( )
    {
        a = ;
        super();
    }
}
