// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileFriendsWidgetView

public class ProfileFacebookConnectRideWidgetView extends LinearLayout
{

    private Binder binder;
    DialogFlow dialogFlow;
    LinearLayout fbConnectContainer;
    private boolean isDriver;
    private String passengerId;
    LinearLayout profileFbConnect;
    ProfileFriendsWidgetView profileFriendsWidgetView;
    IProfileProvider profileProvider;
    IProfileService profileService;
    IProgressController progressController;
    IViewErrorHandler viewErrorHandler;

    public ProfileFacebookConnectRideWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        setOrientation(1);
        attributeset.a(context).inflate(0x7f030106, this, true);
    }

    private void loadMutualFriends(Profile profile)
    {
        profileFriendsWidgetView.setVisibility(0);
        profileFriendsWidgetView.loadUserFriends(profile.getMutualFriends(), profile.getAdditionalMutualFriendsCount());
    }

    private void refreshFacebookToken()
    {
        progressController.showProgress();
        binder.bind(profileService.refreshFacebookToken(), new AsyncCall() {

            final ProfileFacebookConnectRideWidgetView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                fbConnectContainer.setVisibility(4);
                unit = resolveProfile();
                if (unit.hasMutualFriends())
                {
                    loadMutualFriends(unit);
                    return;
                } else
                {
                    dialogFlow.show(new Toast(getContext().getString(0x7f0702c8)));
                    return;
                }
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = ProfileFacebookConnectRideWidgetView.this;
                super();
            }
        });
    }

    private Profile resolveProfile()
    {
        if (isDriver)
        {
            return profileProvider.getDriverProfile();
        } else
        {
            return profileProvider.getPassengerProfile(passengerId);
        }
    }

    private void showFacebookConnectOrFriends(Profile profile)
    {
        if (profileService.shouldRequestProfileV1FacebookPermissions())
        {
            fbConnectContainer.setVisibility(0);
        } else
        {
            fbConnectContainer.setVisibility(8);
            if (profile.hasMutualFriends())
            {
                loadMutualFriends(profile);
                return;
            }
        }
    }

    public void displayForDriver(Profile profile)
    {
        isDriver = true;
        passengerId = null;
        showFacebookConnectOrFriends(profile);
    }

    public void displayForPassenger(String s, Profile profile)
    {
        isDriver = false;
        passengerId = s;
        showFacebookConnectOrFriends(profile);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            profileFbConnect.setOnClickListener(new android.view.View.OnClickListener() {

                final ProfileFacebookConnectRideWidgetView this$0;

                public void onClick(View view)
                {
                    refreshFacebookToken();
                }

            
            {
                this$0 = ProfileFacebookConnectRideWidgetView.this;
                super();
            }
            });
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



}
