// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble.order.client;

import android.content.Context;
import android.content.Intent;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.constant.ResponseStatus;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.notification.TrackerService_;
import com.dominos.pebble.PebbleManager;
import com.dominos.pebble.PebbleManager_;
import com.dominos.pebble.PebbleSession;
import com.dominos.pebble.PebbleSession_;
import com.dominos.pebble.order.PebbleOrderHandler;
import com.dominos.pebble.order.PebbleOrderHandler_;
import com.dominos.remote.util.ResponseEvent;

// Referenced classes of package com.dominos.pebble.order.client:
//            PebbleEasyOrderClient

public class PebblePlaceOrderClient extends PebbleEasyOrderClient
{

    String orderId;
    String storeId;

    public PebblePlaceOrderClient(String s, String s1)
    {
        orderId = s;
        storeId = s1;
    }

    private void handleOrderFailure(ResponseEvent responseevent)
    {
        PebbleManager_ pebblemanager_ = PebbleManager_.getInstance_(responseevent.getContext());
        PebbleOrderHandler_.getInstance_(responseevent.getContext()).setAllowedOrder(true);
        pebblemanager_.sendErrorToPebble(9);
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        Object obj = OrderUtil_.getInstance_(responseevent.getContext());
        UserProfileManager userprofilemanager = (UserProfileManager)PebbleSession_.getInstance_(responseevent.getContext()).getManager("user_manager");
        switch (_cls1..SwitchMap.com.dominos.android.sdk.constant.ResponseStatus[responseevent.getStatus().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            obj = ((OrderUtil) (obj)).fromJson(responseevent.getData());
            if (obj != null && ((LabsOrder) (obj)).getStatus() >= 0)
            {
                Intent intent = new Intent(responseevent.getContext(), com/dominos/notification/TrackerService_);
                intent.putExtra("phone", userprofilemanager.getCurrentUser().getPhone());
                intent.putExtra("extension", userprofilemanager.getCurrentUser().getPhoneExtension());
                intent.putExtra("orderID", ((LabsOrder) (obj)).getStoreOrderId());
                intent.putExtra("fromCheckout", true);
                intent.putExtra("storeID", ((LabsOrder) (obj)).getStoreId());
                intent.setAction("OrderPlaced");
                responseevent.getContext().startService(intent);
                return;
            } else
            {
                handleOrderFailure(responseevent);
                return;
            }

        case 2: // '\002'
            handleOrderFailure(responseevent);
            return;
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus = new int[ResponseStatus.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[ResponseStatus.SUCCESS.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[ResponseStatus.FAILURE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
