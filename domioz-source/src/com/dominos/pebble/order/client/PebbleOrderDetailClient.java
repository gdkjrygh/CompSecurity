// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble.order.client;

import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.constant.ResponseStatus;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.pebble.PebbleManager;
import com.dominos.pebble.PebbleManager_;
import com.dominos.pebble.order.PebbleOrderHandler;
import com.dominos.pebble.order.PebbleOrderHandler_;
import com.dominos.remote.util.ResponseEvent;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.pebble.order.client:
//            PebbleEasyOrderClient

public class PebbleOrderDetailClient extends PebbleEasyOrderClient
{

    private String orderId;

    public PebbleOrderDetailClient(String s)
    {
        orderId = s;
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        PebbleOrderHandler_ pebbleorderhandler_;
        Object obj;
        OrderUtil_ orderutil_;
        obj = PebbleManager_.getInstance_(responseevent.getContext());
        pebbleorderhandler_ = PebbleOrderHandler_.getInstance_(responseevent.getContext());
        orderutil_ = OrderUtil_.getInstance_(responseevent.getContext());
        _cls1..SwitchMap.com.dominos.android.sdk.constant.ResponseStatus[responseevent.getStatus().ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 67
    //                   2 124;
           goto _L1 _L2 _L3
_L1:
        ((PebbleManager) (obj)).sendErrorToPebble(91);
_L5:
        return;
_L2:
        responseevent = orderutil_.parseOrderHistory(responseevent.getData()).iterator();
        while (responseevent.hasNext()) 
        {
            obj = (LabsOrder)responseevent.next();
            if (StringHelper.equals(((LabsOrder) (obj)).getStoreOrderId(), orderId))
            {
                pebbleorderhandler_.priceOrderAndSendToPebble(((LabsOrder) (obj)), false);
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (responseevent.getErrorCode() == ResponseErrorCode.NO_HISTORICAL_ORDER)
        {
            ((PebbleManager) (obj)).sendErrorToPebble(3);
            return;
        }
        if (responseevent.getErrorCode() == ResponseErrorCode.UNAUTHORIZED_USER)
        {
            ((PebbleManager) (obj)).sendErrorToPebble(4);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
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
                $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[ResponseStatus.WARNING.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
