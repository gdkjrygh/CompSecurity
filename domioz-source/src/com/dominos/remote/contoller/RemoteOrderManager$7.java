// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

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
        RemoteOrderManager.access$400(RemoteOrderManager.this, val$remoteOrderClient);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        RemoteOrderManager.access$1100(RemoteOrderManager.this, val$remoteOrderClient, s);
    }

    allback()
    {
        this$0 = final_remoteordermanager;
        val$remoteOrderClient = RemoteOrderClient.this;
        super();
    }
}
