// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.CreditCardHelper;

// Referenced classes of package com.dominos.activities:
//            EditCreditCardActivity

class back extends com.dominos.android.sdk.core.user.CreditCardCallback
{

    final EditCreditCardActivity this$0;

    public void onCreditCardSaved()
    {
        hideLoading();
        showShortToast(getString(0x7f080083));
        EditCreditCardActivity.access$000(EditCreditCardActivity.this, mProfileManager.getCurrentUser().getCustomerId());
        showLoading();
    }

    public void onCreditCardSavingError(com.dominos.android.sdk.core.user.CardErrorType carderrortype)
    {
        mActivityHelper.showAlert(CreditCardHelper.matchAlertTypes(carderrortype));
    }

    ager.CreditCardErrorType()
    {
        this$0 = EditCreditCardActivity.this;
        super();
    }
}
