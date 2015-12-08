// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Spinner;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.dom.useraccounts.CreditCardToken;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.CreditCardHelper;
import com.dominos.utils.CreditCardValidator;
import com.dominos.utils.ExpirationDateSpinnerUtility;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, UserLoginActivity_

public class EditCreditCardActivity extends BaseActivity
    implements com.dominos.android.sdk.data.http.power.PowerCallback.OnError
{

    private static final int CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG = 5;
    private static final int DUPLICATE_NICKNAME_DIALOG = 2;
    private static final int GENERAL_ERROR_DIALOG = 3;
    private static final int GET_CARD_LIST_ERROR_DIALOG = 4;
    private String billingZip;
    private String cardId;
    private String cardType;
    private int expirationMonth;
    private int expirationYear;
    private Boolean isDefault;
    private String lastFour;
    EditText mCardNicknameEditText;
    EditText mCardNumberEditText;
    Spinner mMonthSpinner;
    Spinner mYearSpinner;
    private String nickName;

    public EditCreditCardActivity()
    {
    }

    private CreditCardToken buildCreditCardToken()
    {
        return (new com.dominos.android.sdk.common.dom.useraccounts.CreditCardToken.Builder()).setId(cardId).setLastFour(lastFour).setCardType(cardType).setExpirationMonth(expirationMonth).setExpirationYear(expirationYear).setBillingZip(billingZip).setDefault(isDefault.booleanValue()).setNickName(nickName).build();
    }

    private void deleteCardFromProfile(CreditCardToken creditcardtoken)
    {
        if (mProfileManager.getAuthorizationCode() == null)
        {
            sendToUserLoginActivity();
            return;
        } else
        {
            mProfileManager.deleteCreditCard(creditcardtoken, new _cls2());
            return;
        }
    }

    private void getAllSavedCreditCardsBeforeReturningToCheckout(String s)
    {
        mProfileManager.getAllCards(s, new _cls3());
    }

    private boolean isValidExpirationDate()
    {
        String s = mMonthSpinner.getSelectedItem().toString();
        String s1 = mYearSpinner.getSelectedItem().toString();
        return NumberUtil.isInteger(s) && NumberUtil.isInteger(s1) && CreditCardValidator.isValidExpirationDate(mMonthSpinner.getSelectedItem().toString(), mYearSpinner.getSelectedItem().toString());
    }

    private void sendToUserLoginActivity()
    {
        Intent intent = new Intent(this, com/dominos/activities/UserLoginActivity_);
        intent.putExtra("return-to-caller", true);
        startActivity(intent);
    }

    private void updateCardinProfile(CreditCardToken creditcardtoken)
    {
        if (mProfileManager.getAuthorizationCode() == null)
        {
            sendToUserLoginActivity();
            return;
        } else
        {
            mProfileManager.updateCreditCard(creditcardtoken, new _cls1());
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            cardId = bundle.getString("CardId");
            lastFour = bundle.getString("LastFour");
            cardType = bundle.getString("CardType");
            expirationMonth = Integer.valueOf(bundle.getString("ExpirationMonth")).intValue();
            expirationYear = Integer.valueOf(bundle.getString("ExpirationYear")).intValue();
            billingZip = bundle.getString("BillingZip");
            isDefault = Boolean.valueOf(bundle.getString("IsDefault"));
            nickName = bundle.getString("NickName");
        }
    }

    public void onDeleteThisCreditCardClick(View view)
    {
        if (expirationMonth == 0)
        {
            expirationMonth = Integer.parseInt((String)mMonthSpinner.getItemAtPosition(1));
        }
        if (expirationYear == 0)
        {
            expirationYear = Integer.parseInt((String)mYearSpinner.getItemAtPosition(1));
        }
        deleteCardFromProfile(buildCreditCardToken());
    }

    public void onError(Exception exception, String s)
    {
        hideLoading();
        exception = CreditCardHelper.parseJsonForErrorCodes(s);
        mActivityHelper.showAlert(exception);
    }

    protected void onSetupView()
    {
        mCardNicknameEditText.setText(nickName);
        mCardNicknameEditText.setEnabled(false);
        mCardNumberEditText.setText((new StringBuilder()).append(getString(0x7f080111)).append(" ").append(lastFour).toString());
        mCardNumberEditText.setEnabled(false);
        ExpirationDateSpinnerUtility expirationdatespinnerutility = new ExpirationDateSpinnerUtility(this, mMonthSpinner, mYearSpinner);
        expirationdatespinnerutility.initializeSpinners();
        expirationdatespinnerutility.setYearSpinnerSelection(String.valueOf(expirationYear));
        expirationdatespinnerutility.setMonthSpinnerSelection(String.valueOf(expirationMonth));
        getWindow().setSoftInputMode(3);
    }

    public void onUpdateThisCreditCardClick(View view)
    {
        if (isValidExpirationDate())
        {
            expirationMonth = Integer.parseInt(mMonthSpinner.getSelectedItem().toString());
            expirationYear = Integer.parseInt(mYearSpinner.getSelectedItem().toString());
            updateCardinProfile(buildCreditCardToken());
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.EXPIRATION_DATE_INVALID);
            return;
        }
    }



    private class _cls2 extends com.dominos.android.sdk.core.user.UserProfileManager.DeleteCreditCardCallback
    {

        final EditCreditCardActivity this$0;

        public void onCreditCardDeleted()
        {
            hideLoading();
            showShortToast(getString(0x7f08007d));
            getAllSavedCreditCardsBeforeReturningToCheckout(mProfileManager.getCurrentUser().getCustomerId());
            showLoading();
        }

        public void onCreditCardDeletingError()
        {
            showShortToast(getString(0x7f080115));
        }

        _cls2()
        {
            this$0 = EditCreditCardActivity.this;
            super();
        }
    }


    private class _cls3 extends com.dominos.android.sdk.core.user.UserProfileManager.GetAllCreditCardsCallback
    {

        final EditCreditCardActivity this$0;

        public void onGettingCreditCardsFailed()
        {
            hideLoading();
            showDialog(4);
        }

        public void onGettingCreditCardsSuccess()
        {
            hideLoading();
            LabsCheckoutActivity_.intent(EditCreditCardActivity.this).cardId(cardId).start();
        }

        _cls3()
        {
            this$0 = EditCreditCardActivity.this;
            super();
        }
    }


    private class _cls1 extends com.dominos.android.sdk.core.user.UserProfileManager.UpdateCreditCardCallback
    {

        final EditCreditCardActivity this$0;

        public void onCreditCardSaved()
        {
            hideLoading();
            showShortToast(getString(0x7f080083));
            getAllSavedCreditCardsBeforeReturningToCheckout(mProfileManager.getCurrentUser().getCustomerId());
            showLoading();
        }

        public void onCreditCardSavingError(com.dominos.android.sdk.core.user.UserProfileManager.CreditCardErrorType creditcarderrortype)
        {
            mActivityHelper.showAlert(CreditCardHelper.matchAlertTypes(creditcarderrortype));
        }

        _cls1()
        {
            this$0 = EditCreditCardActivity.this;
            super();
        }
    }

}
