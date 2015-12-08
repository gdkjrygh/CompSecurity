// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.activity.task.dialog.OneFieldBaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.RequestParams;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public abstract class OneFieldSettingBaseDialog extends OneFieldBaseDialog
{

    public OneFieldSettingBaseDialog()
    {
    }

    protected abstract String getFieldApiKey();

    protected abstract String getSuccessToast(String s);

    protected void logSubmitAction()
    {
        Pinalytics.a(ElementType.SAVE_USER_SETTINGS_BUTTON, ComponentType.MODAL_DIALOG);
    }

    protected abstract void setModelValue(String s);

    protected void submit(final String initialValue, final String enteredValue)
    {
        setModelValue(enteredValue);
        RequestParams requestparams = new RequestParams();
        requestparams.a(getFieldApiKey(), enteredValue);
        MyUserApi.a(requestparams, new _cls1(), null);
    }

    private class _cls1 extends com.pinterest.api.remote.MyUserApi.SettingsApiResponse
    {

        final OneFieldSettingBaseDialog this$0;
        final String val$enteredValue;
        final String val$initialValue;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Events.post(new DialogEvent(null));
            setModelValue(initialValue);
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Application.showToastShort(getSuccessToast(enteredValue));
            Events.post(new DialogEvent(null));
        }

        _cls1()
        {
            this$0 = OneFieldSettingBaseDialog.this;
            enteredValue = s;
            initialValue = s1;
            super();
        }
    }

}
