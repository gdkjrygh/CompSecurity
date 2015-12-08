// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import com.soundcloud.android.commands.BulkFetchCommand;
import com.soundcloud.android.commands.WriteStorageCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.entities:
//            EntitySyncJob

public final class  extends b
    implements Provider
{

    private b fetchResources;
    private b storeResources;

    public final void attach(l l1)
    {
        fetchResources = l1.a("com.soundcloud.android.commands.BulkFetchCommand", com/soundcloud/android/sync/entities/EntitySyncJob, getClass().getClassLoader());
        storeResources = l1.a("com.soundcloud.android.commands.WriteStorageCommand", com/soundcloud/android/sync/entities/EntitySyncJob, getClass().getClassLoader());
    }

    public final EntitySyncJob get()
    {
        return new EntitySyncJob((BulkFetchCommand)fetchResources.get(), (WriteStorageCommand)storeResources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fetchResources);
        set.add(storeResources);
    }

    public ()
    {
        super("com.soundcloud.android.sync.entities.EntitySyncJob", "members/com.soundcloud.android.sync.entities.EntitySyncJob", false, com/soundcloud/android/sync/entities/EntitySyncJob);
    }
}
