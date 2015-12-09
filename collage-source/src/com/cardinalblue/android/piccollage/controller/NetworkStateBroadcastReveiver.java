// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            d

public class NetworkStateBroadcastReveiver extends BroadcastReceiver
{
    public static class NetworkStateChangeEvent
        implements IGsonable
    {

        private boolean a;

        public boolean a()
        {
            return a;
        }

        public NetworkStateChangeEvent(boolean flag)
        {
            a = flag;
        }
    }


    public NetworkStateBroadcastReveiver()
    {
    }

    public NetworkStateChangeEvent getNetworkStateEvent()
    {
        return new NetworkStateChangeEvent(k.b(k.a()));
    }

    public void onReceive(Context context, Intent intent)
    {
        d.a().c(getNetworkStateEvent());
    }
}
