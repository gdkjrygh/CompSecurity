// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerSubmitRatingButton

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding lyftPreferences;
    private Binding passengerRideProvider;
    private Binding passengerRideService;
    private Binding progressController;
    private Binding ratingSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
        passengerRideService = linker.requestBinding("me.lyft.android.application.ride.IPassengerRideService", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
        ratingSession = linker.requestBinding("me.lyft.android.application.ride.IRatingSession", me/lyft/android/ui/passenger/PassengerSubmitRatingButton, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(constantsProvider);
        set1.add(passengerRideProvider);
        set1.add(lyftPreferences);
        set1.add(passengerRideService);
        set1.add(dialogFlow);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(appFlow);
        set1.add(ratingSession);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerSubmitRatingButton)obj);
    }

    public void injectMembers(PassengerSubmitRatingButton passengersubmitratingbutton)
    {
        passengersubmitratingbutton.constantsProvider = (IConstantsProvider)constantsProvider.get();
        passengersubmitratingbutton.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengersubmitratingbutton.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        passengersubmitratingbutton.passengerRideService = (IPassengerRideService)passengerRideService.get();
        passengersubmitratingbutton.dialogFlow = (DialogFlow)dialogFlow.get();
        passengersubmitratingbutton.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        passengersubmitratingbutton.progressController = (IProgressController)progressController.get();
        passengersubmitratingbutton.appFlow = (AppFlow)appFlow.get();
        passengersubmitratingbutton.ratingSession = (IRatingSession)ratingSession.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerSubmitRatingButton", false, me/lyft/android/ui/passenger/PassengerSubmitRatingButton);
    }
}
