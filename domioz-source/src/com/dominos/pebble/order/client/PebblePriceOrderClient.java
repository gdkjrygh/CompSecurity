// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble.order.client;

import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.constant.ResponseStatus;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.pebble.PebbleManager;
import com.dominos.pebble.PebbleManager_;
import com.dominos.pebble.order.PebbleOrderHandler;
import com.dominos.pebble.order.PebbleOrderHandler_;
import com.dominos.remote.util.ResponseEvent;
import com.google.b.k;

// Referenced classes of package com.dominos.pebble.order.client:
//            PebbleEasyOrderClient

public class PebblePriceOrderClient extends PebbleEasyOrderClient
{

    private boolean isEasyOrder;

    public PebblePriceOrderClient(boolean flag)
    {
        isEasyOrder = flag;
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        PebbleManager_ pebblemanager_ = PebbleManager_.getInstance_(responseevent.getContext());
        PebbleOrderHandler_ pebbleorderhandler_ = PebbleOrderHandler_.getInstance_(responseevent.getContext());
        responseevent.getContext();
        switch (_cls1..SwitchMap.com.dominos.android.sdk.constant.ResponseStatus[responseevent.getStatus().ordinal()])
        {
        default:
            pebblemanager_.sendErrorToPebble(9);
            return;

        case 1: // '\001'
            pebbleorderhandler_.sendOrderDataToPebble((LabsOrder)(new k()).a(responseevent.getData(), com/dominos/android/sdk/core/models/LabsOrder), isEasyOrder);
            return;

        case 2: // '\002'
            switch (_cls1..SwitchMap.com.dominos.android.sdk.constant.ResponseErrorCode[responseevent.getErrorCode().ordinal()])
            {
            default:
                pebblemanager_.sendErrorToPebble(9);
                return;

            case 1: // '\001'
                pebblemanager_.sendErrorToPebble(15);
                return;

            case 2: // '\002'
                pebblemanager_.sendErrorToPebble(14);
                return;

            case 3: // '\003'
                pebblemanager_.sendErrorToPebble(8);
                return;

            case 4: // '\004'
                pebblemanager_.sendErrorToPebble(12);
                return;

            case 5: // '\005'
                pebblemanager_.sendErrorToPebble(5);
                return;

            case 6: // '\006'
                pebblemanager_.sendErrorToPebble(7);
                return;

            case 7: // '\007'
                pebblemanager_.sendErrorToPebble(11);
                break;
            }
            break;
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[];
        static final int $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus = new int[ResponseStatus.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[ResponseStatus.SUCCESS.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[ResponseStatus.WARNING.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode = new int[ResponseErrorCode.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.ALL_ITEMS_UNAVAILABLE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.SOME_ITEMS_UNAVAILABLE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.STORE_CLOSED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.DELIVERY_NOT_AVAILABLE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.COUPON_REMOVED.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.NO_STORE_DELIVERY_ADDRESS.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.CARRYOUT_NOT_AVAILABLE.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
