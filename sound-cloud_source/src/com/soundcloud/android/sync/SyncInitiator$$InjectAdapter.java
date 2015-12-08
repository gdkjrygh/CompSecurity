// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncInitiator, SyncStateManager

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b context;
    private b syncStateManager;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/sync/SyncInitiator, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/sync/SyncInitiator, getClass().getClassLoader());
        syncStateManager = l1.a("com.soundcloud.android.sync.SyncStateManager", com/soundcloud/android/sync/SyncInitiator, getClass().getClassLoader());
    }

    public final SyncInitiator get()
    {
        return new SyncInitiator((Context)context.get(), (AccountOperations)accountOperations.get(), (SyncStateManager)syncStateManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(accountOperations);
        set.add(syncStateManager);
    }

    public ()
    {
        super("com.soundcloud.android.sync.SyncInitiator", "members/com.soundcloud.android.sync.SyncInitiator", false, com/soundcloud/android/sync/SyncInitiator);
    }
}
