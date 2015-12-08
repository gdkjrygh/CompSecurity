// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.activity.commerce.view.CheckoutView;
import com.pinterest.activity.commerce.viewmodel.CheckoutViewModel;
import com.pinterest.education.EducationHelper;
import com.pinterest.model.api.ApiResponse;
import com.pinterest.model.commerce.Cart;
import com.pinterest.network.api.PinterestError;
import retrofit.client.Response;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CheckoutController

class faultFailure extends PinterestCallbackWithDefaultFailure
{

    final CheckoutController this$0;
    final boolean val$isTotalsCalculation;

    public void failure(PinterestError pinteresterror)
    {
        EducationHelper.a(CheckoutController.access$1500(CheckoutController.this));
        if (CheckoutController.access$600(CheckoutController.this) == null)
        {
            return;
        } else
        {
            CheckoutController.access$500(CheckoutController.this).flagFailure();
            CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
            super.failure(pinteresterror);
            return;
        }
    }

    public void success(ApiResponse apiresponse, Response response)
    {
        if (CheckoutController.access$600(CheckoutController.this) == null)
        {
            return;
        }
        CheckoutController.access$1102(CheckoutController.this, (Cart)apiresponse.getData());
        CheckoutController.access$1200(CheckoutController.this);
        if (val$isTotalsCalculation)
        {
            CheckoutController.access$500(CheckoutController.this).updateCartWithTotals(CheckoutController.access$1100(CheckoutController.this));
            CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
        } else
        {
            CheckoutController.access$1300(CheckoutController.this, apiresponse);
        }
        CheckoutController.access$1400(CheckoutController.this);
    }

    public volatile void success(Object obj, Response response)
    {
        success((ApiResponse)obj, response);
    }

    ()
    {
        this$0 = final_checkoutcontroller;
        val$isTotalsCalculation = Z.this;
        super();
    }
}
