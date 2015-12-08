// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.res.Resources;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistsModule, PlaylistDetailsController

public static final class setLibrary extends t
    implements Provider
{

    private b defaultController;
    private final PlaylistsModule module;
    private b resources;
    private b splitScreenController;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playlists/PlaylistsModule, getClass().getClassLoader());
        splitScreenController = l1.a("javax.inject.Provider<com.soundcloud.android.playlists.SplitScreenController>", com/soundcloud/android/playlists/PlaylistsModule, getClass().getClassLoader());
        defaultController = l1.a("javax.inject.Provider<com.soundcloud.android.playlists.DefaultController>", com/soundcloud/android/playlists/PlaylistsModule, getClass().getClassLoader());
    }

    public final PlaylistDetailsController get()
    {
        return module.providePlaylistViewController((Resources)resources.get(), (Provider)splitScreenController.get(), (Provider)defaultController.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(splitScreenController);
        set.add(defaultController);
    }

    public (PlaylistsModule playlistsmodule)
    {
        super("com.soundcloud.android.playlists.PlaylistDetailsController", false, "com.soundcloud.android.playlists.PlaylistsModule", "providePlaylistViewController");
        module = playlistsmodule;
        setLibrary(false);
    }
}
