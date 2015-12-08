// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.accounts.AccountManager;
import android.content.Context;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.accounts:
//            AccountOperations, SoundCloudTokenOperations

public final class  extends b
    implements Provider
{

    private b accountCleanupAction;
    private b accountManager;
    private b clearTrackDownloadsCommand;
    private b context;
    private b eventBus;
    private b modelManager;
    private b scheduler;
    private b tokenOperations;
    private b userStorage;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
        accountManager = l1.a("android.accounts.AccountManager", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
        tokenOperations = l1.a("com.soundcloud.android.accounts.SoundCloudTokenOperations", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
        modelManager = l1.a("com.soundcloud.android.api.legacy.model.ScModelManager", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
        userStorage = l1.a("com.soundcloud.android.storage.LegacyUserStorage", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
        accountCleanupAction = l1.a("dagger.Lazy<com.soundcloud.android.accounts.AccountCleanupAction>", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
        clearTrackDownloadsCommand = l1.a("dagger.Lazy<com.soundcloud.android.offline.ClearTrackDownloadsCommand>", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/accounts/AccountOperations, getClass().getClassLoader());
    }

    public final AccountOperations get()
    {
        return new AccountOperations((Context)context.get(), (AccountManager)accountManager.get(), (SoundCloudTokenOperations)tokenOperations.get(), (ScModelManager)modelManager.get(), (LegacyUserStorage)userStorage.get(), (EventBus)eventBus.get(), (Lazy)accountCleanupAction.get(), (Lazy)clearTrackDownloadsCommand.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(accountManager);
        set.add(tokenOperations);
        set.add(modelManager);
        set.add(userStorage);
        set.add(eventBus);
        set.add(accountCleanupAction);
        set.add(clearTrackDownloadsCommand);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.accounts.AccountOperations", "members/com.soundcloud.android.accounts.AccountOperations", true, com/soundcloud/android/accounts/AccountOperations);
    }
}
