// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.kit.log.PLog;

final class  extends BaseApiResponseHandler
{

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.log("Submitting: FAILED mobile_perf %s", apiresponse.getMessageDisplay(), new Object[0]);
    }

    public final void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        PLog.log("Submitting: Success mobile_perf", new Object[0]);
    }

    ()
    {
    }
}
