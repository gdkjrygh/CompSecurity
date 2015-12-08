// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.reconnection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.reconnection:
//            ReconnectionService

class this._cls0 extends BroadcastReceiver
{

    final ReconnectionService this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.net.wifi.STATE_CHANGE"))
        {
            boolean flag = ((NetworkInfo)intent.getParcelableExtra("networkInfo")).isConnected();
            if (flag)
            {
                context = Utils.getWifiSsid(context);
            } else
            {
                context = null;
            }
            onWifiConnectivityChanged(flag, context);
        }
    }

    ()
    {
        this$0 = ReconnectionService.this;
        super();
    }
}
