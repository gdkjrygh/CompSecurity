// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            PinvitationalRequestInviteDialogView

class this._cls0
    implements android.view.questInviteDialogView._cls1
{

    final PinvitationalRequestInviteDialogView this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 0 && i == 66)
        {
            _submitButton.performClick();
            return true;
        } else
        {
            return false;
        }
    }

    Q()
    {
        this$0 = PinvitationalRequestInviteDialogView.this;
        super();
    }
}
