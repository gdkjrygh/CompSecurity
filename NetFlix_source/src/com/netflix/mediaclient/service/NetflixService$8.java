// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.service.logging.LoggingAgent;
import com.netflix.mediaclient.service.player.PlayerAgent;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService, NrdController

class this._cls0 extends BroadcastReceiver
{

    final NetflixService this$0;

    public void onReceive(Context context, Intent intent)
    {
        NetflixService.access$200(NetflixService.this).setNetworkInterfaces();
        NetflixService.access$700(NetflixService.this).handleConnectivityChange(intent);
        NetflixService.access$400(NetflixService.this).handleConnectivityChange(intent);
    }

    ent()
    {
        this$0 = NetflixService.this;
        super();
    }
}
