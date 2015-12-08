// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesPresenter, ActivitiesOperations, ActivitiesAdapter

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b operations;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/activities/ActivitiesPresenter, getClass().getClassLoader());
        operations = l1.a("com.soundcloud.android.activities.ActivitiesOperations", com/soundcloud/android/activities/ActivitiesPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.activities.ActivitiesAdapter", com/soundcloud/android/activities/ActivitiesPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/activities/ActivitiesPresenter, getClass().getClassLoader(), false);
    }

    public final ActivitiesPresenter get()
    {
        ActivitiesPresenter activitiespresenter = new ActivitiesPresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (ActivitiesOperations)operations.get(), (ActivitiesAdapter)adapter.get());
        injectMembers(activitiespresenter);
        return activitiespresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(swipeRefreshAttacher);
        set.add(operations);
        set.add(adapter);
        set1.add(supertype);
    }

    public final void injectMembers(ActivitiesPresenter activitiespresenter)
    {
        supertype.injectMembers(activitiespresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActivitiesPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.activities.ActivitiesPresenter", "members/com.soundcloud.android.activities.ActivitiesPresenter", false, com/soundcloud/android/activities/ActivitiesPresenter);
    }
}
