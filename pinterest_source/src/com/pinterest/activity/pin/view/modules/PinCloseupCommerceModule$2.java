// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.text.TextUtils;
import com.pinterest.activity.pin.view.modules.util.ClickThroughUtil;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.model.api.ApiResponse;
import com.pinterest.model.commerce.Merchant;
import com.pinterest.network.api.PinterestCallback;
import com.pinterest.network.api.PinterestError;
import retrofit.client.Response;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupCommerceModule

class val.buyableProduct extends PinterestCallback
{

    final PinCloseupCommerceModule this$0;
    final BuyableProduct val$buyableProduct;

    public void failure(PinterestError pinteresterror)
    {
        ClickThroughUtil.gotoPinLink(val$buyableProduct.getCanonicalMerchantDomain(), _pin, _apiTag);
    }

    public void success(ApiResponse apiresponse, Response response)
    {
        apiresponse = (Merchant)apiresponse.getData();
        response = apiresponse.getReturnPolicyUrl();
        if (!TextUtils.isEmpty(response))
        {
            ClickThroughUtil.gotoPinLink(response, _pin, _apiTag);
            return;
        } else
        {
            ClickThroughUtil.gotoPinLink(apiresponse.getMerchantUrl(), _pin, _apiTag);
            return;
        }
    }

    public volatile void success(Object obj, Response response)
    {
        success((ApiResponse)obj, response);
    }

    ()
    {
        this$0 = final_pincloseupcommercemodule;
        val$buyableProduct = BuyableProduct.this;
        super();
    }
}
