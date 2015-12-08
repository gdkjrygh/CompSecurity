// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.settings.ITrainingRideService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver:
//            TrainingRideCompletedDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding imageLoader;
    private Binding locationService;
    private Binding progressController;
    private Binding supertype;
    private Binding trainingRideService;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/TrainingRideCompletedDialogView, getClass().getClassLoader());
        trainingRideService = linker.requestBinding("me.lyft.android.application.settings.ITrainingRideService", me/lyft/android/ui/driver/TrainingRideCompletedDialogView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/driver/TrainingRideCompletedDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/TrainingRideCompletedDialogView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/driver/TrainingRideCompletedDialogView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/driver/TrainingRideCompletedDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/TrainingRideCompletedDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(trainingRideService);
        set1.add(locationService);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(imageLoader);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((TrainingRideCompletedDialogView)obj);
    }

    public void injectMembers(TrainingRideCompletedDialogView trainingridecompleteddialogview)
    {
        trainingridecompleteddialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        trainingridecompleteddialogview.trainingRideService = (ITrainingRideService)trainingRideService.get();
        trainingridecompleteddialogview.locationService = (ILocationService)locationService.get();
        trainingridecompleteddialogview.progressController = (IProgressController)progressController.get();
        trainingridecompleteddialogview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        trainingridecompleteddialogview.imageLoader = (ImageLoader)imageLoader.get();
        supertype.injectMembers(trainingridecompleteddialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.TrainingRideCompletedDialogView", false, me/lyft/android/ui/driver/TrainingRideCompletedDialogView);
    }
}
