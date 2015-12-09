// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.remote.client.RemoteOrderClient;
import com.dominos.remote.contoller.RemoteOrderManager;

// Referenced classes of package com.dominos.pebble:
//            PebbleSession

public class PebbleRequestManager
{

    public static final String HISTORICAL_ORDER_REQUEST = "com.dominos.pebble.historical-order";
    public static final String PLACE_ORDER_REQUEST = "com.dominos.pebble.place-order";
    public static final String PRICE_ORDER_REQUEST = "com.dominos.pebble.price-order";
    private static final String TAG = com/dominos/pebble/PebbleRequestManager.getSimpleName();
    PebbleSession mPebbleSession;
    RemoteOrderManager mRemoteOrderManager;

    public PebbleRequestManager()
    {
    }

    public void onAfterInject()
    {
        mRemoteOrderManager.setup(mPebbleSession);
    }

    public void request(String s, LabsOrder labsorder, RemoteOrderClient remoteorderclient)
    {
        if (StringHelper.equals(s, "com.dominos.pebble.historical-order"))
        {
            mRemoteOrderManager.getHistoricalOrders(remoteorderclient);
            return;
        }
        if (StringHelper.equals(s, "com.dominos.pebble.price-order"))
        {
            mRemoteOrderManager.createOrderFromHistoricalOrder(labsorder, remoteorderclient);
            return;
        }
        if (StringHelper.equals(s, "com.dominos.pebble.place-order"))
        {
            mRemoteOrderManager.placeOrder(labsorder, remoteorderclient);
            return;
        } else
        {
            LogUtil.d(TAG, (new StringBuilder("Unsupported Action : ")).append(s).toString(), new Object[0]);
            return;
        }
    }

}
