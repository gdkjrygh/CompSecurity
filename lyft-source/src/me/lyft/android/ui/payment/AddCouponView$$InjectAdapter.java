// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCouponView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding messageBus;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;

    public void attach(Linker linker)
    {
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/AddCouponView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/AddCouponView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/AddCouponView, getClass().getClassLoader());
        messageBus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/payment/AddCouponView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/AddCouponView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(paymentErrorHandler);
        set1.add(dialogFlow);
        set1.add(paymentService);
        set1.add(messageBus);
        set1.add(progressController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AddCouponView)obj);
    }

    public void injectMembers(AddCouponView addcouponview)
    {
        addcouponview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        addcouponview.dialogFlow = (DialogFlow)dialogFlow.get();
        addcouponview.paymentService = (IPaymentService)paymentService.get();
        addcouponview.messageBus = (MessageBus)messageBus.get();
        addcouponview.progressController = (IProgressController)progressController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.AddCouponView", false, me/lyft/android/ui/payment/AddCouponView);
    }
}
