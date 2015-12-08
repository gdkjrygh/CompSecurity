// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            MyPlaylistsPresenter, MyProfileOperations

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b clickListenerFactory;
    private b imagePauseOnScrollListener;
    private b profileOperations;
    private b supertype;
    private b swipeRefreshAttacher;
    private b updaterFactory;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/profile/MyPlaylistsPresenter, getClass().getClassLoader());
        imagePauseOnScrollListener = l1.a("com.soundcloud.android.image.ImagePauseOnScrollListener", com/soundcloud/android/profile/MyPlaylistsPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter", com/soundcloud/android/profile/MyPlaylistsPresenter, getClass().getClassLoader());
        clickListenerFactory = l1.a("com.soundcloud.android.view.adapters.MixedItemClickListener$Factory", com/soundcloud/android/profile/MyPlaylistsPresenter, getClass().getClassLoader());
        updaterFactory = l1.a("com.soundcloud.android.presentation.PlayableListUpdater$Factory", com/soundcloud/android/profile/MyPlaylistsPresenter, getClass().getClassLoader());
        profileOperations = l1.a("com.soundcloud.android.profile.MyProfileOperations", com/soundcloud/android/profile/MyPlaylistsPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.profile.ProfilePlayablePresenter", com/soundcloud/android/profile/MyPlaylistsPresenter, getClass().getClassLoader(), false);
    }

    public final MyPlaylistsPresenter get()
    {
        MyPlaylistsPresenter myplaylistspresenter = new MyPlaylistsPresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (ImagePauseOnScrollListener)imagePauseOnScrollListener.get(), (MixedPlayableRecyclerItemAdapter)adapter.get(), (com.soundcloud.android.view.adapters.r)clickListenerFactory.get(), (com.soundcloud.android.presentation.ListenerFactory)updaterFactory.get(), (MyProfileOperations)profileOperations.get());
        injectMembers(myplaylistspresenter);
        return myplaylistspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(swipeRefreshAttacher);
        set.add(imagePauseOnScrollListener);
        set.add(adapter);
        set.add(clickListenerFactory);
        set.add(updaterFactory);
        set.add(profileOperations);
        set1.add(supertype);
    }

    public final void injectMembers(MyPlaylistsPresenter myplaylistspresenter)
    {
        supertype.injectMembers(myplaylistspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MyPlaylistsPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.MyPlaylistsPresenter", "members/com.soundcloud.android.profile.MyPlaylistsPresenter", false, com/soundcloud/android/profile/MyPlaylistsPresenter);
    }
}
