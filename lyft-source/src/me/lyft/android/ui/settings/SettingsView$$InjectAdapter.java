// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.driver.IVehicleProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.settings:
//            SettingsView

public final class ider extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding dialogFlow;
    private Binding driverDocumentsProvider;
    private Binding driverDocumentsService;
    private Binding logoutService;
    private Binding lyftPreferences;
    private Binding passengerRideProvider;
    private Binding signUrlService;
    private Binding slideMenuController;
    private Binding userProvider;
    private Binding vehicleProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        signUrlService = linker.requestBinding("me.lyft.android.application.settings.ISignUrlService", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        vehicleProvider = linker.requestBinding("me.lyft.android.application.driver.IVehicleProvider", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        logoutService = linker.requestBinding("me.lyft.android.application.ILogoutService", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/settings/SettingsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(lyftPreferences);
        set1.add(bus);
        set1.add(signUrlService);
        set1.add(driverDocumentsService);
        set1.add(vehicleProvider);
        set1.add(driverDocumentsProvider);
        set1.add(slideMenuController);
        set1.add(userProvider);
        set1.add(logoutService);
        set1.add(passengerRideProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SettingsView)obj);
    }

    public void injectMembers(SettingsView settingsview)
    {
        settingsview.appFlow = (AppFlow)appFlow.get();
        settingsview.dialogFlow = (DialogFlow)dialogFlow.get();
        settingsview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        settingsview.bus = (MessageBus)bus.get();
        settingsview.signUrlService = (ISignUrlService)signUrlService.get();
        settingsview.driverDocumentsService = (IDriverDocumentsService)driverDocumentsService.get();
        settingsview.vehicleProvider = (IVehicleProvider)vehicleProvider.get();
        settingsview.driverDocumentsProvider = (IDriverDocumentsProvider)driverDocumentsProvider.get();
        settingsview.slideMenuController = (SlideMenuController)slideMenuController.get();
        settingsview.userProvider = (IUserProvider)userProvider.get();
        settingsview.logoutService = (ILogoutService)logoutService.get();
        settingsview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
    }

    public ider()
    {
        super(null, "members/me.lyft.android.ui.settings.SettingsView", false, me/lyft/android/ui/settings/SettingsView);
    }
}
