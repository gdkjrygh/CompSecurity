// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.activities:
//            EditCreditCardActivity

class back extends com.dominos.android.sdk.core.user.CreditCardCallback
{

    final EditCreditCardActivity this$0;

    public void onCreditCardDeleted()
    {
        hideLoading();
        showShortToast(getString(0x7f08007d));
        EditCreditCardActivity.access$000(EditCreditCardActivity.this, mProfileManager.getCurrentUser().getCustomerId());
        showLoading();
    }

    public void onCreditCardDeletingError()
    {
        showShortToast(getString(0x7f080115));
    }

    UserObject()
    {
        this$0 = EditCreditCardActivity.this;
        super();
    }
}
