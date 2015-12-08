// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.assets.IAssetLoadingService;

// Referenced classes of package me.lyft.android.ui.passenger:
//            RideTypeInfoDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding assetLoadingService;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding rideTypeProvider;
    private Binding supertype;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/RideTypeInfoDialogView, getClass().getClassLoader());
        rideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/ui/passenger/RideTypeInfoDialogView, getClass().getClassLoader());
        assetLoadingService = linker.requestBinding("me.lyft.android.infrastructure.assets.IAssetLoadingService", me/lyft/android/ui/passenger/RideTypeInfoDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/RideTypeInfoDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/RideTypeInfoDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(constantsProvider);
        set1.add(rideTypeProvider);
        set1.add(assetLoadingService);
        set1.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((RideTypeInfoDialogView)obj);
    }

    public void injectMembers(RideTypeInfoDialogView ridetypeinfodialogview)
    {
        ridetypeinfodialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        ridetypeinfodialogview.rideTypeProvider = (IRequestRideTypeProvider)rideTypeProvider.get();
        ridetypeinfodialogview.assetLoadingService = (IAssetLoadingService)assetLoadingService.get();
        ridetypeinfodialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        supertype.injectMembers(ridetypeinfodialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.RideTypeInfoDialogView", false, me/lyft/android/ui/passenger/RideTypeInfoDialogView);
    }
}
