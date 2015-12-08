// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

// Referenced classes of package com.spotify.mobile.android.service.media:
//            MediaService

final class a
    implements com.spotify.mobile.android.cosmos.player.v2.ateObserver
{

    private MediaService a;

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        if (playerstate.isPaused())
        {
            MediaService.c(a).resume();
            return;
        } else
        {
            MediaService.c(a).pause();
            return;
        }
    }

    rStateObserver(MediaService mediaservice)
    {
        a = mediaservice;
        super();
    }
}
