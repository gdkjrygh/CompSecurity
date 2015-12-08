// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.help:
//            HelpContextProvider

public final class  extends Binding
    implements Provider
{

    private Binding featureManager;

    public final void attach(Linker linker)
    {
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/help/HelpContextProvider, getClass().getClassLoader());
    }

    public final HelpContextProvider get()
    {
        return new HelpContextProvider((FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.help.HelpContextProvider", "members/com.google.android.apps.wallet.help.HelpContextProvider", true, com/google/android/apps/wallet/help/HelpContextProvider);
    }
}
