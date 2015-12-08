// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.ui.invites:
//            BottomSheetDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding activityController;
    private Binding constantsProvider;
    private Binding device;
    private Binding dialogFlow;
    private Binding userSession;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/invites/BottomSheetDialogView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/invites/BottomSheetDialogView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/invites/BottomSheetDialogView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/invites/BottomSheetDialogView, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/invites/BottomSheetDialogView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(activityController);
        set1.add(userSession);
        set1.add(constantsProvider);
        set1.add(device);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((BottomSheetDialogView)obj);
    }

    public void injectMembers(BottomSheetDialogView bottomsheetdialogview)
    {
        bottomsheetdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        bottomsheetdialogview.activityController = (ActivityController)activityController.get();
        bottomsheetdialogview.userSession = (IUserSession)userSession.get();
        bottomsheetdialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        bottomsheetdialogview.device = (IDevice)device.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.invites.BottomSheetDialogView", false, me/lyft/android/ui/invites/BottomSheetDialogView);
    }
}
