// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.stateful:
//            StatefulPlayer

class 
    implements com.spotify.mobile.android.cosmos.player.v2.eObserver
{

    final StatefulPlayer this$0;
    final com.spotify.mobile.android.cosmos.player.v2.eObserver val$callback;

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        StatefulPlayer.access$000(StatefulPlayer.this, playerstate, ateOrigin.REMOTE);
        val$callback.onPlayerStateReceived(StatefulPlayer.access$200(StatefulPlayer.this));
    }

    ()
    {
        this$0 = final_statefulplayer;
        val$callback = com.spotify.mobile.android.cosmos.player.v2.eObserver.this;
        super();
    }
}
