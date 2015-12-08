// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import android.widget.Button;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            CosmosTestFragment

final class a
    implements com.spotify.mobile.android.cosmos.player.v2.erver
{

    private CosmosTestFragment a;

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        Object obj = a;
        boolean flag;
        if (playerstate.isPlaying() && !playerstate.isPaused())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CosmosTestFragment.a(((CosmosTestFragment) (obj)), flag);
        obj = CosmosTestFragment.d(a);
        if (CosmosTestFragment.a(a))
        {
            playerstate = CosmosTestFragment.b(a);
        } else
        {
            playerstate = CosmosTestFragment.c(a);
        }
        ((Button) (obj)).setText(playerstate);
    }

    eObserver(CosmosTestFragment cosmostestfragment)
    {
        a = cosmostestfragment;
        super();
    }
}
