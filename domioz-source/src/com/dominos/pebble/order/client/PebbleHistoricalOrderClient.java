// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble.order.client;

import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.constant.ResponseStatus;
import com.dominos.pebble.PebbleManager;
import com.dominos.pebble.PebbleManager_;
import com.dominos.pebble.order.PebbleOrderHandler;
import com.dominos.pebble.order.PebbleOrderHandler_;
import com.dominos.remote.util.ResponseEvent;
import java.util.List;

// Referenced classes of package com.dominos.pebble.order.client:
//            PebbleEasyOrderClient

public class PebbleHistoricalOrderClient extends PebbleEasyOrderClient
{

    public PebbleHistoricalOrderClient()
    {
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        PebbleManager_ pebblemanager_;
        PebbleOrderHandler_ pebbleorderhandler_;
        OrderUtil_ orderutil_;
        pebblemanager_ = PebbleManager_.getInstance_(responseevent.getContext());
        pebbleorderhandler_ = PebbleOrderHandler_.getInstance_(responseevent.getContext());
        orderutil_ = OrderUtil_.getInstance_(responseevent.getContext());
        _cls1..SwitchMap.com.dominos.android.sdk.constant.ResponseStatus[responseevent.getStatus().ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 66
    //                   2 97;
           goto _L1 _L2 _L3
_L1:
        pebblemanager_.sendErrorToPebble(1);
_L5:
        return;
_L2:
        responseevent = orderutil_.parseOrderHistory(responseevent.getData());
        if (responseevent.size() > 0)
        {
            pebbleorderhandler_.sendRecentOrderListToPebble(responseevent);
            return;
        } else
        {
            pebblemanager_.sendErrorToPebble(3);
            return;
        }
_L3:
        if (responseevent.getErrorCode() == ResponseErrorCode.UNAUTHORIZED_USER)
        {
            pebblemanager_.sendErrorToPebble(4);
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
