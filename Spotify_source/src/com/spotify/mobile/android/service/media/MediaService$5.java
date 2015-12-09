// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

// Referenced classes of package com.spotify.mobile.android.service.media:
//            MediaService

public final class a
    implements com.spotify.mobile.android.cosmos.player.v2.ateObserver
{

    private boolean a;
    private MediaService b;

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        if (playerstate.track() != null) goto _L2; else goto _L1
_L1:
        b.d();
_L4:
        if (a && !playerstate.options().repeatingContext() && !playerstate.options().repeatingTrack())
        {
            b.n();
        }
        return;
_L2:
        if (playerstate.isPaused())
        {
            b.f();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public s(MediaService mediaservice, boolean flag)
    {
        b = mediaservice;
        a = flag;
        super();
    }
}
