// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.res.Resources;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.CreditCardHelper;

// Referenced classes of package com.dominos.activities:
//            AddCreditCardActivity

class nager.SaveCardCallback extends com.dominos.android.sdk.core.user.ardCallback
{

    final AddCreditCardActivity this$0;

    public void onBegin()
    {
        showLoading();
    }

    public void onCreditCardSaved(String s)
    {
        showShortToast(getResources().getString(0x7f080083));
        mProfileManager.setNewSavedCardId(s);
        getAllSavedCreditCardsBeforeReturningToCheckout(mProfileManager.getCurrentUser().getCustomerId());
    }

    public void onCreditCardSavingError(com.dominos.android.sdk.core.user.tCardErrorType tcarderrortype)
    {
        tcarderrortype = CreditCardHelper.matchAlertTypes(tcarderrortype);
        mActivityHelper.showAlert(tcarderrortype);
    }

    public void onFinish()
    {
        hideLoading();
    }

    public void onUserNotAuthorized()
    {
        sendToUserLoginActivity();
    }

    nager.CreditCardErrorType()
    {
        this$0 = AddCreditCardActivity.this;
        super();
    }
}
