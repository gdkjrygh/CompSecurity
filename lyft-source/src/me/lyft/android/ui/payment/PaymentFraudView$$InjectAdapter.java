// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.cardscan.ICardScanService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentFraudView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding cardScanService;
    private Binding messageBus;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/PaymentFraudView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/PaymentFraudView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/PaymentFraudView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/PaymentFraudView, getClass().getClassLoader());
        messageBus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/payment/PaymentFraudView, getClass().getClassLoader());
        cardScanService = linker.requestBinding("me.lyft.android.infrastructure.cardscan.ICardScanService", me/lyft/android/ui/payment/PaymentFraudView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/PaymentFraudView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(progressController);
        set1.add(paymentService);
        set1.add(paymentErrorHandler);
        set1.add(messageBus);
        set1.add(cardScanService);
        set1.add(userProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PaymentFraudView)obj);
    }

    public void injectMembers(PaymentFraudView paymentfraudview)
    {
        paymentfraudview.appFlow = (AppFlow)appFlow.get();
        paymentfraudview.progressController = (IProgressController)progressController.get();
        paymentfraudview.paymentService = (IPaymentService)paymentService.get();
        paymentfraudview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        paymentfraudview.messageBus = (MessageBus)messageBus.get();
        paymentfraudview.cardScanService = (ICardScanService)cardScanService.get();
        paymentfraudview.userProvider = (IUserProvider)userProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.PaymentFraudView", false, me/lyft/android/ui/payment/PaymentFraudView);
    }
}
