// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.dominos.activities.AddressTypeActivity_;
import com.dominos.activities.CartActivity_;
import com.dominos.activities.SavedAddressActivity_;
import com.dominos.activities.StoreListActivity_;
import com.dominos.activities.StoreProfileActivity_;
import com.dominos.android.sdk.common.AddressUtil;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.fragments:
//            BaseFragment, ShopRunnerFragment_

public class OrderSettingsFragment extends BaseFragment
{

    TextView landingRepeatBox;
    TextView mAddressTypeText;
    TextView mAddressView;
    AnalyticsUtil mAnalyticsUtil;
    ImageButton mCarryoutToggle;
    ImageButton mDeliveryToggle;
    private String mFocusedServiceMethod;
    private LabsOrder mOrder;
    Button mUseThisButton;

    public OrderSettingsFragment()
    {
    }

    private void navigateToAddressDelivery()
    {
        if (mProfileManager.isSavedAddressExists())
        {
            SavedAddressActivity_.intent(this).start();
        } else
        {
            AddressTypeActivity_.intent(this).start();
        }
        getActivity().finish();
    }

    private void navigateToStoreList()
    {
        StoreListActivity_.intent(this).start();
        getActivity().finish();
    }

    protected void navigateToCart()
    {
        ((com.dominos.activities.CartActivity_.IntentBuilder_)CartActivity_.intent(getActivity()).flags(0x4000000)).start();
        getActivity().finish();
    }

    public void navigateToStoreInfo()
    {
        StoreProfile storeprofile = mStoreManager.getStoreProfile();
        if (storeprofile != null)
        {
            Bundle bundle = new Bundle();
            bundle.putString("storeNumber", storeprofile.getStoreId());
            bundle.putString("address", storeprofile.getAddressDescription());
            bundle.putString("deliveryHours", storeprofile.getDeliveryHoursDescription());
            bundle.putString("carryoutHours", storeprofile.getCarryoutHoursDescription());
            bundle.putString("phone", NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
            bundle.putBoolean("carryoutAvail", storeprofile.isCarryoutAvailable());
            bundle.putBoolean("storeOpen", storeprofile.isOpen());
            bundle.putBoolean("storeOnline", storeprofile.isOnline());
            StoreProfileActivity_.intent(this).mBundle(bundle).start();
        }
    }

    void onAddressBoxInClick()
    {
        navigateToStoreInfo();
    }

    protected void onAfterViews()
    {
        landingRepeatBox.refreshDrawableState();
        FontManager.applyDominosFont(this);
        mOrder = mOrderManager.getOrder();
        mFocusedServiceMethod = mOrder.getServiceMethod();
        if (StringHelper.equals(mFocusedServiceMethod, "Delivery"))
        {
            toggleDelivery();
            return;
        } else
        {
            toggleCarryout();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            getChildFragmentManager().a().b(0x7f0f030a, new ShopRunnerFragment_()).b();
        }
    }

    void onModifyButton()
    {
        if (StringHelper.equals(mFocusedServiceMethod, "Delivery"))
        {
            navigateToAddressDelivery();
            return;
        } else
        {
            navigateToStoreList();
            return;
        }
    }

    void onUseThis()
    {
        if (StringHelper.equals(mFocusedServiceMethod, "Delivery"))
        {
            mAnalyticsUtil.postUseThisDeliveyButtonClicked();
            mOrder.setServiceMethod("Delivery");
        } else
        {
            mAnalyticsUtil.postUseThisCarryoutButtonClicked();
            if (!mOrder.isCarryout())
            {
                mOrder.setServiceMethod("Carryout");
                mOrderManager.createOrderForCarryout(mOrder.getStoreId(), new CarryoutOrderCallback(null));
                return;
            }
        }
        navigateToCart();
    }

    protected void toggleCarryout()
    {
        mFocusedServiceMethod = "Carryout";
        mDeliveryToggle.setSelected(false);
        mCarryoutToggle.setSelected(true);
        mCarryoutToggle.clearColorFilter();
        mDeliveryToggle.setColorFilter(getResources().getColor(0x7f0e0057));
        mAddressTypeText.setText(getResources().getString(0x7f080086));
        if (mOrder.getStoreAddress() != null)
        {
            mAddressView.setText(AddressUtil.getCarryoutAddressDescription(mOrder.getStoreAddress()));
            mUseThisButton.setVisibility(0);
        }
    }

    protected void toggleDelivery()
    {
        mFocusedServiceMethod = "Delivery";
        mDeliveryToggle.setSelected(true);
        mCarryoutToggle.setSelected(false);
        mDeliveryToggle.clearColorFilter();
        mCarryoutToggle.setColorFilter(getResources().getColor(0x7f0e0057));
        mAddressTypeText.setText(getResources().getString(0x7f0800b5));
        if (mOrder.isDelivery())
        {
            mAddressView.setText(AddressUtil.getDeliveryAddressDescription(mOrder.getAddress()));
            mUseThisButton.setVisibility(0);
            return;
        } else
        {
            mAddressView.setText(getResources().getString(0x7f080051));
            mUseThisButton.setVisibility(8);
            return;
        }
    }

    private class CarryoutOrderCallback extends com.dominos.android.sdk.core.order.OrderManager.CreateCarryoutOrderCallback
    {

        final OrderSettingsFragment this$0;

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

        public void onOrderCreated(LabsOrder labsorder)
        {
            navigateToCart();
        }

        public void onStoreCarryoutUnavailable(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, null);
        }

        public void onStoreClosed()
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_CLOSED);
        }

        public void onStoreOffline(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, null);
        }

        private CarryoutOrderCallback()
        {
            this$0 = OrderSettingsFragment.this;
            super();
        }

        CarryoutOrderCallback(_cls1 _pcls1)
        {
            this();
        }
    }

}
