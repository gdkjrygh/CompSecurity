// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            ServiceAuthFactory

public final class er extends Binding
    implements Provider
{

    private Binding cloudConfigurationManager;

    public final void attach(Linker linker)
    {
        cloudConfigurationManager = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager", com/google/android/apps/wallet/webview/ServiceAuthFactory, getClass().getClassLoader());
    }

    public final ServiceAuthFactory get()
    {
        return new ServiceAuthFactory((CloudConfigurationManager)cloudConfigurationManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cloudConfigurationManager);
    }

    public er()
    {
        super("com.google.android.apps.wallet.webview.ServiceAuthFactory", "members/com.google.android.apps.wallet.webview.ServiceAuthFactory", false, com/google/android/apps/wallet/webview/ServiceAuthFactory);
    }
}
