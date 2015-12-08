// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Application;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.notification.NotificationHelper;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.service:
//            PinUploader

class piResponse extends com.pinterest.api.remote.esponse
{

    final PinUploader this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        throwable = ((Throwable) (apiresponse.getData()));
        if ((throwable instanceof PinterestJsonObject) && ((PinterestJsonObject)throwable).a("param_name", "").equalsIgnoreCase("sdk_client_id"))
        {
            PinUploader.access$802(PinUploader.this, 10);
            Application.showToast(0x7f0704c7);
            NotificationHelper.cancelNotifPinUpload();
            PinUploader.access$500(PinUploader.this);
            return;
        }
        if (PinUploader.access$800(PinUploader.this) > 3)
        {
            PLog.log("Upload failed entirely, purging :(", new Object[0]);
            PinUploader.access$400(PinUploader.this, 0x7f0703ac);
            PinUploader.access$500(PinUploader.this);
            return;
        } else
        {
            PinUploader.access$1000(PinUploader.this);
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        int _tmp = PinUploader.access$808(PinUploader.this);
        PinUploader.access$400(PinUploader.this, 0x7f0703af);
    }

    public void onSuccess(Pin pin)
    {
        super.onSuccess(pin);
        Pinalytics.a(EventType.PIN_CREATE, pin.getUid());
        if (pin != null && pin.getBoard() != null)
        {
            (new owNotifTask(PinUploader.this, null)).execute(new Pin[] {
                pin
            });
        }
    }

    owNotifTask()
    {
        this$0 = PinUploader.this;
        super();
    }
}
