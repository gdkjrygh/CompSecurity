// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            UploadModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding cloudConfigManager;
    private final UploadModule module;

    public final void attach(Linker linker)
    {
        cloudConfigManager = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager", com/google/android/apps/wallet/wobs/upload/UploadModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final String get()
    {
        UploadModule uploadmodule = module;
        return UploadModule.getScottyUrl((CloudConfigurationManager)cloudConfigManager.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cloudConfigManager);
    }

    public (UploadModule uploadmodule)
    {
        super("@com.google.android.apps.wallet.wobs.upload.BindingAnnotations$ScottyUrl()/java.lang.String", false, "com.google.android.apps.wallet.wobs.upload.UploadModule", "getScottyUrl");
        module = uploadmodule;
        setLibrary(true);
    }
}
