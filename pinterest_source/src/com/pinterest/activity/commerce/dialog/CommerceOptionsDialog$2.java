// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.activity.commerce.event.ShippingAddressDeletedEvent;
import com.pinterest.base.Events;
import com.pinterest.model.api.ApiResponse;
import retrofit.client.Response;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceOptionsDialog

class mmerceOptionsCallback extends mmerceOptionsCallback
{

    final CommerceOptionsDialog this$0;

    public void success(ApiResponse apiresponse, Response response)
    {
        super.success(apiresponse, response);
        Events.post(new ShippingAddressDeletedEvent(CommerceOptionsDialog.access$200(CommerceOptionsDialog.this)));
    }

    public volatile void success(Object obj, Response response)
    {
        success((ApiResponse)obj, response);
    }

    nt()
    {
        this$0 = CommerceOptionsDialog.this;
        super(CommerceOptionsDialog.this, null);
    }
}
