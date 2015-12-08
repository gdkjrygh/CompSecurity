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
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SetDestinyView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding destinyService;
    private Binding destinySession;
    private Binding dialogFlow;
    private Binding geoService;
    private Binding locationService;
    private Binding preferences;
    private Binding progressController;
    private Binding rideMap;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        destinyService = linker.requestBinding("me.lyft.android.application.ride.IDestinyService", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        destinySession = linker.requestBinding("me.lyft.android.application.ride.IDestinySession", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/passenger/SetDestinyView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(dialogFlow);
        set1.add(preferences);
        set1.add(rideMap);
        set1.add(destinyService);
        set1.add(destinySession);
        set1.add(geoService);
        set1.add(constantsProvider);
        set1.add(locationService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SetDestinyView)obj);
    }

    public void injectMembers(SetDestinyView setdestinyview)
    {
        setdestinyview.appFlow = (AppFlow)appFlow.get();
        setdestinyview.progressController = (IProgressController)progressController.get();
        setdestinyview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        setdestinyview.dialogFlow = (DialogFlow)dialogFlow.get();
        setdestinyview.preferences = (ILyftPreferences)preferences.get();
        setdestinyview.rideMap = (RideMap)rideMap.get();
        setdestinyview.destinyService = (IDestinyService)destinyService.get();
        setdestinyview.destinySession = (IDestinySession)destinySession.get();
        setdestinyview.geoService = (IGeoService)geoService.get();
        setdestinyview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        setdestinyview.locationService = (ILocationService)locationService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.SetDestinyView", false, me/lyft/android/ui/passenger/SetDestinyView);
    }
}
