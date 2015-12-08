// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;

class val.choiceString extends com.pinterest.api.remote.onse
{

    final val.choiceString this$1;
    final String val$choiceString;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        class _cls1 extends BaseToast
        {

            final EmailFrequencyDialog._cls1._cls1 this$2;

            public void setMessage(String s)
            {
                super.setMessage(0x7f070239);
            }

            _cls1()
            {
                this$2 = EmailFrequencyDialog._cls1._cls1.this;
                super();
            }
        }

        Events.post(new _cls1());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        try
        {
            apiresponse = MyUser.getJsonUserSettings();
            apiresponse.b("email_interval", val$choiceString);
            MyUser.saveUserSettingsMe(apiresponse);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponse apiresponse)
        {
            PLog.error(apiresponse, "exception occurred", new Object[0]);
        }
    }

    _cls1()
    {
        this$1 = final__pcls1;
        val$choiceString = String.this;
        super();
    }
}
