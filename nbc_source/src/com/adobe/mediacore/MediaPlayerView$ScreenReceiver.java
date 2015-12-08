// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerView

class this._cls0 extends BroadcastReceiver
{

    final MediaPlayerView this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
        {
            MediaPlayerView.access$200().i((new StringBuilder()).append(MediaPlayerView.access$100()).append("::ScreenReceiver#onReceive").toString(), "Device screen was turned off.");
            MediaPlayerView.access$500(MediaPlayerView.this);
        } else
        if (intent.getAction().equals("android.intent.action.SCREEN_ON"))
        {
            MediaPlayerView.access$200().i((new StringBuilder()).append(MediaPlayerView.access$100()).append("::ScreenReceiver#onReceive").toString(), "Device screen was turned on.");
            MediaPlayerView.access$400(MediaPlayerView.this);
            return;
        }
    }

    ()
    {
        this$0 = MediaPlayerView.this;
        super();
    }
}
