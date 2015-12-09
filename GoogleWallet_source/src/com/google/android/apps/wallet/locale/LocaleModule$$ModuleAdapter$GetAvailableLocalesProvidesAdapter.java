// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.locale:
//            LocaleModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final LocaleModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/locale/LocaleModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final List get()
    {
        LocaleModule localemodule = module;
        return LocaleModule.getAvailableLocales((Application)application.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (LocaleModule localemodule)
    {
        super("@com.google.android.apps.wallet.locale.BindingAnnotations$AvailableLocales()/java.util.List<java.util.Locale>", true, "com.google.android.apps.wallet.locale.LocaleModule", "getAvailableLocales");
        module = localemodule;
        setLibrary(true);
    }
}
