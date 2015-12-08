// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.reporting.CrashReporting;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialogView

class val.suggestedEmail
    implements android.view.er
{

    final LoginDialogView this$0;
    final String val$suggestedEmail;

    public void onClick(View view)
    {
        view = new com.pinterest.api.remote.rams();
        view.b = val$suggestedEmail;
        view.e = LoginDialogView.lastPasswordInput;
        LoginDialogView.lastEmailInput = val$suggestedEmail;
        try
        {
            AccountApi.a(view, LoginDialogView.access$600(LoginDialogView.this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            CrashReporting.a(view);
        }
    }

    ()
    {
        this$0 = final_logindialogview;
        val$suggestedEmail = String.this;
        super();
    }
}
