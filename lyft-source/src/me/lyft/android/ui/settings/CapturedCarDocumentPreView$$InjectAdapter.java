// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedCarDocumentPreView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding captureImageSession;
    private Binding dialogFlow;
    private Binding driverDocumentsProvider;
    private Binding driverDocumentsService;
    private Binding progressController;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        captureImageSession = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImageSession", me/lyft/android/ui/settings/CapturedCarDocumentPreView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/settings/CapturedCarDocumentPreView, getClass().getClassLoader());
        driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/ui/settings/CapturedCarDocumentPreView, getClass().getClassLoader());
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/settings/CapturedCarDocumentPreView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/settings/CapturedCarDocumentPreView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/CapturedCarDocumentPreView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/settings/CapturedCarDocumentPreView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(captureImageSession);
        set1.add(progressController);
        set1.add(driverDocumentsService);
        set1.add(driverDocumentsProvider);
        set1.add(viewErrorHandler);
        set1.add(appFlow);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CapturedCarDocumentPreView)obj);
    }

    public void injectMembers(CapturedCarDocumentPreView capturedcardocumentpreview)
    {
        capturedcardocumentpreview.captureImageSession = (ICaptureImageSession)captureImageSession.get();
        capturedcardocumentpreview.progressController = (IProgressController)progressController.get();
        capturedcardocumentpreview.driverDocumentsService = (IDriverDocumentsService)driverDocumentsService.get();
        capturedcardocumentpreview.driverDocumentsProvider = (IDriverDocumentsProvider)driverDocumentsProvider.get();
        capturedcardocumentpreview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        capturedcardocumentpreview.appFlow = (AppFlow)appFlow.get();
        capturedcardocumentpreview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.settings.CapturedCarDocumentPreView", false, me/lyft/android/ui/settings/CapturedCarDocumentPreView);
    }
}
