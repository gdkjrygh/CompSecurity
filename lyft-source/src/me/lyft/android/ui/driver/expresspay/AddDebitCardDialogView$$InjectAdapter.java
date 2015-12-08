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
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.payment.IPaymentErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            AddDebitCardDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding expressPayRepository;
    private Binding paymentErrorHandler;
    private Binding paymentService;
    private Binding progressController;
    private Binding supertype;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/expresspay/AddDebitCardDialogView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/driver/expresspay/AddDebitCardDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/expresspay/AddDebitCardDialogView, getClass().getClassLoader());
        paymentErrorHandler = linker.requestBinding("me.lyft.android.ui.payment.IPaymentErrorHandler", me/lyft/android/ui/driver/expresspay/AddDebitCardDialogView, getClass().getClassLoader());
        expressPayRepository = linker.requestBinding("me.lyft.android.application.driver.expresspay.IExpressPayRepository", me/lyft/android/ui/driver/expresspay/AddDebitCardDialogView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/driver/expresspay/AddDebitCardDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/expresspay/AddDebitCardDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(paymentService);
        set1.add(progressController);
        set1.add(paymentErrorHandler);
        set1.add(expressPayRepository);
        set1.add(constantsProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AddDebitCardDialogView)obj);
    }

    public void injectMembers(AddDebitCardDialogView adddebitcarddialogview)
    {
        adddebitcarddialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        adddebitcarddialogview.paymentService = (IPaymentService)paymentService.get();
        adddebitcarddialogview.progressController = (IProgressController)progressController.get();
        adddebitcarddialogview.paymentErrorHandler = (IPaymentErrorHandler)paymentErrorHandler.get();
        adddebitcarddialogview.expressPayRepository = (IExpressPayRepository)expressPayRepository.get();
        adddebitcarddialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        supertype.injectMembers(adddebitcarddialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.expresspay.AddDebitCardDialogView", false, me/lyft/android/ui/driver/expresspay/AddDebitCardDialogView);
    }
}
