// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            VerifyAgePresenter, UpdateAgeCommand

public final class  extends b
    implements a, Provider
{

    private b engagementsTracking;
    private b followingOperations;
    private b supertype;
    private b updateAgeCommand;

    public final void attach(l l1)
    {
        updateAgeCommand = l1.a("com.soundcloud.android.profile.UpdateAgeCommand", com/soundcloud/android/profile/VerifyAgePresenter, getClass().getClassLoader());
        followingOperations = l1.a("com.soundcloud.android.associations.NextFollowingOperations", com/soundcloud/android/profile/VerifyAgePresenter, getClass().getClassLoader());
        engagementsTracking = l1.a("com.soundcloud.android.analytics.EngagementsTracking", com/soundcloud/android/profile/VerifyAgePresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/profile/VerifyAgePresenter, getClass().getClassLoader(), false);
    }

    public final VerifyAgePresenter get()
    {
        VerifyAgePresenter verifyagepresenter = new VerifyAgePresenter((UpdateAgeCommand)updateAgeCommand.get(), (NextFollowingOperations)followingOperations.get(), (EngagementsTracking)engagementsTracking.get());
        injectMembers(verifyagepresenter);
        return verifyagepresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(updateAgeCommand);
        set.add(followingOperations);
        set.add(engagementsTracking);
        set1.add(supertype);
    }

    public final void injectMembers(VerifyAgePresenter verifyagepresenter)
    {
        supertype.injectMembers(verifyagepresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((VerifyAgePresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.VerifyAgePresenter", "members/com.soundcloud.android.profile.VerifyAgePresenter", false, com/soundcloud/android/profile/VerifyAgePresenter);
    }
}
