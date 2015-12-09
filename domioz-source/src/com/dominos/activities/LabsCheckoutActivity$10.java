// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.dialogs.LoginDialogFragment;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class this._cls0
    implements com.dominos.dialogs.tionListener
{

    final LabsCheckoutActivity this$0;

    public void onCanceled()
    {
        logindialog.dismiss();
        LabsCheckoutActivity.access$200(LabsCheckoutActivity.this);
    }

    public void onContinueAsGuest()
    {
    }

    public void onLoginSuccess()
    {
        proceedWithOrder();
    }

    public void onSignOut()
    {
        restartActivity();
    }

    nListener()
    {
        this$0 = LabsCheckoutActivity.this;
        super();
    }
}
