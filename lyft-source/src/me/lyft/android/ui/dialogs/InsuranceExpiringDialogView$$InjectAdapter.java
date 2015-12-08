// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            InsuranceExpiringDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding apiFacade;
    private Binding appFlow;
    private Binding driverDocumentsProvider;
    private Binding progressController;
    private Binding supertype;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/dialogs/InsuranceExpiringDialogView, getClass().getClassLoader());
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/dialogs/InsuranceExpiringDialogView, getClass().getClassLoader());
        apiFacade = linker.requestBinding("me.lyft.android.facades.ApiFacade", me/lyft/android/ui/dialogs/InsuranceExpiringDialogView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/dialogs/InsuranceExpiringDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/dialogs/InsuranceExpiringDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/dialogs/InsuranceExpiringDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(driverDocumentsProvider);
        set1.add(apiFacade);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((InsuranceExpiringDialogView)obj);
    }

    public void injectMembers(InsuranceExpiringDialogView insuranceexpiringdialogview)
    {
        insuranceexpiringdialogview.appFlow = (AppFlow)appFlow.get();
        insuranceexpiringdialogview.driverDocumentsProvider = (IDriverDocumentsProvider)driverDocumentsProvider.get();
        insuranceexpiringdialogview.apiFacade = (ApiFacade)apiFacade.get();
        insuranceexpiringdialogview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        insuranceexpiringdialogview.progressController = (IProgressController)progressController.get();
        supertype.injectMembers(insuranceexpiringdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.dialogs.InsuranceExpiringDialogView", false, me/lyft/android/ui/dialogs/InsuranceExpiringDialogView);
    }
}
