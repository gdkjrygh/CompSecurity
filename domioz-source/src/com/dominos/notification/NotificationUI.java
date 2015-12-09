// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.bi;
import android.widget.RemoteViews;
import com.dominos.MobileSession_;
import com.dominos.activities.TrackerActivity_;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.tracker.TrackerManager;

// Referenced classes of package com.dominos.notification:
//            DismissReceiver_, TrackerService_

public class NotificationUI
{

    private static final int DRIVERS_NAME_MAX_LENGTH = 11;
    private final String TAG = com/dominos/notification/NotificationUI.getName();
    private boolean isFatal;
    private Context mContext;
    private String mExtension;
    private String mOrderID;
    private String mPhone;

    public NotificationUI(Context context, String s, String s1, String s2)
    {
        isFatal = false;
        mContext = context;
        mPhone = s;
        mExtension = s1;
        mOrderID = s2;
    }

    private Notification getNotification(String s, boolean flag, TrackerOrderStatus trackerorderstatus, StoreProfile storeprofile)
    {
        Object obj1 = null;
        RemoteViews remoteviews;
        Object obj;
        if (!isFatal || trackerorderstatus != null && trackerorderstatus.getOrderStatus() == OrderStatus.COMPLETE)
        {
            StoreManager storemanager;
            if (isFatal)
            {
                remoteviews = new RemoteViews(mContext.getPackageName(), 0x7f03008e);
            } else
            {
                remoteviews = new RemoteViews(mContext.getPackageName(), 0x7f03008d);
                obj = new Intent(mContext, com/dominos/notification/TrackerService_);
                ((Intent) (obj)).setAction("com.dominos.notifications.stop");
                remoteviews.setOnClickPendingIntent(0x7f0f0333, PendingIntent.getService(mContext, 0, ((Intent) (obj)), 0));
            }
            storemanager = (StoreManager)MobileSession_.getInstance_(mContext).getManager("store_manager");
            obj = storeprofile;
            if (storeprofile == null)
            {
                obj = storeprofile;
                if (storemanager.getStoreProfile() != null)
                {
                    obj = storeprofile;
                    if (StringHelper.isNotEmpty(storemanager.getStoreProfile().getStoreId()))
                    {
                        obj = storemanager.getStoreProfile();
                    }
                }
            }
            if (trackerorderstatus == null)
            {
                storeprofile = (TrackerManager)MobileSession_.getInstance_(mContext).getManager("tracker-manager");
                storeprofile = TrackerActivity_.intent(mContext).mStoreProfile(((StoreProfile) (obj))).mOrderStatus(trackerorderstatus).mOrderId(mOrderID).mPhone(mPhone).mServiceMethod(storeprofile.getOrder().getServiceMethod()).get();
            } else
            {
                storeprofile = TrackerActivity_.intent(mContext).mOrderId(mOrderID).mPhone(mPhone).mStoreProfile(((StoreProfile) (obj))).mOrderStatus(trackerorderstatus).get();
            }
            storeprofile.putExtra("startedForPhoneNumber", true);
            storeprofile.putExtra("status", trackerorderstatus);
            if (storemanager.getStoreProfile() != null && StringHelper.isNotEmpty(storemanager.getStoreProfile().getStoreId()))
            {
                storeprofile.putExtra("storeProfile", storemanager.getStoreProfile());
            } else
            {
                storeprofile.putExtra("storeProfile", ((android.os.Parcelable) (obj)));
            }
            trackerorderstatus = PendingIntent.getActivity(mContext, 0, storeprofile, 0x8000000);
            remoteviews.setOnClickPendingIntent(0x7f0f0336, trackerorderstatus);
            remoteviews.setOnClickPendingIntent(0x7f0f0335, trackerorderstatus);
        } else
        {
            remoteviews = new RemoteViews(mContext.getPackageName(), 0x7f03008e);
            if (trackerorderstatus == null)
            {
                remoteviews.setTextViewText(0x7f0f0334, getStringFromR(0x7f0801e5));
            }
            trackerorderstatus = null;
        }
        remoteviews.setTextViewText(0x7f0f0336, s);
        storeprofile = new Intent(mContext, com/dominos/notification/DismissReceiver_);
        storeprofile.setAction("com.dominos.intent.action.NOTIFICATION_DISMISSED");
        storeprofile = PendingIntent.getBroadcast(mContext, 0, storeprofile, 0x10000000);
        obj = new bi(mContext);
        ((bi) (obj)).b(storeprofile);
        ((bi) (obj)).a(0x7f020113);
        ((bi) (obj)).a(remoteviews);
        if (flag)
        {
            s = obj1;
        } else
        {
            ((bi) (obj)).d(s);
            ((bi) (obj)).a();
            storeprofile = ((bi) (obj)).b();
            storeprofile.defaults = ((Notification) (storeprofile)).defaults | 1;
            storeprofile.defaults = ((Notification) (storeprofile)).defaults | 4;
            s = storeprofile;
            if (!isFatal)
            {
                storeprofile.contentIntent = trackerorderstatus;
                return storeprofile;
            }
        }
        return s;
    }

