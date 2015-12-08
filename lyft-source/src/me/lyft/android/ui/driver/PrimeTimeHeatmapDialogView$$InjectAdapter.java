// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.driver:
//            PrimeTimeHeatmapDialogView

public final class I extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding routeProvider;
    private Binding supertype;

    public void attach(Linker linker)
    {
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/PrimeTimeHeatmapDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/PrimeTimeHeatmapDialogView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/PrimeTimeHeatmapDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/PrimeTimeHeatmapDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(bus);
        set1.add(dialogFlow);
        set1.add(routeProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PrimeTimeHeatmapDialogView)obj);
    }

    public void injectMembers(PrimeTimeHeatmapDialogView primetimeheatmapdialogview)
    {
        primetimeheatmapdialogview.bus = (MessageBus)bus.get();
        primetimeheatmapdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        primetimeheatmapdialogview.routeProvider = (IDriverRideProvider)routeProvider.get();
        supertype.injectMembers(primetimeheatmapdialogview);
    }

    public I()
    {
        super(null, "members/me.lyft.android.ui.driver.PrimeTimeHeatmapDialogView", false, me/lyft/android/ui/driver/PrimeTimeHeatmapDialogView);
    }
}
