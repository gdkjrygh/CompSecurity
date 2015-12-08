// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            DriverMyProfileView, ProfileScrollview, ProfileToolBarView, DriverProfilePhotoCarWidgetView, 
//            ProfileBioWidgetView, ProfileFacebookConnectMyWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverMyProfileView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, DriverMyProfileView drivermyprofileview, Object obj)
    {
        drivermyprofileview.profileScrollview = (ProfileScrollview)viewinjector.profileScrollview((View)viewinjector.profileScrollview(obj, 0x7f0d0361, "field 'profileScrollview'"), 0x7f0d0361, "field 'profileScrollview'");
        drivermyprofileview.profileToolBarView = (ProfileToolBarView)viewinjector.profileToolBarView((View)viewinjector.profileToolBarView(obj, 0x7f0d0365, "field 'profileToolBarView'"), 0x7f0d0365, "field 'profileToolBarView'");
        drivermyprofileview.driverProfilePhotoCarWidgetView = (DriverProfilePhotoCarWidgetView)viewinjector.arWidgetView((View)viewinjector.arWidgetView(obj, 0x7f0d0362, "field 'driverProfilePhotoCarWidgetView'"), 0x7f0d0362, "field 'driverProfilePhotoCarWidgetView'");
        drivermyprofileview.driverProfileStatsStars = (TextView)viewinjector.driverProfileStatsStars((View)viewinjector.driverProfileStatsStars(obj, 0x7f0d036c, "field 'driverProfileStatsStars'"), 0x7f0d036c, "field 'driverProfileStatsStars'");
        drivermyprofileview.profileBioWidgetView = (ProfileBioWidgetView)viewinjector.w((View)viewinjector.w(obj, 0x7f0d0363, "field 'profileBioWidgetView'"), 0x7f0d0363, "field 'profileBioWidgetView'");
        drivermyprofileview.profileFacebookConnectMyWidgetView = (ProfileFacebookConnectMyWidgetView)viewinjector.ectMyWidgetView((View)viewinjector.ectMyWidgetView(obj, 0x7f0d0364, "field 'profileFacebookConnectMyWidgetView'"), 0x7f0d0364, "field 'profileFacebookConnectMyWidgetView'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverMyProfileView)obj);
    }

    public void reset(DriverMyProfileView drivermyprofileview)
    {
        drivermyprofileview.profileScrollview = null;
        drivermyprofileview.profileToolBarView = null;
        drivermyprofileview.driverProfilePhotoCarWidgetView = null;
        drivermyprofileview.driverProfileStatsStars = null;
        drivermyprofileview.profileBioWidgetView = null;
        drivermyprofileview.profileFacebookConnectMyWidgetView = null;
    }

    public ()
    {
    }
}
