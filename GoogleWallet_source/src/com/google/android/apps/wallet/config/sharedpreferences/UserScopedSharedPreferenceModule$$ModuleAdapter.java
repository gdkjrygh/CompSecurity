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
//            UserScopedSharedPreferenceModule

public final class INCLUDES extends ModuleAdapter
{
    public static final class GetSharedPreferencesProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private Binding accountName;
        private Binding application;
        private final UserScopedSharedPreferenceModule module;

        public final void attach(Linker linker)
        {
            application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/config/sharedpreferences/UserScopedSharedPreferenceModule, getClass().getClassLoader());
            accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/config/sharedpreferences/UserScopedSharedPreferenceModule, getClass().getClassLoader());
        }

        public final SharedPreferences get()
        {
            UserScopedSharedPreferenceModule userscopedsharedpreferencemodule = module;
            return UserScopedSharedPreferenceModule.getSharedPreferences((Application)application.get(), (String)accountName.get());
        }

        public final volatile Object get()
        {
            return get();
        }

        public final void getDependencies(Set set, Set set1)
        {
            set.add(application);
            set.add(accountName);
        }

        public GetSharedPreferencesProvidesAdapter(UserScopedSharedPreferenceModule userscopedsharedpreferencemodule)
        {
            super("android.content.SharedPreferences", false, "com.google.android.apps.wallet.config.sharedpreferences.UserScopedSharedPreferenceModule", "getSharedPreferences");
            module = userscopedsharedpreferencemodule;
            setLibrary(true);
        }
    }


    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final void getBindings(BindingsGroup bindingsgroup, UserScopedSharedPreferenceModule userscopedsharedpreferencemodule)
    {
        bindingsgroup.contributeProvidesBinding("android.content.SharedPreferences", new GetSharedPreferencesProvidesAdapter(userscopedsharedpreferencemodule));
    }

    public final volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (UserScopedSharedPreferenceModule)obj);
    }

    public final UserScopedSharedPreferenceModule newModule()
    {
        return new UserScopedSharedPreferenceModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public GetSharedPreferencesProvidesAdapter.setLibrary()
    {
        super(com/google/android/apps/wallet/config/sharedpreferences/UserScopedSharedPreferenceModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
