// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.sharedpreferences;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.sharedpreferences:
//            ApplicationScopedSharedPreferenceModule

public final class INCLUDES extends ModuleAdapter
{
    public static final class GetSharedPreferencesProvidesAdapter extends ProvidesBinding
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

        public GetSharedPreferencesProvidesAdapter(ApplicationScopedSharedPreferenceModule applicationscopedsharedpreferencemodule)
        {
            super("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", false, "com.google.android.apps.wallet.config.sharedpreferences.ApplicationScopedSharedPreferenceModule", "getSharedPreferences");
            module = applicationscopedsharedpreferencemodule;
            setLibrary(true);
        }
    }


    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final void getBindings(BindingsGroup bindingsgroup, ApplicationScopedSharedPreferenceModule applicationscopedsharedpreferencemodule)
    {
        bindingsgroup.contributeProvidesBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", new GetSharedPreferencesProvidesAdapter(applicationscopedsharedpreferencemodule));
    }

    public final volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (ApplicationScopedSharedPreferenceModule)obj);
    }

    public final ApplicationScopedSharedPreferenceModule newModule()
    {
        return new ApplicationScopedSharedPreferenceModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public GetSharedPreferencesProvidesAdapter.setLibrary()
    {
        super(com/google/android/apps/wallet/config/sharedpreferences/ApplicationScopedSharedPreferenceModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
