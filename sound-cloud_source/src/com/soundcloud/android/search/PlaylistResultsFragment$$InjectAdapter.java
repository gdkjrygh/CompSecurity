// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistResultsFragment, PlaylistResultsPresenter

public final class  extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.search.PlaylistResultsPresenter", com/soundcloud/android/search/PlaylistResultsFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/search/PlaylistResultsFragment, getClass().getClassLoader(), false);
    }

    public final PlaylistResultsFragment get()
    {
        PlaylistResultsFragment playlistresultsfragment = new PlaylistResultsFragment();
        injectMembers(playlistresultsfragment);
        return playlistresultsfragment;
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

    public final void injectMembers(PlaylistResultsFragment playlistresultsfragment)
    {
        playlistresultsfragment.presenter = (PlaylistResultsPresenter)presenter.get();
        supertype.injectMembers(playlistresultsfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistResultsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.search.PlaylistResultsFragment", "members/com.soundcloud.android.search.PlaylistResultsFragment", false, com/soundcloud/android/search/PlaylistResultsFragment);
    }
}
