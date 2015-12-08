// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import android.app.NotificationManager;
import com.google.gson.Gson;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.notifications:
//            StatusBarNotificationsService

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding appForegroundedDetector;
    private Binding deepLinkManager;
    private Binding gson;
    private Binding imageLoader;
    private Binding notificationManager;
    private Binding preferences;
    private Binding supertype;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/notifications/StatusBarNotificationsService, getClass().getClassLoader());
        notificationManager = linker.requestBinding("android.app.NotificationManager", me/lyft/android/notifications/StatusBarNotificationsService, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/notifications/StatusBarNotificationsService, getClass().getClassLoader());
        appForegroundedDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/notifications/StatusBarNotificationsService, getClass().getClassLoader());
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/notifications/StatusBarNotificationsService, getClass().getClassLoader());
        deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/notifications/StatusBarNotificationsService, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.infrastructure.activity.ActivityService", me/lyft/android/notifications/StatusBarNotificationsService, getClass().getClassLoader(), false, true);
    }

    public volatile Object get()
    {
        return get();
    }

    public StatusBarNotificationsService get()
    {
        StatusBarNotificationsService statusbarnotificationsservice = new StatusBarNotificationsService((ImageLoader)imageLoader.get(), (NotificationManager)notificationManager.get(), (ILyftPreferences)preferences.get(), (IAppForegroundDetector)appForegroundedDetector.get(), (Gson)gson.get(), (DeepLinkManager)deepLinkManager.get());
        injectMembers(statusbarnotificationsservice);
        return statusbarnotificationsservice;
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(imageLoader);
        set.add(notificationManager);
        set.add(preferences);
        set.add(appForegroundedDetector);
        set.add(gson);
        set.add(deepLinkManager);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((StatusBarNotificationsService)obj);
    }

    public void injectMembers(StatusBarNotificationsService statusbarnotificationsservice)
    {
        supertype.injectMembers(statusbarnotificationsservice);
    }

    public ()
    {
        super("me.lyft.android.notifications.StatusBarNotificationsService", "members/me.lyft.android.notifications.StatusBarNotificationsService", false, me/lyft/android/notifications/StatusBarNotificationsService);
    }
}
