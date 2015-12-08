// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.sharedpreferences;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.sharedpreferences:
//            ApplicationScopedSharedPreferenceModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final ApplicationScopedSharedPreferenceModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/config/sharedpreferences/ApplicationScopedSharedPreferenceModule, getClass().getClassLoader());
    }

    public final SharedPreferences get()
    {
        ApplicationScopedSharedPreferenceModule applicationscopedsharedpreferencemodule = module;
        return ApplicationScopedSharedPreferenceModule.getSharedPreferences((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (ApplicationScopedSharedPreferenceModule applicationscopedsharedpreferencemodule)
    {
        super("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", false, "com.google.android.apps.wallet.config.sharedpreferences.ApplicationScopedSharedPreferenceModule", "getSharedPreferences");
        module = applicationscopedsharedpreferencemodule;
        setLibrary(true);
    }
}
