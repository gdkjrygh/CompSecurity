// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class this._cls1
    implements com.dominos.dialogs.ionListener
{

    final l.token this$1;

    public void onCanceled()
    {
    }

    public void onContinueAsGuest()
    {
        restartActivity();
    }

    public void onLoginSuccess()
    {
        LabsCheckoutActivity.access$100(_fld0, token);
    }

    public void onSignOut()
    {
    }

    Listener()
    {
        this$1 = this._cls1.this;
        super();
    }
}
