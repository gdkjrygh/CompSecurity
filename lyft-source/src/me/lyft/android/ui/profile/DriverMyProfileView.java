// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.SlideMenuController;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileScrollview, ProfileToolBarView, DriverProfilePhotoCarWidgetView, ProfileFormatter, 
//            ProfileBioWidgetView, ProfileFacebookConnectMyWidgetView

public class DriverMyProfileView extends FrameLayout
{

    DriverProfilePhotoCarWidgetView driverProfilePhotoCarWidgetView;
    TextView driverProfileStatsStars;
    ProfileBioWidgetView profileBioWidgetView;
    ProfileFacebookConnectMyWidgetView profileFacebookConnectMyWidgetView;
    IProfileProvider profileProvider;
    ProfileScrollview profileScrollview;
    ProfileToolBarView profileToolBarView;
    private boolean showAnimation;
    SlideMenuController slideMenuController;

    public DriverMyProfileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        showAnimation = false;
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            slideMenuController.enableMenu();
            Binder.attach(this).bind(profileScrollview.observeOnScrollUp(), new Action1() {

                final DriverMyProfileView this$0;

                public void call(Boolean boolean1)
                {
                    if (showAnimation != boolean1.booleanValue())
                    {
                        profileToolBarView.setFade(boolean1.booleanValue());
                        showAnimation = boolean1.booleanValue();
                    }
                }

                public volatile void call(Object obj1)
                {
                    call((Boolean)obj1);
                }

            
            {
                this$0 = DriverMyProfileView.this;
                super();
            }
            });
            profileToolBarView.showProfileToolbar();
            Object obj = profileProvider.getSelfAsDriver();
            driverProfilePhotoCarWidgetView.setUserInfo(((Driver) (obj)).getName(), ((Driver) (obj)).getPhoto());
            driverProfilePhotoCarWidgetView.setCarInfo(((Driver) (obj)).getVehicle());
            driverProfileStatsStars.setText(ProfileFormatter.getFormattedRating(((Driver) (obj)), getResources()));
            obj = profileProvider.getMyProfile();
            profileBioWidgetView.setUserBioInfo(((me.lyft.android.domain.profile.Profile) (obj)));
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }



/*
    static boolean access$002(DriverMyProfileView drivermyprofileview, boolean flag)
    {
        drivermyprofileview.showAnimation = flag;
        return flag;
    }

*/
}
