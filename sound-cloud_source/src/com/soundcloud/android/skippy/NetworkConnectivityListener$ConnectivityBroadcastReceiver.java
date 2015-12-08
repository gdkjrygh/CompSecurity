// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.skippy:
//            NetworkConnectivityListener

private class <init> extends BroadcastReceiver
{

    final NetworkConnectivityListener this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || NetworkConnectivityListener.access$100(NetworkConnectivityListener.this) == null)
        {
            (new StringBuilder("onReceived() called with ")).append(NetworkConnectivityListener.access$200(NetworkConnectivityListener.this)._mth0()).append(" and ").append(intent);
        } else
        {
            intent = NetworkConnectivityListener.access$200(NetworkConnectivityListener.this);
            context = (ConnectivityManager)context.getSystemService("connectivity");
            NetworkConnectivityListener.access$302(NetworkConnectivityListener.this, context.getActiveNetworkInfo());
            if (NetworkConnectivityListener.access$300(NetworkConnectivityListener.this) != null && NetworkConnectivityListener.access$300(NetworkConnectivityListener.this).isConnected())
            {
                NetworkConnectivityListener.access$202(NetworkConnectivityListener.this, this._fld0);
            } else
            {
                NetworkConnectivityListener.access$202(NetworkConnectivityListener.this, this._fld0);
            }
            context = NetworkConnectivityListener.access$400(NetworkConnectivityListener.this).keySet().iterator();
            while (context.hasNext()) 
            {
                Handler handler = (Handler)context.next();
                handler.sendMessage(Message.obtain(handler, ((Integer)NetworkConnectivityListener.access$400(NetworkConnectivityListener.this).get(handler)).intValue(), intent._mth0(), NetworkConnectivityListener.access$200(NetworkConnectivityListener.this)._mth0(), NetworkConnectivityListener.access$300(NetworkConnectivityListener.this)));
            }
        }
    }

    private ()
    {
        this$0 = NetworkConnectivityListener.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
