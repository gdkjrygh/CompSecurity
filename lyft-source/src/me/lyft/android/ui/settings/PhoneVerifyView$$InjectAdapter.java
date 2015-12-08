// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.settings.ISettingsService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.sms.IVerificationAutoFillService;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.settings:
//            PhoneVerifyView

public final class vice extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding phoneVerificationService;
    private Binding progressController;
    private Binding verificationAutoFillService;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        phoneVerificationService = linker.requestBinding("me.lyft.android.application.settings.ISettingsService", me/lyft/android/ui/settings/PhoneVerifyView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/settings/PhoneVerifyView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/settings/PhoneVerifyView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/settings/PhoneVerifyView, getClass().getClassLoader());
        verificationAutoFillService = linker.requestBinding("me.lyft.android.infrastructure.sms.IVerificationAutoFillService", me/lyft/android/ui/settings/PhoneVerifyView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(phoneVerificationService);
        set1.add(dialogFlow);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(verificationAutoFillService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PhoneVerifyView)obj);
    }

    public void injectMembers(PhoneVerifyView phoneverifyview)
    {
        phoneverifyview.phoneVerificationService = (ISettingsService)phoneVerificationService.get();
        phoneverifyview.dialogFlow = (DialogFlow)dialogFlow.get();
        phoneverifyview.progressController = (IProgressController)progressController.get();
        phoneverifyview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        phoneverifyview.verificationAutoFillService = (IVerificationAutoFillService)verificationAutoFillService.get();
    }

    public vice()
    {
        super(null, "members/me.lyft.android.ui.settings.PhoneVerifyView", false, me/lyft/android/ui/settings/PhoneVerifyView);
    }
}
