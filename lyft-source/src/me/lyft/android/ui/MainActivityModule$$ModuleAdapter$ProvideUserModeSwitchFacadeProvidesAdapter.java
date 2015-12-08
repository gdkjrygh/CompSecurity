// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule, IViewErrorHandler

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding driverDocumentsProvider;
    private Binding driverDocumentsService;
    private Binding locationSettingsService;
    private Binding lyftPreferences;
    private final MainActivityModule module;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        locationSettingsService = linker.requestBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public UserModeSwitchFacade get()
    {
        return module.provideUserModeSwitchFacade((IDriverDocumentsProvider)driverDocumentsProvider.get(), (IDriverDocumentsService)driverDocumentsService.get(), (ILocationSettingsService)locationSettingsService.get(), (IViewErrorHandler)viewErrorHandler.get(), (ILyftPreferences)lyftPreferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(driverDocumentsProvider);
        set.add(driverDocumentsService);
        set.add(locationSettingsService);
        set.add(viewErrorHandler);
        set.add(lyftPreferences);
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.facades.UserModeSwitchFacade", true, "me.lyft.android.ui.MainActivityModule", "provideUserModeSwitchFacade");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
