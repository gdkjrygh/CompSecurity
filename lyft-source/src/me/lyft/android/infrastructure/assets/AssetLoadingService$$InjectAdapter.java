// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import android.content.Context;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.infrastructure.assets:
//            AssetLoadingService

public final class  extends Binding
    implements Provider
{

    private Binding context;
    private Binding device;
    private Binding picasso;

    public void attach(Linker linker)
    {
        context = linker.requestBinding("android.content.Context", me/lyft/android/infrastructure/assets/AssetLoadingService, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/infrastructure/assets/AssetLoadingService, getClass().getClassLoader());
        picasso = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/assets/AssetLoadingService, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public AssetLoadingService get()
    {
        return new AssetLoadingService((Context)context.get(), (IDevice)device.get(), (ImageLoader)picasso.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(device);
        set.add(picasso);
    }

    public ()
    {
        super("me.lyft.android.infrastructure.assets.AssetLoadingService", "members/me.lyft.android.infrastructure.assets.AssetLoadingService", false, me/lyft/android/infrastructure/assets/AssetLoadingService);
    }
}
