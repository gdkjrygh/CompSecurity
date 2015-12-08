// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.profile.EditProfileView", "members/me.lyft.android.ui.profile.UpdatePassengerPhotoFromEditProfileView", "members/me.lyft.android.ui.profile.UpdatePassengerProfilePhotoView", "members/me.lyft.android.ui.profile.DriverRideProfileView", "members/me.lyft.android.ui.profile.DriverMyProfileView", "members/me.lyft.android.ui.profile.ProfileScrollview", "members/me.lyft.android.ui.profile.DriverProfilePhotoCarWidgetView", "members/me.lyft.android.ui.profile.PassengerRideProfileView", "members/me.lyft.android.ui.profile.PassengerMyProfileView", "members/me.lyft.android.ui.profile.ProfileToolBarView", 
        "members/me.lyft.android.ui.profile.ProfileFacebookConnectRideWidgetView", "members/me.lyft.android.ui.profile.ProfileFacebookConnectMyWidgetView", "members/me.lyft.android.ui.profile.PassengerProfilePhotoWidgetView", "members/me.lyft.android.ui.profile.ProfileFriendsWidgetView", "members/me.lyft.android.ui.profile.ProfileBioWidgetView", "members/me.lyft.android.ui.profile.ProfileFriendsItemWidgetView", "members/me.lyft.android.ui.profile.ProfileAdditionalFriendWidgetView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public ProfileModule newModule()
    {
        return new ProfileModule();
    }


    public ()
    {
        super(me/lyft/android/ui/profile/ProfileModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}
