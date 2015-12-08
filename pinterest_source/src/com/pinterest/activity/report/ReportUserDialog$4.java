// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.event.DialogHideEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.User;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.report:
//            ReportUserDialog

class this._cls0 extends ApiResponseHandler
{

    final ReportUserDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (apiresponse != null)
        {
            Application.showToast(apiresponse.getMessageDisplay());
        } else
        if (_user.getFullName() != null)
        {
            Application.showToast(Resources.string(0x7f0704b5, new Object[] {
                _user.getFullName()
            }));
            return;
        }
    }

    public void onFinish()
    {
        super.onFinish();
        Events.post(new DialogHideEvent(true));
    }

    public void onStart()
    {
        if (_user.getFullName() != null)
        {
            Events.post(new DialogEvent(new LoadingDialog(String.format(Resources.string(0x7f0704b6), new Object[] {
                _user.getFullName()
            }))));
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Pinalytics.a(EventType.USER_REPORT, _user.getUid());
        if (_user.getFullName() != null)
        {
            Application.showToast(Resources.string(0x7f0704b7, new Object[] {
                _user.getFullName()
            }));
        }
    }

    ()
    {
        this$0 = ReportUserDialog.this;
        super();
    }
}
