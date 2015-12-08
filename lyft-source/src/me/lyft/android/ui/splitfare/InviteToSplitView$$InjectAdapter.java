// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

public final class y extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding fareRepository;
    private Binding progressController;
    private Binding rideProvider;
    private Binding splitFareService;
    private Binding splitFareStateRepository;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        rideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        splitFareService = linker.requestBinding("me.lyft.android.infrastructure.splitfare.ISplitFareService", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        fareRepository = linker.requestBinding("me.lyft.android.application.ride.IRideFareRepository", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
        splitFareStateRepository = linker.requestBinding("me.lyft.android.application.splitfare.ISplitFareStateRepository", me/lyft/android/ui/splitfare/InviteToSplitView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(appFlow);
        set1.add(bus);
        set1.add(constantsProvider);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(rideProvider);
        set1.add(splitFareService);
        set1.add(fareRepository);
        set1.add(splitFareStateRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((InviteToSplitView)obj);
    }

    public void injectMembers(InviteToSplitView invitetosplitview)
    {
        invitetosplitview.dialogFlow = (DialogFlow)dialogFlow.get();
        invitetosplitview.appFlow = (AppFlow)appFlow.get();
        invitetosplitview.bus = (MessageBus)bus.get();
        invitetosplitview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        invitetosplitview.progressController = (IProgressController)progressController.get();
        invitetosplitview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        invitetosplitview.rideProvider = (IPassengerRideProvider)rideProvider.get();
        invitetosplitview.splitFareService = (ISplitFareService)splitFareService.get();
        invitetosplitview.fareRepository = (IRideFareRepository)fareRepository.get();
        invitetosplitview.splitFareStateRepository = (ISplitFareStateRepository)splitFareStateRepository.get();
    }

    public y()
    {
        super(null, "members/me.lyft.android.ui.splitfare.InviteToSplitView", false, me/lyft/android/ui/splitfare/InviteToSplitView);
    }
}
