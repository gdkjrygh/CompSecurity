// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.widget.EditText;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.User;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            UsernameSettingDialog

class val.oldValue extends com.pinterest.api.remote.ponse
{

    final UsernameSettingDialog this$0;
    final User val$me;
    final String val$newnameF;
    final String val$oldValue;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Events.post(new DialogEvent(null));
        val$me.setUsername(val$oldValue);
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        if (_username != null)
        {
            _username.setText(val$newnameF);
        }
        Application.showToastShort(String.format(Resources.string(0x7f070393), new Object[] {
            val$newnameF
        }));
        Events.post(new DialogEvent(null));
    }

    ()
    {
        this$0 = final_usernamesettingdialog;
        val$newnameF = s;
        val$me = user;
        val$oldValue = String.this;
        super();
    }
}
