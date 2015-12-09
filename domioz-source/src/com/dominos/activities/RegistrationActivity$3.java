// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            RegistrationActivity

class anager.LoginCallback extends com.dominos.android.sdk.core.user.nCallback
{

    final RegistrationActivity this$0;
    final boolean val$enrollInLoyalty;

    public void onBegin()
    {
        showLoading();
    }

    public void onFinish()
    {
        hideLoading();
    }

    public void onLoginError()
    {
        hideLoading();
        RegistrationActivity.access$300(RegistrationActivity.this);
    }

    public void onLoginFailed()
    {
        hideLoading();
        RegistrationActivity.access$300(RegistrationActivity.this);
    }

    public void onLoginSuccessful()
    {
        mAnalyticsUtil.postLogin(mProfileManager.getCurrentUser().getCustomerId());
        if (val$enrollInLoyalty && !mLoyaltyManager.isCustomerEnrolledInLoyalty())
        {
            class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
            {

                final RegistrationActivity._cls3 this$1;

                public void onAlertDismissed()
                {
                    RegistrationActivity.access$200(this$0);
                }

            _cls1()
            {
                this$1 = RegistrationActivity._cls3.this;
                super();
            }
            }

            mActivityHelper.showAlert(AlertType.NEW_CUSTOMER_LOYALTY_ENROLL_FAIL, new _cls1());
            return;
        } else
        {
            mAnalyticsUtil.postLoyaltyEnrolledEvent();
            RegistrationActivity.access$200(RegistrationActivity.this);
            return;
        }
    }

    _cls1()
    {
        this$0 = final_registrationactivity;
        val$enrollInLoyalty = Z.this;
        super();
    }
}
