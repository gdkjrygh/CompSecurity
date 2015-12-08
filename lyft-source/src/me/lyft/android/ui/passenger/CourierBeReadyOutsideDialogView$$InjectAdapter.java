// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger:
//            CourierBeReadyOutsideDialogView

public final class Q extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding supertype;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/CourierBeReadyOutsideDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/CourierBeReadyOutsideDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/CourierBeReadyOutsideDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CourierBeReadyOutsideDialogView)obj);
    }

    public void injectMembers(CourierBeReadyOutsideDialogView courierbereadyoutsidedialogview)
    {
        courierbereadyoutsidedialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        courierbereadyoutsidedialogview.bus = (MessageBus)bus.get();
        supertype.injectMembers(courierbereadyoutsidedialogview);
    }

    public Q()
    {
        super(null, "members/me.lyft.android.ui.passenger.CourierBeReadyOutsideDialogView", false, me/lyft/android/ui/passenger/CourierBeReadyOutsideDialogView);
    }
}
