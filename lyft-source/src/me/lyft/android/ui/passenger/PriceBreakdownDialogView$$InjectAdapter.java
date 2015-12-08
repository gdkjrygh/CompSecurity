// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PriceBreakdownDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding checkoutSession;
    private Binding dialogFlow;
    private Binding fareRepository;
    private Binding splitFareStateRepository;
    private Binding supertype;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PriceBreakdownDialogView, getClass().getClassLoader());
        fareRepository = linker.requestBinding("me.lyft.android.application.ride.IRideFareRepository", me/lyft/android/ui/passenger/PriceBreakdownDialogView, getClass().getClassLoader());
        splitFareStateRepository = linker.requestBinding("me.lyft.android.application.splitfare.ISplitFareStateRepository", me/lyft/android/ui/passenger/PriceBreakdownDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PriceBreakdownDialogView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PriceBreakdownDialogView, getClass().getClassLoader());
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/ui/passenger/PriceBreakdownDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/PriceBreakdownDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userSession);
        set1.add(fareRepository);
        set1.add(splitFareStateRepository);
        set1.add(dialogFlow);
        set1.add(appFlow);
        set1.add(checkoutSession);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PriceBreakdownDialogView)obj);
    }

    public void injectMembers(PriceBreakdownDialogView pricebreakdowndialogview)
    {
        pricebreakdowndialogview.userSession = (IUserSession)userSession.get();
        pricebreakdowndialogview.fareRepository = (IRideFareRepository)fareRepository.get();
        pricebreakdowndialogview.splitFareStateRepository = (ISplitFareStateRepository)splitFareStateRepository.get();
        pricebreakdowndialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        pricebreakdowndialogview.appFlow = (AppFlow)appFlow.get();
        pricebreakdowndialogview.checkoutSession = (ICheckoutSession)checkoutSession.get();
        supertype.injectMembers(pricebreakdowndialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PriceBreakdownDialogView", false, me/lyft/android/ui/passenger/PriceBreakdownDialogView);
    }
}
