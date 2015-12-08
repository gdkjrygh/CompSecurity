// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

class this._cls0 extends ApiResponseHandler
{

    final ReportPinBaseFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (apiresponse != null)
        {
            Application.showToast(apiresponse.getMessageDisplay());
            return;
        } else
        {
            Application.showToast(0x7f0704ae);
            return;
        }
    }

    public void onStart()
    {
        Application.showToast(0x7f0704af);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Pinalytics.a(EventType.PIN_FLAG, getPinId());
        Application.showToast(0x7f0704b0);
    }

    ()
    {
        this$0 = ReportPinBaseFragment.this;
        super();
    }
}
