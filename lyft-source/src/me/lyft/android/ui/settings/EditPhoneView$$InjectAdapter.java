// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.settings.ISettingsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.settings:
//            EditPhoneView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding defaultErrorHandler;
    private Binding dialogFlow;
    private Binding phoneVerificationService;
    private Binding progressController;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/settings/EditPhoneView, getClass().getClassLoader());
        phoneVerificationService = linker.requestBinding("me.lyft.android.application.settings.ISettingsService", me/lyft/android/ui/settings/EditPhoneView, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/settings/EditPhoneView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/EditPhoneView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/settings/EditPhoneView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/settings/EditPhoneView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userProvider);
        set1.add(phoneVerificationService);
        set1.add(defaultErrorHandler);
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(progressController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditPhoneView)obj);
    }

    public void injectMembers(EditPhoneView editphoneview)
    {
        editphoneview.userProvider = (IUserProvider)userProvider.get();
        editphoneview.phoneVerificationService = (ISettingsService)phoneVerificationService.get();
        editphoneview.defaultErrorHandler = (IDefaultErrorHandler)defaultErrorHandler.get();
        editphoneview.appFlow = (AppFlow)appFlow.get();
        editphoneview.dialogFlow = (DialogFlow)dialogFlow.get();
        editphoneview.progressController = (IProgressController)progressController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.settings.EditPhoneView", false, me/lyft/android/ui/settings/EditPhoneView);
    }
}
