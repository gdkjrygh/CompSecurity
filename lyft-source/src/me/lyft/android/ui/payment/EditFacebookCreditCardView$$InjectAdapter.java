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
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditFacebookCreditCardView, IPaymentErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding errorHandler;
    private Binding paymentService;
    private Binding progressController;

    public void attach(Linker linker)
    {
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/EditFacebookCreditCardView, getClass().getClassLoader());
        errorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/payment/EditFacebookCreditCardView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/EditFacebookCreditCardView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/EditFacebookCreditCardView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/EditFacebookCreditCardView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(paymentService);
        set1.add(errorHandler);
        set1.add(progressController);
        set1.add(appFlow);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditFacebookCreditCardView)obj);
    }

    public void injectMembers(EditFacebookCreditCardView editfacebookcreditcardview)
    {
        editfacebookcreditcardview.paymentService = (IPaymentService)paymentService.get();
        editfacebookcreditcardview.errorHandler = (IPaymentErrorHandler)errorHandler.get();
        editfacebookcreditcardview.progressController = (IProgressController)progressController.get();
        editfacebookcreditcardview.appFlow = (AppFlow)appFlow.get();
        editfacebookcreditcardview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.EditFacebookCreditCardView", false, me/lyft/android/ui/payment/EditFacebookCreditCardView);
    }
}
