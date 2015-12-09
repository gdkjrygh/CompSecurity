// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.os.SystemClock;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState, PlayScreen, PlayerUiState

class this._cls0
    implements Runnable
{

    final PlayerActivity this$0;

    public void run()
    {
        if (destroyed() || PlayerActivity.access$100(PlayerActivity.this).draggingInProgress || PlayerActivity.access$100(PlayerActivity.this).draggingAudioInProgress)
        {
            Log.d("PlayerActivity", "METADATA exit");
            return;
        }
        synchronized (PlayerActivity.this)
        {
            if (PlayerActivity.access$700(PlayerActivity.this) != null && !PlayerActivity.access$100(PlayerActivity.this).draggingInProgress && !PlayerActivity.access$100(PlayerActivity.this).draggingAudioInProgress)
            {
                if (PlayerActivity.access$100(PlayerActivity.this).getLastActionTime() > 0L && SystemClock.elapsedRealtime() - PlayerActivity.access$100(PlayerActivity.this).getLastActionTime() > 5000L && PlayerActivity.access$700(PlayerActivity.this).getState() != PlayerUiState.PostPlay)
                {
                    Log.d("PlayerActivity", "Time to remove panel");
                    PlayerActivity.access$2500(PlayerActivity.this);
                }
                PlayerActivity.access$2600(PlayerActivity.this);
                PlayerActivity.access$2700(PlayerActivity.this);
            }
            PlayerActivity.access$2800(PlayerActivity.this, 1000);
        }
        return;
        exception;
        playeractivity;
        JVM INSTR monitorexit ;
        throw exception;
    }

    e()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
