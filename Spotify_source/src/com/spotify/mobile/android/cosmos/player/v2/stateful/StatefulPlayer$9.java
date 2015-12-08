// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.stateful:
//            StatefulPlayer

class ateOrigin
    implements Runnable
{

    final StatefulPlayer this$0;
    final PlayerState val$source;
    final ateOrigin val$stateOrigin;

    public void run()
    {
        StatefulPlayer.access$300(StatefulPlayer.this, val$source, val$stateOrigin, true);
    }

    ateOrigin()
    {
        this$0 = final_statefulplayer;
        val$source = playerstate;
        val$stateOrigin = ateOrigin.this;
        super();
    }
}
