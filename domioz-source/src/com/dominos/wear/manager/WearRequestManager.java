// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dominos.notification.TrackerService_;
import com.dominos.remote.client.RemoteOrderClient;
import com.dominos.remote.receiver.TrackerReceiver;
import com.dominos.wear.service.WearOrderService_;

public class WearRequestManager
{

    Context mContext;

    public WearRequestManager()
    {
    }

    public void request(String s, String s1, RemoteOrderClient remoteorderclient)
    {
        Intent intent = new Intent(mContext, com/dominos/wear/service/WearOrderService_);
        intent.setAction(s);
        intent.putExtra("Request_Data", s1);
        intent.putExtra("Order_Client", remoteorderclient);
        mContext.startService(intent);
    }

    public void track(Bundle bundle, TrackerReceiver trackerreceiver)
    {
        Intent intent = new Intent(mContext, com/dominos/notification/TrackerService_);
        intent.putExtra("phone", bundle.getString("phone"));
        intent.putExtra("extension", bundle.getString("extension"));
        intent.putExtra("orderID", bundle.getString("orderID"));
        intent.putExtra("storeID", bundle.getString("storeID"));
        intent.putExtra("fromCheckout", bundle.getBoolean("fromCheckout"));
        intent.setAction("OrderPlaced");
        intent.putExtra("tracker-receiver", trackerreceiver);
        mContext.startService(intent);
    }
}
