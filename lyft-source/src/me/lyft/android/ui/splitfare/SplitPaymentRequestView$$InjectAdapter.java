// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitPaymentRequestView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding chargeAccountsProvider;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding imageLoader;
    private Binding progressController;
    private Binding splitFareRequestRepository;
    private Binding splitFareService;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
        splitFareService = linker.requestBinding("me.lyft.android.infrastructure.splitfare.ISplitFareService", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
        splitFareRequestRepository = linker.requestBinding("me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository", me/lyft/android/ui/splitfare/SplitPaymentRequestView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(constantsProvider);
        set1.add(viewErrorHandler);
        set1.add(imageLoader);
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(progressController);
        set1.add(chargeAccountsProvider);
        set1.add(splitFareService);
        set1.add(splitFareRequestRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SplitPaymentRequestView)obj);
    }

    public void injectMembers(SplitPaymentRequestView splitpaymentrequestview)
    {
        splitpaymentrequestview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        splitpaymentrequestview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        splitpaymentrequestview.imageLoader = (ImageLoader)imageLoader.get();
        splitpaymentrequestview.appFlow = (AppFlow)appFlow.get();
        splitpaymentrequestview.dialogFlow = (DialogFlow)dialogFlow.get();
        splitpaymentrequestview.progressController = (IProgressController)progressController.get();
        splitpaymentrequestview.chargeAccountsProvider = (IChargeAccountsProvider)chargeAccountsProvider.get();
        splitpaymentrequestview.splitFareService = (ISplitFareService)splitFareService.get();
        splitpaymentrequestview.splitFareRequestRepository = (ISplitFareRequestRepository)splitFareRequestRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.splitfare.SplitPaymentRequestView", false, me/lyft/android/ui/splitfare/SplitPaymentRequestView);
    }
}
