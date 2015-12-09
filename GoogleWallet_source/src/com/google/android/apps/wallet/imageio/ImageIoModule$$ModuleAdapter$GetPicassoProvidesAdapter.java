// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import android.app.Application;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.squareup.picasso.Picasso;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.imageio:
//            ImageIoModule, PicassoRequestTransformer, PicassoDownloader

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appControl;
    private Binding application;
    private Binding downloader;
    private final ImageIoModule module;
    private Binding requestTransformer;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/imageio/ImageIoModule, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/imageio/ImageIoModule, getClass().getClassLoader());
        requestTransformer = linker.requestBinding("com.google.android.apps.wallet.imageio.PicassoRequestTransformer", com/google/android/apps/wallet/imageio/ImageIoModule, getClass().getClassLoader());
        downloader = linker.requestBinding("com.google.android.apps.wallet.imageio.PicassoDownloader", com/google/android/apps/wallet/imageio/ImageIoModule, getClass().getClassLoader());
    }

    public final Picasso get()
    {
        ImageIoModule imageiomodule = module;
        return ImageIoModule.getPicasso((Application)application.get(), (AppControl)appControl.get(), (PicassoRequestTransformer)requestTransformer.get(), (PicassoDownloader)downloader.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(appControl);
        set.add(requestTransformer);
        set.add(downloader);
    }

    public (ImageIoModule imageiomodule)
    {
        super("com.squareup.picasso.Picasso", true, "com.google.android.apps.wallet.imageio.ImageIoModule", "getPicasso");
        module = imageiomodule;
        setLibrary(true);
    }
}
