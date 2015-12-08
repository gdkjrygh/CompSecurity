// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.DeepLinkLogging;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupConfirmDialog, SignupFailureDialog

class this._cls0 extends ApiResponseHandler
{

    final SignupConfirmDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        StopWatch.get().invalidate("signup_email");
        int i;
        if (getPartnerSignup())
        {
            i = 6;
        } else
        {
            i = SignupConfirmDialog.access$000(SignupConfirmDialog.this).a();
        }
        Events.post(new DialogEvent(new SignupFailureDialog(throwable, apiresponse, i, SignupConfirmDialog.access$000(SignupConfirmDialog.this).u)));
    }

    public void onFinish()
    {
        ActivityHelper.setPostSignup(true);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        MyUser.setAccessToken((String)apiresponse.getData());
        if (getPartnerSignup())
        {
            apiresponse = "register_partner";
        } else
        {
            apiresponse = "register_email";
        }
        AnalyticsApi.a(apiresponse);
        (new DeepLinkLogging()).a(EventType.REFERRER_APP_SIGNUP);
        MyUserApi.a(SignupConfirmDialog.access$100(SignupConfirmDialog.this), null);
    }

    (int i)
    {
        this$0 = SignupConfirmDialog.this;
        super(i);
    }
}
