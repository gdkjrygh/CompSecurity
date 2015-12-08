// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentView

public final class vider extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding chargeAccountsProvider;
    private Binding messageBus;
    private Binding slideMenuController;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/PaymentView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/payment/PaymentView, getClass().getClassLoader());
        messageBus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/payment/PaymentView, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/payment/PaymentView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(slideMenuController);
        set1.add(messageBus);
        set1.add(chargeAccountsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PaymentView)obj);
    }

    public void injectMembers(PaymentView paymentview)
    {
        paymentview.appFlow = (AppFlow)appFlow.get();
        paymentview.slideMenuController = (SlideMenuController)slideMenuController.get();
        paymentview.messageBus = (MessageBus)messageBus.get();
        paymentview.chargeAccountsProvider = (IChargeAccountsProvider)chargeAccountsProvider.get();
    }

    public vider()
    {
        super(null, "members/me.lyft.android.ui.payment.PaymentView", false, me/lyft/android/ui/payment/PaymentView);
    }
}