    private String getOutTheDoorString(String s)
    {
        if (StringHelper.length(s) < 11)
        {
            return String.format(getStringFromR(0x7f0801e6), new Object[] {
                s
            });
        } else
        {
            return getStringFromR(0x7f0801e7);
        }
    }

    private String getStringFromR(int i)
    {
        return mContext.getResources().getString(i);
    }

    public Notification getStartNotification(StoreProfile storeprofile)
    {
        return getNotification(getStringFromR(0x7f0801ec), false, null, storeprofile);
    }

    public boolean isOrderStatusFatal(TrackerOrderStatus trackerorderstatus)
    {
        if (trackerorderstatus != null)
        {
            if ((trackerorderstatus = trackerorderstatus.getOrderStatus()) != OrderStatus.CANCELLED && trackerorderstatus != OrderStatus.COMPLETE && trackerorderstatus != OrderStatus.FUTURE && trackerorderstatus != OrderStatus.UNKNOWN)
            {
                return false;
            }
        }
        return true;
    }

    public Notification processOrderMessage(TrackerOrderStatus trackerorderstatus, StoreProfile storeprofile)
    {
        String s;
        boolean flag;
        boolean flag1;
        s = null;
        flag = true;
        flag1 = false;
        isFatal = isOrderStatusFatal(trackerorderstatus);
        if (trackerorderstatus == null)
        {
            return getNotification(getStringFromR(0x7f0801ea), false, trackerorderstatus, null);
        }
        _cls1..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus[trackerorderstatus.getOrderStatus().ordinal()];
        JVM INSTR tableswitch 1 9: default 96
    //                   1 109
    //                   2 152
    //                   3 163
    //                   4 174
    //                   5 188
    //                   6 199
    //                   7 213
    //                   8 227
    //                   9 241;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        flag1 = true;
_L12:
        return getNotification(s, flag1, trackerorderstatus, storeprofile);
_L2:
        if (trackerorderstatus.getServiceMethod() != ServiceMethod.CARRYOUT)
        {
            flag = false;
        }
        if (flag)
        {
            s = getStringFromR(0x7f0801ee);
        } else
        {
            s = getStringFromR(0x7f0801e9);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        s = getStringFromR(0x7f0801e8);
        continue; /* Loop/switch isn't completed */
_L4:
        s = getStringFromR(0x7f0801eb);
        continue; /* Loop/switch isn't completed */
_L5:
        s = getStringFromR(0x7f0803b5);
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L6:
        s = getStringFromR(0x7f0801ed);
        continue; /* Loop/switch isn't completed */
_L7:
        s = getStringFromR(0x7f0803b4);
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L8:
        s = getStringFromR(0x7f0803b6);
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L9:
        s = getStringFromR(0x7f0803b7);
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L10:
        s = getOutTheDoorString(trackerorderstatus.getDriverName());
        if (true) goto _L12; else goto _L11
_L11:
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus = new int[OrderStatus.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.COMPLETE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.BEING_MADE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.IN_THE_OVEN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.CANCELLED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.ON_THE_RACK.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.FUTURE.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.UNKNOWN.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.WAITING.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.OUT_THE_DOOR.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
