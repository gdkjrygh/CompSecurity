// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.io.File;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.imageio:
//            ImageIoModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final ImageIoModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/imageio/ImageIoModule, getClass().getClassLoader());
    }

    public final File get()
    {
        ImageIoModule imageiomodule = module;
        return ImageIoModule.getApplicationCacheDirectory((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (ImageIoModule imageiomodule)
    {
        super("@com.google.android.apps.wallet.imageio.BindingAnnotations$ApplicationCacheDirectory()/java.io.File", false, "com.google.android.apps.wallet.imageio.ImageIoModule", "getApplicationCacheDirectory");
        module = imageiomodule;
        setLibrary(true);
    }
}
