// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.actionbar.ActionBarHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistsFragment

public final class  extends b
    implements a, Provider
{

    private b actionBarHelper;
    private b supertype;

    public final void attach(l l1)
    {
        actionBarHelper = l1.a("com.soundcloud.android.actionbar.ActionBarHelper", com/soundcloud/android/playlists/PlaylistsFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/playlists/PlaylistsFragment, getClass().getClassLoader(), false);
    }

    public final PlaylistsFragment get()
    {
        PlaylistsFragment playlistsfragment = new PlaylistsFragment();
        injectMembers(playlistsfragment);
        return playlistsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(actionBarHelper);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistsFragment playlistsfragment)
    {
        playlistsfragment.actionBarHelper = (ActionBarHelper)actionBarHelper.get();
        supertype.injectMembers(playlistsfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistsFragment", "members/com.soundcloud.android.playlists.PlaylistsFragment", false, com/soundcloud/android/playlists/PlaylistsFragment);
    }
}
