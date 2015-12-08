// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import com.google.gson.Gson;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android:
//            AppModule, LyftApplication, ILyftPreferences

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding app;
    private Binding gson;
    private final AppModule module;

    public void attach(Linker linker)
    {
        app = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/AppModule, getClass().getClassLoader());
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/AppModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ILyftPreferences get()
    {
        return module.providePreferences((LyftApplication)app.get(), (Gson)gson.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(app);
        set.add(gson);
    }

    public (AppModule appmodule)
    {
        super("me.lyft.android.ILyftPreferences", true, "me.lyft.android.AppModule", "providePreferences");
        module = appmodule;
        setLibrary(true);
    }
}
