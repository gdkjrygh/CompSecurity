// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.view.EmptyViewController;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistTagsFragment, PlaylistDiscoveryOperations, PlaylistTagsPresenter

public final class  extends b
    implements a, Provider
{

    private b emptyViewController;
    private b eventBus;
    private b operations;
    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        operations = l1.a("com.soundcloud.android.search.PlaylistDiscoveryOperations", com/soundcloud/android/search/PlaylistTagsFragment, getClass().getClassLoader());
        presenter = l1.a("com.soundcloud.android.search.PlaylistTagsPresenter", com/soundcloud/android/search/PlaylistTagsFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/search/PlaylistTagsFragment, getClass().getClassLoader());
        emptyViewController = l1.a("com.soundcloud.android.view.EmptyViewController", com/soundcloud/android/search/PlaylistTagsFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/search/PlaylistTagsFragment, getClass().getClassLoader(), false);
    }

    public final PlaylistTagsFragment get()
    {
        PlaylistTagsFragment playlisttagsfragment = new PlaylistTagsFragment();
        injectMembers(playlisttagsfragment);
        return playlisttagsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(operations);
        set1.add(presenter);
        set1.add(eventBus);
        set1.add(emptyViewController);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistTagsFragment playlisttagsfragment)
    {
        playlisttagsfragment.operations = (PlaylistDiscoveryOperations)operations.get();
        playlisttagsfragment.presenter = (PlaylistTagsPresenter)presenter.get();
        playlisttagsfragment.eventBus = (EventBus)eventBus.get();
        playlisttagsfragment.emptyViewController = (EmptyViewController)emptyViewController.get();
        supertype.injectMembers(playlisttagsfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistTagsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.search.PlaylistTagsFragment", "members/com.soundcloud.android.search.PlaylistTagsFragment", false, com/soundcloud/android/search/PlaylistTagsFragment);
    }
}
