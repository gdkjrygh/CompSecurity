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
//            DebtCreditCardListItemView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding errorHandler;
    private Binding paymentService;
    private Binding progressController;
    private Binding supertype;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/DebtCreditCardListItemView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/DebtCreditCardListItemView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/DebtCreditCardListItemView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/DebtCreditCardListItemView, getClass().getClassLoader());
        errorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/DebtCreditCardListItemView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/DebtCreditCardListItemView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.DebtListItemView", me/lyft/android/ui/payment/DebtCreditCardListItemView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(userProvider);
        set1.add(progressController);
        set1.add(paymentService);
        set1.add(errorHandler);
        set1.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DebtCreditCardListItemView)obj);
    }

    public void injectMembers(DebtCreditCardListItemView debtcreditcardlistitemview)
    {
        debtcreditcardlistitemview.appFlow = (AppFlow)appFlow.get();
        debtcreditcardlistitemview.userProvider = (IUserProvider)userProvider.get();
        debtcreditcardlistitemview.progressController = (IProgressController)progressController.get();
        debtcreditcardlistitemview.paymentService = (IPaymentService)paymentService.get();
        debtcreditcardlistitemview.errorHandler = (IPaymentErrorHandler)errorHandler.get();
        debtcreditcardlistitemview.dialogFlow = (DialogFlow)dialogFlow.get();
        supertype.injectMembers(debtcreditcardlistitemview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.DebtCreditCardListItemView", false, me/lyft/android/ui/payment/DebtCreditCardListItemView);
    }
}
