// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.Button;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fragments.CustomerInformationFragment;
import com.dominos.fragments.PizzaProfileFragment;
import com.dominos.utils.AnalyticsUtil;
import java.util.ArrayList;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, StoreListActivity_, LandingActivity_, CartActivity_, 
//            UserEditInfoActivity_

public class PizzaProfileActivity extends BaseActivity
    implements LoyaltyInfoFragment.OnFinishLoyaltyInfoFragment, com.dominos.fragments.CustomerInformationFragment.CustomerInformationFragmentListener, com.dominos.fragments.PizzaProfileFragment.PizzaProfileFragmentListener, com.dominos.views.LoyaltyWidgetBaseLayout.LoyaltyWidgetListener
{

    private static final int PERSONAL_INFO_EDIT_REQUEST = 1;
    private int mCurrentFragmentId;
    private CustomerInformationFragment mCustomerInformationFragment;
    private boolean mEditMode;
    private PizzaProfileFragment mPizzaProfileFragment;
    Button mTitleButton;

    public PizzaProfileActivity()
    {
        mCurrentFragmentId = 0x7f0f02b6;
        mEditMode = false;
    }

    private void createDeliveryOrderForAddress(int i)
    {
        LabsAddress labsaddress = (LabsAddress)mProfileManager.getCurrentUser().getAddressList().get(i);
        mOrderManager.createOrderForDelivery(labsaddress, new _cls1());
    }

    private CustomerInformationFragment getCustomerInformationFragmentInstance(Bundle bundle)
    {
        if (bundle == null)
        {
            return CustomerInformationFragment.newInstance();
        } else
        {
            return (CustomerInformationFragment)getSupportFragmentManager().a(bundle, CustomerInformationFragment.TAG);
        }
    }

    private PizzaProfileFragment getPizzaProfileFragmentInstance(Bundle bundle)
    {
        if (bundle == null)
        {
            return PizzaProfileFragment.newInstance();
        } else
        {
            return (PizzaProfileFragment)getSupportFragmentManager().a(bundle, PizzaProfileFragment.TAG);
        }
    }

    private void hideTitleButton()
    {
        if (mTitleButton != null)
        {
            mTitleButton.setVisibility(8);
        }
        mEditMode = false;
    }

    private void navigateToCustomerInformationFragment()
    {
        ah ah1 = getSupportFragmentManager().a();
        if (mCustomerInformationFragment == null)
        {
            mCustomerInformationFragment = getCustomerInformationFragmentInstance(null);
        }
        if (mCustomerInformationFragment.isAdded())
        {
            ah1.c(mCustomerInformationFragment);
        } else
        {
            ah1.a(0x7f0f00d0, mCustomerInformationFragment);
            ah1.a(CustomerInformationFragment.TAG);
        }
        if (mPizzaProfileFragment != null && mPizzaProfileFragment.isAdded())
        {
            ah1.b(mPizzaProfileFragment);
        }
        ah1.a();
        mCurrentFragmentId = 0x7f0f027a;
        if (shouldShowTitleButton())
        {
            showTitleButton();
        }
        mCustomerInformationFragment.updateEditMode(mEditMode);
    }

    private void navigateToPizzaProfileFragment()
    {
        ah ah1 = getSupportFragmentManager().a();
        if (mPizzaProfileFragment == null)
        {
            mPizzaProfileFragment = getPizzaProfileFragmentInstance(null);
        }
        if (mPizzaProfileFragment.isAdded())
        {
            ah1.c(mPizzaProfileFragment);
        } else
        {
            ah1.a(0x7f0f00d0, mPizzaProfileFragment);
        }
        if (mCustomerInformationFragment != null && mCustomerInformationFragment.isAdded())
        {
            ah1.b(mCustomerInformationFragment);
        }
        ah1.a();
        mCurrentFragmentId = 0x7f0f02b6;
        hideTitleButton();
    }

    private void navigateToStoreLocator(int i)
    {
        StoreListActivity_.intent(this).addressIndex(i).start();
        finish();
    }

    private void redeemClick()
    {
        mLoyaltyManager.setLoyaltyCouponAdded();
        ((LandingActivity_.IntentBuilder_)((LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).extra("com.dominos.intent.extra.NEW_ORDER", true)).start();
    }

    private boolean shouldShowTitleButton()
    {
        return !mProfileManager.getCurrentUser().getAddressList().isEmpty();
    }

    private void showTitleButton()
    {
        if (mTitleButton != null)
        {
            if (mEditMode)
            {
                mTitleButton.setText(0x7f080100);
            } else
            {
                mTitleButton.setText(0x7f08010d);
            }
            mTitleButton.setVisibility(0);
        }
    }

    private void toggleEditMode()
    {
        boolean flag;
        if (!mEditMode)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mEditMode = flag;
        showTitleButton();
        if (mCustomerInformationFragment != null)
        {
            mCustomerInformationFragment.updateEditMode(mEditMode);
        }
    }

    private void updateFragmentViews()
    {
        if (mPizzaProfileFragment != null)
        {
            mPizzaProfileFragment.updateViews();
        }
        if (mCustomerInformationFragment != null)
        {
            mCustomerInformationFragment.updateViews();
        }
    }

    protected void navigateToCart()
    {
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
        finish();
    }

    public void onAfterViews()
    {
        setTitle(getString(0x7f08022e));
        mCurrentFragmentId;
        JVM INSTR lookupswitch 2: default 40
    //                   2131690106: 41
    //                   2131690166: 53;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (shouldShowTitleButton())
        {
            showTitleButton();
            return;
        }
          goto _L1
_L3:
        hideTitleButton();
        return;
    }

    public void onBackPressed()
    {
        if (getSupportFragmentManager().e() == 1)
        {
            if (mEditMode)
            {
                toggleEditMode();
                return;
            } else
            {
                getSupportFragmentManager().d();
                return;
            }
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCarryoutOrderRequestedForSavedAddress(int i)
    {
        navigateToStoreLocator(i);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            mPizzaProfileFragment = getPizzaProfileFragmentInstance(null);
            navigateToPizzaProfileFragment();
        }
    }

    public void onCustomerInfoModificationRequested()
    {
        UserEditInfoActivity_.intent(this).startForResult(1);
    }

    public void onCustomerInformationRequested()
    {
        navigateToCustomerInformationFragment();
    }

    public void onDeliveryOrderRequestedForSavedAddress(int i)
    {
        createDeliveryOrderForAddress(i);
    }

    public void onFinishLoyaltyInfoFragment()
    {
        updateFragmentViews();
    }

    public void onNavigatedToCart()
    {
        finish();
    }

    public void onPersonalInfoEditResult(int i)
    {
        if (i == -1)
        {
            updateFragmentViews();
        }
    }

    public void onPieImageRedeemButtonClick()
    {
        mAnalyticsUtil.postPizzaProfilePieImageViewRedeemClick();
        redeemClick();
    }

    public void onRedeemButtonClick()
    {
        mAnalyticsUtil.postPizzaProfileRedeemClick();
        redeemClick();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        mEditMode = bundle.getBoolean("mEditMode");
        mCurrentFragmentId = bundle.getInt("mCurrentFragmentId");
        mPizzaProfileFragment = getPizzaProfileFragmentInstance(bundle);
        mCustomerInformationFragment = getCustomerInformationFragmentInstance(bundle);
        switch (mCurrentFragmentId)
        {
        default:
            return;

        case 2131690106: 
            navigateToCustomerInformationFragment();
            return;

        case 2131690166: 
            navigateToPizzaProfileFragment();
            break;
        }
    }

    public void onRetryButtonClick()
    {
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("mEditMode", mEditMode);
        bundle.putInt("mCurrentFragmentId", mCurrentFragmentId);
        if (mPizzaProfileFragment != null && mPizzaProfileFragment.isAdded())
        {
            getSupportFragmentManager().a(bundle, PizzaProfileFragment.TAG, mPizzaProfileFragment);
        }
        if (mCustomerInformationFragment != null && mCustomerInformationFragment.isAdded())
        {
            getSupportFragmentManager().a(bundle, CustomerInformationFragment.TAG, mCustomerInformationFragment);
        }
    }

    public void onTitleButtonClick()
    {
        toggleEditMode();
    }

    private class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.CreateDeliveryOrderCallback
    {

        final PizzaProfileActivity this$0;

        public void onAddressInvalid(com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError locatestoreerror)
        {
            mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
        }

        public void onBegin()
        {
            showLoading();
        }

        public void onCreateOrderError(RequestErrorCode requesterrorcode)
        {
            mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR);
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onNoStoreFoundForDelivery()
        {
            mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
        }

        public void onOrderCreated(LabsOrder labsorder)
        {
            navigateToCart();
        }

        public void onStoreClosed(LabsAddress labsaddress)
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED);
        }

        public void onStoreDeliveryUnavailable(LabsAddress labsaddress, String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null);
        }

        public void onStoreOffline(LabsAddress labsaddress, String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null);
        }

        _cls1()
        {
            this$0 = PizzaProfileActivity.this;
            super();
        }
    }

}
