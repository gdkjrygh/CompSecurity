// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.stateful:
//            StatefulPlayer

class ue.Rendezvous
    implements com.spotify.mobile.android.cosmos.player.v2.eObserver
{

    final StatefulPlayer this$0;
    final ue.Rendezvous val$rendezvous;

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        if (!val$rendezvous.tryComplete())
        {
            return;
        } else
        {
            StatefulPlayer.access$000(StatefulPlayer.this, playerstate, ateOrigin.REMOTE);
            return;
        }
    }

    ue.Rendezvous()
    {
        this$0 = final_statefulplayer;
        val$rendezvous = ue.Rendezvous.this;
        super();
    }
}
