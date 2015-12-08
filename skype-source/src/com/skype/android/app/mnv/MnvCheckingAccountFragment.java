// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvRequestFragment, MnvManager, MnvUtil, MnvStateData, 
//            MnvAnalytics

public class MnvCheckingAccountFragment extends MnvRequestFragment
{

    private static final Logger log = Logger.getLogger("MnvCheckingAccountFragment");
    MnvManager mnvManager;
    MnvUtil mnvUtil;

    public MnvCheckingAccountFragment()
    {
    }

    private void finish()
    {
        dismissProgressSpinner();
        getActivity().finish();
    }

    protected void onBackPressed()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        mnvManager.resetLastCheckedTime();
    }

    public void onResume()
    {
        super.onResume();
        showProgressSpinner(mnvUtil.getNativeProgressTimeout(), getString(0x7f0803ea), new Runnable() {

            final MnvCheckingAccountFragment this$0;

            public final void run()
            {
                MnvCheckingAccountFragment.log.info("Timing out on progress.");
                mnvManager.onTimeout();
                mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cP);
            }

            
            {
                this$0 = MnvCheckingAccountFragment.this;
                super();
            }
        });
    }

    public void onTokenRetrieved(com.skype.android.app.token.AbstractTokenRequest.TokenAccount tokenaccount, String s)
    {
        super.onTokenRetrieved(tokenaccount, s);
        mnvManager.request(MnvManager.States.CHECKING_ACCOUNT);
    }

    protected void processAsyncError(MnvStateData mnvstatedata)
    {
        navigation.launchMobileVerification(MnvCases.REFERRER.SIGN_IN);
        dismissProgressSpinner();
        getActivity().finish();
    }

    protected void processFailure(MnvStateData mnvstatedata)
    {
        mnvstatedata = mnvstatedata.getNextState();
        log.info((new StringBuilder("MNV onMnvFailure next state: ")).append(mnvstatedata.name()).toString());
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$States[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$MnvManager$States = new int[MnvManager.States.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ADD_FRIENDS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ADD_PHONE_VERIFY_BY_SMS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.EDIT_PHONE_VERIFY_BY_SMS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ADD_PHONE_VERIFY_BY_VOICE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.EDIT_PHONE_VERIFY_BY_VOICE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.SKIPPED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.COMPLETED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ERRORS_RETRY.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ERRORS_UNABLE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ERRORS_UNKNOWN.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.android.app.mnv.MnvManager.States[mnvstatedata.ordinal()])
        {
        default:
            log.severe((new StringBuilder("MNV default failure state: ")).append(mnvstatedata.name()).toString());
            navigateToHome();
            return;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            navigateToHome();
            return;

        case 10: // '\n'
            displayError();
            break;
        }
    }

    protected void processSuccess(MnvStateData mnvstatedata)
    {
        MnvManager.States states = mnvstatedata.getNextState();
        log.info("MNV CheckingAccountFragment processSuccess");
        log.info((new StringBuilder("MNV \t current state          : ")).append(mnvstatedata.getCurrentState().name()).toString());
        log.info((new StringBuilder("MNV \t next state             : ")).append(states.name()).toString());
        log.info((new StringBuilder("MNV \t skip add number flow   : ")).append(mnvstatedata.getSkipAddNumberFlow()).toString());
        log.info((new StringBuilder("MNV \t skip add friends view  : ")).append(mnvstatedata.getSkipAddFriendsView()).toString());
        if (states == MnvManager.States.QOS_ALERT)
        {
            navigateToHome();
            return;
        }
        if (!mnvstatedata.getSkipAddFriendsView())
        {
            navigation.launchMobileVerification(MnvCases.REFERRER.SIGN_IN);
            finish();
            return;
        }
        switch (_cls2..SwitchMap.com.skype.android.app.mnv.MnvManager.States[states.ordinal()])
        {
        default:
            if (getReferrer() == MnvCases.REFERRER.EXTERNAL_URI)
            {
                navigation.launchMobileVerification(getReferrer());
                finish();
                return;
            } else
            {
                super.processSuccess(mnvstatedata);
                return;
            }

        case 1: // '\001'
            navigation.launchMobileVerification(getReferrer());
            finish();
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            navigation.toMnvAddNumber(getReferrer());
            finish();
            return;
        }
    }


}
