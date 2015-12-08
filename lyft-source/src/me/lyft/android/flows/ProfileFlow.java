// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.flows;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.User;

public class ProfileFlow
{

    AppFlow appFlow;
    IUserProvider userProvider;

    public ProfileFlow()
    {
    }

    public void openDriverRideProfile()
    {
        appFlow.goTo(new me.lyft.android.ui.profile.ProfileScreens.DriverRideProfileScreen());
    }

    public void openMyPassengerRideProfile()
    {
        appFlow.goTo((new me.lyft.android.ui.profile.ProfileScreens.PassengerMyProfileScreen()).setFromRide(true));
    }

    public void openMyProfile()
    {
        if (userProvider.getUser().isApprovedDriver())
        {
            appFlow.goTo(new me.lyft.android.ui.profile.ProfileScreens.DriverMyProfileScreen());
            return;
        } else
        {
            appFlow.goTo(new me.lyft.android.ui.profile.ProfileScreens.PassengerMyProfileScreen());
            return;
        }
    }

    public void openPassengerRideProfile(String s)
    {
        appFlow.goTo(new me.lyft.android.ui.profile.ProfileScreens.PassengerRideProfileScreen(s));
    }
}
