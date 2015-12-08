// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            CosmosTestFragment

final class a
    implements com.spotify.mobile.android.cosmos.player.v2.rver
{

    private CosmosTestFragment a;

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        try
        {
            playerstate = CosmosTestFragment.e(a).writerWithDefaultPrettyPrinter().writeValueAsString(playerstate);
            CosmosTestFragment.a(a, "player", playerstate);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PlayerState playerstate)
        {
            CosmosTestFragment.a(a, playerstate);
        }
    }

    Observer(CosmosTestFragment cosmostestfragment)
    {
        a = cosmostestfragment;
        super();
    }
}
