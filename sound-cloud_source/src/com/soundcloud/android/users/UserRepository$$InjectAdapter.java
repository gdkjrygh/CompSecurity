// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.sync.SyncInitiator;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.users:
//            UserRepository, UserStorage

public final class  extends b
    implements Provider
{

    private b scheduler;
    private b syncInitiator;
    private b userStorage;

    public final void attach(l l1)
    {
        userStorage = l1.a("com.soundcloud.android.users.UserStorage", com/soundcloud/android/users/UserRepository, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/users/UserRepository, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/users/UserRepository, getClass().getClassLoader());
    }

    public final UserRepository get()
    {
        return new UserRepository((UserStorage)userStorage.get(), (SyncInitiator)syncInitiator.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(userStorage);
        set.add(syncInitiator);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.users.UserRepository", "members/com.soundcloud.android.users.UserRepository", false, com/soundcloud/android/users/UserRepository);
    }
}
