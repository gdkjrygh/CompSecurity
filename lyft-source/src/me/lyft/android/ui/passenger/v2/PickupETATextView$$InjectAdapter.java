// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PickupETATextView, PickupETAPresenter

public final class  extends Binding
    implements MembersInjector
{

    private Binding pickupETAController;

    public void attach(Linker linker)
    {
        pickupETAController = linker.requestBinding("me.lyft.android.ui.passenger.v2.PickupETAPresenter", me/lyft/android/ui/passenger/v2/PickupETATextView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(pickupETAController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PickupETATextView)obj);
    }

    public void injectMembers(PickupETATextView pickupetatextview)
    {
        pickupetatextview.pickupETAController = (PickupETAPresenter)pickupETAController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.v2.PickupETATextView", false, me/lyft/android/ui/passenger/v2/PickupETATextView);
    }
}
