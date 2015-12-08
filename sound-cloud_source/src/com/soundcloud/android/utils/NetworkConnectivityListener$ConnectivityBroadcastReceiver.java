// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import com.soundcloud.android.properties.ApplicationProperties;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.utils:
//            NetworkConnectivityListener

private class <init> extends BroadcastReceiver
{

    final NetworkConnectivityListener this$0;

    public void onReceive(Context context, Intent intent)
    {
        ApplicationProperties applicationproperties = new ApplicationProperties(context.getResources());
        if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || NetworkConnectivityListener.access$100(NetworkConnectivityListener.this) == null)
        {
            (new StringBuilder("onReceived() called with ")).append(NetworkConnectivityListener.access$200(NetworkConnectivityListener.this)._mth0()).append(" and ").append(intent);
        } else
        {
            <init> <init>1 = NetworkConnectivityListener.access$200(NetworkConnectivityListener.this);
            boolean flag = intent.getBooleanExtra("noConnectivity", false);
            NetworkConnectivityListener networkconnectivitylistener = NetworkConnectivityListener.this;
            if (flag)
            {
                context = this._fld0;
            } else
            {
                context = this._fld0;
            }
            NetworkConnectivityListener.access$202(networkconnectivitylistener, context);
            NetworkConnectivityListener.access$302(NetworkConnectivityListener.this, (NetworkInfo)intent.getParcelableExtra("networkInfo"));
            NetworkConnectivityListener.access$402(NetworkConnectivityListener.this, (NetworkInfo)intent.getParcelableExtra("otherNetwork"));
            if (applicationproperties.isDevBuildRunningOnDevice())
            {
                intent = (new StringBuilder("onReceive(): networkInfo=")).append(NetworkConnectivityListener.access$300(NetworkConnectivityListener.this)).append(" otherNetworkInfo = ");
                if (NetworkConnectivityListener.access$400(NetworkConnectivityListener.this) == null)
                {
                    context = "[none]";
                } else
                {
                    context = (new StringBuilder()).append(NetworkConnectivityListener.access$400(NetworkConnectivityListener.this)).append(" noConn=").append(flag).toString();
                }
                intent.append(context).append(" mState=").append(NetworkConnectivityListener.access$200(NetworkConnectivityListener.this)._mth0());
            }
            context = NetworkConnectivityListener.access$500(NetworkConnectivityListener.this).keySet().iterator();
            while (context.hasNext()) 
            {
                intent = (Handler)context.next();
                intent.sendMessage(Message.obtain(intent, ((Integer)NetworkConnectivityListener.access$500(NetworkConnectivityListener.this).get(intent)).intValue(), <init>1._mth0(), NetworkConnectivityListener.access$200(NetworkConnectivityListener.this)._mth0(), NetworkConnectivityListener.access$300(NetworkConnectivityListener.this)));
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
