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
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger:
//            TipDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding checkoutSession;
    private Binding dialogFlow;
    private Binding supertype;
    private Binding userSession;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/TipDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/TipDialogView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/TipDialogView, getClass().getClassLoader());
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/ui/passenger/TipDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/TipDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(userSession);
        set1.add(checkoutSession);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((TipDialogView)obj);
    }

    public void injectMembers(TipDialogView tipdialogview)
    {
        tipdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        tipdialogview.bus = (MessageBus)bus.get();
        tipdialogview.userSession = (IUserSession)userSession.get();
        tipdialogview.checkoutSession = (ICheckoutSession)checkoutSession.get();
        supertype.injectMembers(tipdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.TipDialogView", false, me/lyft/android/ui/passenger/TipDialogView);
    }
}
