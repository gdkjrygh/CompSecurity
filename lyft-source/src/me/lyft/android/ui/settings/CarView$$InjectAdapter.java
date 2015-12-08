// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.IVehicleProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.settings:
//            CarView

public final class DocumentsService extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding driverDocumentsProvider;
    private Binding driverDocumentsService;
    private Binding imageLoader;
    private Binding progressController;
    private Binding vehicleProvider;

    public void attach(Linker linker)
    {
        vehicleProvider = linker.requestBinding("me.lyft.android.application.driver.IVehicleProvider", me/lyft/android/ui/settings/CarView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/settings/CarView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/settings/CarView, getClass().getClassLoader());
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/settings/CarView, getClass().getClassLoader());
        driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/ui/settings/CarView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/settings/CarView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/CarView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(vehicleProvider);
        set1.add(imageLoader);
        set1.add(progressController);
        set1.add(driverDocumentsProvider);
        set1.add(driverDocumentsService);
        set1.add(constantsProvider);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CarView)obj);
    }

    public void injectMembers(CarView carview)
    {
        carview.vehicleProvider = (IVehicleProvider)vehicleProvider.get();
        carview.imageLoader = (ImageLoader)imageLoader.get();
        carview.progressController = (IProgressController)progressController.get();
        carview.driverDocumentsProvider = (IDriverDocumentsProvider)driverDocumentsProvider.get();
        carview.driverDocumentsService = (IDriverDocumentsService)driverDocumentsService.get();
        carview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        carview.appFlow = (AppFlow)appFlow.get();
    }

    public DocumentsService()
    {
        super(null, "members/me.lyft.android.ui.settings.CarView", false, me/lyft/android/ui/settings/CarView);
    }
}
