// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls0 extends BroadcastReceiver
{

    final LyftDriverToggleService this$0;

    public void onReceive(Context context, Intent intent)
    {
        LyftDriverToggleService.stopService(context);
        LyftDriverToggleService.startService(context);
    }

    ()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}
