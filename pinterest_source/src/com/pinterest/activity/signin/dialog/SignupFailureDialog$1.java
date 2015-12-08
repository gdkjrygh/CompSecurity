// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.unauth.fragment.PinvitationalInviteRequestFragment;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupFailureDialog, EmailSignupDialog, BusinessSignupDialog, SignupDialog

class val.inviteCode
    implements android.view.g.SignupFailureDialog._cls1
{

    final SignupFailureDialog this$0;
    final BaseDialog val$dialog;
    final boolean val$goRequestInvite;
    final String val$inviteCode;
    final int val$type;

    public void onClick(View view)
    {
        if (val$goRequestInvite)
        {
            val$dialog.dismiss();
            FragmentHelper.replaceFragment(getActivity(), new PinvitationalInviteRequestFragment(), false, com.pinterest.activity.on.SLIDE);
            return;
        }
        if (val$type == 1)
        {
            Events.post(new DialogEvent(new EmailSignupDialog(val$inviteCode)));
            return;
        }
        if (val$type == 6)
        {
            Events.post(new DialogEvent(new BusinessSignupDialog(null, val$inviteCode)));
            return;
        } else
        {
            Events.post(new DialogEvent(new SignupDialog()));
            return;
        }
    }

    equestFragment()
    {
        this$0 = final_signupfailuredialog;
        val$goRequestInvite = flag;
        val$dialog = basedialog;
        val$type = i;
        val$inviteCode = String.this;
        super();
    }
}
