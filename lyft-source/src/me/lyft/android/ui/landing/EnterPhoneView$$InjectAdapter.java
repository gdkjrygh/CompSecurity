// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterPhoneView

public final class  extends Binding
    implements MembersInjector
{

    private Binding device;
    private Binding landingService;
    private Binding progressController;
    private Binding userProvider;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/landing/EnterPhoneView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/landing/EnterPhoneView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/landing/EnterPhoneView, getClass().getClassLoader());
        landingService = linker.requestBinding("me.lyft.android.application.landing.ILandingService", me/lyft/android/ui/landing/EnterPhoneView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/landing/EnterPhoneView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(device);
        set1.add(userProvider);
        set1.add(progressController);
        set1.add(landingService);
        set1.add(viewErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EnterPhoneView)obj);
    }

    public void injectMembers(EnterPhoneView enterphoneview)
    {
        enterphoneview.device = (IDevice)device.get();
        enterphoneview.userProvider = (IUserProvider)userProvider.get();
        enterphoneview.progressController = (IProgressController)progressController.get();
        enterphoneview.landingService = (ILandingService)landingService.get();
        enterphoneview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.EnterPhoneView", false, me/lyft/android/ui/landing/EnterPhoneView);
    }
}
