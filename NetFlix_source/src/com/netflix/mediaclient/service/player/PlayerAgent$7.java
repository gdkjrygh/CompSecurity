// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

class this._cls0 extends BroadcastReceiver
{

    final PlayerAgent this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable(PlayerAgent.access$1400(), 2))
        {
            Log.v(PlayerAgent.access$1400(), (new StringBuilder()).append("Received intent ").append(intent).toString());
        }
        context = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.PLAYER_SUBTITLE_CONFIG_CHANGED".equals(context))
        {
            Log.d(PlayerAgent.access$1400(), "subtitle configuration is changed");
            PlayerAgent.access$5300(PlayerAgent.this, intent.getIntExtra("lookupType", -1));
        } else
        if (Log.isLoggable(PlayerAgent.access$1400(), 3))
        {
            Log.d(PlayerAgent.access$1400(), (new StringBuilder()).append("We do not support action ").append(context).toString());
            return;
        }
    }

    ()
    {
        this$0 = PlayerAgent.this;
        super();
    }
}
