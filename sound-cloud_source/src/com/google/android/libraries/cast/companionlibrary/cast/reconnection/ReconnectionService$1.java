// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.reconnection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.reconnection:
//            ReconnectionService

class this._cls0 extends BroadcastReceiver
{

    final ReconnectionService this$0;

    public void onReceive(Context context, Intent intent)
    {
        LogUtils.LOGD(ReconnectionService.access$000(), (new StringBuilder("ScreenOnOffBroadcastReceiver: onReceive(): ")).append(intent.getAction()).toString());
        if (ReconnectionService.access$100(ReconnectionService.this) < 500L)
        {
            ReconnectionService.access$200(ReconnectionService.this);
        }
    }

    ()
    {
        this$0 = ReconnectionService.this;
        super();
    }
}
