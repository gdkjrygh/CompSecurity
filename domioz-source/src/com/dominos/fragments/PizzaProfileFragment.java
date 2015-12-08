// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Activity;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.dominos.activities.LoyaltyFAQActivity_;
import com.dominos.activities.LoyaltyRewardDetailsActivity_;
import com.dominos.activities.UserChangePassword_;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.views.CustomerPersonalInformationView;
import com.dominos.views.LoyaltyProfileView;
import com.dominos.views.LoyaltyProfileView_;

// Referenced classes of package com.dominos.fragments:
//            BaseFragment, PizzaProfileFragment_, LoyaltyWidgetFragment

public class PizzaProfileFragment extends BaseFragment
{

    public static final String TAG = com/dominos/fragments/PizzaProfileFragment.getSimpleName();
    private com.dominos.views.CustomerPersonalInformationView.CustomerPersonalInformationClickListener mCustomerPersonalInfoClickListener;
    CustomerPersonalInformationView mCustomerPersonalInformationView;
    private PizzaProfileFragmentListener mListener;
    private LoyaltyProfileView mLoyaltyProfileView;
    private com.dominos.views.LoyaltyProfileView.LoyaltyProfileViewListener mLoyaltyProfileViewListener;
    FrameLayout mProfileLoyaltyContainerLayout;
    LinearLayout mProfileLoyaltyEnrolledLayout;
    FrameLayout mProfileLoyaltyWidgetLayout;

    public PizzaProfileFragment()
    {
        mLoyaltyProfileViewListener = new _cls1();
        mCustomerPersonalInfoClickListener = new _cls2();
    }

    private void createLoyaltyViews()
    {
        mLoyaltyProfileView = LoyaltyProfileView_.build(getActivity(), mLoyaltyProfileViewListener);
        mProfileLoyaltyContainerLayout.addView(mLoyaltyProfileView);
    }

    public static PizzaProfileFragment newInstance()
    {
        return PizzaProfileFragment_.builder().build();
    }

    private void updateLoyaltyViews()
    {
        mProfileLoyaltyContainerLayout.setVisibility(8);
        mProfileLoyaltyEnrolledLayout.setVisibility(8);
        if (mLoyaltyManger.isLoyaltyEnabled())
        {
            mLoyaltyProfileView.updateView();
            mProfileLoyaltyContainerLayout.setVisibility(0);
            if (mLoyaltyManger.isLoyaltyAvailable() && mLoyaltyManger.isCustomerEnrolledInLoyalty())
            {
                LoyaltyWidgetFragment loyaltywidgetfragment = (LoyaltyWidgetFragment)getChildFragmentManager().a(LoyaltyWidgetFragment.TAG);
                if (loyaltywidgetfragment == null)
                {
                    loyaltywidgetfragment = LoyaltyWidgetFragment.newInstance(LoyaltyWidgetFragment.LoyaltyWidgetType.CENTERED);
                    getChildFragmentManager().a().b(0x7f0f02b9, loyaltywidgetfragment, LoyaltyWidgetFragment.TAG).a();
                } else
                {
                    loyaltywidgetfragment.updateView();
                }
                mProfileLoyaltyWidgetLayout.setVisibility(0);
                mProfileLoyaltyEnrolledLayout.setVisibility(0);
                return;
            }
        }
    }

    protected void enrollCustomerInLoyalty()
    {
        mProfileManager.enrollCustomerWithLoyalty(new _cls5());
    }

    protected void loadLoyaltyHistory()
    {
        com.dominos.android.sdk.common.dom.useraccounts.UserObject userobject = mProfileManager.getCurrentUser();
        mLoyaltyManger.getLoyaltyHistory(userobject, new _cls4());
    }

    protected void navigateToLoyaltyDetails(boolean flag)
    {
        LoyaltyRewardDetailsActivity_.intent(this).mHistoryCallFailed(flag).start();
    }

