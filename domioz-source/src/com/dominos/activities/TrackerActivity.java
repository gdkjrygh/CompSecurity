// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestionModel;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestions;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.tracker.TrackerManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.fragments.TrackerFeedbackFragment;
import com.dominos.fragments.TrackerFeedbackFragment_;
import com.dominos.loader.ApplicationLoader;
import com.dominos.notification.TrackerService_;
import com.dominos.remote.receiver.NotificationReceiver;
import com.dominos.samsungtv.SamsungDevicesDialog;
import com.dominos.samsungtv.SamsungDevicesDialog_;
import com.dominos.samsungtv.SamsungTVManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.ResUtils;
import com.dominos.views.FeedbackDrawerView;
import com.dominos.views.LoyaltyPointsConfirmationWidget_;
import com.dominos.views.TrackerOrderDetailsView;
import com.dominos.views.TrackerOrderRowView;
import com.dominos.views.TrackerOrderRowView_;
import com.dominos.views.TrackerStatusView;
import com.dominos.views.TrackerStoreAddressView;
import com.dominos.views.TrackerTopBarView;
import com.samsung.multiscreen.device.Device;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.api.c.p;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, LandingActivity_

public class TrackerActivity extends BaseActivity
    implements com.dominos.samsungtv.SamsungDevicesDialog.SamsungDevicesDialogListener, com.dominos.views.FeedbackDrawerView.OnFeedbackDrawerSubmitListener, com.dominos.views.TrackerQuestionView.OnQuestionClickedListener, com.dominos.views.TrackerTopBarView.OnTopBarClickListener
{

    private static final String BOTTLE_DEPOSIT_ZERO = "$0.00";
    private static final String SAMSUNG_POPUP = "SamsungFirstPopup";
    private static final String TAG = com/dominos/activities/TrackerActivity.getName();
    private static final int TOP_PADDING = 50;
    ApplicationLoader mApplicationLoader;
    DominosPrefs_ mDominosPrefs;
    PlaceOrderErrorCode mErrorCode;
    FeedbackDrawerView mFeedbackDrawerView;
    private TrackerFeedbackFragment mFeedbackFragment;
    boolean mFromCheckout;
    LinearLayout mLoyaltyBanner;
    TextView mLoyaltyBannerText;
    FrameLayout mLoyaltyWidgetHolder;
    LinearLayout mOrderDetailContainer;
    TrackerOrderDetailsView mOrderDetailView;
    String mOrderId;
    TrackerOrderStatus mOrderStatus;
    String mPhone;
    private SamsungDevicesDialog mSamsungDevicesDialog;
    private List mSamsungTVDevices;
    SamsungTVManager mSamsungTVManager;
    String mServiceMethod;
    TrackerStoreAddressView mStoreAddressView;
    StoreProfile mStoreProfile;
    TrackerTopBarView mTopBarView;
    private TrackerManager mTrackerManager;
    private TrackerResult mTrackerResult;
    protected BroadcastReceiver mTrackerResultReceiver;
    TrackerStatusView mTrackerStatusView;
    ResUtils resUtils;

    public TrackerActivity()
    {
        mTrackerResultReceiver = new _cls1();
    }

    private void loadSamsungButton()
    {
label0:
        {
            if (mConfigurationManager != null && mConfigurationManager.getApplicationConfiguration() != null)
            {
                if (!mConfigurationManager.getApplicationConfiguration().isSamsungTVEnabled())
                {
                    break label0;
                }
                mSamsungTVManager.findLocalDevices(new _cls3());
            }
            return;
        }
        LogUtil.d(TAG, "SamsungTVInteractor is disabled", new Object[0]);
    }

    private void retryTracker(TrackerOrderStatus trackerorderstatus)
    {
        String s;
        String s1;
        Intent intent;
        if (trackerorderstatus == null)
        {
            s = mTrackerManager.getOrder().getPhone();
            trackerorderstatus = mTrackerManager.getOrder().getId();
            s1 = mTrackerManager.getOrder().getStoreId();
        } else
        {
            s = trackerorderstatus.getPhone();
            String s2 = trackerorderstatus.getOrderId();
            s1 = trackerorderstatus.getStoreId();
            trackerorderstatus = s2;
        }
        intent = new Intent(getApplicationContext(), com/dominos/notification/TrackerService_);
        intent.putExtra("phone", s);
        intent.putExtra("extension", "");
        intent.putExtra("orderID", trackerorderstatus);
        intent.putExtra("storeProfile", mStoreProfile);
        intent.putExtra("tracker-receiver", new NotificationReceiver());
        intent.putExtra("storeID", s1);
        intent.setAction("OrderPlaced");
        startService(intent);
    }

    private void setUpLoyaltyViews()
    {
        mLoyaltyBanner.setVisibility(8);
        mLoyaltyWidgetHolder.setVisibility(8);
        if (mLoyaltyManager.isCustomerEnrolledInLoyalty() && mFromCheckout) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mErrorCode == null) goto _L4; else goto _L3
_L3:
        _cls8..SwitchMap.com.dominos.android.sdk.core.order.PlaceOrderErrorCode[mErrorCode.ordinal()];
        JVM INSTR tableswitch 1 1: default 72
    //                   1 171;
           goto _L4 _L5
_L4:
        if (mLoyaltyManager.isLoyaltyAvailable())
        {
            mLoyaltyWidgetHolder.setVisibility(0);
            int i = mLoyaltyManager.getEarnedBasePointsOfPlacedOrder();
            if (mLoyaltyManager.isNewLoyaltyMember())
            {
                int j = mLoyaltyManager.getEarnedTotalPointsOfPlacedOrder();
                mLoyaltyBannerText.setText(getString(0x7f08031b, new Object[] {
                    Integer.valueOf(j)
                }));
                mLoyaltyBanner.setVisibility(0);
            }
            com.dominos.views.LoyaltyPointsConfirmationWidget loyaltypointsconfirmationwidget = LoyaltyPointsConfirmationWidget_.build(this, i, mLoyaltyManager.getEarnedBonusPointsOfPlacedOrder());
            mLoyaltyWidgetHolder.addView(loyaltypointsconfirmationwidget);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        mLoyaltyWidgetHolder.setVisibility(0);
        android.view.View view = getLayoutInflater().inflate(0x7f03007d, null);
        mLoyaltyWidgetHolder.addView(view);
        return;
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void setupOrderView()
    {
        if (mFromCheckout)
        {
            Object obj = mTrackerManager.getOrder();
            Object obj3;
            for (Iterator iterator = ((LabsOrder) (obj)).getProductLineList().iterator(); iterator.hasNext(); mOrderDetailContainer.addView(((android.view.View) (obj3))))
            {
                Object obj1 = (LabsProductLine)iterator.next();
                String s1 = getString(0x7f080341);
                obj3 = getString(0x7f08018a);
                String s2 = getString(0x7f080283);
                s1 = (new StringBuilder()).append(((LabsProductLine) (obj1)).getQuantity()).append(" ").append(((LabsProductLine) (obj1)).getProduct().getTitle()).append("\n").append(((LabsProductLine) (obj1)).getProduct().getName()).append(" ").append(((LabsProductLine) (obj1)).getOptionDescription(resUtils.getOptionToQuantityMap(), s1, ((String) (obj3)), s2)).append('\n').toString();
                obj1 = NumberUtil.formatPrice(Double.valueOf(((LabsProductLine) (obj1)).getPrice()));
                obj3 = TrackerOrderRowView_.build(this);
                ((TrackerOrderRowView) (obj3)).bind(s1, ((String) (obj1)));
            }

            String s = NumberUtil.formatPrice(Double.valueOf(((LabsOrder) (obj)).getNetAmount()));
            Object obj2 = getResources().getString(0x7f080314);
            TrackerOrderRowView trackerorderrowview = TrackerOrderRowView_.build(this);
            trackerorderrowview.bind(((String) (obj2)), s);
            mOrderDetailContainer.addView(trackerorderrowview);
            s = getResources().getString(0x7f080323);
            obj2 = NumberUtil.formatPrice(Double.valueOf(((LabsOrder) (obj)).getTaxAmount()));
            trackerorderrowview = TrackerOrderRowView_.build(this);
            mOrderDetailContainer.addView(trackerorderrowview);
            trackerorderrowview.bind(s, ((String) (obj2)));
            s = getResources().getString(0x7f080322);
            obj2 = NumberUtil.formatPrice(Double.valueOf(((LabsOrder) (obj)).getDepositAmount()));
            if (!StringHelper.equals(((String) (obj2)), "$0.00"))
            {
                TrackerOrderRowView trackerorderrowview1 = TrackerOrderRowView_.build(this);
                trackerorderrowview1.bind(s, ((String) (obj2)));
                mOrderDetailContainer.addView(trackerorderrowview1);
            }
            if (((LabsOrder) (obj)).getServiceMethod().equalsIgnoreCase("Delivery"))
            {
                s = getResources().getString(0x7f08030b);
                obj2 = NumberUtil.formatPrice(Double.valueOf(((LabsOrder) (obj)).getDeliveryAmount()));
                TrackerOrderRowView trackerorderrowview2 = TrackerOrderRowView_.build(this);
                trackerorderrowview2.bind(s, ((String) (obj2)));
                mOrderDetailContainer.addView(trackerorderrowview2);
            }
            s = getResources().getString(0x7f080326);
            obj = NumberUtil.formatPrice(Double.valueOf(((LabsOrder) (obj)).getPrice()));
            obj2 = TrackerOrderRowView_.build(this);
            ((TrackerOrderRowView) (obj2)).bind(s, ((String) (obj)));
            ((TrackerOrderRowView) (obj2)).setPadding(0, 50, 0, 0);
            mOrderDetailContainer.addView(((android.view.View) (obj2)));
        }
    }

    private boolean shouldShowRateApp()
    {
        String s = (String)mDominosPrefs.ratedAppVersion().c();
        if (!mFromCheckout)
        {
            return false;
        }
        if (mTrackerManager.isRateAppDialogFlag())
        {
            return false;
        }
        if (StringHelper.isEmpty(s))
        {
            return true;
        }
        return !StringHelper.equals(s, "3.0.1");
    }

    private void showRateAppDialog()
    {
        if (shouldShowRateApp())
        {
            mAnalyticsUtil.postRateAppDialogShowed();
            mActivityHelper.showOptionAlert(AlertType.APP_FEEDBACK_REQUEST, null, new _cls7());
        }
    }

    private void submitResponses(ArrayList arraylist)
    {
        arraylist = arraylist.iterator();
        while (arraylist.hasNext()) 
        {
            FeedbackQuestionModel feedbackquestionmodel = (FeedbackQuestionModel)arraylist.next();
            if (StringHelper.equals(feedbackquestionmodel.getTeamMemberPosition(), "Driver"))
            {
                feedbackquestionmodel.setTeamMemberName(mOrderStatus.getDriverName());
                feedbackquestionmodel.setTeamMemberId(mOrderStatus.getDriverId());
            } else
            if (StringHelper.equals(feedbackquestionmodel.getTeamMemberPosition(), "Driver"))
            {
                feedbackquestionmodel.setTeamMemberName(mOrderStatus.getMakerName());
                feedbackquestionmodel.setTeamMemberId(mOrderStatus.getMakerId());
            }
            mTrackerManager.submitFeedbackResponse(feedbackquestionmodel.getCode(), feedbackquestionmodel.getType(), feedbackquestionmodel.getTeamMemberName(), feedbackquestionmodel.getTeamMemberId(), feedbackquestionmodel.getTeamMemberPosition(), String.valueOf(feedbackquestionmodel.getRating()), null);
        }
    }

    private void updateFeedbackQuestions()
    {
        mTrackerManager.loadFeedbackQuestions(mStoreProfile.getStoreId(), mOrderId, new _cls4());
    }

    private void updateTracker(TrackerOrderStatus trackerorderstatus)
    {
        if (trackerorderstatus != null)
        {
            mTrackerStatusView.setCurrentStatus(trackerorderstatus);
            updateFeedbackQuestions();
            if (!mFromCheckout)
            {
                mOrderDetailView.bind(mOrderStatus.getOrderDescription());
            }
            return;
        }
        if (mOrderStatus != null)
        {
            mTrackerStatusView.setStatusAsStarted(mOrderStatus.getServiceMethod());
            return;
        }
        if (mTrackerManager.getOrder() != null)
        {
            mTrackerStatusView.setStatusAsStarted(ServiceMethod.fromString(mTrackerManager.getOrder().getServiceMethod()));
            return;
        } else
        {
            mTrackerStatusView.setStatusAsStarted(ServiceMethod.fromString(mServiceMethod));
            return;
        }
    }

    public void handleDevicesFound(List list)
    {
        mSamsungTVDevices = new ArrayList(list);
        if (App.settings().getBoolean("SamsungFirstPopup", true))
        {
            App.editor().putBoolean("SamsungFirstPopup", false).commit();
            mSamsungDevicesDialog = SamsungDevicesDialog_.builder().mFirstTime(true).mDeviceList(new ArrayList(list)).build();
            mSamsungDevicesDialog.show(getSupportFragmentManager(), "samsungDevicesDialog");
        }
    }

    protected void onAfterInject()
    {
        mTrackerManager = (TrackerManager)mMobileSession.getManager("tracker-manager");
    }

    public void onAfterQuestionClicked()
    {
        if (mOrderStatus.getOrderStatus() == OrderStatus.COMPLETE)
        {
            mFeedbackDrawerView.bind(mFeedbackFragment.getAfterQuestionList(), this, false);
            mFeedbackDrawerView.toggle();
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.TRACKER_PROVIDE_FEEDBACK);
            return;
        }
    }

    protected void onAfterViews()
    {
        mTopBarView.bind(this);
        if (!mApplicationLoader.isApplicationInitialized())
        {
            mTopBarView.setHomeButtonVisible(false);
            mApplicationLoader.setupAsync(mMobileSession, new _cls2());
        }
        setUpLoyaltyViews();
        setupOrderView();
        mStoreAddressView.bind(mStoreProfile.getAddressDescription(), mStoreProfile.getPhone());
        mFeedbackFragment = TrackerFeedbackFragment_.builder().build();
        getSupportFragmentManager().a().b(0x7f0f00f9, mFeedbackFragment).a();
        if (mOrderStatus != null && !mFromCheckout)
        {
            mOrderDetailView.bind(mOrderStatus.getOrderDescription());
        }
    }

    public void onBackPressed()
    {
        if (mFeedbackDrawerView.isOpened())
        {
            mFeedbackDrawerView.toggle();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onBeforeQuestionClicked()
    {
        mFeedbackDrawerView.bind(mFeedbackFragment.getBeforeQuestionList(), this, true);
        mFeedbackDrawerView.toggle();
    }

    public void onDeviceItemSelected(Device device)
    {
        mSamsungTVManager.openTVApp(device, mPhone, mOrderId, new _cls6());
        if (mSamsungDevicesDialog != null && mSamsungDevicesDialog.isVisible())
        {
            mSamsungDevicesDialog.dismiss();
        }
    }

    public void onHomeButtonClicked()
    {
        ((LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).start();
    }

    public void onMultiScreenButtonClicked()
    {
        mSamsungDevicesDialog = SamsungDevicesDialog_.builder().mFirstTime(false).mDeviceList(new ArrayList(mSamsungTVDevices)).build();
        mSamsungDevicesDialog.show(getSupportFragmentManager(), "samsungDevicesDialog");
        mAnalyticsUtil.postMultiScreenButtonClicked();
    }

    protected void onResume()
    {
        super.onResume();
        if (mTrackerManager.getTrackerOrderStatus() != null)
        {
            mOrderStatus = mTrackerManager.getTrackerOrderStatus();
        }
        updateTracker(mOrderStatus);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (mSamsungDevicesDialog != null && mSamsungDevicesDialog.isVisible())
        {
            mSamsungDevicesDialog.dismiss();
        }
        super.onSaveInstanceState(bundle);
    }

    public void onSendButtonClicked(FeedbackQuestionModel feedbackquestionmodel)
    {
        if (mOrderStatus.getOrderStatus() == OrderStatus.COMPLETE)
        {
            mTrackerManager.submitFeedbackResponse(feedbackquestionmodel.getCode(), feedbackquestionmodel.getType(), feedbackquestionmodel.getTeamMemberName(), feedbackquestionmodel.getTeamMemberId(), feedbackquestionmodel.getTeamMemberPosition(), feedbackquestionmodel.getResponse(), null);
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.TRACKER_PROVIDE_FEEDBACK);
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        mAnalyticsUtil.postOrderConfirmation();
        showRateAppDialog();
        if (StringHelper.isEmpty(mOrderId) && mOrderStatus != null)
        {
            mOrderId = mOrderStatus.getOrderId();
        }
        if (StringHelper.isEmpty(mPhone))
        {
            if (mOrderStatus != null)
            {
                mPhone = mOrderStatus.getPhone();
            } else
            {
                mPhone = mTrackerManager.getOrder().getPhone();
            }
        }
        registerReceiver(mTrackerResultReceiver, new IntentFilter("com.dominos.notifications.tracker"));
        if (mTrackerManager.hasTrackerFailed())
        {
            showTrackerNotAvailableDialog();
        }
        loadSamsungButton();
    }

    protected void onStop()
    {
        unregisterReceiver(mTrackerResultReceiver);
        mTrackerStatusView.clearAnimation();
        super.onStop();
    }

    public void onSubmitButtonClick(ArrayList arraylist, boolean flag)
    {
        mFeedbackFragment.updateRatings(arraylist, flag);
        arraylist = new ArrayList();
        if (flag)
        {
            arraylist.addAll(mFeedbackFragment.getBeforeQuestionList());
        } else
        {
            arraylist.addAll(mFeedbackFragment.getAfterQuestionList());
        }
        submitResponses(arraylist);
        mFeedbackDrawerView.toggle();
    }

    protected void showTrackerNotAvailableDialog()
    {
        mActivityHelper.showOptionAlert(AlertType.TRACKER_UNAVAILABLE, null, new _cls5());
    }

    protected void updateFeedbackData(FeedbackQuestions feedbackquestions)
    {
        if (mFeedbackFragment.isAdded())
        {
            mFeedbackFragment.updateData(feedbackquestions, mOrderStatus, this);
        }
    }




/*
    static TrackerResult access$002(TrackerActivity trackeractivity, TrackerResult trackerresult)
    {
        trackeractivity.mTrackerResult = trackerresult;
        return trackerresult;
    }

*/




/*
    static List access$302(TrackerActivity trackeractivity, List list)
    {
        trackeractivity.mSamsungTVDevices = list;
        return list;
    }

*/



    private class _cls1 extends BroadcastReceiver
    {

        final TrackerActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            LogUtil.d(".notification.", "Tracker status received", new Object[0]);
            if (StringHelper.equalsIgnoreCase(intent.getAction(), "com.dominos.notifications.tracker"))
            {
                String s = intent.getStringExtra("tracker-status");
                if (StringHelper.equals(s, "tracking-progress"))
                {
                    int i = intent.getIntExtra("tracker-index", 0);
                    mTrackerResult = (TrackerResult)intent.getParcelableExtra("tracker-result");
                    if (mTrackerResult != null)
                    {
                        mOrderStatus = (TrackerOrderStatus)mTrackerResult.getOrderStatuses().get(i);
                        updateTracker(mOrderStatus);
                    }
                } else
                {
                    if (StringHelper.equals(s, "tracking-timedout"))
                    {
                        showTrackerNotAvailableDialog();
                        return;
                    }
                    if (StringHelper.equals(s, "tracking-completed"))
                    {
                        LogUtil.d(TrackerActivity.TAG, "stopping and going to landing", new Object[0]);
                        ((LandingActivity_.IntentBuilder_)LandingActivity_.intent(context).flags(0x4000000)).start();
                        finish();
                        return;
                    }
                }
            }
        }

        _cls1()
        {
            this$0 = TrackerActivity.this;
            super();
        }
    }


    private class _cls3
        implements com.dominos.samsungtv.SamsungTVManager.OnLocalDevicesSearchListener
    {

        final TrackerActivity this$0;

        public void onDevicesFound(List list)
        {
            mTopBarView.setmMultiScreenButtonVisible(true);
            mSamsungTVDevices = new ArrayList(list);
            handleDevicesFound(list);
        }

        public void onDevicesNotFound()
        {
        }

        _cls3()
        {
            this$0 = TrackerActivity.this;
            super();
        }
    }


    private class _cls8
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode = new int[PlaceOrderErrorCode.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNABLE_TO_PROCESS_LOYALTY_AT_THIS_TIME.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }


    private class _cls7 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final TrackerActivity this$0;

        public void onNegativeButtonClicked()
        {
            mAnalyticsUtil.clickNegativeRateApp();
            mDominosPrefs.ratedAppVersion().b("3.0.1");
        }

        public void onNeutralButtonClicked()
        {
            mAnalyticsUtil.clickNeutralAppRate();
            mTrackerManager.setRateAppDialogFlag(true);
        }

        public void onPositiveButtonClicked()
        {
            mAnalyticsUtil.clickPositiveRateApp();
            try
            {
                startActivity((new Intent("android.intent.action.VIEW")).setData(Uri.parse((new StringBuilder()).append(AmazonUtil.getMarketURI()).append(getPackageName()).toString())));
                mDominosPrefs.ratedAppVersion().b("3.0.1");
                return;
            }
            catch (Exception exception)
            {
                App.displayErrorToast("An error has occured connecting to the Market.", App.getInstance().getApplicationContext());
                exception.printStackTrace();
                return;
            }
        }

        _cls7()
        {
            this$0 = TrackerActivity.this;
            super();
        }
    }


    private class _cls4 extends com.dominos.android.sdk.core.tracker.TrackerManager.LoadFeedbackQuestionsCallback
    {

        final TrackerActivity this$0;

        public void onLoadFeedbackFailure()
        {
        }

        public void onLoadFeedbackSuccess(FeedbackQuestions feedbackquestions)
        {
            updateFeedbackData(feedbackquestions);
        }

        _cls4()
        {
            this$0 = TrackerActivity.this;
            super();
        }
    }


    private class _cls2
        implements com.dominos.loader.ApplicationLoader.SetupLoadCallback
    {

        final TrackerActivity this$0;

        public void onSetupFailure(int i, String s)
        {
        }

        public void onSetupSuccess()
        {
            mTopBarView.setHomeButtonVisible(true);
        }

        _cls2()
        {
            this$0 = TrackerActivity.this;
            super();
        }
    }


    private class _cls6
        implements com.dominos.samsungtv.SamsungTVManager.OnOpenAppListener
    {

        final TrackerActivity this$0;

        public void onAppNotFound()
        {
            mActivityHelper.showAlert(AlertType.SAMSUNG_TV_APP_NOT_FOUND);
        }

        public void onConnectFailed()
        {
            mActivityHelper.showAlert(AlertType.SAMSUNG_TV_APP_CONNECTION_ERROR);
        }

        public void onOpenFailed()
        {
            mActivityHelper.showAlert(AlertType.SAMSUNG_TV_APP_CONNECTION_ERROR);
        }

        public void onOpenSuccess()
        {
            LogUtil.d(TrackerActivity.TAG, "success open samsung app", new Object[0]);
        }

        _cls6()
        {
            this$0 = TrackerActivity.this;
            super();
        }
    }


    private class _cls5 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final TrackerActivity this$0;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            retryTracker(mOrderStatus);
            showLongToast(getString(0x7f080327));
        }

        _cls5()
        {
            this$0 = TrackerActivity.this;
            super();
        }
    }

}
