// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddChargeAccountView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;

    public void attach(Linker linker)
    {
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/AddChargeAccountView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/AddChargeAccountView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/AddChargeAccountView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(paymentService);
        set1.add(paymentErrorHandler);
        set1.add(progressController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AddChargeAccountView)obj);
    }

    public void injectMembers(AddChargeAccountView addchargeaccountview)
    {
        addchargeaccountview.paymentService = (IPaymentService)paymentService.get();
        addchargeaccountview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        addchargeaccountview.progressController = (IProgressController)progressController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.AddChargeAccountView", false, me/lyft/android/ui/payment/AddChargeAccountView);
    }
}
