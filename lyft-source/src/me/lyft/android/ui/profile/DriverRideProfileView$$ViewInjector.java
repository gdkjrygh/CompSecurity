// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            DriverRideProfileView, ProfileScrollview, ProfileToolBarView, DriverProfilePhotoCarWidgetView, 
//            ProfileBioWidgetView, ProfileFacebookConnectRideWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverRideProfileView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, DriverRideProfileView driverrideprofileview, Object obj)
    {
        driverrideprofileview.profileScrollview = (ProfileScrollview)viewinjector.profileScrollview((View)viewinjector.profileScrollview(obj, 0x7f0d0361, "field 'profileScrollview'"), 0x7f0d0361, "field 'profileScrollview'");
        driverrideprofileview.profileToolBarView = (ProfileToolBarView)viewinjector.profileToolBarView((View)viewinjector.profileToolBarView(obj, 0x7f0d0365, "field 'profileToolBarView'"), 0x7f0d0365, "field 'profileToolBarView'");
        driverrideprofileview.driverProfilePhotoCarWidgetView = (DriverProfilePhotoCarWidgetView)viewinjector.WidgetView((View)viewinjector.WidgetView(obj, 0x7f0d0362, "field 'driverProfilePhotoCarWidgetView'"), 0x7f0d0362, "field 'driverProfilePhotoCarWidgetView'");
        driverrideprofileview.driverProfileStatsStars = (TextView)viewinjector.driverProfileStatsStars((View)viewinjector.driverProfileStatsStars(obj, 0x7f0d036c, "field 'driverProfileStatsStars'"), 0x7f0d036c, "field 'driverProfileStatsStars'");
        driverrideprofileview.profileBioWidgetView = (ProfileBioWidgetView)viewinjector.profileBioWidgetView((View)viewinjector.profileBioWidgetView(obj, 0x7f0d0363, "field 'profileBioWidgetView'"), 0x7f0d0363, "field 'profileBioWidgetView'");
        driverrideprofileview.profileFacebookConnectRideWidgetView = (ProfileFacebookConnectRideWidgetView)viewinjector.tRideWidgetView((View)viewinjector.tRideWidgetView(obj, 0x7f0d0364, "field 'profileFacebookConnectRideWidgetView'"), 0x7f0d0364, "field 'profileFacebookConnectRideWidgetView'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverRideProfileView)obj);
    }

    public void reset(DriverRideProfileView driverrideprofileview)
    {
        driverrideprofileview.profileScrollview = null;
        driverrideprofileview.profileToolBarView = null;
        driverrideprofileview.driverProfilePhotoCarWidgetView = null;
        driverrideprofileview.driverProfileStatsStars = null;
        driverrideprofileview.profileBioWidgetView = null;
        driverrideprofileview.profileFacebookConnectRideWidgetView = null;
    }

    public ()
    {
    }
}
