// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.flows.ProfileFlow;

// Referenced classes of package me.lyft.android.ui:
//            PassengerPhotoView

public final class  extends Binding
    implements MembersInjector
{

    private Binding profileFlow;

    public void attach(Linker linker)
    {
        profileFlow = linker.requestBinding("me.lyft.android.flows.ProfileFlow", me/lyft/android/ui/PassengerPhotoView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(profileFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerPhotoView)obj);
    }

    public void injectMembers(PassengerPhotoView passengerphotoview)
    {
        passengerphotoview.profileFlow = (ProfileFlow)profileFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.PassengerPhotoView", false, me/lyft/android/ui/PassengerPhotoView);
    }
}
