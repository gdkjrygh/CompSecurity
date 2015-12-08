// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.app.dialer.SelectCountryActivity;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.AccessibleAutoCompleteTextView;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvRequestFragment, MnvStateData, MnvAnalytics, MnvUtil, 
//            MnvManager

public class MnvAddNumberFragment extends MnvRequestFragment
    implements TextWatcher, android.view.View.OnClickListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.TextView.OnEditorActionListener
{

    private static final String KEY_DESCRIPTION_TEXT = "savedDescriptionText";
    private static final String KEY_TITLE_TEXT = "savedTitleText";
    private static final int MAGIC_HEIGHT = 100;
    private static final String PHONE_NUMBER_SOURCE_BLANK = "blank";
    private static final String PHONE_NUMBER_SOURCE_MSA = "msa";
    private static final String PHONE_NUMBER_SOURCE_SIM = "sim";
    private static final String PHONE_NUMBER_SOURCE_SKYPE = "skype";
    private static final int SELECT_COUNTRY_ACTIVITY_REQUEST_CODE = 1;
    private static final Logger log = Logger.getLogger("MnvAddNumberFragment");
    AccessibilityUtil accessibilityUtil;
    EcsConfiguration configuration;
    ContactUtil contactUtil;
    TextView countryButton;
    private boolean isCurrentEventHandler;
    private boolean keyboardIsShowing;
    SkyLib lib;
    MnvAnalytics mnvAnalytics;
    MnvUtil mnvUtil;
    ImageButton nextButton;
    Button notNowButton;
    ImageButton notNowButtonX;
    AccessibleAutoCompleteTextView phoneEdit;
    private Rect rect;
    private View rootView;
    TextView textDescription;
    TextView textDisclaimer;
    TextView textTitle;

    public MnvAddNumberFragment()
    {
        rect = new Rect();
        rootView = null;
        keyboardIsShowing = false;
    }

    private MnvManager.States getNextState()
    {
        if (isReferrerInsideApp)
        {
            return MnvManager.States.PRE_CHECK;
        }
        static final class _cls5
        {

            static final int $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[];
            static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$States[];
            static final int $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE[];
            static final int $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE[];
            static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE = new int[MnvStateData.PHONE_TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE[MnvStateData.PHONE_TYPE.SERVER_ENTERED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE[MnvStateData.PHONE_TYPE.DEVICE_ENTERED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE[MnvStateData.PHONE_TYPE.USER_ENTERED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE = new int[MnvStateData.PHONE_SOURCE.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE[MnvStateData.PHONE_SOURCE.MSA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE[MnvStateData.PHONE_SOURCE.SKYPE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE[MnvStateData.PHONE_SOURCE.DEVICE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR = new int[MnvBaseFragment.ERROR.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[MnvBaseFragment.ERROR.INVALID_PHONE_NUMBER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message = new int[ProfileServicesErrors.b.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.PHONE_ALREADY_EXISTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.INVALID_PHONE_NUMBER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.UNSUPPORTED_VERIFY_METHOD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                $SwitchMap$com$skype$android$app$mnv$MnvManager$States = new int[MnvManager.States.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ADD_PHONE_VERIFY_BY_VOICE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.EDIT_PHONE_VERIFY_BY_VOICE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.EDIT_VERIFY_PIN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ERRORS_PHONE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ERRORS_UNSUPPORTED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.UNKNOWN_STATE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5..SwitchMap.com.skype.android.app.mnv.MnvManager.States[getStateData().getNextState().ordinal()])
        {
        case 5: // '\005'
        default:
            return getStateData().getNextState();

        case 4: // '\004'
        case 6: // '\006'
            return MnvManager.States.ADD_PHONE_VERIFY_BY_SMS;
        }
    }

    private void handleAccessibility()
    {
        if (accessibilityUtil.a())
        {
            accessibilityUtil.b(countryButton, 12);
            accessibilityUtil.b(notNowButton, 12);
            accessibilityUtil.b(phoneEdit, 12);
            accessibilityUtil.b(nextButton, 15);
            phoneEdit.setIncludeTextInContentDescription(true);
        }
    }

    private void logAnalyticsPhoneTypePresented(String s)
    {
        String s1 = "noSource";
        if (!s.equalsIgnoreCase("sim")) goto _L2; else goto _L1
_L1:
        s1 = "sim";
_L4:
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), s1, AnalyticsEvent.cs);
        return;
_L2:
        if (s.equalsIgnoreCase("skype"))
        {
            s1 = "skype";
        } else
        if (s.equalsIgnoreCase("msa"))
        {
            s1 = "msa";
        } else
        if (s.equalsIgnoreCase("blank"))
        {
            s1 = "blank";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void navigateToPinEntry()
    {
        navigation.startMnvPinEntryWithResult(getReferrer(), 0);
        isCurrentEventHandler = false;
    }

    private void reportIfUserSubmittedSameNumberDuringSignIn(String s, String s1, CountryCode countrycode)
    {
        if (getReferrer() == MnvCases.REFERRER.SIGN_IN)
        {
            if (TextUtils.isEmpty(s))
            {
                log.info("Account was not signed in with a phone number.");
                return;
            }
            s1 = lib.normalizePSTNWithCountry(s1, countrycode.c()).m_normalized;
            if (mnvUtil.comparePhoneNumbers(s1, s))
            {
                mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cS);
                return;
            }
        }
    }

    private void setCountryCode(CountryCode countrycode)
    {
label0:
        {
            CountryCode countrycode1 = countrycode;
            if (countrycode != null)
            {
                countrycode = countrycode1;
                if (countrycode1.a() != null)
                {
                    break label0;
                }
            }
            countrycode = mnvUtil.getCountryCode();
        }
        CountryCode countrycode2 = countrycode;
        if (countrycode == null)
        {
            countrycode2 = contactUtil.b();
        }
        countrycode = countrycode2;
        if (countrycode2 == null)
        {
            countrycode = contactUtil.a(0);
        }
        countryButton.setText(contactUtil.b(countrycode));
        getStateData().setCountryCode(countrycode);
    }

    private void setEnteredNumber()
    {
        String s = phoneEdit.getText().toString();
        String s1 = getStateData().getPhoneNumber();
        if (s1 != null && !s1.equalsIgnoreCase(s))
        {
            mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cn);
        }
        getStateData().setPhoneNumber(s);
    }

    private void setPresentedPhoneText(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = mnvUtil.getUserPhoneNumber();
        }
        phoneEdit.setText(s1);
        phoneEdit.post(new Runnable() {

            final MnvAddNumberFragment this$0;

            public final void run()
            {
                phoneEdit.setSelection(phoneEdit.getText().length());
            }

            
            {
                this$0 = MnvAddNumberFragment.this;
                super();
            }
        });
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

    private void startSpinner()
    {
        showProgressSpinner(mnvUtil.getNativeProgressTimeout(), getString(0x7f0803f5), new Runnable() {

            final MnvAddNumberFragment this$0;

            public final void run()
            {
                onRequestTimeOut();
            }

            
            {
                this$0 = MnvAddNumberFragment.this;
                super();
            }
        });
    }

    private void submitPhone()
    {
        setEnteredNumber();
        String s = mnvUtil.cleanPhoneNumber(getStateData().getPhoneNumber(), getStateData().getCountryCode().c());
        log.info((new StringBuilder("MNV normalized phone number: ")).append(s).toString());
        if (TextUtils.isEmpty(s))
        {
            showError(MnvBaseFragment.ERROR.INVALID_PHONE_NUMBER);
            return;
        } else
        {
            MnvManager.States states = getNextState();
            MnvStateData mnvstatedata = getStateData();
            CountryCode countrycode = mnvstatedata.getCountryCode();
            String s1 = mnvUtil.getUserCountry(countrycode.b(), countrycode.c());
            startSpinner();
            mnvManager.request(states, s, s1);
            mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cL);
            reportIfUserSubmittedSameNumberDuringSignIn(mnvstatedata.getSignInPSTNWithCountry(), s, countrycode);
            return;
        }
    }

    private void updateUi()
    {
        MnvStateData mnvstatedata;
        Object obj;
        mnvstatedata = getStateData();
        obj = mnvstatedata.getSource();
        _cls5..SwitchMap.com.skype.android.app.mnv.MnvStateData.PHONE_SOURCE[((MnvStateData.PHONE_SOURCE) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 143
    //                   2 166
    //                   3 175;
           goto _L1 _L2 _L3 _L4
_L1:
        logAnalyticsPhoneTypePresented("blank");
_L8:
        obj = mnvstatedata.getType();
        log.info((new StringBuilder("MNV updateUi phone entry state: ")).append(((MnvStateData.PHONE_TYPE) (obj)).name()).toString());
        _cls5..SwitchMap.com.skype.android.app.mnv.MnvStateData.PHONE_TYPE[((MnvStateData.PHONE_TYPE) (obj)).ordinal()];
        JVM INSTR tableswitch 1 2: default 112
    //                   1 184
    //                   2 201;
           goto _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_201;
_L5:
        textTitle.setText(getString(0x7f08025a));
_L9:
        setPresentedPhoneText(mnvstatedata.getPhoneNumber());
        setCountryCode(mnvstatedata.getCountryCode());
        return;
_L2:
        textDescription.setText(getString(0x7f0804a8));
        logAnalyticsPhoneTypePresented("msa");
          goto _L8
_L3:
        logAnalyticsPhoneTypePresented("skype");
          goto _L8
_L4:
        logAnalyticsPhoneTypePresented("sim");
          goto _L8
_L6:
        textTitle.setText(getString(0x7f080258));
          goto _L9
        textTitle.setText(getString(0x7f080259));
          goto _L9
    }

    private void updateUiFromSavedInstanceState(Bundle bundle)
    {
        String s = bundle.getString("savedTitleText");
        if (!TextUtils.isEmpty(s) && textTitle != null)
        {
            textTitle.setText(s);
        }
        bundle = bundle.getString("savedDescriptionText");
        if (!TextUtils.isEmpty(bundle) && textDescription != null)
        {
            textDescription.setText(bundle);
        }
        countryButton.setText(contactUtil.b(getStateData().getCountryCode()));
    }

    public void afterTextChanged(Editable editable)
    {
        ImageButton imagebutton = nextButton;
        boolean flag;
        if (!TextUtils.isEmpty(editable.toString()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    protected void handleVerifiedNumber()
    {
        super.handleVerifiedNumber();
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cM);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        rootView = ((ViewGroup)getActivity().findViewById(0x1020002)).getChildAt(0);
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        phoneEdit.addTextChangedListener(this);
        phoneEdit.setOnEditorActionListener(this);
        ViewUtil.a(this, new View[] {
            nextButton, countryButton, notNowButton, notNowButtonX
        });
        handleAccessibility();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1 && i == 1)
        {
            i = intent.getIntExtra("country_list_item", -1);
            if (i >= 0)
            {
                setCountryCode(contactUtil.a(i));
            }
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity.setTitle(0x7f08009c);
    }

    protected void onBackPressed()
    {
        skipMnvFlow();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756122: 
        case 2131756123: 
            skipMnvFlow();
            return;

        case 2131756084: 
            submitPhone();
            PerformanceLog.e.a("USER ACTION: mnv navigate to pin entry screen");
            return;

        case 2131756089: 
            view = new Intent(getActivity(), com/skype/android/app/dialer/SelectCountryActivity);
            view.putExtra("style", 0x7f090121);
            startActivityForResult(view, 1);
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
        super.onCreateView(layoutinflater, viewgroup, bundle);
        return layoutinflater.inflate(0x7f0300b0, viewgroup, false);
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6 || i == 4)
        {
            submitPhone();
            return true;
        } else
        {
            return false;
        }
    }

    public void onEvent(MnvManager.OnPinReceived onpinreceived)
    {
        if (isCurrentEventHandler && !TextUtils.isEmpty(onpinreceived.getPin()))
        {
            showProgressSpinner(mnvUtil.getNativeProgressTimeout(), getString(0x7f0803f4), new Runnable() {

                final MnvAddNumberFragment this$0;

                public final void run()
                {
                    onRequestTimeOut();
                }

            
            {
                this$0 = MnvAddNumberFragment.this;
                super();
            }
            });
            mnvManager.request(MnvManager.States.EDIT_VERIFY_PIN, onpinreceived.getPin());
            mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cr);
        }
    }

    public void onEvent(MnvManager.a a)
    {
        if (isCurrentEventHandler)
        {
            super.onEvent(a);
        }
    }

    public void onGlobalLayout()
    {
        rootView.getWindowVisibleDisplayFrame(rect);
        boolean flag;
        if (rootView.getRootView().getHeight() - (rect.bottom - rect.top) > 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != keyboardIsShowing)
        {
            keyboardIsShowing = flag;
            byte byte0;
            if (keyboardIsShowing)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            textDescription.setVisibility(byte0);
            textDisclaimer.setVisibility(byte0);
        }
    }

    public void onResume()
    {
        super.onResume();
        isCurrentEventHandler = true;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (textTitle != null)
        {
            bundle.putString("savedTitleText", textTitle.getText().toString());
        }
        if (textDescription != null)
        {
            bundle.putString("savedDescriptionText", textDescription.getText().toString());
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        PerformanceLog.e.a("APP ACTION: mnv add number screen displayed");
        if (bundle != null)
        {
            updateUiFromSavedInstanceState(bundle);
        } else
        {
            updateUi();
        }
        showSkipButton();
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.ch);
    }

    protected void processFailure(MnvStateData mnvstatedata)
    {
        ProfileServicesErrors.ErrorState errorstate = mnvstatedata.getErrorState();
        switch (_cls5..SwitchMap.com.skype.android.app.mnv.MnvManager.States[mnvstatedata.getNextState().ordinal()])
        {
        default:
            super.processFailure(mnvstatedata);
            return;

        case 4: // '\004'
            switch (_cls5..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Message[errorstate.message.ordinal()])
            {
            default:
                dismissProgressSpinner();
                return;

            case 1: // '\001'
                mnvManager.request(MnvManager.States.EDIT_PHONE_VERIFY_BY_SMS);
                mnvstatedata.setCurrentState(MnvManager.States.EDIT_PHONE_VERIFY_BY_SMS);
                return;

            case 2: // '\002'
                showError(MnvBaseFragment.ERROR.INVALID_PHONE_NUMBER);
                break;
            }
            dismissProgressSpinner();
            return;

        case 5: // '\005'
            switch (_cls5..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Message[errorstate.message.ordinal()])
            {
            default:
                return;

            case 3: // '\003'
                break;
            }
            break;
        }
        if (mnvstatedata.getCurrentState() == MnvManager.States.EDIT_PHONE_VERIFY_BY_SMS)
        {
            mnvManager.request(MnvManager.States.EDIT_PHONE_VERIFY_BY_VOICE);
            mnvstatedata.setCurrentState(MnvManager.States.EDIT_PHONE_VERIFY_BY_VOICE);
            return;
        } else
        {
            mnvManager.request(MnvManager.States.ADD_PHONE_VERIFY_BY_VOICE);
            mnvstatedata.setCurrentState(MnvManager.States.ADD_PHONE_VERIFY_BY_VOICE);
            return;
        }
    }

    protected void processSuccess(MnvStateData mnvstatedata)
    {
        switch (_cls5..SwitchMap.com.skype.android.app.mnv.MnvManager.States[mnvstatedata.getNextState().ordinal()])
        {
        default:
            super.processSuccess(mnvstatedata);
            return;

        case 1: // '\001'
        case 2: // '\002'
            navigateToPinEntry();
            dismissProgressSpinner();
            return;

        case 3: // '\003'
            mnvstatedata = getStateData().getCountryCode();
            break;
        }
        String s = mnvUtil.cleanPhoneNumber(phoneEdit.getText().toString(), mnvstatedata.c());
        if (mnvUtil.isDeviceNumber(mnvstatedata, s))
        {
            showProgressSpinner(mnvUtil.getSmsProgressTimeout(), getString(0x7f0803f5), new Runnable() {

                final MnvAddNumberFragment this$0;

                public final void run()
                {
                    navigateToPinEntry();
                    dismissProgressSpinner();
                }

            
            {
                this$0 = MnvAddNumberFragment.this;
                super();
            }
            });
            return;
        } else
        {
            navigateToPinEntry();
            dismissProgressSpinner();
            return;
        }
    }

    public void showError(MnvBaseFragment.ERROR error)
    {
        int i;
        hideSoftKeyboard(phoneEdit);
        i = 0;
        _cls5..SwitchMap.com.skype.android.app.mnv.MnvBaseFragment.ERROR[error.ordinal()];
        JVM INSTR tableswitch 1 1: default 36
    //                   1 117;
           goto _L1 _L2
_L1:
        log.info((new StringBuilder("MNV unknown showError: ")).append(error.name()).toString());
_L4:
        textTitle.setText(getString(0x7f080257));
        textDescription.setText(getString(i));
        if (accessibilityUtil.a())
        {
            accessibilityUtil.a(new Handler(), textDescription);
        }
        return;
_L2:
        i = 0x7f0803f1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void skipMnvFlow()
    {
        reportMnvSkipAndNavigateToHome("Add phone screen", "Skip not now");
        mnvManager.onSkip(2);
    }


}
