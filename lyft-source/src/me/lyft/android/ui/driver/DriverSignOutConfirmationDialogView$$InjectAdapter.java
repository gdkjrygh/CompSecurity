// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverSignOutConfirmationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding apiFacade;
    private Binding dialogFlow;
    private Binding progressController;
    private Binding supertype;
    private Binding userSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverSignOutConfirmationDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/DriverSignOutConfirmationDialogView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/driver/DriverSignOutConfirmationDialogView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/driver/DriverSignOutConfirmationDialogView, getClass().getClassLoader());
        apiFacade = linker.requestBinding("me.lyft.android.facades.ApiFacade", me/lyft/android/ui/driver/DriverSignOutConfirmationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/DriverSignOutConfirmationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(userSession);
        set1.add(apiFacade);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverSignOutConfirmationDialogView)obj);
    }

    public void injectMembers(DriverSignOutConfirmationDialogView driversignoutconfirmationdialogview)
    {
        driversignoutconfirmationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        driversignoutconfirmationdialogview.progressController = (IProgressController)progressController.get();
        driversignoutconfirmationdialogview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        driversignoutconfirmationdialogview.userSession = (IUserSession)userSession.get();
        driversignoutconfirmationdialogview.apiFacade = (ApiFacade)apiFacade.get();
        supertype.injectMembers(driversignoutconfirmationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverSignOutConfirmationDialogView", false, me/lyft/android/ui/driver/DriverSignOutConfirmationDialogView);
    }
}
