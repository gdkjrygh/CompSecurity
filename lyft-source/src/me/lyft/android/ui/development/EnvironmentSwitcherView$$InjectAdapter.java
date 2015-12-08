// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.trackers.AnalyticsService;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.s3.IS3Api;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.development:
//            EnvironmentSwitcherView

public final class  extends Binding
    implements MembersInjector
{

    private Binding IS3Api;
    private Binding activityController;
    private Binding analyticsService;
    private Binding appFlow;
    private Binding logoutService;
    private Binding lyftPreferences;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        IS3Api = linker.requestBinding("me.lyft.android.infrastructure.s3.IS3Api", me/lyft/android/ui/development/EnvironmentSwitcherView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/development/EnvironmentSwitcherView, getClass().getClassLoader());
        logoutService = linker.requestBinding("me.lyft.android.application.ILogoutService", me/lyft/android/ui/development/EnvironmentSwitcherView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/development/EnvironmentSwitcherView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/development/EnvironmentSwitcherView, getClass().getClassLoader());
        analyticsService = linker.requestBinding("me.lyft.android.analytics.trackers.AnalyticsService", me/lyft/android/ui/development/EnvironmentSwitcherView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/development/EnvironmentSwitcherView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(IS3Api);
        set1.add(lyftPreferences);
        set1.add(logoutService);
        set1.add(activityController);
        set1.add(appFlow);
        set1.add(analyticsService);
        set1.add(viewErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EnvironmentSwitcherView)obj);
    }

    public void injectMembers(EnvironmentSwitcherView environmentswitcherview)
    {
        environmentswitcherview.IS3Api = (IS3Api)IS3Api.get();
        environmentswitcherview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        environmentswitcherview.logoutService = (ILogoutService)logoutService.get();
        environmentswitcherview.activityController = (ActivityController)activityController.get();
        environmentswitcherview.appFlow = (AppFlow)appFlow.get();
        environmentswitcherview.analyticsService = (AnalyticsService)analyticsService.get();
        environmentswitcherview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.development.EnvironmentSwitcherView", false, me/lyft/android/ui/development/EnvironmentSwitcherView);
    }
}
