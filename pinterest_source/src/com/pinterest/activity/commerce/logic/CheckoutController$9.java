// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.activity.commerce.view.CheckoutView;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.SimpleToast;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.api.ApiResponse;
import com.pinterest.network.api.PinterestError;
import retrofit.client.Response;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CheckoutController

class faultFailure extends PinterestCallbackWithDefaultFailure
{

    final CheckoutController this$0;

    public void failure(PinterestError pinteresterror)
    {
        super.failure(pinteresterror);
        CheckoutController.access$802(CheckoutController.this, false);
        Events.post(new ToastEvent(new SimpleToast(Resources.string(0x7f0706f1))));
    }

    public void success(ApiResponse apiresponse, Response response)
    {
        CheckoutController.access$802(CheckoutController.this, true);
        CheckoutController.access$1200(CheckoutController.this);
        CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
        CheckoutController.access$1700(CheckoutController.this);
        CheckoutController.access$1800(CheckoutController.this);
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
