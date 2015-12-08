// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.activity.commerce.event.SecureDialogActivityEvent;
import com.pinterest.activity.commerce.event.ShippingAddressSelectedEvent;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.model.api.ApiResponse;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.network.api.PinterestError;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import retrofit.client.Response;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            AddressFormFragmentController

class e extends PinterestCallbackWithDefaultFailure
{

    final AddressFormFragmentController this$0;

    public void failure(PinterestError pinteresterror)
    {
        Events.post(new DialogEvent(null));
        super.failure(pinteresterror);
    }

    public void success(ApiResponse apiresponse, Response response)
    {
        Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SETTINGS_ADDRESS_SAVE_BUTTON, null, null);
        Events.postSticky(new ShippingAddressSelectedEvent((DetailedShipping)apiresponse.getData(), true));
        Events.post(new DialogEvent(null));
        Events.post(new SecureDialogActivityEvent(com.pinterest.activity.commerce.event.lose));
    }

    public volatile void success(Object obj, Response response)
    {
        success((ApiResponse)obj, response);
    }

    e()
    {
        this$0 = AddressFormFragmentController.this;
        super();
    }
}
