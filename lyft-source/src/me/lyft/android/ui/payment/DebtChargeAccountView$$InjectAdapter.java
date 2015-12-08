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
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtChargeAccountView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/DebtChargeAccountView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/DebtChargeAccountView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/DebtChargeAccountView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/DebtChargeAccountView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/DebtChargeAccountView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/DebtChargeAccountView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(progressController);
        set1.add(paymentService);
        set1.add(paymentErrorHandler);
        set1.add(userProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DebtChargeAccountView)obj);
    }

    public void injectMembers(DebtChargeAccountView debtchargeaccountview)
    {
        debtchargeaccountview.appFlow = (AppFlow)appFlow.get();
        debtchargeaccountview.dialogFlow = (DialogFlow)dialogFlow.get();
        debtchargeaccountview.progressController = (IProgressController)progressController.get();
        debtchargeaccountview.paymentService = (IPaymentService)paymentService.get();
        debtchargeaccountview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        debtchargeaccountview.userProvider = (IUserProvider)userProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.DebtChargeAccountView", false, me/lyft/android/ui/payment/DebtChargeAccountView);
    }
}
