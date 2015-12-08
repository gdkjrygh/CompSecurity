// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerArtworkController, PlayerArtworkLoader

public static class playerArtworkLoaderProvider
{

    private final com.soundcloud.android.playback.ui.progress.workLoaderProvider animationControllerFactory;
    private final Provider playerArtworkLoaderProvider;

    public PlayerArtworkController create(PlayerTrackArtworkView playertrackartworkview)
    {
        return new PlayerArtworkController(playertrackartworkview, animationControllerFactory, (PlayerArtworkLoader)playerArtworkLoaderProvider.get());
    }

    ory(com.soundcloud.android.playback.ui.progress.i i, Provider provider)
    {
        animationControllerFactory = i;
        playerArtworkLoaderProvider = provider;
    }
}
