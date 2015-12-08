// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

public class ProfileFacebookConnectMyWidgetView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    DialogFlow dialogFlow;
    LinearLayout profileFbConnect;
    LinearLayout profileFbSettings;
    TextView profileFriendsTitleTextView;
    IProfileProvider profileProvider;
    IProfileService profileService;
    IProgressController progressController;
    IViewErrorHandler viewErrorHandler;

    public ProfileFacebookConnectMyWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        setOrientation(1);
        attributeset.a(context).inflate(0x7f030105, this, true);
    }

    private void refreshFacebookToken()
    {
        progressController.showProgress();
        binder.bind(profileService.refreshFacebookToken(), new AsyncCall() {

            final ProfileFacebookConnectMyWidgetView this$0;

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
                dialogFlow.show(new Toast(getContext().getString(0x7f0702be)));
                showFacebookSettings();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = ProfileFacebookConnectMyWidgetView.this;
                super();
            }
        });
    }

    private void showFacebookConnect()
    {
        profileFbSettings.setVisibility(8);
        profileFriendsTitleTextView.setVisibility(0);
        profileFbConnect.setVisibility(0);
    }

    private void showFacebookSettings()
    {
        boolean flag = profileProvider.getMyProfile().isCanShowMutualFriends();
        profileFbConnect.setVisibility(8);
        Resources resources = getResources();
        String s;
        int i;
        if (flag)
        {
            i = 0x7f070168;
        } else
        {
            i = 0x7f07011c;
        }
        s = resources.getString(i).toUpperCase();
        profileFriendsTitleTextView.setText(Strings.joinWithDelimiter(" ", new String[] {
            resources.getString(0x7f0702c5), s
        }));
        profileFriendsTitleTextView.setVisibility(0);
        profileFbSettings.setVisibility(0);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        profileFbConnect.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileFacebookConnectMyWidgetView this$0;

            public void onClick(View view)
            {
                refreshFacebookToken();
            }

            
            {
                this$0 = ProfileFacebookConnectMyWidgetView.this;
                super();
            }
        });
        profileFbSettings.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileFacebookConnectMyWidgetView this$0;

            public void onClick(View view)
            {
                appFlow.goTo(new ProfileScreens.EditProfileScreen());
            }

            
            {
                this$0 = ProfileFacebookConnectMyWidgetView.this;
                super();
            }
        });
        if (profileService.shouldRequestProfileV1FacebookPermissions())
        {
            showFacebookConnect();
            return;
        } else
        {
            showFacebookSettings();
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
