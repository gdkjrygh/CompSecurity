// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.dominos.adapters.LoyaltyFAQListAdapter;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.loyalty.CustomerLoyalty;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.ToolBarView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, LandingActivity_

public class LoyaltyFAQActivity extends BaseActivity
    implements com.dominos.views.LoyaltyFAQRowView.LoyaltyOptOutListener
{

    RecyclerView mFaqListView;
    ToolBarView mToolBar;

    public LoyaltyFAQActivity()
    {
    }

    private void optOutConfirm()
    {
        mProfileManager.optOutUserFromLoyalty(new _cls2());
    }

    public void afterViews()
    {
        FontManager.applyDominosFont(this);
        mToolBar.setTitle(getString(0x7f0801a6));
        mAnalyticsUtil.postLoyaltyFaqLoad();
        Object obj = mConfigurationManager.getLoyaltyFaqs();
        if (obj != null)
        {
            obj = new LoyaltyFAQListAdapter(this, this, ((List) (obj)));
            LinearLayoutManager linearlayoutmanager = new LinearLayoutManager();
            mFaqListView.a(linearlayoutmanager);
            mFaqListView.a(((android.support.v7.widget.bc) (obj)));
        }
    }

    public boolean handleHomeButtonClicked()
    {
        ((LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).start();
        return true;
    }

    public void onOptOutClick()
    {
        mAnalyticsUtil.postOptOutClick();
        CustomerLoyalty customerloyalty = mLoyaltyManager.getCustomerLoyalty();
        ArrayList arraylist = new ArrayList();
        arraylist.add(String.valueOf(customerloyalty.getVestedPointBalance()));
        mActivityHelper.showOptionAlert(AlertType.LOYALTY_OPT_OUT_CONFIRMATION, arraylist, null, new _cls1());
    }


    private class _cls2 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.OptOutCallback
    {

        final LoyaltyFAQActivity this$0;

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onLoyaltyOptOutFail()
        {
            hideLoading();
            mActivityHelper.showAlert(AlertType.LOYALTY_OPT_OUT_ERROR);
        }

        public void onLoyaltyOptOutSuccess()
        {
            hideLoading();
            onHomeButtonClick();
        }

        _cls2()
        {
            this$0 = LoyaltyFAQActivity.this;
            super();
        }
    }


    private class _cls1 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final LoyaltyFAQActivity this$0;

        public void onNegativeButtonClicked()
        {
            mAnalyticsUtil.postRewardsOptOutCancel();
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            mAnalyticsUtil.postRewardsOptOutConfirm();
            optOutConfirm();
        }

        _cls1()
        {
            this$0 = LoyaltyFAQActivity.this;
            super();
        }
    }

}
