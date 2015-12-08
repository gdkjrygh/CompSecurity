// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.jobs.JobManager;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android:
//            AppModule, ILyftPreferences, IUserSession

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding bus;
    private Binding jobManager;
    private final AppModule module;
    private Binding preferences;

    public void attach(Linker linker)
    {
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/AppModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/AppModule, getClass().getClassLoader());
        jobManager = linker.requestBinding("me.lyft.android.jobs.JobManager", me/lyft/android/AppModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IUserSession get()
    {
        return module.provideIUserSession((MessageBus)bus.get(), (ILyftPreferences)preferences.get(), (JobManager)jobManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(bus);
        set.add(preferences);
        set.add(jobManager);
    }

    public Q(AppModule appmodule)
    {
        super("me.lyft.android.IUserSession", true, "me.lyft.android.AppModule", "provideIUserSession");
        module = appmodule;
        setLibrary(true);
    }
}
