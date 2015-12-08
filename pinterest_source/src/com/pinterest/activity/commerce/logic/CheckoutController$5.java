// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.activity.commerce.view.CheckoutView;
import com.pinterest.activity.commerce.viewmodel.CheckoutViewModel;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.model.api.ApiErrorResponse;
import com.pinterest.model.api.ApiResponse;
import com.pinterest.model.commerce.Cart;
import com.pinterest.model.common.ErrorBody;
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
        Events.post(new DialogEvent(null));
        CheckoutController.access$500(CheckoutController.this).flagFailure();
        CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
        pinteresterror = pinteresterror.a();
        if (pinteresterror != null && pinteresterror.getData() != null && ((ErrorBody)pinteresterror.getData()).getCartStatus() == com.pinterest.model.commerce.ILED.dinal())
        {
            CheckoutController.access$500(CheckoutController.this).setShowProgress();
            CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
            CheckoutController.access$700(CheckoutController.this);
        }
    }

    public void success(ApiResponse apiresponse, Response response)
    {
        if (CheckoutController.access$800(CheckoutController.this) && CheckoutController.access$900(CheckoutController.this) != null)
        {
            CheckoutController.access$900(CheckoutController.this).b();
        }
        CheckoutController.access$1000(CheckoutController.this, (Cart)apiresponse.getData());
    }

    public volatile void success(Object obj, Response response)
    {
        success((ApiResponse)obj, response);
    }

    ()
    {
        this$0 = CheckoutController.this;
        super();
    }
}
