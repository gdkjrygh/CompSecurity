// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.utils.ProfileScrollHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePresenter, UserProfileOperations

public final class aderPresenterFactory extends b
    implements a, Provider
{

    private b accountOperations;
    private b eventBus;
    private b profileHeaderPresenterFactory;
    private b profileOperations;
    private b scrollHelper;
    private b supertype;

    public final void attach(l l1)
    {
        scrollHelper = l1.a("com.soundcloud.android.utils.ProfileScrollHelper", com/soundcloud/android/profile/ProfilePresenter, getClass().getClassLoader());
        profileHeaderPresenterFactory = l1.a("com.soundcloud.android.profile.ProfileHeaderPresenter$ProfileHeaderPresenterFactory", com/soundcloud/android/profile/ProfilePresenter, getClass().getClassLoader());
        profileOperations = l1.a("com.soundcloud.android.profile.UserProfileOperations", com/soundcloud/android/profile/ProfilePresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/profile/ProfilePresenter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/profile/ProfilePresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.ActivityLightCycleDispatcher", com/soundcloud/android/profile/ProfilePresenter, getClass().getClassLoader(), false);
    }

    public final ProfilePresenter get()
    {
        ProfilePresenter profilepresenter = new ProfilePresenter((ProfileScrollHelper)scrollHelper.get(), (aderPresenterFactory)profileHeaderPresenterFactory.get(), (UserProfileOperations)profileOperations.get(), (EventBus)eventBus.get(), (AccountOperations)accountOperations.get());
        injectMembers(profilepresenter);
        return profilepresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(scrollHelper);
        set.add(profileHeaderPresenterFactory);
        set.add(profileOperations);
        set.add(eventBus);
        set.add(accountOperations);
        set1.add(supertype);
    }

    public final void injectMembers(ProfilePresenter profilepresenter)
    {
        supertype.injectMembers(profilepresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ProfilePresenter)obj);
    }

    public aderPresenterFactory()
    {
        super("com.soundcloud.android.profile.ProfilePresenter", "members/com.soundcloud.android.profile.ProfilePresenter", false, com/soundcloud/android/profile/ProfilePresenter);
    }
}
