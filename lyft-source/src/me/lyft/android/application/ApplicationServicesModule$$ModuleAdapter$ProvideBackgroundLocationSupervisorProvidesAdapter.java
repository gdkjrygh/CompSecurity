// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.polling.IBackgroundLocationAppProcess;
import me.lyft.android.application.polling.IBackgroundLocationTracker;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appForegroundDetector;
    private Binding backgroundLocationTracker;
    private final ApplicationServicesModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        backgroundLocationTracker = linker.requestBinding("me.lyft.android.application.polling.IBackgroundLocationTracker", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IBackgroundLocationAppProcess get()
    {
        return module.provideBackgroundLocationSupervisor((IBackgroundLocationTracker)backgroundLocationTracker.get(), (IAppForegroundDetector)appForegroundDetector.get(), (IUserProvider)userProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(backgroundLocationTracker);
        set.add(appForegroundDetector);
        set.add(userProvider);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.polling.IBackgroundLocationAppProcess", true, "me.lyft.android.application.ApplicationServicesModule", "provideBackgroundLocationSupervisor");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
