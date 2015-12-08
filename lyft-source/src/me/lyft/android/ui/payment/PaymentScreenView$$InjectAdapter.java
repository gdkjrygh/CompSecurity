// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentScreenView

public final class A extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding slideMenuController;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/PaymentScreenView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/payment/PaymentScreenView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PaymentScreenView)obj);
    }

    public void injectMembers(PaymentScreenView paymentscreenview)
    {
        paymentscreenview.appFlow = (AppFlow)appFlow.get();
        paymentscreenview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public A()
    {
        super(null, "members/me.lyft.android.ui.payment.PaymentScreenView", false, me/lyft/android/ui/payment/PaymentScreenView);
    }
}
