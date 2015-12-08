// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.InviteFriendsAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.SocialSharing;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.invites.SocialIntentProvider;
import me.lyft.android.utils.MetricsUtils;

public class PassengerSocialSharingView extends DialogContainerView
{

    ActivityController activityController;
    AppFlow appFlow;
    MessageBus bus;
    IConstantsProvider constantsProvider;
    IDevice device;
    DialogFlow dialogFlow;
    View hr;
    View inviteContacts;
    View inviteTwitter;
    final MetricsUtils metricsUtils = MetricsUtils.fromView(this);
    ILyftPreferences preferences;
    final me.lyft.android.infrastructure.lyft.constants.SocialSharing.RateSocialPrompt prompt = getRateSocialPrompt();
    IRideRequestSession rideRequestSession;
    final PassengerDialogs.PassengerSocialSharingDialog screen;
    final SocialIntentProvider socialIntentProvider;
    final SocialSharing socialSharing;
    TextView subtitleText;
    TextView titleText;
    IUserSession userSession;

    public PassengerSocialSharingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        screen = (PassengerDialogs.PassengerSocialSharingDialog)context.a();
        socialSharing = constantsProvider.getConstants().getSocialSharing();
        if (!screen.isInvitedDialog())
        {
            preferences.increaseShownCount();
        }
        socialIntentProvider = (new me.lyft.android.ui.invites.SocialIntentProvider.Builder()).twitter(getTwitterShareText()).facebook((String)Objects.firstNonNull(userSession.getUser().getReferralUrl(), "")).build(getContext().getPackageManager(), userSession, constantsProvider, device);
    }

    private me.lyft.android.infrastructure.lyft.constants.SocialSharing.RateSocialPrompt getDefaultRateSocialPrompt()
    {
        me.lyft.android.infrastructure.lyft.constants.SocialSharing.RateSocialPrompt ratesocialprompt = new me.lyft.android.infrastructure.lyft.constants.SocialSharing.RateSocialPrompt();
        ratesocialprompt.setTitle(getResources().getString(0x7f070106));
        ratesocialprompt.setSubtitle(getContext().getResources().getString(0x7f070105));
        return ratesocialprompt;
    }

    private me.lyft.android.infrastructure.lyft.constants.SocialSharing.RateSocialPrompt getRateSocialPrompt()
    {
        Object obj = constantsProvider.getConstants().getSocialSharing();
        String s = rideRequestSession.getCurrentRideType().getId();
        for (obj = ((List)Objects.firstNonNull(((SocialSharing) (obj)).getRateSocialPrompts(), Collections.emptyList())).iterator(); ((Iterator) (obj)).hasNext();)
        {
            me.lyft.android.infrastructure.lyft.constants.SocialSharing.RateSocialPrompt ratesocialprompt = (me.lyft.android.infrastructure.lyft.constants.SocialSharing.RateSocialPrompt)((Iterator) (obj)).next();
            if (ratesocialprompt.getRideTypeId().equalsIgnoreCase(s))
            {
                return ratesocialprompt;
            }
        }

        return getDefaultRateSocialPrompt();
    }

    Drawable getTitleCompoundDrawable()
    {
        Resources resources = getResources();
        int i;
        if (screen.isInvitedDialog())
        {
            i = 0x7f02007f;
        } else
        {
            i = 0x7f020160;
        }
        return resources.getDrawable(i);
    }

    float getTitleCompoundDrawablePadding()
    {
        MetricsUtils metricsutils = metricsUtils;
        float f;
        if (screen.isInvitedDialog())
        {
            f = 40F;
        } else
        {
            f = 50F;
        }
        return metricsutils.pixelsToDp(f);
    }

    String getTwitterShareText()
    {
        String s;
        if (screen.isInvitedDialog())
        {
            s = socialSharing.getInviteTwitterShareText();
        } else
        {
            s = socialSharing.getEndRideTwitterShareText();
        }
        return (String)Objects.firstNonNull(s, getResources().getString(0x7f070107, new Object[] {
            Objects.firstNonNull(userSession.getUser().getReferralUrl(), "")
        }));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        InviteFriendsAnalytics.trackShowInviteButton("share_modal");
    }

    void onCancelClicked()
    {
        dialogFlow.dismiss();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this, this);
        boolean flag = screen.isInvitedDialog();
        TextView textview = titleText;
        Object obj;
        if (flag)
        {
            obj = getResources().getString(0x7f0701c1);
        } else
        {
            obj = prompt.getTitle();
        }
        textview.setText(((CharSequence) (obj)));
        subtitleText.setText(prompt.getSubtitle());
        if (screen.isInvitedDialog())
        {
            hr.setVisibility(0);
            inviteContacts.setVisibility(8);
            obj = (android.view.ViewGroup.MarginLayoutParams)inviteTwitter.getLayoutParams();
            obj.rightMargin = 0;
            inviteTwitter.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            hr.setVisibility(8);
        }
        titleText.setCompoundDrawablePadding((int)getTitleCompoundDrawablePadding());
        titleText.setCompoundDrawablesWithIntrinsicBounds(null, getTitleCompoundDrawable(), null, null);
    }

    void shareWithContacts()
    {
        dialogFlow.dismiss();
        appFlow.goTo(new me.lyft.android.ui.invites.InvitesScreens.InviteScreen());
    }

    void shareWithFacebook()
    {
        startActivityOrShowErrorToast(socialIntentProvider.getFacebookShareItem(), 0x7f07036d);
    }

    void shareWithTwitter()
    {
        startActivityOrShowErrorToast(socialIntentProvider.getTwitterShareItem(), 0x7f070370);
    }

    void startActivityOrShowErrorToast(me.lyft.android.ui.invites.SocialIntentProvider.ShareItem shareitem, int i)
    {
        ActionAnalytics actionanalytics = InviteFriendsAnalytics.trackShareInvites(shareitem.getName());
        shareitem = socialIntentProvider.createShareIntent(shareitem);
        if (shareitem != null)
        {
            actionanalytics.trackSuccess();
            activityController.startActivity(shareitem);
            return;
        } else
        {
            shareitem = getResources().getString(i);
            actionanalytics.trackFailure(shareitem);
            dialogFlow.show(new Toast(shareitem));
            return;
        }
    }
}
