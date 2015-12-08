// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import com.soundcloud.android.utils.IOUtils;

// Referenced classes of package com.soundcloud.android.main:
//            NetworkConnectivityController

private final class <init> extends Handler
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
        if (NetworkConnectivityController.access$100(NetworkConnectivityController.this) != null && (message.obj instanceof NetworkInfo))
        {
            message = (NetworkInfo)message.obj;
            NetworkConnectivityController.access$202(NetworkConnectivityController.this, Boolean.valueOf(message.isConnectedOrConnecting()));
            if (NetworkConnectivityController.access$200(NetworkConnectivityController.this).booleanValue())
            {
                NetworkConnectivityController.access$100(NetworkConnectivityController.this).sendBroadcast((new Intent("com.soundcloud.android.action.CHANGE_PROXY")).putExtra("proxy", IOUtils.getProxy(NetworkConnectivityController.access$100(NetworkConnectivityController.this), message)));
            }
        }
    }

    private ()
    {
        this$0 = NetworkConnectivityController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
