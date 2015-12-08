// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PartySizePickerDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding rideRequestSession;
    private Binding supertype;
    private Binding userSession;

    public void attach(Linker linker)
    {
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PartySizePickerDialogView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PartySizePickerDialogView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PartySizePickerDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PartySizePickerDialogView, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/PartySizePickerDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/PartySizePickerDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(bus);
        set1.add(userSession);
        set1.add(constantsProvider);
        set1.add(dialogFlow);
        set1.add(rideRequestSession);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PartySizePickerDialogView)obj);
    }

    public void injectMembers(PartySizePickerDialogView partysizepickerdialogview)
    {
        partysizepickerdialogview.bus = (MessageBus)bus.get();
        partysizepickerdialogview.userSession = (IUserSession)userSession.get();
        partysizepickerdialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        partysizepickerdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        partysizepickerdialogview.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        supertype.injectMembers(partysizepickerdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PartySizePickerDialogView", false, me/lyft/android/ui/passenger/PartySizePickerDialogView);
    }
}
