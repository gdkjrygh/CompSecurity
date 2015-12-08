// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.payment.PaymentService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddPayPalPaymentItemView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding messageBus;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;
    private Binding supertype;

    public void attach(Linker linker)
    {
        paymentService = linker.requestBinding("me.lyft.android.application.payment.PaymentService", me/lyft/android/ui/payment/AddPayPalPaymentItemView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/AddPayPalPaymentItemView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/AddPayPalPaymentItemView, getClass().getClassLoader());
        messageBus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/payment/AddPayPalPaymentItemView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.PaymentListItemView", me/lyft/android/ui/payment/AddPayPalPaymentItemView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(paymentService);
        set1.add(progressController);
        set1.add(paymentErrorHandler);
        set1.add(messageBus);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AddPayPalPaymentItemView)obj);
    }

    public void injectMembers(AddPayPalPaymentItemView addpaypalpaymentitemview)
    {
        addpaypalpaymentitemview.paymentService = (PaymentService)paymentService.get();
        addpaypalpaymentitemview.progressController = (IProgressController)progressController.get();
        addpaypalpaymentitemview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        addpaypalpaymentitemview.messageBus = (MessageBus)messageBus.get();
        supertype.injectMembers(addpaypalpaymentitemview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.AddPayPalPaymentItemView", false, me/lyft/android/ui/payment/AddPayPalPaymentItemView);
    }
}
