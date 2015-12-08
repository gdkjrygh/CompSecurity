// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverEndRideConfirmationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding routeProvider;
    private Binding supertype;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverEndRideConfirmationDialogView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/DriverEndRideConfirmationDialogView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/driver/DriverEndRideConfirmationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/DriverEndRideConfirmationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(routeProvider);
        set1.add(constantsProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverEndRideConfirmationDialogView)obj);
    }

    public void injectMembers(DriverEndRideConfirmationDialogView driverendrideconfirmationdialogview)
    {
        driverendrideconfirmationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        driverendrideconfirmationdialogview.routeProvider = (IDriverRideProvider)routeProvider.get();
        driverendrideconfirmationdialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        supertype.injectMembers(driverendrideconfirmationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverEndRideConfirmationDialogView", false, me/lyft/android/ui/driver/DriverEndRideConfirmationDialogView);
    }
}
