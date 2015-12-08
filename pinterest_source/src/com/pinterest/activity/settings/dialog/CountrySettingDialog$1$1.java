// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.activity.settings.Country;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

class val.country extends ApiResponseHandler
{

    final ccountSettingsEvent this$1;
    final Country val$country;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Events.post(new DialogEvent(null));
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Application.showToastShort(String.format(Resources.string(0x7f07038c), new Object[] {
            val$country.name
        }));
        super.onSuccess(apiresponse);
        Events.post(new DialogEvent(null));
        Events.post(new com.pinterest.activity.settings.gment.AccountSettingsEvent());
    }

    ccountSettingsEvent()
    {
        this$1 = final_ccountsettingsevent;
        val$country = Country.this;
        super();
    }
}
