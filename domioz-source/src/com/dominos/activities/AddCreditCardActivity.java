// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.text.InputFilter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.AnonymousCreditCard;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.CreditCardValidator;
import com.dominos.utils.ExpirationDateSpinnerUtility;
import com.dominos.utils.ViewWithErrorMessage;
import com.google.a.b.by;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, LabsCheckoutActivity_, UserLoginActivity_

public class AddCreditCardActivity extends BaseActivity
{

    private static final int ADD_CARD_REQUEST_CODE = 1;
    public static final String EDIT_UNSAVED_CARD_KEY = "cardEditFlag";
    private static final int GET_CARD_LIST_AND_RETURN_TO_CHECKOUT_REQUEST_CODE = 2;
    public static final String SUBMITTED_UNSAVED_CARD_KEY = "anonymousCardUsed";
    EditText mCardNicknameEditText;
    EditText mCardNumberEditText;
    private CreditCardValidator mCreditCardValidator;
    private boolean mIsEditUnsavedCardMode;
    LinearLayout mLineDividerBelowPrimaryCardControls;
    Spinner mMonthSpinner;
    CheckBox mPrimaryCardCheckBox;
    RelativeLayout mPrimaryCardControlsContainer;
    CheckBox mSaveToProfileCheckBox;
    RelativeLayout mSaveToProfileContainer;
    TextView mSaveToProfileHint;
    LinearLayout mSavedCardControlsContainer;
    EditText mSecurityCodeEditText;
    private ExpirationDateSpinnerUtility mSpinnerHelper;
    Spinner mYearSpinner;
    TextView mZipCodeHint;
    EditText mZipEditText;

    public AddCreditCardActivity()
    {
    }

    private AnonymousCreditCard getCreditCardFromUserInput()
    {
        String s1 = mCardNumberEditText.getText().toString();
        String s2 = (String)mMonthSpinner.getSelectedItem();
        String s3 = (String)mYearSpinner.getSelectedItem();
        String s4 = mSecurityCodeEditText.getText().toString();
        String s5 = mZipEditText.getText().toString();
        boolean flag1 = mSaveToProfileCheckBox.isChecked();
        String s;
        boolean flag;
        if (flag1)
        {
            flag = mPrimaryCardCheckBox.isChecked();
        } else
        {
            flag = false;
        }
        if (flag1)
        {
            s = mCardNicknameEditText.getText().toString();
        } else
        {
            s = "";
        }
        return (new com.dominos.android.sdk.common.dom.useraccounts.AnonymousCreditCard.Builder()).setFullNumber(s1).setMonth(s2).setYear(s3).setSecurityCode(s4).setZip(s5).setDefault(flag).setNickname(s).build();
    }

    private void initializeEditMode()
    {
        if (!mIsEditUnsavedCardMode) goto _L2; else goto _L1
_L1:
        Object obj = mOrderManager.getOrder().getPaymentList();
        if (obj == null || ((List) (obj)).size() <= 0) goto _L4; else goto _L3
_L3:
        Iterator iterator = ((List) (obj)).iterator();
_L8:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        obj = (LabsPayment)iterator.next();
        if (!((LabsPayment) (obj)).getPaymentType().equalsIgnoreCase("CreditCard")) goto _L8; else goto _L7
_L7:
        if (obj == null) goto _L10; else goto _L9
_L9:
        populateFieldsWithUnsavedCardInfo(((LabsPayment) (obj)));
_L2:
        return;
_L10:
        mIsEditUnsavedCardMode = false;
        return;
_L4:
        mIsEditUnsavedCardMode = false;
        return;
_L6:
        obj = null;
        if (true) goto _L7; else goto _L11
_L11:
    }

    private boolean isZipRequired()
    {
        return mStoreManager.getStoreProfile().isAvsEnabled() || StringHelper.equalsIgnoreCase(mOrderManager.getOrder().getServiceMethod(), "Delivery");
    }

    private void populateFieldsWithUnsavedCardInfo(LabsPayment labspayment)
    {
        String s = labspayment.getNumber();
        mCardNumberEditText.setText(s);
        mCardNumberEditText.setSelection(s.length());
        mMonthSpinner.setSelection(Integer.parseInt(labspayment.getExpirationMonth()));
        mSpinnerHelper.setYearSpinnerSelection(labspayment.getExpirationYear());
        mSecurityCodeEditText.setText(labspayment.getSecurityCode());
        mZipEditText.setText(labspayment.getBillingZip());
        mSaveToProfileCheckBox.setChecked(false);
        mPrimaryCardCheckBox.setChecked(false);
        mCardNicknameEditText.setText("");
    }

    private void saveCardToOrderObject(AnonymousCreditCard anonymouscreditcard)
    {
        anonymouscreditcard = new LabsPayment(anonymouscreditcard);
        mOrderManager.getOrder().clearPayments();
        mOrderManager.getOrder().setPaymentList(by.a(new LabsPayment[] {
            anonymouscreditcard
        }));
    }

