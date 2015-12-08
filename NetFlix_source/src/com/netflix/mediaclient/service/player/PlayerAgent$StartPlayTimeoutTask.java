// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import java.util.TimerTask;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent, PlayerListenerManager

private class this._cls0 extends TimerTask
{

    final PlayerAgent this$0;

    public void run()
    {
        Log.d(PlayerAgent.access$1400(), "StartPlayTimeoutTask to handleFatalError()!");
        PlayerAgent.access$5100(PlayerAgent.this, PlayerAgent.access$5000(PlayerAgent.this).getPlayerListenerOnNrdFatalErrorHandler(), new Object[0]);
    }

    ()
    {
        this$0 = PlayerAgent.this;
        super();
        Log.d(PlayerAgent.access$1400(), "StartPlayTimeoutTask created!");
    }
}
