// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.EventType;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            NewsPrivacyDialog

class t> extends com.pinterest.api.remote.iResponse
{

    final NewsPrivacyDialog this$0;
    final boolean val$checked;
    final User val$me;
    final boolean val$oldCheck;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        val$me.setHideFromNews(Boolean.valueOf(val$oldCheck));
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

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = new HashMap();
        apiresponse.put("label", BaseApi.a(val$checked));
        Pinalytics.a(EventType.USER_SEARCH_PRIVACY_CHANGED, null, apiresponse);
        val$me.setHideFromNews(Boolean.valueOf(val$checked));
        Application.showToastShort(0x7f070216);
    }

    ()
    {
        this$0 = final_newsprivacydialog;
        val$checked = flag;
        val$me = user;
        val$oldCheck = Z.this;
        super();
    }
}
