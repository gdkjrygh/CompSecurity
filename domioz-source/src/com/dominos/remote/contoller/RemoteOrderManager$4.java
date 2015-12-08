// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import com.dominos.remote.client.RemoteOrderClient;

// Referenced classes of package com.dominos.remote.contoller:
//            RemoteOrderManager

class allback extends PowerRestCallback
{

    final RemoteOrderManager this$0;
    final RemoteOrderClient val$client;
    final UserObject val$userObject;

    public void onError(Exception exception, String s)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Place order request Failed!", new Object[0]);
        RemoteOrderManager.access$400(RemoteOrderManager.this, val$client);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Place order request Success!", new Object[0]);
        LogUtil.d(RemoteOrderManager.access$000(), "Refreshing historical orders..", new Object[0]);
        RemoteOrderManager.access$600(RemoteOrderManager.this).loadAndWaitForOrderHistoryAndCards(val$userObject.getCustomerId());
        RemoteOrderManager.access$1100(RemoteOrderManager.this, val$client, s);
    }

    erObject()
    {
        this$0 = final_remoteordermanager;
        val$client = remoteorderclient;
        val$userObject = UserObject.this;
        super();
    }
}
