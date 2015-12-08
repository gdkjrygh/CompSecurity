// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.payment:
//            ConcurView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding expenseNoteSession;
    private Binding lyftPreferences;
    private Binding progressController;
    private Binding signUrlService;
    private Binding userProvider;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        signUrlService = linker.requestBinding("me.lyft.android.application.settings.ISignUrlService", me/lyft/android/ui/payment/ConcurView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/payment/ConcurView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/payment/ConcurView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/ConcurView, getClass().getClassLoader());
        expenseNoteSession = linker.requestBinding("me.lyft.android.application.ride.IExpenseNoteSession", me/lyft/android/ui/payment/ConcurView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/payment/ConcurView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/ConcurView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(signUrlService);
        set1.add(progressController);
        set1.add(lyftPreferences);
        set1.add(userProvider);
        set1.add(expenseNoteSession);
        set1.add(viewErrorHandler);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ConcurView)obj);
    }

    public void injectMembers(ConcurView concurview)
    {
        concurview.signUrlService = (ISignUrlService)signUrlService.get();
        concurview.progressController = (IProgressController)progressController.get();
        concurview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        concurview.userProvider = (IUserProvider)userProvider.get();
        concurview.expenseNoteSession = (IExpenseNoteSession)expenseNoteSession.get();
        concurview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        concurview.appFlow = (AppFlow)appFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.ConcurView", false, me/lyft/android/ui/payment/ConcurView);
    }
}
