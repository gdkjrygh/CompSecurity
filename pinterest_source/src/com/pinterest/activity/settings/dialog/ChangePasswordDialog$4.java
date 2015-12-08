// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            ChangePasswordDialog

class this._cls0 extends ApiResponseHandler
{

    final ChangePasswordDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.error(throwable, "ApiResponseHandler response: %s", new Object[] {
            apiresponse
        });
        ChangePasswordDialog.access$200(ChangePasswordDialog.this, apiresponse);
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Pinalytics.a(EventType.USER_PASSWORD_RESET_COMPLETED, null);
        Application.showToast(0x7f0700da);
        apiresponse = new com.pinterest.api.remote.<init>();
        apiresponse.b = MyUser.get().getUsername();
        apiresponse.e = ChangePasswordDialog.access$100(ChangePasswordDialog.this);
        ApiResponseHandler.setForceUnauthedLogout(false);
        class _cls1 extends com.pinterest.api.remote.AccountApi.LoginApiResponse
        {

            final ChangePasswordDialog._cls4 this$1;

            public void onFinish()
            {
                super.onFinish();
                ApiResponseHandler.setForceUnauthedLogout(true);
            }

            _cls1(boolean flag)
            {
                this$1 = ChangePasswordDialog._cls4.this;
                super(flag);
            }
        }

        try
        {
            AccountApi.a(apiresponse, new _cls1(true));
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponse apiresponse)
        {
            PLog.error(apiresponse, "exception occurred", new Object[0]);
        }
        Events.post(new DialogEvent(null));
    }

    _cls1(boolean flag)
    {
        this$0 = ChangePasswordDialog.this;
        super(flag);
    }
}
