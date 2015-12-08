// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LoyaltyInfoFragment

class this._cls0
    implements com.dominos.dialogs.ActionListener
{

    final LoyaltyInfoFragment this$0;

    public void onCanceled()
    {
    }

    public void onContinueAsGuest()
    {
    }

    public void onLoginSuccess()
    {
        saveCustomerWithLoyalty();
    }

    public void onSignOut()
    {
    }

    ionListener()
    {
        this$0 = LoyaltyInfoFragment.this;
        super();
    }
}
