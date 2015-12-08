// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.util.CondensedNumberFormatter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b engagementsTracking;
    private b followingOperations;
    private b imageOperations;
    private b numberFormatter;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/profile/ProfileHeaderPresenter$ProfileHeaderPresenterFactory, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/profile/ProfileHeaderPresenter$ProfileHeaderPresenterFactory, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/profile/ProfileHeaderPresenter$ProfileHeaderPresenterFactory, getClass().getClassLoader());
        followingOperations = l1.a("com.soundcloud.android.associations.NextFollowingOperations", com/soundcloud/android/profile/ProfileHeaderPresenter$ProfileHeaderPresenterFactory, getClass().getClassLoader());
        engagementsTracking = l1.a("com.soundcloud.android.analytics.EngagementsTracking", com/soundcloud/android/profile/ProfileHeaderPresenter$ProfileHeaderPresenterFactory, getClass().getClassLoader());
    }

    public final engagementsTracking get()
    {
        return new engagementsTracking((ImageOperations)imageOperations.get(), (CondensedNumberFormatter)numberFormatter.get(), (AccountOperations)accountOperations.get(), (NextFollowingOperations)followingOperations.get(), (EngagementsTracking)engagementsTracking.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(numberFormatter);
        set.add(accountOperations);
        set.add(followingOperations);
        set.add(engagementsTracking);
    }

    public ()
    {
        super("com.soundcloud.android.profile.ProfileHeaderPresenter$ProfileHeaderPresenterFactory", "members/com.soundcloud.android.profile.ProfileHeaderPresenter$ProfileHeaderPresenterFactory", false, com/soundcloud/android/profile/ProfileHeaderPresenter$ProfileHeaderPresenterFactory);
    }
}
