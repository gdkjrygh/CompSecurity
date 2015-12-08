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
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.payment:
//            ConcurSendRideReceiptsView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding dialogFlow;
    private Binding expenseNoteSession;
    private Binding paymentService;
    private Binding progressController;
    private Binding userProvider;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/ConcurSendRideReceiptsView, getClass().getClassLoader());
        paymentService = linker.requestBinding("me.lyft.android.application.payment.IPaymentService", me/lyft/android/ui/payment/ConcurSendRideReceiptsView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/payment/ConcurSendRideReceiptsView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/ConcurSendRideReceiptsView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/ConcurSendRideReceiptsView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/payment/ConcurSendRideReceiptsView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/ConcurSendRideReceiptsView, getClass().getClassLoader());
        expenseNoteSession = linker.requestBinding("me.lyft.android.application.ride.IExpenseNoteSession", me/lyft/android/ui/payment/ConcurSendRideReceiptsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userProvider);
        set1.add(paymentService);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(appFlow);
        set1.add(expenseNoteSession);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ConcurSendRideReceiptsView)obj);
    }

    public void injectMembers(ConcurSendRideReceiptsView concursendridereceiptsview)
    {
        concursendridereceiptsview.userProvider = (IUserProvider)userProvider.get();
        concursendridereceiptsview.paymentService = (IPaymentService)paymentService.get();
        concursendridereceiptsview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        concursendridereceiptsview.progressController = (IProgressController)progressController.get();
        concursendridereceiptsview.dialogFlow = (DialogFlow)dialogFlow.get();
        concursendridereceiptsview.bus = (MessageBus)bus.get();
        concursendridereceiptsview.appFlow = (AppFlow)appFlow.get();
        concursendridereceiptsview.expenseNoteSession = (IExpenseNoteSession)expenseNoteSession.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.ConcurSendRideReceiptsView", false, me/lyft/android/ui/payment/ConcurSendRideReceiptsView);
    }
}
