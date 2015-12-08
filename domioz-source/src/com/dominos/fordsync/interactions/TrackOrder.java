// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fordsync.FordSyncSession;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.notification.TrackerService_;
import com.dominos.utils.AnalyticsUtil;
import org.a.a.a.a.f;

// Referenced classes of package com.dominos.fordsync.interactions:
//            YesNoInteraction, TrackOrder_, CallStore_

public class TrackOrder extends YesNoInteraction
{

    private static final int MAX_FAILURES = 30;
    private static OrderStatus lastOrderStatus;
    private static ServiceMethod lastServiceMethod;
    private int count;
    AnalyticsUtil mAnalyticsUtil;
    private boolean mIsBroadcastRegistered;
    private UserProfileManager mProfileManager;
    private String orderId;
    private TrackerResult result;
    private String storeId;
    private String trackOrderId;
    private String trackStoreId;
    protected BroadcastReceiver trackerResultReceiver;
    private UserObject user;

    public TrackOrder()
    {
        count = 0;
        trackerResultReceiver = new _cls1();
    }

    private boolean doWeTrackThisStatus(TrackerOrderStatus trackerorderstatus)
    {
        user = mProfileManager.getCurrentUser();
        if (StringHelper.startsWith(trackerorderstatus.getPhone(), user.getPhone()) || StringHelper.isNotEmpty(trackOrderId) && StringHelper.startsWith(trackerorderstatus.getOrderId(), trackOrderId))
        {
            trackOrderId = trackerorderstatus.getOrderId();
            trackStoreId = trackerorderstatus.getStoreId();
            return true;
        } else
        {
            return false;
        }
    }

    private PromptModel getOrderStatusPrompt()
    {
        this;
        JVM INSTR monitorenter ;
        String s = String.format("STATUS_%s", new Object[] {
            lastOrderStatus
        });
        Object obj = s;
        if (lastOrderStatus == OrderStatus.COMPLETE)
        {
            obj = String.format("%s_%s", new Object[] {
                s, lastServiceMethod.name()
            });
            stopTrackerService();
        }
        obj = prompts.getPrompter(((String) (obj))).getRandomPrompt();
        this;
        JVM INSTR monitorexit ;
        return ((PromptModel) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    private void handleTrackerResult(TrackerOrderStatus trackerorderstatus)
    {
        LogUtil.v("SyncInteraction", "handleTrackerResult: %s", new Object[] {
            f.a(trackerorderstatus)
        });
        if (trackerorderstatus != null && doWeTrackThisStatus(trackerorderstatus))
        {
            thenGoAheadAndAlertTheUser(trackerorderstatus);
        }
    }

    private void startTrackerService()
    {
        if (user == null)
        {
            user = mProfileManager.getCurrentUser();
        }
        mIsBroadcastRegistered = true;
        mAppLinkManager.registerReceiver(trackerResultReceiver, new IntentFilter("com.dominos.notifications.tracker"));
        Intent intent = new Intent(App.getInstance().getBaseContext(), com/dominos/notification/TrackerService_);
        intent.putExtra("phone", user.getPhone());
        intent.putExtra("extension", user.getPhoneExtension());
        intent.putExtra("orderID", trackOrderId);
        intent.putExtra("storeID", trackStoreId);
        intent.setAction("OrderPlaced");
        App.getInstance().startService(intent);
    }

    private void stopTrackerService()
    {
        Intent intent = new Intent(App.getInstance().getBaseContext(), com/dominos/notification/TrackerService_);
        App.getInstance().stopService(intent);
        if (mIsBroadcastRegistered)
        {
            mAppLinkManager.unregisterReceiver(trackerResultReceiver);
            mIsBroadcastRegistered = false;
        }
    }

    private void thenGoAheadAndAlertTheUser(TrackerOrderStatus trackerorderstatus)
    {
        OrderStatus orderstatus = trackerorderstatus.getOrderStatus();
        if (orderstatus != lastOrderStatus)
        {
            count = 0;
            lastOrderStatus = orderstatus;
            lastServiceMethod = trackerorderstatus.getServiceMethod();
            mAppLinkManager.alert(getOrderStatusPrompt(), new Object[0]);
            trackerorderstatus = _cls2..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus;
            orderstatus.ordinal();
        }
    }

    protected void no()
    {
        mAnalyticsUtil.postFordSyncTrackOrderNo();
        super.no();
        stopTrackerService();
        mAppLinkManager.prompt(prompts.getPrompter("thank_you_enjoy"), new Object[0]);
        mAppLinkManager.showWelcomeMessage();
    }

    public void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mFordSyncSession.getManager("user_manager");
    }

    public TrackOrder_ setOrderToTrack(String s, String s1)
    {
        stopTrackerService();
        storeId = s;
        orderId = s1;
        trackStoreId = s;
        trackOrderId = s1;
        return (TrackOrder_)this;
    }

    public void start()
    {
        mIsBroadcastRegistered = false;
        mAnalyticsUtil.postFordSyncTrackOrderStart();
        if (!mProfileManager.isAuthorizedUser())
        {
            CallStore_.getInstance_(app).start();
            return;
        }
        if (StringHelper.isBlank(storeId) && StringHelper.isBlank(orderId))
        {
            if (result == null)
            {
                yes();
            } else
            {
                mAppLinkManager.prompt(getOrderStatusPrompt(), new Object[0]);
            }
        } else
        {
            super.start();
        }
        mAppLinkManager.updateLayout("TEXTBUTTONS_WITH_GRAPHIC");
    }

    protected void yes()
    {
        lastOrderStatus = null;
        mAnalyticsUtil.postFordSyncTrackOrderYes();
        super.yes();
        startTrackerService();
        mAppLinkManager.showWelcomeMessage();
    }

    static 
    {
        lastServiceMethod = ServiceMethod.UNKNOWN;
    }



/*
    static TrackerResult access$002(TrackOrder trackorder, TrackerResult trackerresult)
    {
        trackorder.result = trackerresult;
        return trackerresult;
    }

*/




/*
    static int access$202(TrackOrder trackorder, int i)
    {
        trackorder.count = i;
        return i;
    }

*/


/*
    static int access$208(TrackOrder trackorder)
    {
        int i = trackorder.count;
        trackorder.count = i + 1;
        return i;
    }

*/


    private class _cls1 extends BroadcastReceiver
    {

        final TrackOrder this$0;

        public void onReceive(Context context, Intent intent)
        {
            LogUtil.d("SyncInteraction", "Tracker status received", new Object[0]);
            if (intent.getAction().equalsIgnoreCase("com.dominos.notifications.tracker"))
            {
                if (StringHelper.equals(intent.getStringExtra("tracker-status"), "tracking-progress"))
                {
                    result = (TrackerResult)intent.getParcelableExtra("tracker-result");
                    if (result != null)
                    {
                        int i = intent.getIntExtra("tracker-index", 0);
                        context = (TrackerOrderStatus)result.getOrderStatuses().get(i);
                        handleTrackerResult(context);
                        count = 0;
                    }
                }
                int i = ((_22_tracker_2D_status_22_) (this))._22_tracker_2D_status_22_;
                if (count > 30)
                {
                    count = 0;
                    context = prompts.getPrompter("error_prompt").getPrompt("tracker_error");
                    mAppLinkManager.alert(context, new Object[0]);
                    stopTrackerService();
                }
            }
        }

        _cls1()
        {
            this$0 = TrackOrder.this;
            super();
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus = new int[OrderStatus.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.COMPLETE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.FUTURE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.WAITING.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.CANCELLED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.UNKNOWN.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
