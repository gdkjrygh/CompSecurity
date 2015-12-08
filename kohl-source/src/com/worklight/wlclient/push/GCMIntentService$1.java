// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.worklight.wlclient.push:
//            GCMIntentService

class this._cls0 extends BroadcastReceiver
{

    final GCMIntentService this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (getResultCode() == 1 || !GCMIntentService.isAppForeground())
        {
            onUnhandled(context, intent);
        }
    }

    ()
    {
        this$0 = GCMIntentService.this;
        super();
    }
}
