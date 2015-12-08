// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.ui.IMedia;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

class this._cls0
    implements Runnable
{

    final PlayerAgent this$0;

    public void run()
    {
        PlayerAgent playeragent = PlayerAgent.this;
        playeragent;
        JVM INSTR monitorenter ;
        int j;
        int k;
        PlayerAgent.access$202(PlayerAgent.this, getCurrentPositionMs());
        PlayerAgent.access$302(PlayerAgent.this, false);
        PlayerAgent.access$2702(PlayerAgent.this, true);
        PlayerAgent.access$402(PlayerAgent.this, false);
        k = getDuration();
        j = PlayerAgent.access$800(PlayerAgent.this);
        if (PlayerAgent.access$800(PlayerAgent.this) + 10000 < k || k <= 0) goto _L2; else goto _L1
_L1:
        Log.d(PlayerAgent.access$1400(), "seek to close to EOS, defaulting to 10 seconss before EOS.");
        int i = k - 10000;
_L4:
        PlayerAgent.access$100(PlayerAgent.this).seekTo(i, PlayerAgent.access$2800(PlayerAgent.this));
        PlayerAgent.access$802(PlayerAgent.this, i);
        PlayerAgent.access$1002(PlayerAgent.this, false);
        playeragent;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = j;
        if (!Log.isLoggable(PlayerAgent.access$1400(), 3))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.d(PlayerAgent.access$1400(), (new StringBuilder()).append("seek to position ").append(PlayerAgent.access$800(PlayerAgent.this)).append(", duration ").append(k).toString());
        i = j;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        playeragent;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = PlayerAgent.this;
        super();
    }
}
