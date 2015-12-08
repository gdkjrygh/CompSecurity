// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.sync.timeline.TimelineSyncStorage;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            ActivitiesSyncer, StoreActivitiesCommand, ReplaceActivitiesCommand

public final class  extends b
    implements a, Provider
{

    private b apiClient;
    private b replaceItemsCommand;
    private b storeItemsCommand;
    private b supertype;
    private b timelineSyncStorage;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/activities/ActivitiesSyncer, getClass().getClassLoader());
        storeItemsCommand = l1.a("com.soundcloud.android.sync.activities.StoreActivitiesCommand", com/soundcloud/android/sync/activities/ActivitiesSyncer, getClass().getClassLoader());
        replaceItemsCommand = l1.a("com.soundcloud.android.sync.activities.ReplaceActivitiesCommand", com/soundcloud/android/sync/activities/ActivitiesSyncer, getClass().getClassLoader());
        timelineSyncStorage = l1.a("@javax.inject.Named(value=ActivitiesSyncStorage)/com.soundcloud.android.sync.timeline.TimelineSyncStorage", com/soundcloud/android/sync/activities/ActivitiesSyncer, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.timeline.TimelineSyncer", com/soundcloud/android/sync/activities/ActivitiesSyncer, getClass().getClassLoader(), false);
    }

    public final ActivitiesSyncer get()
    {
        ActivitiesSyncer activitiessyncer = new ActivitiesSyncer((ApiClient)apiClient.get(), (StoreActivitiesCommand)storeItemsCommand.get(), (ReplaceActivitiesCommand)replaceItemsCommand.get(), (TimelineSyncStorage)timelineSyncStorage.get());
        injectMembers(activitiessyncer);
        return activitiessyncer;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
        set.add(storeItemsCommand);
        set.add(replaceItemsCommand);
        set.add(timelineSyncStorage);
        set1.add(supertype);
    }

    public final void injectMembers(ActivitiesSyncer activitiessyncer)
    {
        supertype.injectMembers(activitiessyncer);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActivitiesSyncer)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.activities.ActivitiesSyncer", "members/com.soundcloud.android.sync.activities.ActivitiesSyncer", false, com/soundcloud/android/sync/activities/ActivitiesSyncer);
    }
}
