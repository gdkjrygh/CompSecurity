// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.AccessibleAutoCompleteTextView;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvRequestFragment, MnvManager, MnvStateData, MnvAnalytics, 
//            MnvUtil

public class MnvEnterPinFragment extends MnvRequestFragment
    implements android.os.Handler.Callback, TextWatcher, android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener
{
    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a CALL_ME;
        public static final a RESEND_CODE;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/mnv/MnvEnterPinFragment$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            RESEND_CODE = new a("RESEND_CODE", 0);
            CALL_ME = new a("CALL_ME", 1);
            $VALUES = (new a[] {
                RESEND_CODE, CALL_ME
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    private final class b
        implements Runnable
    {

        final MnvEnterPinFragment this$0;
        private TextView view;

        public final void run()
        {
            if (view != null)
            {
                view.setVisibility(0);
            }
        }

        public b(TextView textview)
        {
            this$0 = MnvEnterPinFragment.this;
            super();
            view = textview;
        }
    }


    private static final long ACTION_BUTTONS_DELAYED_SHOW = 60000L;
    private static final String KEY_DESCRIPTION_TEXT = "savedPinDescriptionText";
    private static final long TEXT_DESCRIPTION_DELAYED_SHOW = 500L;
    private static final int WHAT_CALL = 2;
    private static final int WHAT_SMS = 1;
    AccessibilityUtil accessibilityUtil;
    TextView callMeButton;
    AccessibleAutoCompleteTextView codeEdit;
    Button editNumberButton;
    private Handler handler;
    private boolean isActionButtonsVisible;
    private boolean isFirstTimeLoaded;
    private a message;
    MnvAnalytics mnvAnalytics;
    MnvUtil mnvUtil;
    ImageButton nextButton;
    TextView resendCodeButton;
    TextView textDescription;
    TextView textOr;

    public MnvEnterPinFragment()
    {
        isFirstTimeLoaded = true;
    }

    private void actionButtonsClicked(a a1)
    {
        displayTextDescDelayed();
        showMessage(a1);
        a a2 = a1;
        if (a1 == a.CALL_ME)
        {
            a2 = a1;
            if (message != a1)
            {
                a2 = a.RESEND_CODE;
            }
        }
        removeActionButtons(a2);
    }

    private void displayTextDescDelayed()
    {
        textDescription.setVisibility(4);
        handler.postDelayed(new b(textDescription), 500L);
    }

    private String getUserInputPin()
    {
        return codeEdit.getText().toString();
    }

    private void handleAccessibility()
    {
        if (accessibilityUtil.a())
        {
            accessibilityUtil.b(editNumberButton, 12);
            accessibilityUtil.b(codeEdit, 12);
            accessibilityUtil.b(resendCodeButton, 4);
            accessibilityUtil.b(callMeButton, 8);
            accessibilityUtil.b(nextButton, 14);
            codeEdit.setIncludeTextInContentDescription(true);
        }
    }

    private void hideSoftKeyboard()
    {
        hideSoftKeyboard(((android.widget.EditText) (codeEdit)));
    }

    private boolean isVoiceCall()
    {
        return mnvManager.getStateDataChange().getStateData().getCurrentState() == MnvManager.States.ADD_PHONE_VERIFY_BY_VOICE || mnvManager.getStateDataChange().getStateData().getCurrentState() == MnvManager.States.EDIT_PHONE_VERIFY_BY_VOICE;
    }

    private void logAnalyticsCallMeClick()
    {
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cp);
    }

    private void logAnalyticsEditButtonClick()
    {
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), "Pin entry screen", "Edit phone number link", AnalyticsEvent.cm);
    }

    private void logAnalyticsPinEntrySuccess()
    {
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cq);
    }

    private void logAnalyticsResendCodeClick()
    {
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.co);
    }

    private void logAnalyticsScreenLoad()
    {
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.ci);
    }

    private void removeActionButtons(a a1)
    {
        isFirstTimeLoaded = false;
        setActionButtonsVisibility(8, a1);
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[];
            static final int $SwitchMap$com$skype$android$app$mnv$MnvEnterPinFragment$Message[];
            static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$States[];
            static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message = new int[ProfileServicesErrors.b.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.CODE_WAS_INCORRECT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[ProfileServicesErrors.b.CODE_HAS_EXPIRED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                $SwitchMap$com$skype$android$app$mnv$MnvManager$States = new int[MnvManager.States.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.EDIT_RESEND_PIN_BY_SMS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.EDIT_RESEND_PIN_BY_VOICE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.VERIFIED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$skype$android$app$mnv$MnvEnterPinFragment$Message = new int[a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvEnterPinFragment$Message[a.RESEND_CODE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvEnterPinFragment$Message[a.CALL_ME.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR = new int[MnvBaseFragment.ERROR.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[MnvBaseFragment.ERROR.CODE_WAS_INCORRECT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[MnvBaseFragment.ERROR.CODE_HAS_EXPIRED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.android.app.mnv.MnvEnterPinFragment.Message[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            handler.sendMessageDelayed(handler.obtainMessage(1), 60000L);
            return;

        case 2: // '\002'
            handler.sendMessageDelayed(handler.obtainMessage(2), 60000L);
            break;
        }
    }

    private void setActionButtonsVisibility(int i, a a1)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isActionButtonsVisible = flag;
        switch (_cls2..SwitchMap.com.skype.android.app.mnv.MnvEnterPinFragment.Message[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            resendCodeButton.setVisibility(i);
            textOr.setVisibility(i);
            // fall through

        case 2: // '\002'
            callMeButton.setVisibility(i);
            break;
        }
    }

    private void submitPin()
    {
        String s = getUserInputPin();
        if (TextUtils.isEmpty(s) || s.length() < 4)
        {
            showError(MnvBaseFragment.ERROR.CODE_WAS_INCORRECT);
            return;
        } else
        {
            showProgressSpinner(mnvUtil.getNativeProgressTimeout(), getString(0x7f0803f4), new Runnable() {

                final MnvEnterPinFragment this$0;

                public final void run()
                {
                    onRequestTimeOut();
                }

            
            {
                this$0 = MnvEnterPinFragment.this;
                super();
            }
            });
            mnvManager.request(MnvManager.States.EDIT_VERIFY_PIN, s);
            logAnalyticsPinEntrySuccess();
            return;
        }
    }

    private void updateUi()
    {
        if (message == null)
        {
            message = a.RESEND_CODE;
        }
        if (isVoiceCall())
        {
            message = a.CALL_ME;
            showMessage(message);
        }
        if (isFirstTimeLoaded)
        {
            removeActionButtons(message);
        } else
        if (isActionButtonsVisible)
        {
            setActionButtonsVisibility(0, message);
            return;
        }
    }

    private void updateUiFromSavedInstanceState(Bundle bundle)
    {
        bundle = bundle.getString("savedPinDescriptionText");
        if (!TextUtils.isEmpty(bundle))
        {
            textDescription.setText(bundle);
        }
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag;
        if (editable.length() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (nextButton.isEnabled() != flag)
        {
            nextButton.setEnabled(flag);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public boolean handleMessage(Message message1)
    {
        switch (message1.what)
        {
        default:
            return false;

        case 1: // '\001'
            setActionButtonsVisibility(0, a.RESEND_CODE);
            return false;

        case 2: // '\002'
            setActionButtonsVisibility(0, a.CALL_ME);
            break;
        }
        return false;
    }

    protected void handleVerifiedNumber()
    {
        getActivity().setResult(-1);
        super.handleVerifiedNumber();
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cM);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity.setTitle(0x7f08009d);
    }

    protected void onBackPressed()
    {
        mnvManager.request(MnvManager.States.PREVIOUS);
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), "Pin entry screen", "Back button", AnalyticsEvent.cm);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756097: 
            logAnalyticsEditButtonClick();
            hideSoftKeyboard();
            mnvManager.request(MnvManager.States.PREVIOUS);
            getActivity().finish();
            return;

        case 2131756102: 
            mnvManager.request(MnvManager.States.EDIT_RESEND_PIN_BY_SMS);
            actionButtonsClicked(a.RESEND_CODE);
            logAnalyticsResendCodeClick();
            return;

        case 2131756104: 
            mnvManager.request(MnvManager.States.EDIT_RESEND_PIN_BY_VOICE);
            actionButtonsClicked(a.CALL_ME);
            logAnalyticsCallMeClick();
            return;

        case 2131756084: 
            submitPin();
            PerformanceLog.e.a("USER ACTION: mnv navigate to verified screen");
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
        return layoutinflater.inflate(0x7f0300b2, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        handler.removeCallbacksAndMessages(null);
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6 || i == 4)
        {
            submitPin();
            return true;
        } else
        {
            return false;
        }
    }

    public void onEvent(MnvManager.OnPinReceived onpinreceived)
    {
        if (!TextUtils.isEmpty(onpinreceived.getPin()))
        {
            codeEdit.setText(onpinreceived.getPin());
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (textDescription != null)
        {
            bundle.putString("savedPinDescriptionText", textDescription.getText().toString());
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        PerformanceLog.e.a("APP ACTION: mnv pin entry screen displayed");
        nextButton.setEnabled(false);
        codeEdit.addTextChangedListener(this);
        codeEdit.setOnEditorActionListener(this);
        handler = new Handler(this);
        ViewUtil.a(this, new View[] {
            editNumberButton, resendCodeButton, callMeButton, nextButton
        });
        handleAccessibility();
        if (bundle != null)
        {
            updateUiFromSavedInstanceState(bundle);
        } else
        {
            updateUi();
        }
        logAnalyticsScreenLoad();
    }

    protected void processAsyncError(MnvStateData mnvstatedata)
    {
        getActivity().setResult(-1);
        super.processAsyncError(mnvstatedata);
    }

    protected void processFailure(MnvStateData mnvstatedata)
    {
        switch (_cls2..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Message[mnvstatedata.getErrorState().message.ordinal()])
        {
        default:
            super.processFailure(mnvstatedata);
            return;

        case 1: // '\001'
            showError(MnvBaseFragment.ERROR.CODE_WAS_INCORRECT);
            dismissProgressSpinner();
            return;

        case 2: // '\002'
            showError(MnvBaseFragment.ERROR.CODE_HAS_EXPIRED);
            break;
        }
        dismissProgressSpinner();
    }

    protected void processSuccess(MnvStateData mnvstatedata)
    {
        switch (_cls2..SwitchMap.com.skype.android.app.mnv.MnvManager.States[mnvstatedata.getNextState().ordinal()])
        {
        default:
            super.processSuccess(mnvstatedata);
            return;

        case 1: // '\001'
            showMessage(a.RESEND_CODE);
            return;

        case 2: // '\002'
            showMessage(a.CALL_ME);
            break;
        }
    }

    public void showError(MnvBaseFragment.ERROR error)
    {
        int i;
        hideSoftKeyboard();
        i = 0;
        _cls2..SwitchMap.com.skype.android.app.mnv.MnvBaseFragment.ERROR[error.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 74
    //                   2 81;
           goto _L1 _L2 _L3
_L1:
        textDescription.setText(getString(i));
        if (accessibilityUtil.a())
        {
            accessibilityUtil.a(handler, textDescription);
        }
        return;
_L2:
        i = 0x7f0803f0;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f0803ef;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void showMessage(a a1)
    {
        int i;
        hideSoftKeyboard();
        i = 0;
        _cls2..SwitchMap.com.skype.android.app.mnv.MnvEnterPinFragment.Message[a1.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 49
    //                   2 56;
           goto _L1 _L2 _L3
_L1:
        textDescription.setText(getString(i));
        return;
_L2:
        i = 0x7f0804af;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f0804ae;
        if (true) goto _L1; else goto _L4
_L4:
    }
}
