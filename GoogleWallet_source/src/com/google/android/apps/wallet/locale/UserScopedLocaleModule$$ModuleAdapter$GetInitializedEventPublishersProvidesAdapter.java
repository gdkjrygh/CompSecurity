// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.locale:
//            UserScopedLocaleModule, LocaleChangedEventPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final UserScopedLocaleModule module;
    private Binding provider;

    public final void attach(Linker linker)
    {
        provider = linker.requestBinding("com.google.android.apps.wallet.locale.LocaleChangedEventPublisher", com/google/android/apps/wallet/locale/UserScopedLocaleModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        UserScopedLocaleModule userscopedlocalemodule = module;
        return UserScopedLocaleModule.getInitializedEventPublishers((LocaleChangedEventPublisher)provider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(provider);
    }

    public (UserScopedLocaleModule userscopedlocalemodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.locale.UserScopedLocaleModule", "getInitializedEventPublishers");
        module = userscopedlocalemodule;
        setLibrary(true);
    }
}
