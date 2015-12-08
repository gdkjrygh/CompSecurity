// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare.util;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.ImageApi;
import com.pinterest.base.Application;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.sendshare.util:
//            SendShareUtils

class saved extends BackgroundTask
{

    private boolean saved;
    final SendShareUtils this$0;
    final Pin val$pin;

    public void onFinish()
    {
        super.onFinish();
        Pinalytics.a(EventType.PIN_SAVE_TO_DEVICE, val$pin.getUid());
        int i;
        int j;
        if (saved)
        {
            i = 0x7f070410;
        } else
        {
            i = 0x7f07040f;
        }
        if (saved)
        {
            j = 0;
        } else
        {
            j = 0x7f020173;
        }
        Application.showToast(i, j);
    }

    public void run()
    {
        saved = ImageApi.a(val$pin.getImageLargeUrl());
    }

    ()
    {
        this$0 = final_sendshareutils;
        val$pin = Pin.this;
        super();
        saved = false;
    }
}
