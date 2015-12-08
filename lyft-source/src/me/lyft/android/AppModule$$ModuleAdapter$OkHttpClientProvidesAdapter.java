// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android:
//            AppModule, ILyftPreferences

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private Binding device;
    private final AppModule module;
    private Binding preferences;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/AppModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/AppModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/AppModule, getClass().getClassLoader());
    }

    public OkHttpClient get()
    {
        return module.okHttpClient((ILyftPreferences)preferences.get(), (IConstantsProvider)constantsProvider.get(), (IDevice)device.get());
    }

    public volatile Object get()
    {
        return get();
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(preferences);
        set.add(constantsProvider);
        set.add(device);
    }

    public (AppModule appmodule)
    {
        super("com.squareup.okhttp.OkHttpClient", true, "me.lyft.android.AppModule", "okHttpClient");
        module = appmodule;
        setLibrary(true);
    }
}
