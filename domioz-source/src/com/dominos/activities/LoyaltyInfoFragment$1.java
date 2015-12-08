// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            LoyaltyInfoFragment, BaseActivity

class WithLoyaltyCallback extends com.dominos.android.sdk.core.user.ateCustomerWithLoyaltyCallback
{

    final LoyaltyInfoFragment this$0;

    public void onAuthorizationRequired()
    {
        popLoginDialog();
    }

    public void onBegin()
    {
        super.onBegin();
        if (getActivity() instanceof BaseActivity)
        {
            ((BaseActivity)getActivity()).showLoading();
        }
    }

    public void onCustomerUpdateError()
    {
        mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
    }

    public void onCustomerUpdated()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.ertClose(new String[0]));
        mAnalyticsUtil.postLoyaltyEnrolledEvent();
        dismissDialog();
    }

    public void onFinish()
    {
        super.onFinish();
        if (getActivity() instanceof BaseActivity)
        {
            ((BaseActivity)getActivity()).hideLoading();
        }
    }

    public void onLoyaltyEnrollFail()
    {
        mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
    }

    us()
    {
        this$0 = LoyaltyInfoFragment.this;
        super();
    }
}
