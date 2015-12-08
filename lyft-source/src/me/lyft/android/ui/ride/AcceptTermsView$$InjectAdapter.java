// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.ride:
//            AcceptTermsView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding errorHandler;
    private Binding landingService;
    private Binding progressController;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/ride/AcceptTermsView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/ride/AcceptTermsView, getClass().getClassLoader());
        errorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/ride/AcceptTermsView, getClass().getClassLoader());
        landingService = linker.requestBinding("me.lyft.android.application.landing.ILandingService", me/lyft/android/ui/ride/AcceptTermsView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/ride/AcceptTermsView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/ride/AcceptTermsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(progressController);
        set1.add(errorHandler);
        set1.add(landingService);
        set1.add(userProvider);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AcceptTermsView)obj);
    }

    public void injectMembers(AcceptTermsView accepttermsview)
    {
        accepttermsview.appFlow = (AppFlow)appFlow.get();
        accepttermsview.progressController = (IProgressController)progressController.get();
        accepttermsview.errorHandler = (IViewErrorHandler)errorHandler.get();
        accepttermsview.landingService = (ILandingService)landingService.get();
        accepttermsview.userProvider = (IUserProvider)userProvider.get();
        accepttermsview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.ride.AcceptTermsView", false, me/lyft/android/ui/ride/AcceptTermsView);
    }
}
