// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.imageio:
//            ImageIoModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding cloudConfigManager;
    private final ImageIoModule module;

    public final void attach(Linker linker)
    {
        cloudConfigManager = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager", com/google/android/apps/wallet/imageio/ImageIoModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final String get()
    {
        ImageIoModule imageiomodule = module;
        return ImageIoModule.getAuthScope((CloudConfigurationManager)cloudConfigManager.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cloudConfigManager);
    }

    public (ImageIoModule imageiomodule)
    {
        super("@com.google.android.apps.wallet.imageio.BindingAnnotations$AuthScope()/java.lang.String", false, "com.google.android.apps.wallet.imageio.ImageIoModule", "getAuthScope");
        module = imageiomodule;
        setLibrary(true);
    }
}
