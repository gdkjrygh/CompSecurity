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
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.SlideMenuController;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileScrollview, ProfileToolBarView, PassengerProfilePhotoWidgetView, ProfileFormatter, 
//            ProfileBioWidgetView

public class PassengerMyProfileView extends FrameLayout
{

    private final boolean fromRide;
    TextView joinDateTextView;
    PassengerProfilePhotoWidgetView passengerProfilePhotoWidgetView;
    ProfileBioWidgetView profileBioWidgetView;
    IProfileProvider profileProvider;
    ProfileScrollview profileScrollview;
    ProfileToolBarView profileToolBarView;
    private boolean showAnimation;
    SlideMenuController slideMenuController;

    public PassengerMyProfileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        showAnimation = false;
        context = Scoop.a(this);
        context.b(this);
        fromRide = ((ProfileScreens.PassengerMyProfileScreen)context.a()).isFromRide();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        Binder.attach(this).bind(profileScrollview.observeOnScrollUp(), new Action1() {

            final PassengerMyProfileView this$0;

            public void call(Boolean boolean1)
            {
                if (showAnimation != boolean1.booleanValue())
                {
                    profileToolBarView.setFade(boolean1.booleanValue());
                    showAnimation = boolean1.booleanValue();
                }
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = PassengerMyProfileView.this;
                super();
            }
        });
        Profile profile;
        if (fromRide)
        {
            profileToolBarView.showRideToolbar(true);
        } else
        {
            slideMenuController.enableMenu();
            profileToolBarView.showProfileToolbar();
        }
        profile = profileProvider.getMyProfile();
        passengerProfilePhotoWidgetView.setUserInfo(profile.getFirstName(), profile.getPhotoUrl(), true);
        joinDateTextView.setText(ProfileFormatter.getFormattedJoinDate(profile.getJoinDate(), getResources()));
        profileBioWidgetView.setUserBioInfo(profile);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (!fromRide)
        {
            slideMenuController.disableMenu();
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
    static boolean access$002(PassengerMyProfileView passengermyprofileview, boolean flag)
    {
        passengermyprofileview.showAnimation = flag;
        return flag;
    }

*/
}
