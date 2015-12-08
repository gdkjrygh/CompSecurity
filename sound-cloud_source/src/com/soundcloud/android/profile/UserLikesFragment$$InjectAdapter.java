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
//            UserLikesFragment, UserLikesPresenter

public final class  extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.profile.UserLikesPresenter", com/soundcloud/android/profile/UserLikesFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.profile.ScrollableProfileFragment", com/soundcloud/android/profile/UserLikesFragment, getClass().getClassLoader(), false);
    }

    public final UserLikesFragment get()
    {
        UserLikesFragment userlikesfragment = new UserLikesFragment();
        injectMembers(userlikesfragment);
        return userlikesfragment;
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

    public final void injectMembers(UserLikesFragment userlikesfragment)
    {
        userlikesfragment.presenter = (UserLikesPresenter)presenter.get();
        supertype.injectMembers(userlikesfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserLikesFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.UserLikesFragment", "members/com.soundcloud.android.profile.UserLikesFragment", false, com/soundcloud/android/profile/UserLikesFragment);
    }
}
