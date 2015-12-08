// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;

// Referenced classes of package me.lyft.android.ui:
//            MenuView, SlideMenuController

public final class filePhotoLoader extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding developerTools;
    private Binding lyftPreferences;
    private Binding passengerRideProvider;
    private Binding profileFlow;
    private Binding profilePhotoLoader;
    private Binding slideMenuController;
    private Binding userModeSwitchFacade;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/MenuView, getClass().getClassLoader());
        profileFlow = linker.requestBinding("me.lyft.android.flows.ProfileFlow", me/lyft/android/ui/MenuView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/MenuView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/MenuView, getClass().getClassLoader());
        userModeSwitchFacade = linker.requestBinding("me.lyft.android.facades.UserModeSwitchFacade", me/lyft/android/ui/MenuView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/MenuView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/MenuView, getClass().getClassLoader());
        developerTools = linker.requestBinding("me.lyft.android.development.DeveloperTools", me/lyft/android/ui/MenuView, getClass().getClassLoader());
        profilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.IProfilePhotoLoader", me/lyft/android/ui/MenuView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(profileFlow);
        set1.add(userProvider);
        set1.add(passengerRideProvider);
        set1.add(userModeSwitchFacade);
        set1.add(lyftPreferences);
        set1.add(slideMenuController);
        set1.add(developerTools);
        set1.add(profilePhotoLoader);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((MenuView)obj);
    }

    public void injectMembers(MenuView menuview)
    {
        menuview.appFlow = (AppFlow)appFlow.get();
        menuview.profileFlow = (ProfileFlow)profileFlow.get();
        menuview.userProvider = (IUserProvider)userProvider.get();
        menuview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        menuview.userModeSwitchFacade = (UserModeSwitchFacade)userModeSwitchFacade.get();
        menuview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        menuview.slideMenuController = (SlideMenuController)slideMenuController.get();
        menuview.developerTools = (DeveloperTools)developerTools.get();
        menuview.profilePhotoLoader = (IProfilePhotoLoader)profilePhotoLoader.get();
    }

    public filePhotoLoader()
    {
        super(null, "members/me.lyft.android.ui.MenuView", false, me/lyft/android/ui/MenuView);
    }
}
