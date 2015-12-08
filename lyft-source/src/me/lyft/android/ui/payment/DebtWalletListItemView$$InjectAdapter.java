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
//            DebtWalletListItemView, IPaymentErrorHandler

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
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/DebtWalletListItemView, getClass().getClassLoader());
        errorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/DebtWalletListItemView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/DebtWalletListItemView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/DebtWalletListItemView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/DebtWalletListItemView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/DebtWalletListItemView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.DebtListItemView", me/lyft/android/ui/payment/DebtWalletListItemView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(paymentService);
        set1.add(errorHandler);
        set1.add(appFlow);
        set1.add(progressController);
        set1.add(dialogFlow);
        set1.add(userProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DebtWalletListItemView)obj);
    }

    public void injectMembers(DebtWalletListItemView debtwalletlistitemview)
    {
        debtwalletlistitemview.paymentService = (IPaymentService)paymentService.get();
        debtwalletlistitemview.errorHandler = (IPaymentErrorHandler)errorHandler.get();
        debtwalletlistitemview.appFlow = (AppFlow)appFlow.get();
        debtwalletlistitemview.progressController = (IProgressController)progressController.get();
        debtwalletlistitemview.dialogFlow = (DialogFlow)dialogFlow.get();
        debtwalletlistitemview.userProvider = (IUserProvider)userProvider.get();
        supertype.injectMembers(debtwalletlistitemview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.DebtWalletListItemView", false, me/lyft/android/ui/payment/DebtWalletListItemView);
    }
}
