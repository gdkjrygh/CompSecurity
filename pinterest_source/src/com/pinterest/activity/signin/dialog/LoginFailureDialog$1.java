// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialog, LoginFailureDialog

class this._cls0
    implements android.view.og.LoginFailureDialog._cls1
{

    final LoginFailureDialog this$0;

    public void onClick(View view)
    {
        Events.post(new DialogEvent(new LoginDialog()));
    }

    ()
    {
        this$0 = LoginFailureDialog.this;
        super();
    }
}
