// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.users.UserAssociationStorage;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.associations:
//            NextFollowingOperations, UpdateFollowingCommand

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b scheduler;
    private b storeFollowingCommand;
    private b syncInitiator;
    private b userAssociationStorage;

    public final void attach(l l1)
    {
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/associations/NextFollowingOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/associations/NextFollowingOperations, getClass().getClassLoader());
        storeFollowingCommand = l1.a("com.soundcloud.android.associations.UpdateFollowingCommand", com/soundcloud/android/associations/NextFollowingOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/associations/NextFollowingOperations, getClass().getClassLoader());
        userAssociationStorage = l1.a("com.soundcloud.android.users.UserAssociationStorage", com/soundcloud/android/associations/NextFollowingOperations, getClass().getClassLoader());
    }

    public final NextFollowingOperations get()
    {
        return new NextFollowingOperations((SyncInitiator)syncInitiator.get(), (EventBus)eventBus.get(), (UpdateFollowingCommand)storeFollowingCommand.get(), (R)scheduler.get(), (UserAssociationStorage)userAssociationStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(syncInitiator);
        set.add(eventBus);
        set.add(storeFollowingCommand);
        set.add(scheduler);
        set.add(userAssociationStorage);
    }

    public ()
    {
        super("com.soundcloud.android.associations.NextFollowingOperations", "members/com.soundcloud.android.associations.NextFollowingOperations", false, com/soundcloud/android/associations/NextFollowingOperations);
    }
}
