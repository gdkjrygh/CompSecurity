// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            ContinueEmailSignupFragment

class this._cls0 extends BaseApiResponseHandler
{

    final ContinueEmailSignupFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Events.post(new DialogEvent(null));
        PLog.error(throwable, "Email check failed", new Object[0]);
        Application.showToast(0x7f070234);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Events.post(new DialogEvent(null));
        apiresponse = (String)apiresponse.getData();
        ContinueEmailSignupFragment.access$100(ContinueEmailSignupFragment.this, apiresponse.equals("true"));
    }

    ()
    {
        this$0 = ContinueEmailSignupFragment.this;
        super();
    }
}
