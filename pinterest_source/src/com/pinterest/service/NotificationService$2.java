// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.service:
//            NotificationService

class this._cls0 extends ApiResponseHandler
{

    final NotificationService this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.info("onNotifLoad.onFailure", new Object[0]);
        stopSelf();
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        boolean flag;
        try
        {
            apiresponse = ((PinterestJsonArray)apiresponse.getData()).c(0);
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponse apiresponse)
        {
            apiresponse = null;
        }
        if (apiresponse != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PLog.info((new StringBuilder("onNotifLoad.onSuccess: ")).append(flag).toString(), new Object[0]);
        if (!flag)
        {
            stopSelf();
            return;
        } else
        {
            (new owNotifTask(NotificationService.this, null)).execute(new PinterestJsonObject[] {
                apiresponse
            });
            Pinalytics.a(EventType.PULL_NOTIFICATION_RECEIVED_BY, ApplicationInfo.getInstallId());
            return;
        }
    }

    ct()
    {
        this$0 = NotificationService.this;
        super();
    }
}
