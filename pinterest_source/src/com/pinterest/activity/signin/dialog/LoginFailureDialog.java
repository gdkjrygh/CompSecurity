// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.ApiResponse;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.NetworkUtils;
import java.io.IOException;
import javax.net.ssl.SSLException;
import org.apache.commons.lang3.StringUtils;

public class LoginFailureDialog extends BaseDialog
{

    public LoginFailureDialog()
    {
    }

    public LoginFailureDialog(Throwable throwable, ApiResponse apiresponse)
    {
        int i = apiresponse.getCode();
        String s = apiresponse.getMessageDisplay();
        setTitle(0x7f07004d);
        if (i == 2 || i == 80)
        {
            setMessage(s);
            setPositiveButton(0x7f0705a1, new _cls1());
            setNegativeButton(0x7f0702f1, new _cls2());
            return;
        }
        apiresponse = s;
        if (StringUtils.isEmpty(s))
        {
            if (!NetworkUtils.getInstance().hasInternet() || (throwable instanceof IOException))
            {
                apiresponse = Resources.string(0x7f07039b);
            } else
            if (throwable instanceof SSLException)
            {
                apiresponse = Resources.string(0x7f07034c);
            } else
            {
                apiresponse = Resources.string(0x7f070350);
            }
        }
        setMessage(apiresponse);
        setPositiveButton(0x7f0705a1, new _cls3());
        setNegativeButton(0x7f0700af, null);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoginFailureDialog this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(new LoginDialog()));
        }

        _cls1()
        {
            this$0 = LoginFailureDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LoginFailureDialog this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(new ResetPasswordDialog(LoginDialogView.lastEmailInput)));
        }

        _cls2()
        {
            this$0 = LoginFailureDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LoginFailureDialog this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(new LoginDialog()));
        }

        _cls3()
        {
            this$0 = LoginFailureDialog.this;
            super();
        }
    }

}
