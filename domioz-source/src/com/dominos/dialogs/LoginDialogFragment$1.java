// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.view.View;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment

class this._cls0
    implements android.view.ment._cls1
{

    final LoginDialogFragment this$0;

    public void onClick(View view)
    {
        LoginDialogFragment.access$000(LoginDialogFragment.this).clearCurrentUser();
        if (LoginDialogFragment.access$100(LoginDialogFragment.this).getOrder() != null)
        {
            LoginDialogFragment.access$100(LoginDialogFragment.this).getOrder().clearPayments();
        }
        if (LoginDialogFragment.access$200(LoginDialogFragment.this) != null)
        {
            LoginDialogFragment.access$200(LoginDialogFragment.this).onContinueAsGuest();
        }
        LoginDialogFragment.access$300(LoginDialogFragment.this);
        dismiss();
    }

    ActionListener()
    {
        this$0 = LoginDialogFragment.this;
        super();
    }
}
