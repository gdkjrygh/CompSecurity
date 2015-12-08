// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.model.api.ApiResponse;
import com.pinterest.network.api.PinterestError;
import com.pinterest.reporting.CrashReporting;
import retrofit.client.Response;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CheckoutController

class faultFailure extends PinterestCallbackWithDefaultFailure
{

    final CheckoutController this$0;

    public void failure(PinterestError pinteresterror)
    {
        super.failure(pinteresterror);
        CrashReporting.a(pinteresterror.b());
        CheckoutController.access$1602(CheckoutController.this, false);
    }

    public void success(ApiResponse apiresponse, Response response)
    {
        CheckoutController.access$1602(CheckoutController.this, ((Boolean)apiresponse.getData()).booleanValue());
    }

    public volatile void success(Object obj, Response response)
    {
        success((ApiResponse)obj, response);
    }

    faultFailure()
    {
        this$0 = CheckoutController.this;
        super();
    }
}
