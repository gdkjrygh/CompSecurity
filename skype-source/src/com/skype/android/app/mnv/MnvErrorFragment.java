// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.widget.animator.SpriteAnimator;
import com.skype.android.widget.animator.SquareSpriteAnimator;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvBaseFragment, MnvAnalytics, MnvStateData, MnvManager

public class MnvErrorFragment extends MnvBaseFragment
    implements android.view.View.OnClickListener
{

    Button actionButton;
    private ProfileServicesErrors.a errorCode;
    TextView errorDescription;
    private ImageView icon;
    private String message;
    MnvAnalytics mnvAnalytics;
    Button skipButton;
    private SpriteAnimator spriteAnimator;

    public MnvErrorFragment()
    {
    }

    private String getErrorMessage(ProfileServicesErrors.b b)
    {
        int i = 0x7f0803f3;
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[];
            static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message = new int[ProfileServicesErrors.b.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.NO_MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.ALREADY_VERIFIED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.CODE_HAS_EXPIRED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.UNABLE_TO_VERIFY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.CODE_WAS_INCORRECT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.INVALID_PHONE_NUMBER.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.ENCOUNTERED_A_PROBLEM.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.ACTIVITY_LIMIT_REACHED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.UNSUPPORTED_VERIFY_METHOD.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.CONNECTION_FAILED.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.JSON_EXCEPTION.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.TIMEOUT_EXCEPTION.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code = new int[ProfileServicesErrors.a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[ProfileServicesErrors.a.RETRY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[ProfileServicesErrors.a.UNABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Message[b.ordinal()];
        JVM INSTR tableswitch 1 12: default 72
    //                   1 78
    //                   2 84
    //                   3 90
    //                   4 96
    //                   5 102
    //                   6 108
    //                   7 114
    //                   8 120
    //                   9 126
    //                   10 132
    //                   11 138
    //                   12 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        return getString(i);
_L2:
        i = 0x7f0803f3;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f0803eb;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f0803ef;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0803f3;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f0803f0;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f0803f1;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 0x7f0803ee;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 0x7f0803f2;
        continue; /* Loop/switch isn't completed */
_L10:
        i = 0x7f0803ec;
        continue; /* Loop/switch isn't completed */
_L11:
        i = 0x7f0803ed;
        continue; /* Loop/switch isn't completed */
_L12:
        i = 0x7f0803f3;
        continue; /* Loop/switch isn't completed */
_L13:
        i = 0x7f0803f3;
        if (true) goto _L1; else goto _L14
_L14:
    }

    private void logAnalyticsScreenLoad()
    {
        switch (_cls1..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Code[errorCode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.ck);
            return;

        case 2: // '\002'
            mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cj);
            break;
        }
    }

    private void setErrorCodeAndMessageFromStateData(MnvStateData mnvstatedata)
    {
        if (mnvstatedata == null)
        {
            throw new IllegalStateException("Attempt to start ErrorFragment without state data");
        } else
        {
            mnvstatedata = mnvstatedata.getErrorState();
            errorCode = ((ProfileServicesErrors.ErrorState) (mnvstatedata)).code;
            message = getErrorMessage(((ProfileServicesErrors.ErrorState) (mnvstatedata)).message);
            return;
        }
    }

    private void skipMnvFlow(String s)
    {
        mnvManager.onSkip(3);
        _cls1..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Code[errorCode.ordinal()];
        JVM INSTR tableswitch 1 1: default 36
    //                   1 53;
           goto _L1 _L2
_L1:
        String s1 = "Validation error screen";
_L4:
        spriteAnimator.b();
        reportMnvSkipAndNavigateToHome(s1, s);
        return;
_L2:
        s1 = "Connection error screen";
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void tryAgain(String s)
    {
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), "Connection error screen", s, AnalyticsEvent.cm);
        spriteAnimator.b();
        mnvManager.request(MnvManager.States.PREVIOUS);
        navigation.toMnvAddNumber(getReferrer());
        getActivity().finish();
    }

    private void updateUi()
    {
        switch (_cls1..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Code[errorCode.ordinal()])
        {
        default:
            errorDescription.setText(message);
            actionButton.setText(getString(0x7f0802f6));
            actionButton.setVisibility(0);
            actionButton.setOnClickListener(this);
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_95;
        }
_L1:
        if (errorCode.hasSkip())
        {
            skipButton.setVisibility(0);
            skipButton.setOnClickListener(this);
            return;
        } else
        {
            skipButton.setVisibility(4);
            skipButton.setOnClickListener(null);
            return;
        }
        errorDescription.setText(message);
        actionButton.setText(getString(0x7f080340));
        actionButton.setVisibility(0);
        actionButton.setOnClickListener(this);
          goto _L1
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity.setTitle(0x7f08009e);
    }

    protected void onBackPressed()
    {
        switch (_cls1..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Code[errorCode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            tryAgain("Back button");
            return;

        case 2: // '\002'
            skipMnvFlow("Skip not now");
            break;
        }
    }

    public void onClick(View view)
    {
        if (view == skipButton)
        {
            skipMnvFlow("Skip not now");
            return;
        }
        if (errorCode == ProfileServicesErrors.a.RETRY)
        {
            tryAgain("Try again button");
            return;
        } else
        {
            skipMnvFlow("Ok button");
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
        return layoutinflater.inflate(0x7f0300b3, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        setErrorCodeAndMessageFromStateData(getStateData());
        icon = (ImageView)view.findViewById(0x7f10044b);
        spriteAnimator = new SquareSpriteAnimator(new Handler(), icon, (byte)0);
        spriteAnimator.a();
        updateUi();
        logAnalyticsScreenLoad();
        setRetainInstance(true);
    }
}
