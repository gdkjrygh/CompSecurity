// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.tracker;

import com.dominos.android.sdk.common.core.Ts;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestion;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.tracker.OrderSource;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.google.a.b.ar;
import java.util.Iterator;
import java.util.Map;

public class TrackerUtil
{

    public static final String COMMENT_QUESTION_KEY = "09262007-000007";
    public static final String FOOD_QUESTION_KEY = "09262007-000006";
    private static final String ORDERING_QUESTION_PHONE_KEY = "09262007-000001";
    private static final String ORDERING_QUESTION_WALKIN_KEY = "09262007-000002";
    private static final String ORDERING_QUESTION_WEB_KEY = "09262007-000003";
    public static final String SHOUT_OUT_QUESTION_KEY = "06092011-000001";
    private static final String TEAM_MEMBER_QUESTION_CARRYOUT_KEY = "09262007-000005";
    private static final String TEAM_MEMBER_QUESTION_DELIVERY_KEY = "09262007-000004";
    public static final String ULTIMATE_QUESTION_KEY = "09262007-000000";

    public TrackerUtil()
    {
    }

    public static int getLatestOrderIndex(ar ar1)
    {
        Object obj;
        int i;
        i = 0;
        obj = null;
        if (ar1 != null && !ar1.isEmpty()) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        Iterator iterator = ar1.iterator();
        ar1 = obj;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            TrackerOrderStatus trackerorderstatus = (TrackerOrderStatus)iterator.next();
            Object obj1 = ar1;
            if (ar1 == null)
            {
                obj1 = trackerorderstatus.getMakeTime();
            }
            if (((Ts) (obj1)).before(trackerorderstatus.getMakeTime()) && trackerorderstatus.getOrderStatus() != OrderStatus.FUTURE)
            {
                ar1 = trackerorderstatus.getMakeTime();
                i++;
            } else
            {
                ar1 = ((ar) (obj1));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static FeedbackQuestion getQuestionForOrderingExperience(TrackerOrderStatus trackerorderstatus, Map map)
    {
        switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderSource[trackerorderstatus.getOrderSource().ordinal()])
        {
        default:
            return (FeedbackQuestion)map.get("09262007-000001");

        case 1: // '\001'
            return (FeedbackQuestion)map.get("09262007-000001");

        case 2: // '\002'
            return (FeedbackQuestion)map.get("09262007-000002");

        case 3: // '\003'
            return (FeedbackQuestion)map.get("09262007-000003");

        case 4: // '\004'
            return (FeedbackQuestion)map.get("09262007-000001");
        }
    }

    public static FeedbackQuestion getQuestionForTeamMember(TrackerOrderStatus trackerorderstatus, Map map)
    {
        switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.order.ServiceMethod[trackerorderstatus.getServiceMethod().ordinal()])
        {
        default:
            return (FeedbackQuestion)map.get("09262007-000004");

        case 1: // '\001'
            return (FeedbackQuestion)map.get("09262007-000004");

        case 2: // '\002'
            return (FeedbackQuestion)map.get("09262007-000005");

        case 3: // '\003'
            return (FeedbackQuestion)map.get("09262007-000004");
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[];
        static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod = new int[ServiceMethod.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.DELIVERY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.CARRYOUT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.UNKNOWN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource = new int[OrderSource.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[OrderSource.PHONE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[OrderSource.WALKIN.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[OrderSource.WEB.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[OrderSource.UNKNOWN.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
