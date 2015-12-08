// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import com.dominos.remote.client.RemoteOrderClient;

// Referenced classes of package com.dominos.remote.contoller:
//            RemoteOrderManager

class allback extends PowerRestCallback
{

    final RemoteOrderManager this$0;
    final RemoteOrderClient val$remoteOrderClient;

    public void onError(Exception exception, String s)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Login as remember user failed!", new Object[0]);
        RemoteOrderManager.access$400(RemoteOrderManager.this, val$remoteOrderClient);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Login response success!", new Object[0]);
        s = UserObject.from(s);
        if (s == null)
        {
            RemoteOrderManager.access$500(RemoteOrderManager.this, val$remoteOrderClient, ResponseErrorCode.UNAUTHORIZED_USER);
            return;
        } else
        {
            RemoteOrderManager.access$600(RemoteOrderManager.this).saveNewCurrentUser(s);
            RemoteOrderManager.access$1200(RemoteOrderManager.this, val$remoteOrderClient);
            return;
        }
    }

    er()
    {
        this$0 = final_remoteordermanager;
        val$remoteOrderClient = RemoteOrderClient.this;
        super();
    }
}
