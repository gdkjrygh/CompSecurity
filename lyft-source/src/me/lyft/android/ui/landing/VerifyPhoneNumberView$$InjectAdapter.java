// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.sms.IVerificationAutoFillService;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.landing:
//            VerifyPhoneNumberView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding landingService;
    private Binding progressController;
    private Binding verificationAutoFillService;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/landing/VerifyPhoneNumberView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/landing/VerifyPhoneNumberView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/landing/VerifyPhoneNumberView, getClass().getClassLoader());
        landingService = linker.requestBinding("me.lyft.android.application.landing.ILandingService", me/lyft/android/ui/landing/VerifyPhoneNumberView, getClass().getClassLoader());
        verificationAutoFillService = linker.requestBinding("me.lyft.android.infrastructure.sms.IVerificationAutoFillService", me/lyft/android/ui/landing/VerifyPhoneNumberView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(landingService);
        set1.add(verificationAutoFillService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((VerifyPhoneNumberView)obj);
    }

    public void injectMembers(VerifyPhoneNumberView verifyphonenumberview)
    {
        verifyphonenumberview.dialogFlow = (DialogFlow)dialogFlow.get();
        verifyphonenumberview.progressController = (IProgressController)progressController.get();
        verifyphonenumberview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        verifyphonenumberview.landingService = (ILandingService)landingService.get();
        verifyphonenumberview.verificationAutoFillService = (IVerificationAutoFillService)verificationAutoFillService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.VerifyPhoneNumberView", false, me/lyft/android/ui/landing/VerifyPhoneNumberView);
    }
}