    private void saveCreditCardToProfile(AnonymousCreditCard anonymouscreditcard)
    {
        mProfileManager.saveCardToProfile(anonymouscreditcard, new _cls4());
    }

    private void setControlVisibility()
    {
        if (!mProfileManager.isUserLoggedIn())
        {
            mSaveToProfileCheckBox.setChecked(false);
            mLineDividerBelowPrimaryCardControls.setVisibility(8);
            mSavedCardControlsContainer.setVisibility(8);
            return;
        }
        List list;
        if (mSaveToProfileCheckBox.isChecked())
        {
            mSavedCardControlsContainer.setVisibility(0);
        } else
        {
            mSavedCardControlsContainer.setVisibility(8);
        }
        list = mProfileManager.getSavedPaymentList();
        if (list != null && list.size() > 0)
        {
            mLineDividerBelowPrimaryCardControls.setVisibility(0);
            mPrimaryCardControlsContainer.setVisibility(0);
            return;
        } else
        {
            mLineDividerBelowPrimaryCardControls.setVisibility(8);
            mPrimaryCardControlsContainer.setVisibility(8);
            return;
        }
    }

    private void setHintLinesAndText()
    {
        if (!mProfileManager.isUserLoggedIn())
        {
            mSaveToProfileHint.setText(getString(0x7f08028e));
        } else
        {
            mSaveToProfileHint.setText(getString(0x7f08028f));
        }
        if (Locale.getDefault().getLanguage().equals("es"))
        {
            mZipCodeHint.setLines(2);
            if (!mProfileManager.isUserLoggedIn())
            {
                mSaveToProfileHint.setLines(4);
                return;
            } else
            {
                mSaveToProfileHint.setLines(2);
                return;
            }
        }
        mZipCodeHint.setLines(1);
        if (!mProfileManager.isUserLoggedIn())
        {
            mSaveToProfileHint.setLines(2);
            return;
        } else
        {
            mSaveToProfileHint.setLines(1);
            return;
        }
    }

    void afterViews()
    {
        Object obj = new android.text.InputFilter.AllCaps();
        android.text.InputFilter.LengthFilter lengthfilter = new android.text.InputFilter.LengthFilter(20);
        mCardNicknameEditText.setFilters(new InputFilter[] {
            obj, lengthfilter
        });
        mSpinnerHelper = new ExpirationDateSpinnerUtility(this, mMonthSpinner, mYearSpinner);
        mSpinnerHelper.initializeSpinners();
        mYearSpinner.post(new _cls1());
        obj = new ArrayList();
        ((List) (obj)).add(new ViewWithErrorMessage(mCardNumberEditText, getString(0x7f080081)));
        ((List) (obj)).add(new ViewWithErrorMessage(mMonthSpinner, getString(0x7f08007e)));
        ((List) (obj)).add(new ViewWithErrorMessage(mYearSpinner, getString(0x7f080084)));
        ((List) (obj)).add(new ViewWithErrorMessage(mSecurityCodeEditText, getString(0x7f0800ed)));
        if (isZipRequired())
        {
            ((List) (obj)).add(new ViewWithErrorMessage(mZipEditText, getString(0x7f080350)));
            mZipEditText.setHint(getString(0x7f08013d));
        }
        mCreditCardValidator = new CreditCardValidator(this, ((List) (obj)));
        if (!isZipRequired())
        {
            mSaveToProfileContainer.setVisibility(8);
            mZipEditText.addTextChangedListener(new ZipWatcher(mSaveToProfileContainer, mSaveToProfileCheckBox));
            mZipEditText.setHint(getString(0x7f08013c));
        }
    }

    protected void getAllSavedCreditCardsBeforeReturningToCheckout(String s)
    {
        mProfileManager.getAllCards(s, new _cls2());
    }

    protected void goToCheckoutScreen()
    {
        ((LabsCheckoutActivity_.IntentBuilder_)LabsCheckoutActivity_.intent(this).flags(0x4000000)).start();
    }

