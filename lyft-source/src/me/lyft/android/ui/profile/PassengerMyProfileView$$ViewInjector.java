// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerMyProfileView, ProfileScrollview, ProfileToolBarView, PassengerProfilePhotoWidgetView, 
//            ProfileBioWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerMyProfileView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PassengerMyProfileView passengermyprofileview, Object obj)
    {
        passengermyprofileview.profileScrollview = (ProfileScrollview)viewinjector.profileScrollview((View)viewinjector.profileScrollview(obj, 0x7f0d0361, "field 'profileScrollview'"), 0x7f0d0361, "field 'profileScrollview'");
        passengermyprofileview.profileToolBarView = (ProfileToolBarView)viewinjector.profileToolBarView((View)viewinjector.profileToolBarView(obj, 0x7f0d0365, "field 'profileToolBarView'"), 0x7f0d0365, "field 'profileToolBarView'");
        passengermyprofileview.passengerProfilePhotoWidgetView = (PassengerProfilePhotoWidgetView)viewinjector.idgetView((View)viewinjector.idgetView(obj, 0x7f0d0378, "field 'passengerProfilePhotoWidgetView'"), 0x7f0d0378, "field 'passengerProfilePhotoWidgetView'");
        passengermyprofileview.joinDateTextView = (TextView)viewinjector.joinDateTextView((View)viewinjector.joinDateTextView(obj, 0x7f0d02ba, "field 'joinDateTextView'"), 0x7f0d02ba, "field 'joinDateTextView'");
        passengermyprofileview.profileBioWidgetView = (ProfileBioWidgetView)viewinjector.profileBioWidgetView((View)viewinjector.profileBioWidgetView(obj, 0x7f0d0363, "field 'profileBioWidgetView'"), 0x7f0d0363, "field 'profileBioWidgetView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerMyProfileView)obj);
    }

    public void reset(PassengerMyProfileView passengermyprofileview)
    {
        passengermyprofileview.profileScrollview = null;
        passengermyprofileview.profileToolBarView = null;
        passengermyprofileview.passengerProfilePhotoWidgetView = null;
        passengermyprofileview.joinDateTextView = null;
        passengermyprofileview.profileBioWidgetView = null;
    }

    public ()
    {
    }
}
