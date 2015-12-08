// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.wobs.provider.WobsClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager, WobsCacheClient, WobDatastore

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding sharedPreferences;
    private Binding wobDatastore;
    private Binding wobsCacheClient;
    private Binding wobsClient;

    public final void attach(Linker linker)
    {
        wobsCacheClient = linker.requestBinding("com.google.android.apps.wallet.wobs.caching.WobsCacheClient", com/google/android/apps/wallet/wobs/caching/WobsManager, getClass().getClassLoader());
        wobsClient = linker.requestBinding("com.google.android.apps.wallet.wobs.provider.WobsClient", com/google/android/apps/wallet/wobs/caching/WobsManager, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/wobs/caching/WobsManager, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/wobs/caching/WobsManager, getClass().getClassLoader());
        wobDatastore = linker.requestBinding("com.google.android.apps.wallet.wobs.caching.WobDatastore", com/google/android/apps/wallet/wobs/caching/WobsManager, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/wobs/caching/WobsManager, getClass().getClassLoader());
    }

    public final WobsManager get()
    {
        return new WobsManager((WobsCacheClient)wobsCacheClient.get(), (WobsClient)wobsClient.get(), (EventBus)eventBus.get(), (SharedPreferences)sharedPreferences.get(), (WobDatastore)wobDatastore.get(), (ActionExecutor)actionExecutor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(wobsCacheClient);
        set.add(wobsClient);
        set.add(eventBus);
        set.add(sharedPreferences);
        set.add(wobDatastore);
        set.add(actionExecutor);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.caching.WobsManager", "members/com.google.android.apps.wallet.wobs.caching.WobsManager", true, com/google/android/apps/wallet/wobs/caching/WobsManager);
    }
}
