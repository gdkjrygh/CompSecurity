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
//            PersonalizationSettingDialog

class val.oldAdsCustomizeFromConversion extends com.pinterest.api.remote.ttingDialog._cls2
{

    final PersonalizationSettingDialog this$0;
    final User val$me;
    final boolean val$newPersonalizeFromOffsiteBrowsing;
    final boolean val$oldAdsCustomizeFromConversion;
    final boolean val$oldPersonalizeFromOffsiteBrowsing;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.nFailure(throwable, apiresponse);
        val$me.setPersonalizeFromOffsiteBrowsing(Boolean.valueOf(val$oldPersonalizeFromOffsiteBrowsing));
        val$me.setAdsCustomizeFromConversion(Boolean.valueOf(val$oldAdsCustomizeFromConversion));
        Events.post(new DialogEvent(null));
    }

    public void onStart()
    {
        super.nStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.nSuccess(apiresponse);
        apiresponse = new HashMap();
        apiresponse.put("label", BaseApi.a(val$newPersonalizeFromOffsiteBrowsing));
        Pinalytics.a(EventType.USER_PERSONALIZED_RECOMMENDATIONS_CHANGED, null, apiresponse);
        Application.showToastShort(0x7f070217);
        Events.post(new DialogEvent(null));
    }

    ()
    {
        this$0 = final_personalizationsettingdialog;
        val$newPersonalizeFromOffsiteBrowsing = flag;
        val$me = user;
        val$oldPersonalizeFromOffsiteBrowsing = flag1;
        val$oldAdsCustomizeFromConversion = Z.this;
        super();
    }
}
