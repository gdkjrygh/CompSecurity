// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.digby.mm.android.library.utils.Logger;

// Referenced classes of package com.digby.mm.android.library.services.impl:
//            EventSenderService

class this._cls0 extends BroadcastReceiver
{

    final EventSenderService this$0;

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            if (EventSenderService.access$400(EventSenderService.this).getActiveNetworkInfo() != null && EventSenderService.access$400(EventSenderService.this).getActiveNetworkInfo().isConnected())
            {
                EventSenderService.access$300(EventSenderService.this);
                unregisterReceiver(this);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("mConnectivityReceiver_onReceive: ", context);
        }
    }

    ()
    {
        this$0 = EventSenderService.this;
        super();
    }
}
