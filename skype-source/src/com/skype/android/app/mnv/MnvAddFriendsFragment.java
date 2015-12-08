// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvBaseFragment, MnvManager, MnvStateData, MnvUtil, 
//            MnvAnalytics, MnvCases

public class MnvAddFriendsFragment extends MnvBaseFragment
    implements android.view.View.OnClickListener
{

    private static final Logger log = Logger.getLogger("MnvAddFriendsFragment");
    Button addFriendsButton;
    TextView addFriendsDesc;
    ChatText chatText;
    EcsConfiguration configuration;
    MnvAnalytics mnvAnalytics;
    MnvCases mnvCases;
    MnvUtil mnvUtil;
    ImageButton nextButton;
    Button notNowButton;
    ImageButton notNowButtonX;
    PermissionRequest permissionRequest;

    public MnvAddFriendsFragment()
    {
    }

    private void launchLearnMore()
    {
        navigation.toMnvLearnMore();
    }

    private void launchNextStep()
    {
        MnvStateData mnvstatedata = mnvManager.getStateDataChange().getStateData();
        if (shouldSkipAddNumberFlow(mnvstatedata))
        {
            if (mnvstatedata.getNextState() == MnvManager.States.ADD_VERIFIED_SOURCE_MSA)
            {
                log.info("Short circuiting MSA verified phone number in background.");
                mnvManager.request(MnvManager.States.ADD_VERIFIED_SOURCE_MSA, mnvstatedata.getPhoneNumber(), mnvUtil.getUserCountry(mnvstatedata.getCountryCode()));
                mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cN);
                navigateToHome();
                return;
            } else
            {
                log.info("Phone number already verified.");
                mnvCases.setCompleted();
                skipMnvFlow("MnvAlreadyVerified");
                return;
            }
        } else
        {
            log.info("Launching view for user to add number.");
            navigation.toMnvAddNumber(getReferrer());
            getActivity().finish();
            return;
        }
    }

    private boolean shouldSkipAddNumberFlow(MnvStateData mnvstatedata)
    {
        return mnvstatedata.getSkipAddNumberFlow();
    }

    private void showDescription()
    {
        if (userPreferences.isNewUser())
        {
            addFriendsDesc.setText(chatText.a(0x7f0804a5, new Object[0]));
        } else
        {
            addFriendsDesc.setText(chatText.a(0x7f0804a4, new Object[0]));
        }
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cd);
    }

    private void showNextButton()
    {
        String s1 = configuration.getPhoneVerificationNextButton();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "TEXT_BTN";
        }
        if (s.equalsIgnoreCase("ARROW_BTN"))
        {
            addFriendsButton.setVisibility(8);
            nextButton.setVisibility(0);
            return;
        } else
        {
            nextButton.setVisibility(8);
            addFriendsButton.setVisibility(0);
            return;
        }
    }

    private void showSkipButton()
    {
        String s1 = configuration.getPhoneVerificationSkipButton();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "X_BTN";
        }
        if (s.equalsIgnoreCase("NOT_NOW_BTN"))
        {
            notNowButtonX.setVisibility(8);
            notNowButton.setVisibility(0);
            return;
        }
        if (s.equalsIgnoreCase("NO_BTN"))
        {
            notNowButtonX.setVisibility(8);
            notNowButton.setVisibility(8);
            return;
        } else
        {
            notNowButton.setVisibility(8);
            notNowButtonX.setVisibility(0);
            return;
        }
    }

    private void skipMnvFlow(String s)
    {
        mnvManager.onSkip(2);
        reportMnvSkipAndNavigateToHome("Add friends screen", s);
    }

    private void updateUi()
    {
        showSkipButton();
        showNextButton();
        showDescription();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity.setTitle(0x7f08009b);
    }

    public void onBackPressed()
    {
        PerformanceLog.e.a("USER ACTION: mnv add friends screen skipped");
        skipMnvFlow("Back button");
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756083: 
        case 2131756084: 
            permissionRequest.a(Permission.p, true, new PermissionHandlerAdapter() {

                final MnvAddFriendsFragment this$0;

                public final void onDenied(Set set)
                {
                    skipMnvFlow("Permission denied");
                }

                public final void onGranted()
                {
                    launchNextStep();
                    PerformanceLog.e.a("USER ACTION: mnv navigate to add number screen");
                }

            
            {
                this$0 = MnvAddFriendsFragment.this;
                super();
            }
            });
            return;

        case 2131756122: 
        case 2131756123: 
            skipMnvFlow("Skip not now");
            return;

        case 2131756078: 
            launchLearnMore();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300af, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        PerformanceLog.e.a("APP ACTION: mnv add friends screen displayed");
        ViewUtil.a(this, new View[] {
            notNowButton, addFriendsDesc, addFriendsButton, notNowButtonX, nextButton
        });
        updateUi();
    }



}
