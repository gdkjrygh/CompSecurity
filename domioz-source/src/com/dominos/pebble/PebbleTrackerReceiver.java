// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.Ts;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.pebble.order.PebbleOrderHandler;
import com.getpebble.android.kit.a.a;
import com.google.a.b.ar;

// Referenced classes of package com.dominos.pebble:
//            PebbleManager, PebbleCommand

public class PebbleTrackerReceiver extends BroadcastReceiver
{

    private static final String LOG_TAG = "PebbleManager";
    PebbleManager mPebbleManager;
    PebbleOrderHandler mPebbleOrderHandler;

    public PebbleTrackerReceiver()
    {
    }

    private void sendStatusToPebble(Context context, TrackerOrderStatus trackerorderstatus)
    {
        String s = context.getResources().getString(0x7f0803cc);
        if (trackerorderstatus != null) goto _L2; else goto _L1
_L1:
        trackerorderstatus = s;
        if (!StringHelper.equals(mPebbleManager.getmLastStatus(), s))
        {
            trackerorderstatus = context.getResources().getString(0x7f0803cc);
            if (!mPebbleManager.isPebbleAppOpen())
            {
                mPebbleManager.notifyPebble(context, trackerorderstatus);
            } else
            {
                sendTrackerDataToPebble(context, trackerorderstatus, "", "1");
            }
            mPebbleManager.setmLastStatus(trackerorderstatus);
        }
        mPebbleManager.setmLastStatus(trackerorderstatus);
_L14:
        return;
_L2:
        _cls1..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus[trackerorderstatus.getOrderStatus().ordinal()];
        JVM INSTR tableswitch 1 9: default 152
    //                   1 198
    //                   2 225
    //                   3 238
    //                   4 265
    //                   5 292
    //                   6 402
    //                   7 490
    //                   8 517
    //                   9 574;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_574;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        String s1;
        trackerorderstatus = context.getResources().getString(0x7f0803d3);
        s1 = "0";
_L15:
        if (!StringHelper.equals(mPebbleManager.getmLastStatus(), s))
        {
            sendTrackerDataToPebble(context, s, trackerorderstatus, s1);
            mPebbleManager.setmLastStatus(s);
            return;
        }
        if (true) goto _L14; else goto _L13
_L13:
        s1 = "2";
        s = context.getResources().getString(0x7f0803c0);
        trackerorderstatus = context.getResources().getString(0x7f0803bf);
          goto _L15
_L5:
        s = "";
        trackerorderstatus = "";
        s1 = "0";
          goto _L15
_L6:
        s1 = "3";
        s = context.getResources().getString(0x7f0803ca);
        trackerorderstatus = context.getResources().getString(0x7f0803c9);
          goto _L15
_L7:
        s1 = "4";
        s = context.getResources().getString(0x7f0803cf);
        trackerorderstatus = context.getResources().getString(0x7f0803ce);
          goto _L15
_L8:
        switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.order.ServiceMethod[trackerorderstatus.getServiceMethod().ordinal()])
        {
        default:
            trackerorderstatus = "";
            s1 = "0";
            break;

        case 1: // '\001'
            s1 = "5A";
            s = context.getResources().getString(0x7f0803be);
            trackerorderstatus = context.getResources().getString(0x7f0803bd);
            break;

        case 2: // '\002'
            s1 = "5";
            s = context.getResources().getString(0x7f0803d1);
            trackerorderstatus = context.getResources().getString(0x7f0803d0);
            break;

        case 3: // '\003'
            trackerorderstatus = "";
            s1 = "0";
            break;
        }
        if (true) goto _L15; else goto _L16
_L16:
_L9:
        s1 = "6";
        s = context.getResources().getString(0x7f0803c1);
        switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.order.ServiceMethod[trackerorderstatus.getServiceMethod().ordinal()])
        {
        default:
            trackerorderstatus = "";
            break;

        case 1: // '\001'
            trackerorderstatus = context.getResources().getString(0x7f0803c2);
            break;

        case 2: // '\002'
            trackerorderstatus = context.getResources().getString(0x7f0803cd);
            break;

        case 3: // '\003'
            trackerorderstatus = "";
            break;
        }
        if (true) goto _L15; else goto _L17
_L17:
_L10:
        s = context.getResources().getString(0x7f0803d5);
        trackerorderstatus = context.getResources().getString(0x7f0803d4);
        s1 = "0";
          goto _L15
_L11:
        s1 = "F";
        s = context.getResources().getString(0x7f0803c8);
        trackerorderstatus = (new StringBuilder()).append(context.getResources().getString(0x7f0803c7)).append(" ").append(trackerorderstatus.getAdvancedOrderTime().format("MM/dd/yyyy 'at' hh:mm a")).toString();
          goto _L15
        s1 = "N/A";
        s = context.getResources().getString(0x7f0803d3);
        trackerorderstatus = context.getResources().getString(0x7f0803d2);
          goto _L15
    }

    public void onReceive(Context context, Intent intent)
    {
        LogUtil.d("PebbleManager", "Tracker status received", new Object[0]);
        mPebbleOrderHandler.setAllowedOrder(true);
        if (StringHelper.equalsIgnoreCase(intent.getAction(), "com.dominos.notifications.tracker"))
        {
            String s = intent.getStringExtra("tracker-status");
            mPebbleManager.openPebbleApp(context);
            if (s.equalsIgnoreCase("tracking-progress"))
            {
                int i = intent.getIntExtra("tracker-index", 0);
                sendStatusToPebble(context, (TrackerOrderStatus)((TrackerResult)intent.getParcelableExtra("tracker-result")).getOrderStatuses().get(i));
            } else
            {
                if (StringHelper.equalsIgnoreCase("tracking-started", s))
                {
                    sendStatusToPebble(context, null);
                    return;
                }
                if (StringHelper.equalsIgnoreCase("tracking-timedout", s))
                {
                    mPebbleManager.sendErrorToPebble(1);
                    return;
                }
            }
        }
    }

    protected void sendTrackerDataToPebble(Context context, String s, String s1, String s2)
    {
        if (!mPebbleManager.isPebbleAppOpen())
        {
            mPebbleManager.notifyPebble(context, s);
            return;
        } else
        {
            LogUtil.d("PebbleManager", (new StringBuilder("sending status to pebble ")).append(s).toString(), new Object[0]);
            context = new a();
            PebbleCommand.GetTrackerInfo.addCommand(context);
            context.a(45, s2);
            context.a(46, s);
            context.a(47, s1);
            mPebbleManager.sendToPebble(context);
            return;
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[];
        static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus = new int[OrderStatus.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.BEING_MADE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.CANCELLED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.IN_THE_OVEN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.ON_THE_RACK.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.OUT_THE_DOOR.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.COMPLETE.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.WAITING.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.FUTURE.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.UNKNOWN.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod = new int[ServiceMethod.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.DELIVERY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.CARRYOUT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.UNKNOWN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
