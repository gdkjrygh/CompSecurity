// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.driver:
//            NoShowConfirmationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding lyftPreferences;
    private Binding routeProvider;
    private Binding supertype;

    public void attach(Linker linker)
    {
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/NoShowConfirmationDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/NoShowConfirmationDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/NoShowConfirmationDialogView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/driver/NoShowConfirmationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/NoShowConfirmationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(routeProvider);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(lyftPreferences);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((NoShowConfirmationDialogView)obj);
    }

    public void injectMembers(NoShowConfirmationDialogView noshowconfirmationdialogview)
    {
        noshowconfirmationdialogview.routeProvider = (IDriverRideProvider)routeProvider.get();
        noshowconfirmationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        noshowconfirmationdialogview.bus = (MessageBus)bus.get();
        noshowconfirmationdialogview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        supertype.injectMembers(noshowconfirmationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.NoShowConfirmationDialogView", false, me/lyft/android/ui/driver/NoShowConfirmationDialogView);
    }
}
