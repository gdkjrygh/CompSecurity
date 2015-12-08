// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.analytics.trackers.AnalyticsService;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.jobs.JobManager;

// Referenced classes of package me.lyft.android:
//            LyftApplication, ILyftPreferences, IUserSession

public final class vice extends Binding
    implements MembersInjector, Provider
{

    private Binding analyticsService;
    private Binding developerTools;
    private Binding device;
    private Binding jobManager;
    private Binding logoutService;
    private Binding preferences;
    private Binding userSession;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/LyftApplication, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/LyftApplication, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/LyftApplication, getClass().getClassLoader());
        jobManager = linker.requestBinding("me.lyft.android.jobs.JobManager", me/lyft/android/LyftApplication, getClass().getClassLoader());
        analyticsService = linker.requestBinding("me.lyft.android.analytics.trackers.AnalyticsService", me/lyft/android/LyftApplication, getClass().getClassLoader());
        logoutService = linker.requestBinding("me.lyft.android.application.ILogoutService", me/lyft/android/LyftApplication, getClass().getClassLoader());
        developerTools = linker.requestBinding("me.lyft.android.development.DeveloperTools", me/lyft/android/LyftApplication, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public LyftApplication get()
    {
        LyftApplication lyftapplication = new LyftApplication();
        injectMembers(lyftapplication);
        return lyftapplication;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(preferences);
        set1.add(device);
        set1.add(userSession);
        set1.add(jobManager);
        set1.add(analyticsService);
        set1.add(logoutService);
        set1.add(developerTools);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((LyftApplication)obj);
    }

    public void injectMembers(LyftApplication lyftapplication)
    {
        lyftapplication.preferences = (ILyftPreferences)preferences.get();
        lyftapplication.device = (IDevice)device.get();
        lyftapplication.userSession = (IUserSession)userSession.get();
        lyftapplication.jobManager = (JobManager)jobManager.get();
        lyftapplication.analyticsService = (AnalyticsService)analyticsService.get();
        lyftapplication.logoutService = (ILogoutService)logoutService.get();
        lyftapplication.developerTools = (DeveloperTools)developerTools.get();
    }

    public vice()
    {
        super("me.lyft.android.LyftApplication", "members/me.lyft.android.LyftApplication", false, me/lyft/android/LyftApplication);
    }
}
