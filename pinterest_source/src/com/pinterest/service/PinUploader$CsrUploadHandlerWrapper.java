// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.SiteApi;
import com.pinterest.schemas.event.EventType;
import java.util.HashMap;

// Referenced classes of package com.pinterest.service:
//            PinUploader

class _csrId extends com.pinterest.api.remote.rId
{

    private String _csrId;
    final PinUploader this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PinUploader.access$1100(PinUploader.this)._mth0(throwable, apiresponse);
    }

    public void onStart()
    {
        PinUploader.access$1100(PinUploader.this)._mth0();
    }

    public void onSuccess(final Pin pin)
    {
        super.pin(pin);
        if (pin != null && pin.getBoard() != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("csr_id", _csrId);
            Pinalytics.a(EventType.PIN_REPIN, pin.getUid(), hashmap);
            class _cls1 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
            {

                final PinUploader.CsrUploadHandlerWrapper this$1;
                final Pin val$pin;

                public void onFailure(Throwable throwable, ApiResponse apiresponse)
                {
                    super.onFailure(throwable, apiresponse);
                    (new PinUploader.ShowNotifTask(this$0, null)).execute(new Pin[] {
                        pin
                    });
                }

                public void onSuccess(Feed feed)
                {
                    super.onSuccess(feed);
                    feed = new PinUploader.CsrNotificationTaskParams(this$0, pin, feed.getItems());
                    (new PinUploader.ShowCsrNotificationTask(this$0, null)).execute(new PinUploader.CsrNotificationTaskParams[] {
                        feed
                    });
                }

            _cls1()
            {
                this$1 = PinUploader.CsrUploadHandlerWrapper.this;
                pin = pin1;
                super();
            }
            }

            SiteApi.a(pin.getDomain(), new _cls1());
        }
    }

    public _cls1(String s)
    {
        this$0 = PinUploader.this;
        super();
        _csrId = s;
    }
}
