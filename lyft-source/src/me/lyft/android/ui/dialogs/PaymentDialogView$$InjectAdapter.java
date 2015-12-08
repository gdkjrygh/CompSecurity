// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.payment.PaymentService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.payment.IPaymentErrorHandler;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            PaymentDialogView

public final class A extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding messageBus;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;
    private Binding supertype;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/dialogs/PaymentDialogView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.PaymentService", me/lyft/android/ui/dialogs/PaymentDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/dialogs/PaymentDialogView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/dialogs/PaymentDialogView, getClass().getClassLoader());
        messageBus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/dialogs/PaymentDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/dialogs/PaymentDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(paymentService);
        set1.add(progressController);
        set1.add(paymentErrorHandler);
        set1.add(messageBus);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PaymentDialogView)obj);
    }

    public void injectMembers(PaymentDialogView paymentdialogview)
    {
        paymentdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        paymentdialogview.paymentService = (PaymentService)paymentService.get();
        paymentdialogview.progressController = (IProgressController)progressController.get();
        paymentdialogview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        paymentdialogview.messageBus = (MessageBus)messageBus.get();
        supertype.injectMembers(paymentdialogview);
    }

    public A()
    {
        super(null, "members/me.lyft.android.ui.dialogs.PaymentDialogView", false, me/lyft/android/ui/dialogs/PaymentDialogView);
    }
}
