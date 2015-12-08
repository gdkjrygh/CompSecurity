// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.activities;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.dominos.MobileSession;
import com.dominos.activities.BaseActivity;
import com.dominos.beacon.adapter.BeaconOrderAdapter;
import com.dominos.beacon.manager.BeaconManager;
import com.dominos.beacon.model.Beacon;
import com.dominos.beacon.model.CarryoutOrder;
import com.dominos.beacon.util.BeaconNotificationUI;
import com.dominos.beacon.util.BeaconUtil;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.ToolBarView;
import java.util.List;

public class BeaconCheckInActivity extends BaseActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    Beacon mBeacon;
    private BeaconManager mBeaconManager;
    CarryoutOrder mCarryoutOrder;
    ListView mListView;
    BeaconNotificationUI mNotificationUI;
    ToolBarView mToolBar;

    public BeaconCheckInActivity()
    {
    }

    private void doCheckIn(com.dominos.beacon.model.CarryoutOrder.Order order)
    {
        mBeaconManager.checkIn(order, mBeacon, new _cls2());
    }

    protected void onAfterViews()
    {
        mToolBar.setTitle(getString(0x7f08036d));
        if (mCarryoutOrder != null)
        {
            BeaconOrderAdapter beaconorderadapter = new BeaconOrderAdapter(this);
            beaconorderadapter.addAll(mCarryoutOrder.getOrder());
            mListView.setAdapter(beaconorderadapter);
            mListView.setOnItemClickListener(this);
        }
        mAnalyticsUtil.postBeaconOrderListScreen();
    }

    public void onItemClick(final AdapterView order, View view, int i, long l)
    {
        mAnalyticsUtil.postOnEventCheckinOrderListSelect();
        order = (com.dominos.beacon.model.CarryoutOrder.Order)mCarryoutOrder.getOrder().get(i);
        view = BeaconUtil.getFormattedFirstName(order.getCustomerName());
        mActivityHelper.showOptionDialog(getString(0x7f08035c, new Object[] {
            view
        }), getString(0x7f08035b), getString(0x7f08035e), getString(0x7f08035a), null, null, new _cls1());
    }

    protected void setup()
    {
        mBeaconManager = (BeaconManager)mMobileSession.getManager("beacon_manager");
    }






    private class _cls2 extends com.dominos.beacon.manager.BeaconManager.BeaconCheckInCallback
    {

        final BeaconCheckInActivity this$0;

        public void onCheckInFailed()
        {
            finish.postOnEventCheckinFailure();
            finish();
        }

        public void onCheckInSuccess()
        {
            class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
            {

                final _cls2 this$1;

                public void onAlertDismissed()
                {
                    finish();
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            BeaconCheckInActivity.this.BeaconCheckInActivity$2$1.showAlert(getString(0x7f080360), getString(0x7f08035f), new _cls1());
        }

        _cls2()
        {
            this$0 = BeaconCheckInActivity.this;
            super();
        }
    }


    private class _cls1 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final BeaconCheckInActivity this$0;
        final com.dominos.beacon.model.CarryoutOrder.Order val$order;

        public void onNegativeButtonClicked()
        {
            postOnEventCheckinOrderListSelectCancel.postOnEventCheckinOrderListSelectCancel();
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            postOnEventCheckinOrderListSelectCancel.postOnEventCheckinOrderListSelectConfirm();
            doCheckIn(order);
        }

        _cls1()
        {
            this$0 = BeaconCheckInActivity.this;
            order = order1;
            super();
        }
    }

}
