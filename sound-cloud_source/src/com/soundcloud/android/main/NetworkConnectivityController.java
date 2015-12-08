// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.utils.NetworkConnectivityListener;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

public class NetworkConnectivityController extends DefaultActivityLightCycle
{
    private final class ConnectivityHandler extends Handler
    {

        final NetworkConnectivityController this$0;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Unknown msg.what: ")).append(message.what).toString());

            case 0: // '\0'
                break;
            }
            if (context != null && (message.obj instanceof NetworkInfo))
            {
                message = (NetworkInfo)message.obj;
                isConnected = Boolean.valueOf(message.isConnectedOrConnecting());
                if (isConnected.booleanValue())
                {
                    context.sendBroadcast((new Intent("com.soundcloud.android.action.CHANGE_PROXY")).putExtra("proxy", IOUtils.getProxy(context, message)));
                }
            }
        }

        private ConnectivityHandler()
        {
            this$0 = NetworkConnectivityController.this;
            super();
        }

        ConnectivityHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int CONNECTIVITY_MSG = 0;
    private final Handler connHandler = new ConnectivityHandler(null);
    private final NetworkConnectivityListener connectivityListener;
    private final Context context;
    private Boolean isConnected;

    public NetworkConnectivityController(Context context1, NetworkConnectivityListener networkconnectivitylistener)
    {
        context = context1;
        connectivityListener = networkconnectivitylistener;
    }

    public boolean isConnected()
    {
        boolean flag = true;
        if (isConnected != null) goto _L2; else goto _L1
_L1:
        if (connectivityListener != null) goto _L4; else goto _L3
_L3:
        isConnected = Boolean.valueOf(flag);
_L2:
        return isConnected.booleanValue();
_L4:
        NetworkInfo networkinfo = connectivityListener.getNetworkInfo();
        if (networkinfo != null && !networkinfo.isConnectedOrConnecting())
        {
            flag = false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        connectivityListener.registerHandler(connHandler, 0);
    }

    public volatile void onDestroy(Activity activity)
    {
        onDestroy((AppCompatActivity)activity);
    }

    public void onDestroy(AppCompatActivity appcompatactivity)
    {
        connectivityListener.unregisterHandler(connHandler);
    }

    public volatile void onStart(Activity activity)
    {
        onStart((AppCompatActivity)activity);
    }

    public void onStart(AppCompatActivity appcompatactivity)
    {
        connectivityListener.startListening(context);
    }

    public volatile void onStop(Activity activity)
    {
        onStop((AppCompatActivity)activity);
    }

    public void onStop(AppCompatActivity appcompatactivity)
    {
        connectivityListener.stopListening();
    }




/*
    static Boolean access$202(NetworkConnectivityController networkconnectivitycontroller, Boolean boolean1)
    {
        networkconnectivitycontroller.isConnected = boolean1;
        return boolean1;
    }

*/
}
