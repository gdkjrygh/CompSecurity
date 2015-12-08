// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.facades;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.facades:
//            UserModeSwitchFacade, ApiFacade

public final class tingsService extends Binding
    implements Provider
{

    private Binding apiFacade;
    private Binding appFlow;
    private Binding dialogFlow;
    private Binding driverDocumentsProvider;
    private Binding driverDocumentsService;
    private Binding locationSettingsService;
    private Binding progressController;
    private Binding slideMenuController;
    private Binding userSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        apiFacade = linker.requestBinding("me.lyft.android.facades.ApiFacade", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
        locationSettingsService = linker.requestBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", me/lyft/android/facades/UserModeSwitchFacade, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public UserModeSwitchFacade get()
    {
        return new UserModeSwitchFacade((IProgressController)progressController.get(), (AppFlow)appFlow.get(), (DialogFlow)dialogFlow.get(), (ApiFacade)apiFacade.get(), (IUserSession)userSession.get(), (IViewErrorHandler)viewErrorHandler.get(), (SlideMenuController)slideMenuController.get(), (IDriverDocumentsProvider)driverDocumentsProvider.get(), (IDriverDocumentsService)driverDocumentsService.get(), (ILocationSettingsService)locationSettingsService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(progressController);
        set.add(appFlow);
        set.add(dialogFlow);
        set.add(apiFacade);
        set.add(userSession);
        set.add(viewErrorHandler);
        set.add(slideMenuController);
        set.add(driverDocumentsProvider);
        set.add(driverDocumentsService);
        set.add(locationSettingsService);
    }

    public tingsService()
    {
        super("me.lyft.android.facades.UserModeSwitchFacade", "members/me.lyft.android.facades.UserModeSwitchFacade", false, me/lyft/android/facades/UserModeSwitchFacade);
    }
}
