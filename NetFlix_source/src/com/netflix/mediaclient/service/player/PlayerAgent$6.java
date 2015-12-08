// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.user.SimpleUserAgentWebCallback;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent, PlayerListenerManager

class ebCallback extends SimpleUserAgentWebCallback
{

    final PlayerAgent this$0;

    public void onDummyWebCallDone(int i)
    {
        PlayerAgent.access$4802(PlayerAgent.this, false);
        if (i == 0)
        {
            Log.d(PlayerAgent.access$1400(), (new StringBuilder()).append("Dummy webcall completed with statusCode=").append(i).toString());
            com.netflix.mediaclient.event.nrdp.media.NccpError nccperror = PlayerAgent.access$4900(PlayerAgent.this);
            PlayerAgent.access$4902(PlayerAgent.this, null);
            PlayerAgent.access$5100(PlayerAgent.this, PlayerAgent.access$5000(PlayerAgent.this).getPlayerListenerRestartPlaybackHandler(), new Object[] {
                nccperror
            });
            return;
        } else
        {
            Log.e(PlayerAgent.access$1400(), (new StringBuilder()).append("Dummy webcall completed  failed (skipping user info update) with statusCode=").append(i).toString());
            PlayerAgent.access$5100(PlayerAgent.this, PlayerAgent.access$5000(PlayerAgent.this).getPlayerListenerOnNccpErrorHandler(), new Object[] {
                PlayerAgent.access$4900(PlayerAgent.this)
            });
            return;
        }
    }

    Manager()
    {
        this$0 = PlayerAgent.this;
        super();
    }
}
