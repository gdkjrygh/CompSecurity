// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditPayPalView, IPaymentErrorHandler

public final class er extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding chargeAccountsProvider;
    private Binding dialogFlow;
    private Binding errorHandler;
    private Binding paymentService;
    private Binding progressController;

    public void attach(Linker linker)
    {
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/EditPayPalView, getClass().getClassLoader());
        errorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/EditPayPalView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/EditPayPalView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/payment/EditPayPalView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/EditPayPalView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/EditPayPalView, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/payment/EditPayPalView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(paymentService);
        set1.add(errorHandler);
        set1.add(progressController);
        set1.add(bus);
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(chargeAccountsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditPayPalView)obj);
    }

    public void injectMembers(EditPayPalView editpaypalview)
    {
        editpaypalview.paymentService = (IPaymentService)paymentService.get();
        editpaypalview.errorHandler = (IPaymentErrorHandler)errorHandler.get();
        editpaypalview.progressController = (IProgressController)progressController.get();
        editpaypalview.bus = (MessageBus)bus.get();
        editpaypalview.appFlow = (AppFlow)appFlow.get();
        editpaypalview.dialogFlow = (DialogFlow)dialogFlow.get();
        editpaypalview.chargeAccountsProvider = (IChargeAccountsProvider)chargeAccountsProvider.get();
    }

    public er()
    {
        super(null, "members/me.lyft.android.ui.payment.EditPayPalView", false, me/lyft/android/ui/payment/EditPayPalView);
    }
}
