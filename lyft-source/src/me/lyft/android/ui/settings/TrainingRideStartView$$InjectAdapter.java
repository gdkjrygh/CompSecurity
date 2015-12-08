// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.settings.ITrainingRideService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.settings:
//            TrainingRideStartView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding locationService;
    private Binding progressController;
    private Binding trainingRideService;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        trainingRideService = linker.requestBinding("me.lyft.android.application.settings.ITrainingRideService", me/lyft/android/ui/settings/TrainingRideStartView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/settings/TrainingRideStartView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/settings/TrainingRideStartView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/TrainingRideStartView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/settings/TrainingRideStartView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(trainingRideService);
        set1.add(locationService);
        set1.add(progressController);
        set1.add(appFlow);
        set1.add(viewErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((TrainingRideStartView)obj);
    }

    public void injectMembers(TrainingRideStartView trainingridestartview)
    {
        trainingridestartview.trainingRideService = (ITrainingRideService)trainingRideService.get();
        trainingridestartview.locationService = (ILocationService)locationService.get();
        trainingridestartview.progressController = (IProgressController)progressController.get();
        trainingridestartview.appFlow = (AppFlow)appFlow.get();
        trainingridestartview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.settings.TrainingRideStartView", false, me/lyft/android/ui/settings/TrainingRideStartView);
    }
}
