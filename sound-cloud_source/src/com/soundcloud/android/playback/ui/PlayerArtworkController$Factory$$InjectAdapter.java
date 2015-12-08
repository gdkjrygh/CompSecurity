// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b animationControllerFactory;
    private b playerArtworkLoaderProvider;

    public final void attach(l l1)
    {
        animationControllerFactory = l1.a("com.soundcloud.android.playback.ui.progress.ProgressController$Factory", com/soundcloud/android/playback/ui/PlayerArtworkController$Factory, getClass().getClassLoader());
        playerArtworkLoaderProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ui.PlayerArtworkLoader>", com/soundcloud/android/playback/ui/PlayerArtworkController$Factory, getClass().getClassLoader());
    }

    public final playerArtworkLoaderProvider get()
    {
        return new playerArtworkLoaderProvider((com.soundcloud.android.playback.ui.progress.workLoaderProvider)animationControllerFactory.get(), (Provider)playerArtworkLoaderProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(animationControllerFactory);
        set.add(playerArtworkLoaderProvider);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.PlayerArtworkController$Factory", "members/com.soundcloud.android.playback.ui.PlayerArtworkController$Factory", false, com/soundcloud/android/playback/ui/PlayerArtworkController$Factory);
    }
}
