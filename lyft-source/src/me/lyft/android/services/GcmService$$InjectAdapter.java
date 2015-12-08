// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import com.google.gson.Gson;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IAppStateHandler;
import me.lyft.android.IUserSession;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.notifications.IStatusBarNotificationsService;

// Referenced classes of package me.lyft.android.services:
//            GcmService

public final class nsService extends Binding
    implements MembersInjector, Provider
{

    private Binding appStateHandler;
    private Binding developerTools;
    private Binding gson;
    private Binding statusBarNotificationsService;
    private Binding supertype;
    private Binding userSession;

    public void attach(Linker linker)
    {
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/services/GcmService, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/services/GcmService, getClass().getClassLoader());
        appStateHandler = linker.requestBinding("me.lyft.android.IAppStateHandler", me/lyft/android/services/GcmService, getClass().getClassLoader());
        developerTools = linker.requestBinding("me.lyft.android.development.DeveloperTools", me/lyft/android/services/GcmService, getClass().getClassLoader());
        statusBarNotificationsService = linker.requestBinding("me.lyft.android.notifications.IStatusBarNotificationsService", me/lyft/android/services/GcmService, getClass().getClassLoader());
        supertype = linker.requestBinding("members/com.google.android.gms.gcm.GcmListenerService", me/lyft/android/services/GcmService, getClass().getClassLoader(), false, true);
    }

    public volatile Object get()
    {
        return get();
    }

    public GcmService get()
    {
        GcmService gcmservice = new GcmService();
        injectMembers(gcmservice);
        return gcmservice;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(gson);
        set1.add(userSession);
        set1.add(appStateHandler);
        set1.add(developerTools);
        set1.add(statusBarNotificationsService);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((GcmService)obj);
    }

    public void injectMembers(GcmService gcmservice)
    {
        gcmservice.gson = (Gson)gson.get();
        gcmservice.userSession = (IUserSession)userSession.get();
        gcmservice.appStateHandler = (IAppStateHandler)appStateHandler.get();
        gcmservice.developerTools = (DeveloperTools)developerTools.get();
        gcmservice.statusBarNotificationsService = (IStatusBarNotificationsService)statusBarNotificationsService.get();
        supertype.injectMembers(gcmservice);
    }

    public nsService()
    {
        super("me.lyft.android.services.GcmService", "members/me.lyft.android.services.GcmService", false, me/lyft/android/services/GcmService);
    }
}
