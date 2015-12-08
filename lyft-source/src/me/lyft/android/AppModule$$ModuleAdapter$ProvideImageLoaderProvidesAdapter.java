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
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android:
//            AppModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;
    private Binding okHttpClient;

    public void attach(Linker linker)
    {
        okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/AppModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ImageLoader get()
    {
        return module.provideImageLoader((OkHttpClient)okHttpClient.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(okHttpClient);
    }

    public (AppModule appmodule)
    {
        super("me.lyft.android.managers.ImageLoader", true, "me.lyft.android.AppModule", "provideImageLoader");
        module = appmodule;
        setLibrary(true);
    }
}
