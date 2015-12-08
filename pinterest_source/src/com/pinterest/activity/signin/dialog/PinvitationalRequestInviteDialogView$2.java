// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.text.Editable;
import android.text.TextWatcher;
import com.pinterest.kit.utils.SignupFormUtils;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            PinvitationalRequestInviteDialogView

class this._cls0
    implements TextWatcher
{

    final PinvitationalRequestInviteDialogView this$0;

    public void afterTextChanged(Editable editable)
    {
        PinvitationalRequestInviteDialogView.access$000(PinvitationalRequestInviteDialogView.this, SignupFormUtils.isEmailValid(editable.toString()));
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    Q()
    {
        this$0 = PinvitationalRequestInviteDialogView.this;
        super();
    }
}
