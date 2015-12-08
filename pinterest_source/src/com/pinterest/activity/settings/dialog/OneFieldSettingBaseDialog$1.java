// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.base.Application;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            OneFieldSettingBaseDialog

class val.initialValue extends com.pinterest.api.remote.e
{

    final OneFieldSettingBaseDialog this$0;
    final String val$enteredValue;
    final String val$initialValue;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Events.post(new DialogEvent(null));
        setModelValue(val$initialValue);
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Application.showToastShort(getSuccessToast(val$enteredValue));
        Events.post(new DialogEvent(null));
    }

    ()
    {
        this$0 = final_onefieldsettingbasedialog;
        val$enteredValue = s;
        val$initialValue = String.this;
        super();
    }
}
