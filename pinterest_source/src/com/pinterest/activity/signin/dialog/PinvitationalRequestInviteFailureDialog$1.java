// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import com.pinterest.activity.DialogHelper;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            PinvitationalRequestInviteFailureDialog

class val.attemptedEmailAddress
    implements android.view.stInviteFailureDialog._cls1
{

    final PinvitationalRequestInviteFailureDialog this$0;
    final String val$attemptedEmailAddress;
    final boolean val$emailConflicted;

    public void onClick(View view)
    {
        if (val$emailConflicted)
        {
            view = null;
        } else
        {
            view = val$attemptedEmailAddress;
        }
        DialogHelper.goPinvitationalRequestInvite(view);
    }

    ()
    {
        this$0 = final_pinvitationalrequestinvitefailuredialog;
        val$emailConflicted = flag;
        val$attemptedEmailAddress = String.this;
        super();
    }
}
