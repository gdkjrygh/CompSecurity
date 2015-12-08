// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.stateful:
//            StatefulPlayer

class this._cls0
    implements com.spotify.mobile.android.cosmos.player.v2.eObserver
{

    final StatefulPlayer this$0;

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        StatefulPlayer.access$000(StatefulPlayer.this, playerstate, ateOrigin.REMOTE);
    }

    ateOrigin()
    {
        this$0 = StatefulPlayer.this;
        super();
    }
}
