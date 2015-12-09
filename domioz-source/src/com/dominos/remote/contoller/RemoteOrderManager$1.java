// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.remote.client.RemoteOrderClient;
import java.util.Locale;

// Referenced classes of package com.dominos.remote.contoller:
//            RemoteOrderManager

class val.client
    implements com.dominos.loader.upLoadCallback
{

    final RemoteOrderManager this$0;
    final RemoteOrderClient val$client;

    public void onSetupFailure(int i, String s)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Failed to setup application", new Object[0]);
        s = RemoteOrderManager.access$200(RemoteOrderManager.this).getUpgradeMessage(Locale.ENGLISH.getLanguage());
        if (i == 8)
        {
            LogUtil.d(RemoteOrderManager.access$000(), "Order unavailable", new Object[0]);
            RemoteOrderManager.access$300(RemoteOrderManager.this, val$client, s, ResponseErrorCode.ORDERING_UNAVAILABLE);
            return;
        }
        if (i == 3)
        {
            LogUtil.d(RemoteOrderManager.access$000(), "Force upgrade required", new Object[0]);
            RemoteOrderManager.access$300(RemoteOrderManager.this, val$client, s, ResponseErrorCode.FORCE_UPGRADE);
            return;
        } else
        {
            RemoteOrderManager.access$400(RemoteOrderManager.this, val$client);
            return;
        }
    }

    public void onSetupSuccess()
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Setup application success", new Object[0]);
        RemoteOrderManager.access$100(RemoteOrderManager.this, val$client);
    }

    ()
    {
        this$0 = final_remoteordermanager;
        val$client = RemoteOrderClient.this;
        super();
    }
}
