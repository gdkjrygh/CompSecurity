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
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditCreditLineView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;

    public void attach(Linker linker)
    {
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/EditCreditLineView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/EditCreditLineView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/EditCreditLineView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/EditCreditLineView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(progressController);
        set1.add(paymentService);
        set1.add(paymentErrorHandler);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditCreditLineView)obj);
    }

    public void injectMembers(EditCreditLineView editcreditlineview)
    {
        editcreditlineview.progressController = (IProgressController)progressController.get();
        editcreditlineview.paymentService = (IPaymentService)paymentService.get();
        editcreditlineview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        editcreditlineview.appFlow = (AppFlow)appFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.EditCreditLineView", false, me/lyft/android/ui/payment/EditCreditLineView);
    }
}
