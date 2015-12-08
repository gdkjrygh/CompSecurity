// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.infrastructure.activity.ActivityServiceRegistry;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.managers.DeepLinkManager;

// Referenced classes of package me.lyft.android.ui:
//            MainActivity

public final class .ILocationSettingsService extends Binding
    implements MembersInjector, Provider
{

    private Binding activityController;
    private Binding activityServiceRegistry;
    private Binding apiFacade;
    private Binding appFlow;
    private Binding appForegroundDetector;
    private Binding deepLinkManager;
    private Binding developerTools;
    private Binding dialogFlow;
    private Binding googleApiProvider;
    private Binding locationSettingsService;
    private Binding userSession;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        apiFacade = linker.requestBinding("me.lyft.android.facades.ApiFacade", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        googleApiProvider = linker.requestBinding("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        activityServiceRegistry = linker.requestBinding("me.lyft.android.infrastructure.activity.ActivityServiceRegistry", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        developerTools = linker.requestBinding("me.lyft.android.development.DeveloperTools", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
        locationSettingsService = linker.requestBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", me/lyft/android/ui/MainActivity, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public MainActivity get()
    {
        MainActivity mainactivity = new MainActivity();
        injectMembers(mainactivity);
        return mainactivity;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(appForegroundDetector);
        set1.add(userSession);
        set1.add(apiFacade);
        set1.add(deepLinkManager);
        set1.add(googleApiProvider);
        set1.add(activityController);
        set1.add(activityServiceRegistry);
        set1.add(developerTools);
        set1.add(locationSettingsService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((MainActivity)obj);
    }

    public void injectMembers(MainActivity mainactivity)
    {
        mainactivity.appFlow = (AppFlow)appFlow.get();
        mainactivity.dialogFlow = (DialogFlow)dialogFlow.get();
        mainactivity.appForegroundDetector = (IAppForegroundDetector)appForegroundDetector.get();
        mainactivity.userSession = (IUserSession)userSession.get();
        mainactivity.apiFacade = (ApiFacade)apiFacade.get();
        mainactivity.deepLinkManager = (DeepLinkManager)deepLinkManager.get();
        mainactivity.googleApiProvider = (IGoogleApiProvider)googleApiProvider.get();
        mainactivity.activityController = (ActivityController)activityController.get();
        mainactivity.activityServiceRegistry = (ActivityServiceRegistry)activityServiceRegistry.get();
        mainactivity.developerTools = (DeveloperTools)developerTools.get();
        mainactivity.locationSettingsService = (ILocationSettingsService)locationSettingsService.get();
    }

    public .ILocationSettingsService()
    {
        super("me.lyft.android.ui.MainActivity", "members/me.lyft.android.ui.MainActivity", false, me/lyft/android/ui/MainActivity);
    }
}
