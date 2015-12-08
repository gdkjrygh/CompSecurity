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
//            NameSettingDialog

class t> extends com.pinterest.api.remote.iResponse
{

    final NameSettingDialog this$0;
    final String val$full;
    final User val$me;
    final String val$oldFirst;
    final String val$oldFull;
    final String val$oldLast;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Events.post(new DialogEvent(null));
        val$me.setFirstName(val$oldFirst);
        val$me.setLastName(val$oldLast);
        val$me.setFullName(val$oldFull);
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Application.showToastShort(String.format(Resources.string(0x7f070226), new Object[] {
            val$full
        }));
        Events.post(new DialogEvent(null));
    }

    ()
    {
        this$0 = final_namesettingdialog;
        val$full = s;
        val$me = user;
        val$oldFirst = s1;
        val$oldLast = s2;
        val$oldFull = String.this;
        super();
    }
}
