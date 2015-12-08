// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity

class this._cls0 extends BroadcastReceiver
{

    final PlayerActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        handleConnectivityCheck();
    }

    _cls9()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
