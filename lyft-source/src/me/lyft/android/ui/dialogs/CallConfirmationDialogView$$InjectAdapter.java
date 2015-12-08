// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.utils.Telephony;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            CallConfirmationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding routeProvider;
    private Binding supertype;
    private Binding telephony;

    public void attach(Linker linker)
    {
        telephony = linker.requestBinding("me.lyft.android.utils.Telephony", me/lyft/android/ui/dialogs/CallConfirmationDialogView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/dialogs/CallConfirmationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/dialogs/CallConfirmationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(telephony);
        set1.add(routeProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CallConfirmationDialogView)obj);
    }

    public void injectMembers(CallConfirmationDialogView callconfirmationdialogview)
    {
        callconfirmationdialogview.telephony = (Telephony)telephony.get();
        callconfirmationdialogview.routeProvider = (IDriverRideProvider)routeProvider.get();
        supertype.injectMembers(callconfirmationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.dialogs.CallConfirmationDialogView", false, me/lyft/android/ui/dialogs/CallConfirmationDialogView);
    }
}
