// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.payment.IPaymentErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            EditDebitCardView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding expressPayRepository;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/expresspay/EditDebitCardView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/expresspay/EditDebitCardView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/driver/expresspay/EditDebitCardView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/driver/expresspay/EditDebitCardView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/driver/expresspay/EditDebitCardView, getClass().getClassLoader());
        expressPayRepository = linker.requestBinding("me.lyft.android.application.driver.expresspay.IExpressPayRepository", me/lyft/android/ui/driver/expresspay/EditDebitCardView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/expresspay/EditDebitCardView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(paymentService);
        set1.add(constantsProvider);
        set1.add(paymentErrorHandler);
        set1.add(expressPayRepository);
        set1.add(progressController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditDebitCardView)obj);
    }

    public void injectMembers(EditDebitCardView editdebitcardview)
    {
        editdebitcardview.appFlow = (AppFlow)appFlow.get();
        editdebitcardview.dialogFlow = (DialogFlow)dialogFlow.get();
        editdebitcardview.paymentService = (IPaymentService)paymentService.get();
        editdebitcardview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        editdebitcardview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        editdebitcardview.expressPayRepository = (IExpressPayRepository)expressPayRepository.get();
        editdebitcardview.progressController = (IProgressController)progressController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.expresspay.EditDebitCardView", false, me/lyft/android/ui/driver/expresspay/EditDebitCardView);
    }
}
