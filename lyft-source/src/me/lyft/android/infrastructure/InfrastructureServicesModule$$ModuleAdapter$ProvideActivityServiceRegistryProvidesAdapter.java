// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.analytics.trackers.AnalyticsService;
import me.lyft.android.infrastructure.activity.ActivityServiceRegistry;
import me.lyft.android.infrastructure.appboy.IAppboyService;
import me.lyft.android.infrastructure.cardscan.ICardScanService;
import me.lyft.android.infrastructure.competition.InstallTrackerService;
import me.lyft.android.infrastructure.driverdefense.DriverDefenseStarterService;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.gallery.IGalleryService;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import me.lyft.android.infrastructure.instabug.IInstabugService;
import me.lyft.android.infrastructure.leanplum.ILeanplumService;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.infrastructure.paypal.IPayPalService;
import me.lyft.android.infrastructure.viewserver.IViewServerService;
import me.lyft.android.infrastructure.wallet.IWalletService;
import me.lyft.android.notifications.IStatusBarNotificationsService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding analyticsService;
    private Binding appboyService;
    private Binding driverDefenseStarterService;
    private Binding facebookService;
    private Binding galleryService;
    private Binding googleApiProvider;
    private Binding inAppNotificationService;
    private Binding instabugService;
    private Binding installTrackerService;
    private Binding leanplumService;
    private Binding locationSettingsService;
    private final InfrastructureServicesModule module;
    private Binding payPalService;
    private Binding scanService;
    private Binding statusBarNotificationsService;
    private Binding viewServerService;
    private Binding walletService;

    public void attach(Linker linker)
    {
        facebookService = linker.requestBinding("me.lyft.android.infrastructure.facebook.IFacebookService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        googleApiProvider = linker.requestBinding("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        walletService = linker.requestBinding("me.lyft.android.infrastructure.wallet.IWalletService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        galleryService = linker.requestBinding("me.lyft.android.infrastructure.gallery.IGalleryService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        analyticsService = linker.requestBinding("me.lyft.android.analytics.trackers.AnalyticsService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        scanService = linker.requestBinding("me.lyft.android.infrastructure.cardscan.ICardScanService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        payPalService = linker.requestBinding("me.lyft.android.infrastructure.paypal.IPayPalService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        locationSettingsService = linker.requestBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        viewServerService = linker.requestBinding("me.lyft.android.infrastructure.viewserver.IViewServerService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        driverDefenseStarterService = linker.requestBinding("me.lyft.android.infrastructure.driverdefense.DriverDefenseStarterService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        inAppNotificationService = linker.requestBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        installTrackerService = linker.requestBinding("me.lyft.android.infrastructure.competition.InstallTrackerService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        appboyService = linker.requestBinding("me.lyft.android.infrastructure.appboy.IAppboyService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        statusBarNotificationsService = linker.requestBinding("me.lyft.android.notifications.IStatusBarNotificationsService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        leanplumService = linker.requestBinding("me.lyft.android.infrastructure.leanplum.ILeanplumService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        instabugService = linker.requestBinding("me.lyft.android.infrastructure.instabug.IInstabugService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ActivityServiceRegistry get()
    {
        return module.provideActivityServiceRegistry((IFacebookService)facebookService.get(), (IGoogleApiProvider)googleApiProvider.get(), (IWalletService)walletService.get(), (IGalleryService)galleryService.get(), (AnalyticsService)analyticsService.get(), (ICardScanService)scanService.get(), (IPayPalService)payPalService.get(), (ILocationSettingsService)locationSettingsService.get(), (IViewServerService)viewServerService.get(), (DriverDefenseStarterService)driverDefenseStarterService.get(), (InAppNotificationService)inAppNotificationService.get(), (InstallTrackerService)installTrackerService.get(), (IAppboyService)appboyService.get(), (IStatusBarNotificationsService)statusBarNotificationsService.get(), (ILeanplumService)leanplumService.get(), (IInstabugService)instabugService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(facebookService);
        set.add(googleApiProvider);
        set.add(walletService);
        set.add(galleryService);
        set.add(analyticsService);
        set.add(scanService);
        set.add(payPalService);
        set.add(locationSettingsService);
        set.add(viewServerService);
        set.add(driverDefenseStarterService);
        set.add(inAppNotificationService);
        set.add(installTrackerService);
        set.add(appboyService);
        set.add(statusBarNotificationsService);
        set.add(leanplumService);
        set.add(instabugService);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.activity.ActivityServiceRegistry", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideActivityServiceRegistry");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