    public void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        createLoyaltyViews();
        updateViews();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof PizzaProfileFragmentListener)
        {
            mListener = (PizzaProfileFragmentListener)activity;
        }
    }

    public void onChangePasswordButtonClick()
    {
        UserChangePassword_.intent(this).start();
    }

    public void onDetach()
    {
        super.onDetach();
        mListener = null;
    }

    public void onLoyaltyFaqButton()
    {
        LoyaltyFAQActivity_.intent(this).start();
    }

    public void onLoyaltyRewardDetailsButton()
    {
        loadLoyaltyHistory();
    }

    public void onSignOutButtonClick()
    {
        mActivityHelper.showOptionAlert(AlertType.SIGN_OUT_ALERT, null, new _cls3());
    }

    public void updateViews()
    {
        com.dominos.android.sdk.common.dom.useraccounts.UserObject userobject = mProfileManager.getCurrentUser();
        mCustomerPersonalInformationView.bind(userobject, com.dominos.views.CustomerPersonalInformationView.ViewMode.PERSONAL_INFO_LINK, mCustomerPersonalInfoClickListener);
        updateLoyaltyViews();
    }



    private class _cls1
        implements com.dominos.views.LoyaltyProfileView.LoyaltyProfileViewListener
    {

        final PizzaProfileFragment this$0;

        public void onLoyaltyActivateClick()
        {
            mAnalyticsUtil.postPizzaProfileActivateRewardsClick();
            enrollCustomerInLoyalty();
        }

        public void onLoyaltyLearnMoreClick()
        {
            mAnalyticsUtil.postPizzaProfileLearnMoreRewardsClick();
            LoyaltyInfoFragment.newInstance(com.dominos.activities.LoyaltyInfoFragment.InfoType.ACTIVATE).show(getChildFragmentManager(), LoyaltyInfoFragment.TAG);
        }

        _cls1()
        {
            this$0 = PizzaProfileFragment.this;
            super();
        }
    }


    private class _cls2
        implements com.dominos.views.CustomerPersonalInformationView.CustomerPersonalInformationClickListener
    {

        final PizzaProfileFragment this$0;

        public void onPersonalInformationClicked()
        {
        }

        public void onPersonalInformationFooterClicked()
        {
            if (mListener != null)
            {
                mListener.onCustomerInformationRequested();
            }
        }

        _cls2()
        {
            this$0 = PizzaProfileFragment.this;
            super();
        }
    }


    private class _cls5 extends com.dominos.android.sdk.core.user.UserProfileManager.UpdateCustomerWithLoyaltyCallback
    {

        final PizzaProfileFragment this$0;

        public void onAuthorizationRequired()
        {
        }

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onCustomerUpdateError()
        {
            mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
        }

        public void onCustomerUpdated()
        {
            updateViews();
            mAnalyticsUtil.postLoyaltyEnrolledEvent();
        }

        public void onFinish()
        {
            super.onFinish();
            hideLoading();
        }

        public void onLoyaltyEnrollFail()
        {
            mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
        }

        _cls5()
        {
            this$0 = PizzaProfileFragment.this;
            super();
        }
    }


    private class _cls4 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.LoyaltyHistoryCallback
    {

        final PizzaProfileFragment this$0;

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onFinish()
        {
            super.onFinish();
            hideLoading();
        }

        public void onLoyaltyHistoryFail()
        {
            navigateToLoyaltyDetails(true);
        }

        public void onLoyaltyHistorySuccess()
        {
            navigateToLoyaltyDetails(false);
        }

        _cls4()
        {
            this$0 = PizzaProfileFragment.this;
            super();
        }
    }


    private class PizzaProfileFragmentListener
    {

        public abstract void onCustomerInformationRequested();
    }


    private class _cls3 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final PizzaProfileFragment this$0;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            mProfileManager.clearCurrentUser();
            mOrderManager.getOrder().clearPersonalInfo();
            mOrderManager.getOrder().clearPrices();
            ((com.dominos.activities.LandingActivity_.IntentBuilder_)LandingActivity_.intent(PizzaProfileFragment.this).flags(0x4000000)).start();
        }

        _cls3()
        {
            this$0 = PizzaProfileFragment.this;
            super();
        }
    }

}
