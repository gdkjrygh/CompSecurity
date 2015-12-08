// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerMyProfileView

public final class  extends Binding
    implements MembersInjector
{

    private Binding profileProvider;
    private Binding slideMenuController;

    public void attach(Linker linker)
    {
        profileProvider = linker.requestBinding("me.lyft.android.application.profile.IProfileProvider", me/lyft/android/ui/profile/PassengerMyProfileView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/profile/PassengerMyProfileView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(profileProvider);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerMyProfileView)obj);
    }

    public void injectMembers(PassengerMyProfileView passengermyprofileview)
    {
        passengermyprofileview.profileProvider = (IProfileProvider)profileProvider.get();
        passengermyprofileview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.PassengerMyProfileView", false, me/lyft/android/ui/profile/PassengerMyProfileView);
    }
}
