// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            CreateNewPasswordDialog

class this._cls0 extends ApiResponseHandler
{

    final CreateNewPasswordDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(apiresponse.getMessageDetailIfExist());
        CreateNewPasswordDialog.show(_pwdParams);
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Application.showToast(0x7f0700da);
        CreateNewPasswordDialog.access$100(CreateNewPasswordDialog.this);
        Events.post(new DialogEvent(null));
    }

    (boolean flag)
    {
        this$0 = CreateNewPasswordDialog.this;
        super(flag);
    }
}
