// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.android.sync.SyncStateManager;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.storage:
//            LegacyActivitiesStorage, ActivityDAO

public final class  extends b
    implements Provider
{

    private b activitiesDAO;
    private b syncStateManager;

    public final void attach(l l1)
    {
        syncStateManager = l1.a("com.soundcloud.android.sync.SyncStateManager", com/soundcloud/android/storage/LegacyActivitiesStorage, getClass().getClassLoader());
        activitiesDAO = l1.a("com.soundcloud.android.storage.ActivityDAO", com/soundcloud/android/storage/LegacyActivitiesStorage, getClass().getClassLoader());
    }

    public final LegacyActivitiesStorage get()
    {
        return new LegacyActivitiesStorage((SyncStateManager)syncStateManager.get(), (ActivityDAO)activitiesDAO.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(syncStateManager);
        set.add(activitiesDAO);
    }

    public ()
    {
        super("com.soundcloud.android.storage.LegacyActivitiesStorage", "members/com.soundcloud.android.storage.LegacyActivitiesStorage", false, com/soundcloud/android/storage/LegacyActivitiesStorage);
    }
}
