// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import com.dominos.android.sdk.common.ExtrasUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.Ts;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;

public class TrackerStatusUtil
{

    private static final String AM_STRING = "am";
    private static final String PM_STRING = "pm";
    private static final String TIME_PATTERN = "E, d MMM yyyy h:mm a";
    private final Context mContext;

    protected TrackerStatusUtil(Context context)
    {
        mContext = context;
    }

    private String getString(int i)
    {
        return mContext.getString(i);
    }

    public String getDetail(TrackerOrderStatus trackerorderstatus)
    {
        if (trackerorderstatus == null)
        {
            return getString(0x7f080239);
        }
        String s = getString(0x7f08021b);
        if (StringHelper.isNotEmpty(trackerorderstatus.getMakerName()))
        {
            s = trackerorderstatus.getMakerName();
        }
        switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus[trackerorderstatus.getOrderStatus().ordinal()])
        {
        default:
            return getString(0x7f080238);

        case 3: // '\003'
            return String.format(getString(0x7f080311), new Object[] {
                s, ExtrasUtil.getTimeString(trackerorderstatus.getMakeTime().toMillis())
            });

        case 4: // '\004'
            return String.format(getString(0x7f08030e), new Object[] {
                s, ExtrasUtil.getTimeString(trackerorderstatus.getOvenTime().toMillis())
            });

        case 5: // '\005'
            return String.format(getString(0x7f080312), new Object[] {
                s, ExtrasUtil.getTimeString(trackerorderstatus.getRackTime().toMillis())
            });

        case 1: // '\001'
            switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.order.ServiceMethod[trackerorderstatus.getServiceMethod().ordinal()])
            {
            default:
                return "";

            case 1: // '\001'
                String s2 = trackerorderstatus.getDriverName();
                String s1 = s2;
                if (StringHelper.isEmpty(s2))
                {
                    s1 = getString(0x7f08021a);
                }
                return String.format(getString(0x7f080310), new Object[] {
                    s1, ExtrasUtil.getTimeString(trackerorderstatus.getRouteTime().toMillis())
                });

            case 2: // '\002'
                return String.format(getString(0x7f080321), new Object[0]);
            }

        case 2: // '\002'
            if (trackerorderstatus.getServiceMethod() == ServiceMethod.DELIVERY)
            {
                return getString(0x7f080313);
            } else
            {
                return getString(0x7f08030f);
            }

        case 6: // '\006'
            return getString(0x7f080230);

        case 7: // '\007'
            return getString(0x7f080243);

        case 8: // '\b'
            return (new StringBuilder()).append(getString(0x7f080233)).append(" ").append(trackerorderstatus.getAdvancedOrderTime().format("E, d MMM yyyy h:mm a")).toString();

        case 9: // '\t'
            return getString(0x7f080242);
        }
    }

    public String getSummary(TrackerOrderStatus trackerorderstatus)
    {
        if (trackerorderstatus == null)
        {
            return "";
        }
        OrderStatus orderstatus = trackerorderstatus.getOrderStatus();
        switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus[orderstatus.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return getString(0x7f08030d);

        case 3: // '\003'
            return getString(0x7f08031f);

        case 4: // '\004'
            return getString(0x7f080309);

        case 5: // '\005'
            return getString(0x7f080320);

        case 2: // '\002'
            break;
        }
        if (trackerorderstatus.getServiceMethod() == ServiceMethod.DELIVERY)
        {
            return getString(0x7f08031a);
        } else
        {
            return getString(0x7f08030a);
        }
    }

    public String getTitle(TrackerOrderStatus trackerorderstatus)
    {
        if (trackerorderstatus == null)
        {
            return "";
        }
        OrderStatus orderstatus = trackerorderstatus.getOrderStatus();
        switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus[orderstatus.ordinal()])
        {
        default:
            if (trackerorderstatus.getServiceMethod() == ServiceMethod.DELIVERY)
            {
                return getString(0x7f0800f3);
            } else
            {
                return getString(0x7f080085);
            }

        case 1: // '\001'
            if (trackerorderstatus.getServiceMethod() == ServiceMethod.DELIVERY)
            {
                return getString(0x7f08031e);
            } else
            {
                return getString(0x7f080321);
            }

        case 2: // '\002'
            break;
        }
        if (trackerorderstatus.getServiceMethod() == ServiceMethod.DELIVERY)
        {
            return getString(0x7f08031d);
        } else
        {
            return getString(0x7f080321);
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[];
        static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod = new int[ServiceMethod.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.DELIVERY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.CARRYOUT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus = new int[OrderStatus.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.OUT_THE_DOOR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.COMPLETE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.BEING_MADE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.IN_THE_OVEN.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.ON_THE_RACK.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.CANCELLED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.WAITING.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.FUTURE.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.UNKNOWN.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
