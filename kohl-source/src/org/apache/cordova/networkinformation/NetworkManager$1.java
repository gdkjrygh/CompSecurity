// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.networkinformation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

// Referenced classes of package org.apache.cordova.networkinformation:
//            NetworkManager

class this._cls0 extends BroadcastReceiver
{

    final NetworkManager this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (webView != null)
        {
            NetworkManager.access$000(NetworkManager.this, sockMan.getActiveNetworkInfo());
        }
    }

    ()
    {
        this$0 = NetworkManager.this;
        super();
    }
}
