// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialogView

class nit> extends com.pinterest.api.remote.iResponse
{

    final LoginDialogView this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        StopWatch.get().invalidate("login_email");
        Events.post(new DialogEvent(null));
        LoginDialogView.access$300(LoginDialogView.this, throwable, apiresponse);
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onTokenSaved()
    {
        LoginDialogView.access$200(LoginDialogView.this);
    }

    ()
    {
        this$0 = LoginDialogView.this;
        super();
    }
}
