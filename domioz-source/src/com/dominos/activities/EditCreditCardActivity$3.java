// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            EditCreditCardActivity, LabsCheckoutActivity_

class lback extends com.dominos.android.sdk.core.user.CreditCardsCallback
{

    final EditCreditCardActivity this$0;

    public void onGettingCreditCardsFailed()
    {
        hideLoading();
        showDialog(4);
    }

    public void onGettingCreditCardsSuccess()
    {
        hideLoading();
        LabsCheckoutActivity_.intent(EditCreditCardActivity.this).cardId(EditCreditCardActivity.access$100(EditCreditCardActivity.this)).start();
    }

    entBuilder_()
    {
        this$0 = EditCreditCardActivity.this;
        super();
    }
}
