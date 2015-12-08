// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.activity.conversation.HideConversationTask;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.event.DialogHideEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.report:
//            ReportConversationDialog

class this._cls0 extends ApiResponseHandler
{

    final ReportConversationDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(Resources.string(0x7f0704a4));
    }

    public void onFinish()
    {
        super.onFinish();
        Events.post(new DialogHideEvent(true));
    }

    public void onStart()
    {
        Events.post(new DialogEvent(new LoadingDialog(Resources.string(0x7f0704a6))));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Application.showToast(Resources.string(0x7f0704a7));
        (new HideConversationTask(ReportConversationDialog.access$200(ReportConversationDialog.this))).execute();
    }

    ()
    {
        this$0 = ReportConversationDialog.this;
        super();
    }
}
