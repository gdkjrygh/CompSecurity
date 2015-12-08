// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import android.app.NotificationManager;
import com.google.gson.Gson;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.notifications.IStatusBarNotificationsService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appForegroundDetector;
    private Binding deepLinkManager;
    private Binding gson;
    private Binding imageLoader;
    private final InfrastructureServicesModule module;
    private Binding notificationManager;
    private Binding preferences;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        notificationManager = linker.requestBinding("android.app.NotificationManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IStatusBarNotificationsService get()
    {
        return module.provideStatusBarService((ImageLoader)imageLoader.get(), (NotificationManager)notificationManager.get(), (ILyftPreferences)preferences.get(), (IAppForegroundDetector)appForegroundDetector.get(), (Gson)gson.get(), (DeepLinkManager)deepLinkManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(imageLoader);
        set.add(notificationManager);
        set.add(preferences);
        set.add(appForegroundDetector);
        set.add(gson);
        set.add(deepLinkManager);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.notifications.IStatusBarNotificationsService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideStatusBarService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
