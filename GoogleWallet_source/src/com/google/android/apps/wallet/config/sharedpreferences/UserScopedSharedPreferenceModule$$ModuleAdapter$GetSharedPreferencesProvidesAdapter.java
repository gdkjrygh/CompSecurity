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
//            UserScopedSharedPreferenceModule

public static final class setLibrary extends ProvidesBinding
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

    public _91_(UserScopedSharedPreferenceModule userscopedsharedpreferencemodule)
    {
        super("android.content.SharedPreferences", false, "com.google.android.apps.wallet.config.sharedpreferences.UserScopedSharedPreferenceModule", "getSharedPreferences");
        module = userscopedsharedpreferencemodule;
        setLibrary(true);
    }
}
