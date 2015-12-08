// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesFragment, ActivitiesPresenter

public final class I extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.activities.ActivitiesPresenter", com/soundcloud/android/activities/ActivitiesFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/activities/ActivitiesFragment, getClass().getClassLoader(), false);
    }

    public final ActivitiesFragment get()
    {
        ActivitiesFragment activitiesfragment = new ActivitiesFragment();
        injectMembers(activitiesfragment);
        return activitiesfragment;
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

    public final void injectMembers(ActivitiesFragment activitiesfragment)
    {
        activitiesfragment.presenter = (ActivitiesPresenter)presenter.get();
        supertype.injectMembers(activitiesfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActivitiesFragment)obj);
    }

    public I()
    {
        super("com.soundcloud.android.activities.ActivitiesFragment", "members/com.soundcloud.android.activities.ActivitiesFragment", false, com/soundcloud/android/activities/ActivitiesFragment);
    }
}
