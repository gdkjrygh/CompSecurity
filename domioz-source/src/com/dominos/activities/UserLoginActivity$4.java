// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            UserLoginActivity

class ack extends com.dominos.android.sdk.core.user.oginCallback
{

    final UserLoginActivity this$0;

    public void onLoginError()
    {
        hideLoading();
        showLoginErrorToast();
    }

    public void onLoginFailed()
    {
        hideLoading();
        showLoginFailedDialog();
    }

    public void onLoginSuccessful()
    {
        hideLoading();
        mAnalyticsUtil.postLogin(mProfileManager.getCurrentUser().getCustomerId());
        if (mEnrollInLoyalty && !mLoyaltyManager.isCustomerEnrolledInLoyalty())
        {
            saveCustomerWithLoyalty();
            return;
        } else
        {
            UserLoginActivity.access$100(UserLoginActivity.this);
            finish();
            return;
        }
    }

    yManager()
    {
        this$0 = UserLoginActivity.this;
        super();
    }
}
