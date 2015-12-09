// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.u;
import com.dominos.App;
import com.dominos.activities.CartActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fragments.BaseFragment;
import com.dominos.fragments.ItemUnavailableFragment;
import com.dominos.fragments.ItemUnavailableFragment_;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AnalyticsUtil;
import java.util.Locale;

public class ReOrderFragment extends BaseFragment
    implements com.dominos.fragments.ItemUnavailableFragment.OnItemUnavailableClickListener
{

    AnalyticsUtil mAnalyticsUtil;
    private com.dominos.utils.ActivityHelper.AlertActionCallback mDomAlertActionCallback;
    private ItemUnavailableFragment mItemUnavailableFragment;
    OrderUtil mOrderUtil;
    SpeechManager mSpeechManager;

    public ReOrderFragment()
    {
    }

    private void handleCreateOrderResponse(LabsOrder labsorder)
    {
        mOrderManager.clearHistoricalPaymentIfExpired(labsorder);
        if (!mProfileManager.hasProductRemovedAlertBeenShown(labsorder.getOriginalOrderId()) && mOrderUtil.isHistoricalProductsRemoved(labsorder))
        {
            showItemAvailabilityDialog(labsorder);
            return;
        } else
        {
            navigateToCart();
            return;
        }
    }

    protected void navigateToCart()
    {
        mCartManager.setOriginatedAsReorder(true);
        mAnalyticsUtil.postCartReset();
        mSpeechManager.preventNinaPause();
        CartActivity_.intent(getActivity()).reorderPaymentType(mOrderUtil.getHistoricalPaymentType(mOrderManager.getOrder())).start();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ReorderCreated());
    }

    void onAfterInject()
    {
        mDomAlertActionCallback = new _cls1();
    }

    void onBaseAfterViews()
    {
        mItemUnavailableFragment = (ItemUnavailableFragment)getActivity().getSupportFragmentManager().a(com/dominos/fragments/ItemUnavailableFragment.getSimpleName());
        if (mItemUnavailableFragment != null)
        {
            mItemUnavailableFragment.setItemUnavailableClickListener(this);
        }
    }

    public void onDialogCanceled()
    {
        mSpeechManager.resetDialogModel();
    }

    public void onDialogContinueClicked()
    {
        navigateToCart();
    }

    public void reorder(final LabsOrder order)
    {
        mOrderManager.createOrderFromHistoricalOrder(order, new _cls2());
    }

    protected void showItemAvailabilityDialog(LabsOrder labsorder)
    {
        String s = mConfigurationManager.getItemAvailabilityMessage(Locale.getDefault().getLanguage());
        if (mOrderUtil.isHistoricalProductsListEmpty(labsorder))
        {
            labsorder = getString(0x7f08017f);
        } else
        {
            labsorder = getString(0x7f080180);
        }
        mItemUnavailableFragment = ItemUnavailableFragment_.builder().mSummary(labsorder).mMoreInfoContent(s).build();
        mItemUnavailableFragment.setItemUnavailableClickListener(this);
        mItemUnavailableFragment.show(getActivity().getSupportFragmentManager(), com/dominos/fragments/ItemUnavailableFragment.getSimpleName());
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
    }













    private class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final ReOrderFragment this$0;

        public void onAlertDismissed()
        {
            mSpeechManager.resetDialogModel();
        }

        _cls1()
        {
            this$0 = ReOrderFragment.this;
            super();
        }
    }


    private class _cls2 extends com.dominos.android.sdk.core.order.OrderManager.CreateReOrderCallback
    {

        final ReOrderFragment this$0;
        final LabsOrder val$order;

        public void onBegin()
        {
            showLoading();
        }

        public void onFailure()
        {
            STORE_CONNECTION_ERROR.showAlert(AlertType.STORE_CONNECTION_ERROR, mDomAlertActionCallback);
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onNewOrder(LabsOrder labsorder)
        {
            handleCreateOrderResponse(labsorder);
        }

        public void onNoStoreFoundForDelivery()
        {
            STORE_CONNECTION_ERROR.showAlert(AlertType.NO_LONGER_DELIVERY_AREA, mDomAlertActionCallback);
        }

        public void onStoreCarryoutUnavailable(String s)
        {
            STORE_CONNECTION_ERROR.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, mDomAlertActionCallback);
        }

        public void onStoreClosed()
        {
            if (order.isDelivery())
            {
                STORE_CONNECTION_ERROR.showAlert(AlertType.STORE_DELIVERY_CLOSED, mDomAlertActionCallback);
                return;
            } else
            {
                STORE_CONNECTION_ERROR.showAlert(AlertType.STORE_CARRYOUT_CLOSED, mDomAlertActionCallback);
                return;
            }
        }

        public void onStoreDeliveryUnavailable(String s)
        {
            STORE_CONNECTION_ERROR.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, mDomAlertActionCallback);
        }

        public void onStoreOffline(String s)
        {
            if (order.isDelivery())
            {
                STORE_CONNECTION_ERROR.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, mDomAlertActionCallback);
                return;
            } else
            {
                STORE_CONNECTION_ERROR.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, mDomAlertActionCallback);
                return;
            }
        }

        _cls2()
        {
            this$0 = ReOrderFragment.this;
            order = labsorder;
            super();
        }
    }

}
