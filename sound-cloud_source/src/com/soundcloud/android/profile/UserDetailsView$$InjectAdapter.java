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
//            UserDetailsView, ProfileEmptyViewHelper

public final class  extends b
    implements a, Provider
{

    private b profileEmptyViewHelper;

    public final void attach(l l1)
    {
        profileEmptyViewHelper = l1.a("com.soundcloud.android.profile.ProfileEmptyViewHelper", com/soundcloud/android/profile/UserDetailsView, getClass().getClassLoader());
    }

    public final UserDetailsView get()
    {
        UserDetailsView userdetailsview = new UserDetailsView();
        injectMembers(userdetailsview);
        return userdetailsview;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(profileEmptyViewHelper);
    }

    public final void injectMembers(UserDetailsView userdetailsview)
    {
        userdetailsview.profileEmptyViewHelper = (ProfileEmptyViewHelper)profileEmptyViewHelper.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserDetailsView)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.UserDetailsView", "members/com.soundcloud.android.profile.UserDetailsView", false, com/soundcloud/android/profile/UserDetailsView);
    }
}
