// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialog, LoginForgotPasswordDialog

class this._cls0
    implements android.view.nForgotPasswordDialog._cls1
{

    final LoginForgotPasswordDialog this$0;

    public void onClick(View view)
    {
        Events.post(new DialogEvent(new LoginDialog()));
    }

    ()
    {
        this$0 = LoginForgotPasswordDialog.this;
        super();
    }
}
