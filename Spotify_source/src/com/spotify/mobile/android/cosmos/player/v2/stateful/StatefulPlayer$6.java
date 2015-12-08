// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.Player;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.stateful:
//            StatefulPlayer

class val.enabled
    implements Runnable
{

    final StatefulPlayer this$0;
    final boolean val$enabled;

    public void run()
    {
        StatefulPlayer.access$100(StatefulPlayer.this).setRepeatingTrack(val$enabled);
    }

    ()
    {
        this$0 = final_statefulplayer;
        val$enabled = Z.this;
        super();
    }
}
