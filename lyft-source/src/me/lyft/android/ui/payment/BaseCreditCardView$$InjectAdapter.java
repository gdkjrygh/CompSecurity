// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            BaseCreditCardView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding dialogFlow;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/BaseCreditCardView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/BaseCreditCardView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/payment/BaseCreditCardView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/BaseCreditCardView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/BaseCreditCardView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/BaseCreditCardView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(paymentService);
        set1.add(paymentErrorHandler);
        set1.add(progressController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((BaseCreditCardView)obj);
    }

    public void injectMembers(BaseCreditCardView basecreditcardview)
    {
        basecreditcardview.appFlow = (AppFlow)appFlow.get();
        basecreditcardview.dialogFlow = (DialogFlow)dialogFlow.get();
        basecreditcardview.bus = (MessageBus)bus.get();
        basecreditcardview.paymentService = (IPaymentService)paymentService.get();
        basecreditcardview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        basecreditcardview.progressController = (IProgressController)progressController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.BaseCreditCardView", false, me/lyft/android/ui/payment/BaseCreditCardView);
    }
}
