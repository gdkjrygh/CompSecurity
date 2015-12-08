// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.LinearLayout;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fragments.ShopRunnerFragment_;
import com.dominos.nina.dialog.agent.DeliveryGuard;
import com.dominos.nina.dialog.agent.DeliverySelectionAgent;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.CommandBuilder;
import com.dominos.views.SavedAddressView;
import com.dominos.views.SavedAddressView_;
import com.dominos.views.ToolBarView;
import java.util.ArrayList;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, CartActivity_, AddressTypeActivity_

public class SavedAddressActivity extends BaseActivity
{

    private static final int SAVED_ADDRESS_LIST_SIZE_SINGLE = 0;
    private BusSubscriber mBusSubscriber;
    private String mSavedAddressAlertCloseCommands[];
    LinearLayout mSavedAddressLayout;
    LinearLayout mScrollViewChild;
    ToolBarView mToolBar;

    public SavedAddressActivity()
    {
        mSavedAddressAlertCloseCommands = (new CommandBuilder()).appendReset(DeliverySelectionAgent.NAME).appendReset(DeliveryGuard.NAME).build();
    }

    private void checkForSavedLocations()
    {
        UserObject userobject = mProfileManager.getCurrentUser();
        mSavedAddressLayout.removeAllViews();
        _cls1 _lcls1 = new _cls1();
        _cls2 _lcls2 = new _cls2();
        ArrayList arraylist = userobject.getAddressList();
        for (int i = 0; i < arraylist.size(); i++)
        {
            SavedAddressView savedaddressview1 = SavedAddressView_.build(this);
            com.dominos.views.SavedAddressView.ViewType viewtype = com.dominos.views.SavedAddressView.ViewType.CENTER;
            if (i == 0)
            {
                viewtype = com.dominos.views.SavedAddressView.ViewType.TOP;
            }
            savedaddressview1.bindAddress((LabsAddress)arraylist.get(i), i, viewtype);
            savedaddressview1.setOnClickListener(_lcls1);
            mSavedAddressLayout.addView(savedaddressview1);
        }

        SavedAddressView savedaddressview = SavedAddressView_.build(this);
        savedaddressview.bindValues(getString(0x7f080336), null, userobject.getAddressList().size(), com.dominos.views.SavedAddressView.ViewType.BOTTOM);
        savedaddressview.setOnClickListener(_lcls2);
        mSavedAddressLayout.addView(savedaddressview);
        FontManager.applyDominosFont(mSavedAddressLayout);
    }

    private void onSavedAddressSelected(int i)
    {
        LabsAddress labsaddress = (LabsAddress)mProfileManager.getCurrentUser().getAddressList().get(i);
        mOrderManager.createOrderForDelivery(labsaddress, new CreateDeliveryOrderCallBack(null));
    }

    private void showShopRunnerFragment()
    {
        if (mProfileManager.isAuthorizedUser())
        {
            getSupportFragmentManager().a().b(0x7f0f00d4, ShopRunnerFragment_.builder().build()).b();
        }
    }

    public boolean handleHomeButtonClicked()
    {
        mSpeechManager.resetDialogModel();
        finish();
        return true;
    }

    void initViews()
    {
        mToolBar.setTitle(getString(0x7f080050));
        mScrollViewChild.addView(getNinaPaddingView());
        FontManager.applyWiderCursor(this);
    }

    protected void navigateToCart()
    {
        mSpeechManager.preventNinaPause();
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.DeliveryAddressSelected());
        finish();
    }

    protected void navigateToNewAddress()
    {
        mSpeechManager.preventNinaPause();
        AddressTypeActivity_.intent(this).startForResult(16);
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.NewAddressTypeRequested());
    }

    protected void onActivityResult(int i, Intent intent)
    {
        switch (i)
        {
        default:
            return;

        case 4096: 
            finish();
            break;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        mSpeechManager.resetDialogModel();
    }

    protected void onPause()
    {
        super.onPause();
        if (mBusSubscriber != null)
        {
            App.getInstance().bus.unregister(mBusSubscriber);
        }
    }

    protected void onPostResume()
    {
        super.onPostResume();
        showShopRunnerFragment();
    }

    protected void onResume()
    {
        super.onResume();
        checkForSavedLocations();
        if (mBusSubscriber == null)
        {
            mBusSubscriber = new BusSubscriber(null);
        }
        App.getInstance().bus.register(mBusSubscriber);
    }

    protected void onStart()
    {
        super.onStart();
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.SavedAddressesTransition());
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SavedAddressActivity this$0;

        public void onClick(View view)
        {
            int i = ((Integer)view.getTag()).intValue();
            onSavedAddressSelected(i);
        }

        _cls1()
        {
            this$0 = SavedAddressActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SavedAddressActivity this$0;

        public void onClick(View view)
        {
            navigateToNewAddress();
        }

        _cls2()
        {
            this$0 = SavedAddressActivity.this;
            super();
        }
    }


    private class CreateDeliveryOrderCallBack extends com.dominos.android.sdk.core.order.OrderManager.CreateDeliveryOrderCallback
    {

        final SavedAddressActivity this$0;

        public void onAddressInvalid(com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError locatestoreerror)
        {
            mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA, mSavedAddressAlertCloseCommands);
        }

        public void onBegin()
        {
            showLoading();
        }

        public void onCreateOrderError(RequestErrorCode requesterrorcode)
        {
            mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR, mSavedAddressAlertCloseCommands);
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onNoStoreFoundForDelivery()
        {
            mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA, mSavedAddressAlertCloseCommands);
        }

        public void onOrderCreated(LabsOrder labsorder)
        {
            navigateToCart();
        }

        public void onStoreClosed(LabsAddress labsaddress)
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED, mSavedAddressAlertCloseCommands);
        }

        public void onStoreDeliveryUnavailable(LabsAddress labsaddress, String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null, mSavedAddressAlertCloseCommands, null);
        }

        public void onStoreOffline(LabsAddress labsaddress, String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null, mSavedAddressAlertCloseCommands, null);
        }

        private CreateDeliveryOrderCallBack()
        {
            this$0 = SavedAddressActivity.this;
            super();
        }

        CreateDeliveryOrderCallBack(_cls1 _pcls1)
        {
            this();
        }
    }


    private class BusSubscriber
    {

        final SavedAddressActivity this$0;

        public void onDeliveryAddressSelected(com.dominos.bus.events.OriginatedFromSpeech.DeliveryAddressSelected deliveryaddressselected)
        {
            onSavedAddressSelected(deliveryaddressselected.getSelection());
        }

        public void onDeliveryPrimaryAddressSelected(com.dominos.bus.events.OriginatedFromSpeech.DeliveryPrimaryAddressSelected deliveryprimaryaddressselected)
        {
            deliveryprimaryaddressselected = mProfileManager.getCurrentUser().getAddressList().iterator();
            do
            {
                if (!deliveryprimaryaddressselected.hasNext())
                {
                    break;
                }
                LabsAddress labsaddress = (LabsAddress)deliveryprimaryaddressselected.next();
                if (!labsaddress.isDefault())
                {
                    continue;
                }
                mOrderManager.createOrderForDelivery(labsaddress, new CreateDeliveryOrderCallBack(null));
                break;
            } while (true);
        }

        public void onNewAddressRequested(com.dominos.bus.events.OriginatedFromSpeech.NewAddressRequested newaddressrequested)
        {
            navigateToNewAddress();
        }

        private BusSubscriber()
        {
            this$0 = SavedAddressActivity.this;
            super();
        }

        BusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

}
