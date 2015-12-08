// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistLikesFragment, PlaylistLikesPresenter

public final class  extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.playlists.PlaylistLikesPresenter", com/soundcloud/android/playlists/PlaylistLikesFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/playlists/PlaylistLikesFragment, getClass().getClassLoader(), false);
    }

    public final PlaylistLikesFragment get()
    {
        PlaylistLikesFragment playlistlikesfragment = new PlaylistLikesFragment();
        injectMembers(playlistlikesfragment);
        return playlistlikesfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(presenter);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistLikesFragment playlistlikesfragment)
    {
        playlistlikesfragment.presenter = (PlaylistLikesPresenter)presenter.get();
        supertype.injectMembers(playlistlikesfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistLikesFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistLikesFragment", "members/com.soundcloud.android.playlists.PlaylistLikesFragment", false, com/soundcloud/android/playlists/PlaylistLikesFragment);
    }
}
