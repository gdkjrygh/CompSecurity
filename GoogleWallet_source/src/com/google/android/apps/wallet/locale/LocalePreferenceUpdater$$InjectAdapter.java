// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.locale:
//            LocalePreferenceUpdater

public final class  extends Binding
    implements Provider
{

    private Binding eventBus;
    private Binding executor;
    private Binding preferenceClient;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/locale/LocalePreferenceUpdater, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/dagger.Lazy<java.util.concurrent.Executor>", com/google/android/apps/wallet/locale/LocalePreferenceUpdater, getClass().getClassLoader());
        preferenceClient = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.preferences.PreferenceClient>", com/google/android/apps/wallet/locale/LocalePreferenceUpdater, getClass().getClassLoader());
    }

    public final LocalePreferenceUpdater get()
    {
        return new LocalePreferenceUpdater((EventBus)eventBus.get(), (Lazy)executor.get(), (Lazy)preferenceClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(executor);
        set.add(preferenceClient);
    }

    public ()
    {
        super("com.google.android.apps.wallet.locale.LocalePreferenceUpdater", "members/com.google.android.apps.wallet.locale.LocalePreferenceUpdater", true, com/google/android/apps/wallet/locale/LocalePreferenceUpdater);
    }
}
