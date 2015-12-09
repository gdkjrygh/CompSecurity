// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.app.Application;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            CombinedBackgroundInitializerTask, EagerSingletonInitializer

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding eagerSingletonInitializer;
    private Binding executor;
    private Binding experimentsUpdater;
    private Binding featureManager;
    private Binding gcmRegistrar;
    private Binding geofencingClientProvider;
    private Binding localePreferenceUpdater;
    private Binding preferenceClient;
    private Binding sleepTimeMillis;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        eagerSingletonInitializer = linker.requestBinding("com.google.android.apps.wallet.init.EagerSingletonInitializer", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        geofencingClientProvider = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.geofencing.api.GeofencingClient>", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        preferenceClient = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.preferences.PreferenceClient>", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        localePreferenceUpdater = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.locale.LocalePreferenceUpdater>", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        sleepTimeMillis = linker.requestBinding("@com.google.android.apps.wallet.init.BindingAnnotations$LessImportantTaskSleepMillis()/java.lang.Long", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        gcmRegistrar = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.notifications.GcmRegistrar>", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
        experimentsUpdater = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.globalresources.ExperimentsUpdater>", com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask, getClass().getClassLoader());
    }

    public final CombinedBackgroundInitializerTask get()
    {
        return new CombinedBackgroundInitializerTask((Application)application.get(), (Executor)executor.get(), (EagerSingletonInitializer)eagerSingletonInitializer.get(), (Provider)geofencingClientProvider.get(), (Provider)preferenceClient.get(), (Provider)localePreferenceUpdater.get(), (Long)sleepTimeMillis.get(), (FeatureManager)featureManager.get(), (Lazy)gcmRegistrar.get(), (Lazy)experimentsUpdater.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(executor);
        set.add(eagerSingletonInitializer);
        set.add(geofencingClientProvider);
        set.add(preferenceClient);
        set.add(localePreferenceUpdater);
        set.add(sleepTimeMillis);
        set.add(featureManager);
        set.add(gcmRegistrar);
        set.add(experimentsUpdater);
    }

    public ()
    {
        super("com.google.android.apps.wallet.init.CombinedBackgroundInitializerTask", "members/com.google.android.apps.wallet.init.CombinedBackgroundInitializerTask", false, com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask);
    }
}
