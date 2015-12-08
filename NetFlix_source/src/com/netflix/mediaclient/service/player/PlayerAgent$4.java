// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import java.util.Timer;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

class this._cls0
    implements Runnable
{

    final PlayerAgent this$0;

    public void run()
    {
label0:
        {
            synchronized (PlayerAgent.this)
            {
                if (PlayerAgent.access$1300(PlayerAgent.this) != null)
                {
                    PlayerAgent.access$1300(PlayerAgent.this).cancel();
                }
                if (PlayerAgent.access$1200(PlayerAgent.this) != null)
                {
                    PlayerAgent.access$1200(PlayerAgent.this).purge();
                }
                PlayerAgent.access$1902(PlayerAgent.this, false);
                if (PlayerAgent.access$1500(PlayerAgent.this) == 5 || PlayerAgent.access$1500(PlayerAgent.this) == 0 || PlayerAgent.access$1500(PlayerAgent.this) == 3)
                {
                    PlayerAgent.access$2902(PlayerAgent.this, true);
                }
                if (PlayerAgent.access$1500(PlayerAgent.this) != 4 && PlayerAgent.access$1500(PlayerAgent.this) != 8)
                {
                    break label0;
                }
                Log.d(PlayerAgent.access$1400(), "close() pending or already closed");
            }
            return;
        }
        PlayerAgent.access$3000(PlayerAgent.this);
        playeragent;
        JVM INSTR monitorexit ;
        if (PlayerAgent.access$1200(PlayerAgent.this) != null)
        {
            PlayerAgent.access$3102(PlayerAgent.this, new oseTimeoutTask(PlayerAgent.this));
            PlayerAgent.access$1200(PlayerAgent.this).schedule(PlayerAgent.access$3100(PlayerAgent.this), 10000L);
            return;
        } else
        {
            return;
        }
        exception;
        playeragent;
        JVM INSTR monitorexit ;
        throw exception;
    }

    oseTimeoutTask()
    {
        this$0 = PlayerAgent.this;
        super();
    }
}
