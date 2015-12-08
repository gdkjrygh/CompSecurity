// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.appcontrol;

import com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.appcontrol:
//            AppControl

public final class er extends Binding
    implements Provider
{

    private Binding clientConfigurationManager;

    public final void attach(Linker linker)
    {
        clientConfigurationManager = linker.requestBinding("com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager", com/google/android/apps/wallet/config/appcontrol/AppControl, getClass().getClassLoader());
    }

    public final AppControl get()
    {
        return new AppControl((ClientConfigurationManager)clientConfigurationManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(clientConfigurationManager);
    }

    public er()
    {
        super("com.google.android.apps.wallet.config.appcontrol.AppControl", "members/com.google.android.apps.wallet.config.appcontrol.AppControl", true, com/google/android/apps/wallet/config/appcontrol/AppControl);
    }
}
