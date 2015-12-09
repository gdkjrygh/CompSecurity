// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.remote.client.RemoteOrderClient;

// Referenced classes of package com.dominos.remote.contoller:
//            RemoteOrderManager

class lback extends com.dominos.android.sdk.core.user.tOrderHistoryCallback
{

    final RemoteOrderManager this$0;
    final RemoteOrderClient val$listener;

    public void onGetOrderHistoryError()
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Historical order request Failed", new Object[0]);
        RemoteOrderManager.access$400(RemoteOrderManager.this, val$listener);
    }

    public void onGetOrderHistorySuccess()
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Historical order request success", new Object[0]);
        RemoteOrderManager.access$1100(RemoteOrderManager.this, val$listener, RemoteOrderManager.access$600(RemoteOrderManager.this).getHistoricalOrderResponse());
    }

    er()
    {
        this$0 = final_remoteordermanager;
        val$listener = RemoteOrderClient.this;
        super();
    }
}
