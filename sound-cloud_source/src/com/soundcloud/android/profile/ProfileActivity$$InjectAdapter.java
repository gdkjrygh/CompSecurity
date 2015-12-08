// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileActivity, ProfilePresenter

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b playerController;
    private b profilePresenter;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/profile/ProfileActivity, getClass().getClassLoader());
        profilePresenter = l1.a("com.soundcloud.android.profile.ProfilePresenter", com/soundcloud/android/profile/ProfileActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/profile/ProfileActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/profile/ProfileActivity, getClass().getClassLoader(), false);
    }

    public final ProfileActivity get()
    {
        ProfileActivity profileactivity = new ProfileActivity();
        injectMembers(profileactivity);
        return profileactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playerController);
        set1.add(profilePresenter);
        set1.add(baseLayoutHelper);
        set1.add(supertype);
    }

    public final void injectMembers(ProfileActivity profileactivity)
    {
        profileactivity.playerController = (PlayerController)playerController.get();
        profileactivity.profilePresenter = (ProfilePresenter)profilePresenter.get();
        profileactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        supertype.injectMembers(profileactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ProfileActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.ProfileActivity", "members/com.soundcloud.android.profile.ProfileActivity", false, com/soundcloud/android/profile/ProfileActivity);
    }
}