    protected void onActivityResult(int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            mLineDividerBelowPrimaryCardControls.setVisibility(8);
            break;
        }
        mSavedCardControlsContainer.setVisibility(8);
    }

    public void onResume()
    {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("cardEditFlag"))
        {
            mIsEditUnsavedCardMode = intent.getBooleanExtra("cardEditFlag", false);
            initializeEditMode();
        }
        if (!mProfileManager.isUserLoggedIn() && mSaveToProfileCheckBox.isChecked())
        {
            mSaveToProfileCheckBox.setChecked(false);
        }
        setHintLinesAndText();
        setControlVisibility();
        mCardNumberEditText.requestFocus();
    }

    protected void onSaveToProfileClick()
    {
        if (mSaveToProfileCheckBox.isChecked())
        {
            if (mProfileManager.isUserLoggedIn())
            {
                mLineDividerBelowPrimaryCardControls.setVisibility(0);
                mSavedCardControlsContainer.setVisibility(0);
                return;
            } else
            {
                sendToUserLoginActivity();
                return;
            }
        } else
        {
            mLineDividerBelowPrimaryCardControls.setVisibility(8);
            mSavedCardControlsContainer.setVisibility(8);
            return;
        }
    }

    protected void onSessionTimedOut()
    {
        mActivityHelper.showAlert(AlertType.SESSION_TIMED_OUT, new _cls3());
    }

    protected void onUseThisCreditCardClick()
    {
        Object obj = getCreditCardFromUserInput();
        String s = mCreditCardValidator.validate(((AnonymousCreditCard) (obj)), isZipRequired());
        if (StringHelper.isEmpty(s))
        {
            if (mSaveToProfileCheckBox.isChecked())
            {
                saveCreditCardToProfile(((AnonymousCreditCard) (obj)));
                return;
            } else
            {
                saveCardToOrderObject(((AnonymousCreditCard) (obj)));
                obj = new Intent();
                ((Intent) (obj)).putExtra("extraAnonymousCardUsed", true);
                setResult(-1, ((Intent) (obj)));
                finish();
                return;
            }
        } else
        {
            mActivityHelper.showAlert(AlertType.MISSING_CREDIT_CARD_FIELD, s, null);
            return;
        }
    }

    protected void primaryCardHelpClicked()
    {
        mActivityHelper.showAlert(AlertType.PRIMARY_CARD_HELP_DIALOG);
    }

    protected void saveToProfileHelpClicked()
    {
        mActivityHelper.showAlert(AlertType.SAVE_TO_PROFILE_HELP_DIALOG);
    }

    protected void secureCodeHelpClicked()
    {
        mActivityHelper.showAlert(AlertType.CVV_HELP_DIALOG);
    }

    protected void sendToUserLoginActivity()
    {
        startActivityForResult(UserLoginActivity_.intent(this).get().putExtra("return-to-caller", true).putExtra("caller-is-add-credit-card-activity", true), 6);
    }

    private class _cls4 extends com.dominos.android.sdk.core.user.UserProfileManager.SaveCardCallback
    {

        final AddCreditCardActivity this$0;

        public void onBegin()
        {
            showLoading();
        }

        public void onCreditCardSaved(String s)
        {
            showShortToast(getResources().getString(0x7f080083));
            mProfileManager.setNewSavedCardId(s);
            getAllSavedCreditCardsBeforeReturningToCheckout(mProfileManager.getCurrentUser().getCustomerId());
        }

        public void onCreditCardSavingError(com.dominos.android.sdk.core.user.UserProfileManager.CreditCardErrorType creditcarderrortype)
        {
            creditcarderrortype = CreditCardHelper.matchAlertTypes(creditcarderrortype);
            mActivityHelper.showAlert(creditcarderrortype);
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onUserNotAuthorized()
        {
            sendToUserLoginActivity();
        }

        _cls4()
        {
            this$0 = AddCreditCardActivity.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final AddCreditCardActivity this$0;

        public void run()
        {
            class _cls1
                implements android.widget.AdapterView.OnItemSelectedListener
            {

                final _cls1 this$1;

                public void onItemSelected(AdapterView adapterview, View view, int i, long l)
                {
                    mSecurityCodeEditText.requestFocus();
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            mYearSpinner.setOnItemSelectedListener(new _cls1());
        }

        _cls1()
        {
            this$0 = AddCreditCardActivity.this;
            super();
        }
    }


    private class ZipWatcher
        implements TextWatcher
    {

        private CheckBox saveToProfileCheckBox;
        private RelativeLayout saveToProfileLayout;
        final AddCreditCardActivity this$0;

        private boolean isZipValid(Editable editable)
        {
            return Pattern.matches("\\d{5}", editable.toString().trim());
        }

        public void afterTextChanged(Editable editable)
        {
            boolean flag = isZipValid(editable);
            editable = saveToProfileLayout;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            editable.setVisibility(i);
            if (!flag)
            {
                saveToProfileCheckBox.setChecked(false);
                onSaveToProfileClick();
            }
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public ZipWatcher(RelativeLayout relativelayout, CheckBox checkbox)
        {
            this$0 = AddCreditCardActivity.this;
            super();
            saveToProfileLayout = relativelayout;
            saveToProfileCheckBox = checkbox;
        }
    }


    private class _cls2 extends com.dominos.android.sdk.core.user.UserProfileManager.GetAllCreditCardsCallback
    {

        final AddCreditCardActivity this$0;

        public void onGettingCreditCardsFailed()
        {
            mActivityHelper.showAlert(AlertType.GET_CARD_LIST_ERROR_DIALOG);
            showShortToast(getResources().getString(0x7f080060));
        }

        public void onGettingCreditCardsSuccess()
        {
            goToCheckoutScreen();
        }

        _cls2()
        {
            this$0 = AddCreditCardActivity.this;
            super();
        }
    }


    private class _cls3 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final AddCreditCardActivity this$0;

        public void onAlertDismissed()
        {
            finish();
        }

        _cls3()
        {
            this$0 = AddCreditCardActivity.this;
            super();
        }
    }

}
