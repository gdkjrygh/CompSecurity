// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationView, SetDestinationPresenter

public final class  extends Binding
    implements MembersInjector
{

    private Binding setDestinationPresenter;

    public void attach(Linker linker)
    {
        setDestinationPresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.destination.SetDestinationPresenter", me/lyft/android/ui/passenger/v2/destination/SetDestinationView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(setDestinationPresenter);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SetDestinationView)obj);
    }

    public void injectMembers(SetDestinationView setdestinationview)
    {
        setdestinationview.setDestinationPresenter = (SetDestinationPresenter)setDestinationPresenter.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.v2.destination.SetDestinationView", false, me/lyft/android/ui/passenger/v2/destination/SetDestinationView);
    }
}
