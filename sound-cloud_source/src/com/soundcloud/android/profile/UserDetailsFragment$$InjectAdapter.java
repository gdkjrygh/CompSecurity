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
//            UserDetailsFragment, UserDetailsView, UserProfileOperations

public final class  extends b
    implements a, Provider
{

    private b profileOperations;
    private b supertype;
    private b userDetailsView;

    public final void attach(l l1)
    {
        userDetailsView = l1.a("com.soundcloud.android.profile.UserDetailsView", com/soundcloud/android/profile/UserDetailsFragment, getClass().getClassLoader());
        profileOperations = l1.a("com.soundcloud.android.profile.UserProfileOperations", com/soundcloud/android/profile/UserDetailsFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.profile.ScrollableProfileFragment", com/soundcloud/android/profile/UserDetailsFragment, getClass().getClassLoader(), false);
    }

    public final UserDetailsFragment get()
    {
        UserDetailsFragment userdetailsfragment = new UserDetailsFragment();
        injectMembers(userdetailsfragment);
        return userdetailsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(userDetailsView);
        set1.add(profileOperations);
        set1.add(supertype);
    }

    public final void injectMembers(UserDetailsFragment userdetailsfragment)
    {
        userdetailsfragment.userDetailsView = (UserDetailsView)userDetailsView.get();
        userdetailsfragment.profileOperations = (UserProfileOperations)profileOperations.get();
        supertype.injectMembers(userdetailsfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserDetailsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.UserDetailsFragment", "members/com.soundcloud.android.profile.UserDetailsFragment", false, com/soundcloud/android/profile/UserDetailsFragment);
    }
}
