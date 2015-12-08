// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.dominos.App;
import com.dominos.adapters.HistoricalListAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.dialogs.LoginDialogFragment;
import com.dominos.nina.dialog.agent.ProfileAuthGuard;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CommandBuilder;
import com.dominos.views.ToolBarView;
import com.google.a.b.by;
import java.util.ArrayList;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, CartActivity_

public class HistoricalListActivity extends BaseActivity
    implements com.dominos.adapters.HistoricalListAdapter.OnHistoricalListListener
{

    private String mDialogUpdateCommands[];
    private HistoricalBusSubscriber mEventHistoricalBusSubscriber;
    RecyclerView mHistoricalListView;
    private ArrayList mHistoricalOrderList;
    OrderUtil mOrderUtil;
    ToolBarView mToolBarView;

    public HistoricalListActivity()
    {
        mDialogUpdateCommands = (new CommandBuilder()).appendReset("EasyOrderAgency").appendReset("RecentOrderAgency").appendReset(ProfileAuthGuard.NAME).build();
    }

    private void reorder(final LabsOrder order)
    {
        mOrderManager.createOrderFromHistoricalOrder(order, new _cls3());
    }

    public boolean handleHomeButtonClicked()
    {
        mSpeechManager.resetDialogModel();
        finish();
        return true;
    }

    protected void navigateToCart(LabsOrder labsorder)
    {
        mCartManager.setOriginatedAsReorder(true);
        mAnalyticsUtil.postCartReset();
        mSpeechManager.preventNinaPause();
        CartActivity_.intent(this).reorderPaymentType(mOrderUtil.getHistoricalPaymentType(labsorder)).start();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ReorderCreated());
    }

    protected void onAfterViews()
    {
        Object obj;
        LinearLayoutManager linearlayoutmanager;
        if (mOrderManager.isEasyOrder())
        {
            mToolBarView.setTitle(getString(0x7f080107));
        } else
        {
            mToolBarView.setTitle(getString(0x7f080211));
        }
        mHistoricalListView.a();
        if (mOrderManager.isEasyOrder())
        {
            obj = by.a(new LabsOrder[] {
                mProfileManager.getEasyOrder()
            });
        } else
        {
            obj = mProfileManager.getRecentOrderHistoryList();
        }
        mHistoricalOrderList = ((ArrayList) (obj));
        if (mHistoricalOrderList.size() > 5)
        {
            obj = new ArrayList(mHistoricalOrderList.subList(0, 5));
        } else
        {
            obj = mHistoricalOrderList;
        }
        mHistoricalOrderList = ((ArrayList) (obj));
        obj = new HistoricalListAdapter(this, mHistoricalOrderList, getNinaPaddingView());
        ((HistoricalListAdapter) (obj)).setHistoricalListListener(this);
        linearlayoutmanager = new LinearLayoutManager();
        mHistoricalListView.a(linearlayoutmanager);
        mHistoricalListView.a(((android.support.v7.widget.bc) (obj)));
    }

    public void onBackPressed()
    {
        mSpeechManager.resetDialogModel();
        super.onBackPressed();
    }

    protected void onPause()
    {
        super.onPause();
        App.getInstance().bus.unregister(mEventHistoricalBusSubscriber);
        mEventHistoricalBusSubscriber = null;
    }

    public void onReorderButtonClicked(LabsOrder labsorder, int i)
    {
        if (mProfileManager.isAuthorizedToPlaceOrder(labsorder))
        {
            reorder(new LabsOrder(labsorder));
            return;
        } else
        {
            showLoginDialog(labsorder, i);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (mEventHistoricalBusSubscriber == null)
        {
            mEventHistoricalBusSubscriber = new HistoricalBusSubscriber(null);
        }
        App.getInstance().bus.register(mEventHistoricalBusSubscriber);
        if (mOrderManager.isEasyOrder())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.EasyOrderActivityTransition());
            return;
        } else
        {
            App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.RecentOrderActivityTransition());
            return;
        }
    }

    protected void onSessionTimedOut()
    {
        mActivityHelper.showAlert(AlertType.SESSION_TIMED_OUT, new _cls2());
    }

    protected void showLoginDialog(final LabsOrder order, int i)
    {
        LoginDialogFragment.newInstance(mProfileManager.getCurrentUser().getFirstName(), null, false, false, new _cls1()).show(getSupportFragmentManager());
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.LoginAlertShow());
    }




    private class _cls3 extends com.dominos.android.sdk.core.order.OrderManager.CreateReOrderCallback
    {

        final HistoricalListActivity this$0;
        final LabsOrder val$order;

        public void onBegin()
        {
            showLoading();
        }

        public void onFailure()
        {
            mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR, mDialogUpdateCommands);
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onNewOrder(LabsOrder labsorder)
        {
            mOrderManager.clearHistoricalPaymentIfExpired(order);
            navigateToCart(labsorder);
        }

        public void onNoStoreFoundForDelivery()
        {
            mActivityHelper.showAlert(AlertType.NO_LONGER_DELIVERY_AREA, mDialogUpdateCommands);
        }

        public void onStoreCarryoutUnavailable(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, null, mDialogUpdateCommands, null);
        }

        public void onStoreClosed()
        {
            if (order.isDelivery())
            {
                mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED, mDialogUpdateCommands);
                return;
            } else
            {
                mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_CLOSED, mDialogUpdateCommands);
                return;
            }
        }

        public void onStoreDeliveryUnavailable(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null, mDialogUpdateCommands, null);
        }

        public void onStoreOffline(String s)
        {
            if (order.isDelivery())
            {
                mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null, mDialogUpdateCommands, null);
                return;
            } else
            {
                mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, null, mDialogUpdateCommands, null);
                return;
            }
        }

        _cls3()
        {
            this$0 = HistoricalListActivity.this;
            order = labsorder;
            super();
        }
    }


    private class HistoricalBusSubscriber
    {

        final HistoricalListActivity this$0;

        public void cancelRecentOrder(com.dominos.bus.events.OriginatedFromSpeech.GoBack goback)
        {
            onBackPressed();
        }

        public void reorderEasyOrder(com.dominos.bus.events.OriginatedFromSpeech.EasyOrderResponse easyorderresponse)
        {
            if (easyorderresponse.getResponse())
            {
                if (mHistoricalOrderList != null && !mHistoricalOrderList.isEmpty())
                {
                    onReorderButtonClicked((LabsOrder)mHistoricalOrderList.get(0), 0);
                }
                return;
            } else
            {
                onBackPressed();
                return;
            }
        }

        public void selectRecentOrder(com.dominos.bus.events.OriginatedFromSpeech.RecentOrderSelection recentorderselection)
        {
            int i = recentorderselection.getIndex();
            if (mHistoricalOrderList != null && !mHistoricalOrderList.isEmpty() && i >= 0 && i < mHistoricalOrderList.size())
            {
                onReorderButtonClicked((LabsOrder)mHistoricalOrderList.get(i), i);
            }
        }

        private HistoricalBusSubscriber()
        {
            this$0 = HistoricalListActivity.this;
            super();
        }

        HistoricalBusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final HistoricalListActivity this$0;

        public void onAlertDismissed()
        {
            finish();
        }

        _cls2()
        {
            this$0 = HistoricalListActivity.this;
            super();
        }
    }


    private class _cls1
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final HistoricalListActivity this$0;
        final LabsOrder val$order;

        public void onCanceled()
        {
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.LoginAlertClose(mDialogUpdateCommands));
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            reorder(order);
        }

        public void onSignOut()
        {
            mSpeechManager.resetDialogModel();
            finish();
        }

        _cls1()
        {
            this$0 = HistoricalListActivity.this;
            order = labsorder;
            super();
        }
    }

}
