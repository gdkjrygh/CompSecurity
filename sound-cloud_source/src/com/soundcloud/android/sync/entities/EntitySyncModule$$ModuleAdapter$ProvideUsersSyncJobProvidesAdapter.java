// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.sync.commands.FetchUsersCommand;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.entities:
//            EntitySyncModule, EntitySyncJob

public static final class setLibrary extends t
    implements Provider
{

    private b fetchUsers;
    private final EntitySyncModule module;
    private b storeUsers;

    public final void attach(l l1)
    {
        fetchUsers = l1.a("com.soundcloud.android.sync.commands.FetchUsersCommand", com/soundcloud/android/sync/entities/EntitySyncModule, getClass().getClassLoader());
        storeUsers = l1.a("com.soundcloud.android.commands.StoreUsersCommand", com/soundcloud/android/sync/entities/EntitySyncModule, getClass().getClassLoader());
    }

    public final EntitySyncJob get()
    {
        return module.provideUsersSyncJob((FetchUsersCommand)fetchUsers.get(), (StoreUsersCommand)storeUsers.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fetchUsers);
        set.add(storeUsers);
    }

    public (EntitySyncModule entitysyncmodule)
    {
        super("@javax.inject.Named(value=UsersSync)/com.soundcloud.android.sync.entities.EntitySyncJob", false, "com.soundcloud.android.sync.entities.EntitySyncModule", "provideUsersSyncJob");
        module = entitysyncmodule;
        setLibrary(true);
    }
}
