// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.ContentResolver;
import com.soundcloud.android.storage.LocalCollectionDAO;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncStateManager

public final class A extends b
    implements Provider
{

    private b dao;
    private b resolver;

    public final void attach(l l1)
    {
        resolver = l1.a("android.content.ContentResolver", com/soundcloud/android/sync/SyncStateManager, getClass().getClassLoader());
        dao = l1.a("com.soundcloud.android.storage.LocalCollectionDAO", com/soundcloud/android/sync/SyncStateManager, getClass().getClassLoader());
    }

    public final SyncStateManager get()
    {
        return new SyncStateManager((ContentResolver)resolver.get(), (LocalCollectionDAO)dao.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resolver);
        set.add(dao);
    }

    public A()
    {
        super("com.soundcloud.android.sync.SyncStateManager", "members/com.soundcloud.android.sync.SyncStateManager", false, com/soundcloud/android/sync/SyncStateManager);
    }
}
