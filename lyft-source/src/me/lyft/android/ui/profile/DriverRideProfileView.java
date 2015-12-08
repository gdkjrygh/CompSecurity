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
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileScrollview, ProfileToolBarView, DriverProfilePhotoCarWidgetView, ProfileFormatter, 
//            ProfileBioWidgetView, ProfileFacebookConnectRideWidgetView

public class DriverRideProfileView extends FrameLayout
{

    AppFlow appFlow;
    DriverProfilePhotoCarWidgetView driverProfilePhotoCarWidgetView;
    TextView driverProfileStatsStars;
    private final Action1 onRideUpdated = new Action1() {

        final DriverRideProfileView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            unit = passengerRideProvider.getPassengerRide().getStatus();
            if (unit.isDroppedOff() || unit.isCanceled())
            {
                appFlow.goBack();
            }
        }

            
            {
                this$0 = DriverRideProfileView.this;
                super();
            }
    };
    IPassengerRideProvider passengerRideProvider;
    ProfileBioWidgetView profileBioWidgetView;
    ProfileFacebookConnectRideWidgetView profileFacebookConnectRideWidgetView;
    IProfileProvider profileProvider;
    ProfileScrollview profileScrollview;
    ProfileToolBarView profileToolBarView;
    private boolean showAnimation;

    public DriverRideProfileView(Context context, AttributeSet attributeset)
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
            Object obj = Binder.attach(this);
            ((Binder) (obj)).bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdated);
            ((Binder) (obj)).bind(profileScrollview.observeOnScrollUp(), new Action1() {

                final DriverRideProfileView this$0;

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
                this$0 = DriverRideProfileView.this;
                super();
            }
            });
            profileToolBarView.showRideToolbar(false);
            obj = passengerRideProvider.getPassengerRide().getDriver();
            driverProfilePhotoCarWidgetView.setUserInfo(((Driver) (obj)).getName(), ((Driver) (obj)).getPhoto());
            driverProfilePhotoCarWidgetView.setCarInfo(((Driver) (obj)).getVehicle());
            driverProfileStatsStars.setText(ProfileFormatter.getFormattedRating(((Driver) (obj)), getResources()));
            obj = profileProvider.getDriverProfile();
            profileBioWidgetView.setUserBioInfo(((me.lyft.android.domain.profile.Profile) (obj)));
            profileFacebookConnectRideWidgetView.displayForDriver(((me.lyft.android.domain.profile.Profile) (obj)));
            return;
        }
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
    static boolean access$002(DriverRideProfileView driverrideprofileview, boolean flag)
    {
        driverrideprofileview.showAnimation = flag;
        return flag;
    }

*/
}
