// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerRideProfileView, ProfileScrollview, ProfileToolBarView, PassengerProfilePhotoWidgetView, 
//            ProfileBioWidgetView, ProfileFacebookConnectRideWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerRideProfileView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PassengerRideProfileView passengerrideprofileview, Object obj)
    {
        passengerrideprofileview.profileScrollview = (ProfileScrollview)viewinjector.profileScrollview((View)viewinjector.profileScrollview(obj, 0x7f0d0361, "field 'profileScrollview'"), 0x7f0d0361, "field 'profileScrollview'");
        passengerrideprofileview.profileToolBarView = (ProfileToolBarView)viewinjector.profileToolBarView((View)viewinjector.profileToolBarView(obj, 0x7f0d0365, "field 'profileToolBarView'"), 0x7f0d0365, "field 'profileToolBarView'");
        passengerrideprofileview.passengerProfilePhotoWidgetView = (PassengerProfilePhotoWidgetView)viewinjector.getView((View)viewinjector.getView(obj, 0x7f0d0378, "field 'passengerProfilePhotoWidgetView'"), 0x7f0d0378, "field 'passengerProfilePhotoWidgetView'");
        passengerrideprofileview.joinDateTextView = (TextView)viewinjector.joinDateTextView((View)viewinjector.joinDateTextView(obj, 0x7f0d02ba, "field 'joinDateTextView'"), 0x7f0d02ba, "field 'joinDateTextView'");
        passengerrideprofileview.profileBioWidgetView = (ProfileBioWidgetView)viewinjector.profileBioWidgetView((View)viewinjector.profileBioWidgetView(obj, 0x7f0d0363, "field 'profileBioWidgetView'"), 0x7f0d0363, "field 'profileBioWidgetView'");
        passengerrideprofileview.profileFacebookConnectRideWidgetView = (ProfileFacebookConnectRideWidgetView)viewinjector.deWidgetView((View)viewinjector.deWidgetView(obj, 0x7f0d0364, "field 'profileFacebookConnectRideWidgetView'"), 0x7f0d0364, "field 'profileFacebookConnectRideWidgetView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerRideProfileView)obj);
    }

    public void reset(PassengerRideProfileView passengerrideprofileview)
    {
        passengerrideprofileview.profileScrollview = null;
        passengerrideprofileview.profileToolBarView = null;
        passengerrideprofileview.passengerProfilePhotoWidgetView = null;
        passengerrideprofileview.joinDateTextView = null;
        passengerrideprofileview.profileBioWidgetView = null;
        passengerrideprofileview.profileFacebookConnectRideWidgetView = null;
    }

    public ()
    {
    }
}
