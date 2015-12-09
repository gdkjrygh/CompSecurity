// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            SettingsModule, ActionQueue

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding actionExecutor;
    private final SettingsModule module;

    public final void attach(Linker linker)
    {
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/settings/SettingsModule, getClass().getClassLoader());
    }

    public final ActionQueue get()
    {
        SettingsModule settingsmodule = module;
        return SettingsModule.getRequestActionsQueue((ActionExecutor)actionExecutor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(actionExecutor);
    }

    public q(SettingsModule settingsmodule)
    {
        super("com.google.android.apps.wallet.settings.ActionQueue<com.google.wallet.proto.api.NanoWalletSettings$FetchSettingsResponse>", false, "com.google.android.apps.wallet.settings.SettingsModule", "getRequestActionsQueue");
        module = settingsmodule;
        setLibrary(true);
    }
}
