// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import java.util.TimerTask;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

private class this._cls0 extends TimerTask
{

    final PlayerAgent this$0;

    public void run()
    {
        Log.d(PlayerAgent.access$1400(), "CloseTimeoutTask to unmute audio!");
        PlayerAgent.access$5200(PlayerAgent.this, false);
    }

    I()
    {
        this$0 = PlayerAgent.this;
        super();
        Log.d(PlayerAgent.access$1400(), "CloseTimeoutTask created!");
    }
}
