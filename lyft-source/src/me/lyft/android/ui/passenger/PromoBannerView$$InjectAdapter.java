// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PromoBannerView

public final class A extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding deepLinkManager;
    private Binding dialogFlow;
    private Binding rideRequestSession;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PromoBannerView, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/PromoBannerView, getClass().getClassLoader());
        deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/ui/passenger/PromoBannerView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PromoBannerView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PromoBannerView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userSession);
        set1.add(rideRequestSession);
        set1.add(deepLinkManager);
        set1.add(dialogFlow);
        set1.add(bus);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PromoBannerView)obj);
    }

    public void injectMembers(PromoBannerView promobannerview)
    {
        promobannerview.userSession = (IUserSession)userSession.get();
        promobannerview.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        promobannerview.deepLinkManager = (DeepLinkManager)deepLinkManager.get();
        promobannerview.dialogFlow = (DialogFlow)dialogFlow.get();
        promobannerview.bus = (MessageBus)bus.get();
    }

    public A()
    {
        super(null, "members/me.lyft.android.ui.passenger.PromoBannerView", false, me/lyft/android/ui/passenger/PromoBannerView);
    }
}
