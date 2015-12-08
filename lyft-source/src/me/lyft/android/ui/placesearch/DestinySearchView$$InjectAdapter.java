// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            DestinySearchView, IPlaceSearchPresenter

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding destinyService;
    private Binding destinySession;
    private Binding placeSearchPresenter;
    private Binding progressController;
    private Binding supertype;

    public void attach(Linker linker)
    {
        destinyService = linker.requestBinding("me.lyft.android.application.ride.IDestinyService", me/lyft/android/ui/placesearch/DestinySearchView, getClass().getClassLoader());
        destinySession = linker.requestBinding("me.lyft.android.application.ride.IDestinySession", me/lyft/android/ui/placesearch/DestinySearchView, getClass().getClassLoader());
        placeSearchPresenter = linker.requestBinding("me.lyft.android.ui.placesearch.IPlaceSearchPresenter", me/lyft/android/ui/placesearch/DestinySearchView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/placesearch/DestinySearchView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/placesearch/DestinySearchView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.placesearch.PlaceSearchView", me/lyft/android/ui/placesearch/DestinySearchView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(destinyService);
        set1.add(destinySession);
        set1.add(placeSearchPresenter);
        set1.add(appFlow);
        set1.add(progressController);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DestinySearchView)obj);
    }

    public void injectMembers(DestinySearchView destinysearchview)
    {
        destinysearchview.destinyService = (IDestinyService)destinyService.get();
        destinysearchview.destinySession = (IDestinySession)destinySession.get();
        destinysearchview.placeSearchPresenter = (IPlaceSearchPresenter)placeSearchPresenter.get();
        destinysearchview.appFlow = (AppFlow)appFlow.get();
        destinysearchview.progressController = (IProgressController)progressController.get();
        supertype.injectMembers(destinysearchview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.placesearch.DestinySearchView", false, me/lyft/android/ui/placesearch/DestinySearchView);
    }
}
