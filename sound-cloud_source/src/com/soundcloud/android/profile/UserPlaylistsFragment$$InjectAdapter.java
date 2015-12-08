// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            UserPlaylistsFragment, UserPlaylistsPresenter

public final class I extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.profile.UserPlaylistsPresenter", com/soundcloud/android/profile/UserPlaylistsFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.profile.ScrollableProfileFragment", com/soundcloud/android/profile/UserPlaylistsFragment, getClass().getClassLoader(), false);
    }

    public final UserPlaylistsFragment get()
    {
        UserPlaylistsFragment userplaylistsfragment = new UserPlaylistsFragment();
        injectMembers(userplaylistsfragment);
        return userplaylistsfragment;
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

    public final void injectMembers(UserPlaylistsFragment userplaylistsfragment)
    {
        userplaylistsfragment.presenter = (UserPlaylistsPresenter)presenter.get();
        supertype.injectMembers(userplaylistsfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserPlaylistsFragment)obj);
    }

    public I()
    {
        super("com.soundcloud.android.profile.UserPlaylistsFragment", "members/com.soundcloud.android.profile.UserPlaylistsFragment", false, com/soundcloud/android/profile/UserPlaylistsFragment);
    }
}
