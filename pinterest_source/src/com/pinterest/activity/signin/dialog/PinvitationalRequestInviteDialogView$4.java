// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            PinvitationalRequestInviteDialogView, PinvitationalRequestInviteFailureDialog

class val.emailAddress extends BaseApiResponseHandler
{

    final PinvitationalRequestInviteDialogView this$0;
    final String val$emailAddress;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        PinvitationalRequestInviteDialogView.access$100(PinvitationalRequestInviteDialogView.this, false);
        AnalyticsApi.c("wl_errored");
        Events.post(new DialogEvent(new PinvitationalRequestInviteFailureDialog(val$emailAddress, apiresponse)));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        _dialog.dismiss();
        Events.post(new com.pinterest.api.remote.viteResult(val$emailAddress));
    }

    ()
    {
        this$0 = final_pinvitationalrequestinvitedialogview;
        val$emailAddress = String.this;
        super();
    }
}
