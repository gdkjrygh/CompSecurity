// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class this._cls0
    implements com.dominos.dialogs.tionListener
{

    final LabsCheckoutActivity this$0;

    public void onCanceled()
    {
    }

    public void onContinueAsGuest()
    {
    }

    public void onLoginSuccess()
    {
        enrollCustomer();
    }

    public void onSignOut()
    {
    }

    nListener()
    {
        this$0 = LabsCheckoutActivity.this;
        super();
    }
}
