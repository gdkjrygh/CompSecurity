// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.User;
import com.pinterest.appwidget.PWidgetHelper;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.receiver.GlobalDataUpdateReceiver;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class  extends com.pinterest.api.remote.se
{

    final SocialConnectActivity this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
    }

    public void onFinish()
    {
        super.onFinish();
        Events.post(new DialogEvent(null));
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(User user)
    {
        super.onSuccess(user);
        GlobalDataUpdateReceiver.c();
        PWidgetHelper.notifyWidgetStateChange(Application.context());
        Events.post(new DialogEvent(null));
        ActivityHelper.goPostSignup(SocialConnectActivity.this);
        finish();
    }

    ()
    {
        this$0 = SocialConnectActivity.this;
        super();
    }
}
