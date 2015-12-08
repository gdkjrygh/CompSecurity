// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.storage.LegacyActivitiesStorage;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.sync:
//            ApiSyncer

public final class e extends b
    implements a
{

    private b activitiesStorage;
    private b apiClient;
    private b eventBus;
    private b storeTracksCommand;
    private b supertype;
    private b userStorage;

    public final void attach(l l1)
    {
        activitiesStorage = l1.a("com.soundcloud.android.storage.LegacyActivitiesStorage", com/soundcloud/android/sync/ApiSyncer, getClass().getClassLoader());
        userStorage = l1.a("com.soundcloud.android.storage.LegacyUserStorage", com/soundcloud/android/sync/ApiSyncer, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/sync/ApiSyncer, getClass().getClassLoader());
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/ApiSyncer, getClass().getClassLoader());
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/sync/ApiSyncer, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.LegacySyncStrategy", com/soundcloud/android/sync/ApiSyncer, getClass().getClassLoader(), false);
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(activitiesStorage);
        set1.add(userStorage);
        set1.add(eventBus);
        set1.add(apiClient);
        set1.add(storeTracksCommand);
        set1.add(supertype);
    }

    public final void injectMembers(ApiSyncer apisyncer)
    {
        apisyncer.activitiesStorage = (LegacyActivitiesStorage)activitiesStorage.get();
        apisyncer.userStorage = (LegacyUserStorage)userStorage.get();
        apisyncer.eventBus = (EventBus)eventBus.get();
        apisyncer.apiClient = (ApiClient)apiClient.get();
        apisyncer.storeTracksCommand = (StoreTracksCommand)storeTracksCommand.get();
        supertype.injectMembers(apisyncer);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ApiSyncer)obj);
    }

    public e()
    {
        super(null, "members/com.soundcloud.android.sync.ApiSyncer", false, com/soundcloud/android/sync/ApiSyncer);
    }
}
