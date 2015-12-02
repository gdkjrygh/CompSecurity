// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.base.broadcast.a;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.common.hardware:
//            k, l

class m extends BroadcastReceiver
{

    final k a;

    private m(k k1)
    {
        a = k1;
        super();
    }

    m(k k1, l l)
    {
        this(k1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (isInitialStickyBroadcast())
        {
            b.c(k.e(), "Ignoring the event. It is a sticky broadcast ");
            return;
        }
        context = (NetworkInfo)intent.getParcelableExtra("networkInfo");
        context = (NetworkInfo)intent.getParcelableExtra("otherNetwork");
        intent.getBooleanExtra("isFailover", false);
        intent.getBooleanExtra("noConnectivity", false);
        context = com.facebook.common.hardware.k.a(a).getActiveNetworkInfo();
        boolean flag;
        if (context != null && context.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.c(k.e(), (new StringBuilder()).append("Connectivity changed: connected=").append(flag).toString());
        com.facebook.common.hardware.k.b(a).a("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
    }
}
