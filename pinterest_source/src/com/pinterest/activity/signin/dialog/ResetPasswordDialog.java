// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.api.remote.AccountApi;

public class ResetPasswordDialog extends LoadingDialog
{

    private String _email;

    public ResetPasswordDialog(String s)
    {
        _email = s;
    }

    private void doForgotPassword()
    {
        AccountApi.c(_email, new _cls1());
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        doForgotPassword();
    }


    private class _cls1 extends ApiResponseHandler
    {

        final ResetPasswordDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            apiresponse = apiresponse.getMessageDisplay();
            throwable = apiresponse;
            if (StringUtils.isEmpty(apiresponse))
            {
                throwable = Resources.string(0x7f070287);
            }
            apiresponse = new BaseDialog();
            apiresponse.setTitle(0x7f07004d);
            apiresponse.setMessage(throwable);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final _cls1 this$1;

                public void onClick(View view)
                {
                    Events.post(new DialogEvent(new SignupDialog()));
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            apiresponse.setPositiveButton(0x7f070528, new _cls1());
            class _cls2
                implements android.view.View.OnClickListener
            {

                final _cls1 this$1;

                public void onClick(View view)
                {
                    Events.post(new DialogEvent(new LoginDialog()));
                }

                _cls2()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            apiresponse.setNegativeButton(0x7f0705a1, new _cls2());
            Events.post(new DialogEvent(apiresponse));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.USER_PASSWORD_RESET_REQUEST, null);
            apiresponse = new BaseDialog();
            apiresponse.setTitle(0x7f07004d);
            apiresponse.setMessage(String.format(Resources.string(0x7f070391), new Object[] {
                _email
            }));
            class _cls3
                implements android.view.View.OnClickListener
            {

                final _cls1 this$1;

                public void onClick(View view)
                {
                    Events.post(new DialogEvent(new LoginDialog()));
                }

                _cls3()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            apiresponse.setPositiveButton(0x7f0704ba, new _cls3());
            Events.post(new DialogEvent(apiresponse));
        }

        _cls1()
        {
            this$0 = ResetPasswordDialog.this;
            super();
        }
    }

}
