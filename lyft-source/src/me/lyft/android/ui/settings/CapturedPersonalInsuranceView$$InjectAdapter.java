// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.application.driverdocuments.StatesProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedPersonalInsuranceView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding captureImageSession;
    private Binding dialogFlow;
    private Binding driverDocumentsProvider;
    private Binding driverDocumentsService;
    private Binding imageLoader;
    private Binding lyftPreferences;
    private Binding progressController;
    private Binding statesProvider;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        captureImageSession = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImageSession", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        statesProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.StatesProvider", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/CapturedPersonalInsuranceView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftPreferences);
        set1.add(imageLoader);
        set1.add(bus);
        set1.add(progressController);
        set1.add(driverDocumentsService);
        set1.add(driverDocumentsProvider);
        set1.add(captureImageSession);
        set1.add(statesProvider);
        set1.add(viewErrorHandler);
        set1.add(dialogFlow);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CapturedPersonalInsuranceView)obj);
    }

    public void injectMembers(CapturedPersonalInsuranceView capturedpersonalinsuranceview)
    {
        capturedpersonalinsuranceview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        capturedpersonalinsuranceview.imageLoader = (ImageLoader)imageLoader.get();
        capturedpersonalinsuranceview.bus = (MessageBus)bus.get();
        capturedpersonalinsuranceview.progressController = (IProgressController)progressController.get();
        capturedpersonalinsuranceview.driverDocumentsService = (IDriverDocumentsService)driverDocumentsService.get();
        capturedpersonalinsuranceview.driverDocumentsProvider = (IDriverDocumentsProvider)driverDocumentsProvider.get();
        capturedpersonalinsuranceview.captureImageSession = (ICaptureImageSession)captureImageSession.get();
        capturedpersonalinsuranceview.statesProvider = (StatesProvider)statesProvider.get();
        capturedpersonalinsuranceview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        capturedpersonalinsuranceview.dialogFlow = (DialogFlow)dialogFlow.get();
        capturedpersonalinsuranceview.appFlow = (AppFlow)appFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.settings.CapturedPersonalInsuranceView", false, me/lyft/android/ui/settings/CapturedPersonalInsuranceView);
    }
}
