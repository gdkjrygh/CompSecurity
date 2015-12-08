// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.sync.SyncInitiator;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesOperations, ActivitiesStorage

public final class  extends b
    implements a, Provider
{

    private b activitiesStorage;
    private b contentStats;
    private b scheduler;
    private b supertype;
    private b syncInitiator;

    public final void attach(l l1)
    {
        activitiesStorage = l1.a("com.soundcloud.android.activities.ActivitiesStorage", com/soundcloud/android/activities/ActivitiesOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/activities/ActivitiesOperations, getClass().getClassLoader());
        contentStats = l1.a("com.soundcloud.android.api.legacy.model.ContentStats", com/soundcloud/android/activities/ActivitiesOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/activities/ActivitiesOperations, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.timeline.TimelineOperations", com/soundcloud/android/activities/ActivitiesOperations, getClass().getClassLoader(), false);
    }

    public final ActivitiesOperations get()
    {
        ActivitiesOperations activitiesoperations = new ActivitiesOperations((ActivitiesStorage)activitiesStorage.get(), (SyncInitiator)syncInitiator.get(), (ContentStats)contentStats.get(), (R)scheduler.get());
        injectMembers(activitiesoperations);
        return activitiesoperations;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activitiesStorage);
        set.add(syncInitiator);
        set.add(contentStats);
        set.add(scheduler);
        set1.add(supertype);
    }

    public final void injectMembers(ActivitiesOperations activitiesoperations)
    {
        supertype.injectMembers(activitiesoperations);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActivitiesOperations)obj);
    }

    public ()
    {
        super("com.soundcloud.android.activities.ActivitiesOperations", "members/com.soundcloud.android.activities.ActivitiesOperations", false, com/soundcloud/android/activities/ActivitiesOperations);
    }
}
