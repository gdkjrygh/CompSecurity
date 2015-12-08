// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.User;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            EmailSettingDialog

class > extends com.pinterest.api.remote.Response
{

    final EmailSettingDialog this$0;
    final User val$me;
    final String val$newemailF;
    final String val$oldValue;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Events.post(new DialogEvent(null));
        val$me.setEmail(val$oldValue);
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Application.showToastShort(String.format(Resources.string(0x7f07038d), new Object[] {
            val$newemailF
        }));
        Events.post(new com.pinterest.activity.settings.sFragment.AccountSettingsEvent());
        Events.post(new DialogEvent(null));
    }

    nt.AccountSettingsEvent()
    {
        this$0 = final_emailsettingdialog;
        val$newemailF = s;
        val$me = user;
        val$oldValue = String.this;
        super();
    }
}
