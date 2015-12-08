// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.EmailValidator;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, PizzaProfileActivity_, LabsCheckoutActivity_, CartActivity, 
//            RegistrationActivity_, LandingActivity_

public class UserLoginActivity extends BaseActivity
{

    public static final int ADDRESS_ACTIVITY_REQUEST_CODE = 4;
    public static final int ADDRESS_RESULT_SUCCESS = 5;
    public static final int CREDID_CARD_ACTIVITY_REQUEST_CODE = 6;
    public static final String EXTRA_CALLER_IS_ADDRESS_DELIVERY_ACTIVITY = "caller-is-address-delivery-activity";
    public static final String EXTRA_CALLER_IS_ADD_CREDIT_CARD_ACTIVITY = "caller-is-add-credit-card-activity";
    public static final String EXTRA_CALLER_IS_CART_ACTIVITY = "caller-is-cart-activity";
    public static final String EXTRA_CALLER_IS_CHECKOUT_FORM_ACTIVITY = "caller-is-checkout-form-activity";
    public static final String EXTRA_IS_CONFIRM_LOGIN = "confirm-login";
    public static final String EXTRA_RETURN_TO_CALLER = "return-to-caller";
    private static final int REGISTER_REQUEST_CODE = 2;
    private EditText emailEntry;
    private TextView forgotPasswordLink;
    private boolean isAddressDeliveryActivity;
    private boolean isCallerCartActivity;
    private boolean isCallerCheckoutFormActivity;
    private boolean isConfirmLogin;
    boolean mEnrollInLoyalty;
    private boolean mIsCreditCardActivity;
    TextView mNewProfileNoteTextView;
    MaskedWallet maskedWallet;
    private EditText passwordEntry;
    DominosPrefs_ prefs;
    private CheckBox rememberMe;
    private TextView rememberMeBenefitText;
    private boolean returnToCaller;

    public UserLoginActivity()
    {
    }

    private void initViews()
    {
        emailEntry = (EditText)findViewById(0x7f0f040c);
        passwordEntry = (EditText)findViewById(0x7f0f040d);
        rememberMe = (CheckBox)findViewById(0x7f0f0394);
        rememberMeBenefitText = (TextView)findViewById(0x7f0f0398);
        forgotPasswordLink = (TextView)findViewById(0x7f0f0414);
        forgotPasswordLink.setText(Html.fromHtml((new StringBuilder("<u>")).append(getString(0x7f08027d)).append("</u>").toString()));
        if (mProfileManager.getRememberMeCookie() != null)
        {
            rememberMe.setChecked(true);
        }
        populateEmailEntry();
        setUpListeners();
    }

    private void makeLogin()
    {
        String s = emailEntry.getText().toString().trim();
        String s1 = passwordEntry.getText().toString();
        if (StringHelper.isEmpty(s1) || !EmailValidator.isValidEmail(s))
        {
            mActivityHelper.showAlert(AlertType.SIGN_IN_FAILURE);
            return;
        } else
        {
            executeLogin(s, s1);
            return;
        }
    }

    private void populateEmailEntry()
    {
        String s;
        if (mProfileManager.getCurrentUser() != null)
        {
            s = mProfileManager.getCurrentUser().getEmail();
        } else
        {
            s = "";
        }
        if (s != null && !s.trim().equals(""))
        {
            emailEntry.setText(s);
            passwordEntry.requestFocus();
            return;
        } else
        {
            emailEntry.requestFocus();
            return;
        }
    }

    private void setUpListeners()
    {
        _cls2 _lcls2 = new _cls2();
        passwordEntry.setOnEditorActionListener(_lcls2);
        forgotPasswordLink.setOnClickListener(new _cls3());
    }

    private void setupConfirmLogin()
    {
        Object obj1 = emailEntry;
        Object obj;
        TextView textview;
        LinearLayout linearlayout;
        LinearLayout linearlayout1;
        Object obj2;
        LinearLayout linearlayout2;
        Button button;
        LinearLayout linearlayout3;
        if (mProfileManager.getCurrentUser() != null)
        {
            obj = mProfileManager.getCurrentUser().getEmail();
        } else
        if (mOrderManager.getOrder() != null)
        {
            obj = mOrderManager.getOrder().getEmail();
        } else
        {
            obj = "";
        }
        ((EditText) (obj1)).setText(((CharSequence) (obj)));
        passwordEntry.requestFocus();
        obj = (TextView)findViewById(0x7f0f040a);
        obj2 = (LinearLayout)findViewById(0x7f0f040b);
        linearlayout2 = (LinearLayout)findViewById(0x7f0f040e);
        button = (Button)findViewById(0x7f0f040f);
        obj1 = (TextView)findViewById(0x7f0f0417);
        textview = (TextView)findViewById(0x7f0f0418);
        linearlayout3 = (LinearLayout)findViewById(0x7f0f0416);
        linearlayout = (LinearLayout)findViewById(0x7f0f0419);
        linearlayout1 = (LinearLayout)findViewById(0x7f0f0393);
        ((TextView) (obj)).setVisibility(0);
        ((LinearLayout) (obj2)).setVisibility(8);
        linearlayout2.setVisibility(8);
        button.setText(getString(0x7f080199));
        linearlayout3.setVisibility(0);
        obj2 = (new StringBuilder()).append(getString(0x7f0802af)).append(" ");
        if (mProfileManager.getCurrentUser() != null)
        {
            obj = mProfileManager.getCurrentUser().getFirstName();
        } else
        {
            obj = "";
        }
        ((TextView) (obj1)).setText(((StringBuilder) (obj2)).append(((String) (obj))).append("?").toString());
        textview.setText(Html.fromHtml((new StringBuilder("<u>")).append(getString(0x7f0802ae)).append("</u>").toString()));
        textview.setOnClickListener(new _cls1());
        linearlayout.setVisibility(8);
        linearlayout1.setVisibility(8);
        rememberMeBenefitText.setVisibility(8);
    }

    private void startNextActivity()
    {
        if (!returnToCaller)
        {
            startActivity(new Intent(this, com/dominos/activities/PizzaProfileActivity_));
            return;
        }
        if (returnToCaller && isCallerCheckoutFormActivity)
        {
            LabsCheckoutActivity_.IntentBuilder_ intentbuilder_ = LabsCheckoutActivity_.intent(this).maskedWallet(maskedWallet);
            boolean flag;
            if (maskedWallet != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            startActivity(((LabsCheckoutActivity_.IntentBuilder_)intentbuilder_.useGoogleWallet(flag).flags(0x4000000)).get());
            return;
        }
        if (returnToCaller && isCallerCartActivity)
        {
            startActivity(new Intent(this, com/dominos/activities/CartActivity));
            return;
        }
        if (returnToCaller && isAddressDeliveryActivity)
        {
            setResult(5);
            return;
        }
        if (returnToCaller && mIsCreditCardActivity)
        {
            setResult(6);
            return;
        } else
        {
            setResult(-1);
            return;
        }
    }

    protected void dismissDialog()
    {
        hideLoading();
    }

    protected void executeLogin(String s, String s1)
    {
        showLoading();
        if (mOrderManager.getOrder() != null && s.length() != 0)
        {
            mOrderManager.getOrder().setEmail(s);
        }
        boolean flag = rememberMe.isChecked();
        if (!flag)
        {
            App.editor().remove("rememberMeCookieValue");
        }
        App.editor().putBoolean("remember-me", flag);
        App.editor().commit();
        mProfileManager.login(s, s1, flag, new _cls4());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 2 && j == -1)
        {
            startNextActivity();
            finish();
        }
    }

    void onAfterInject()
    {
        boolean flag;
        if (mLoyaltyManager.isLoyaltyAvailable() && mEnrollInLoyalty)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mEnrollInLoyalty = flag;
    }

    void onAfterViews()
    {
        if (mLoyaltyManager.isLoyaltyEnabled())
        {
            mNewProfileNoteTextView.setText(getString(0x7f0801b2));
        }
        setTitle(getString(0x7f0802ff));
        initViews();
        returnToCaller = getIntent().getBooleanExtra("return-to-caller", false);
        isCallerCheckoutFormActivity = getIntent().getBooleanExtra("caller-is-checkout-form-activity", false);
        isCallerCartActivity = getIntent().getBooleanExtra("caller-is-cart-activity", false);
        isConfirmLogin = getIntent().getBooleanExtra("confirm-login", false);
        isAddressDeliveryActivity = getIntent().getBooleanExtra("caller-is-address-delivery-activity", false);
        mIsCreditCardActivity = getIntent().getBooleanExtra("caller-is-add-credit-card-activity", false);
        if (isConfirmLogin)
        {
            setupConfirmLogin();
        }
        mAnalyticsUtil.postAccountLogin();
    }

    public void onCreateNewProfileClick(View view)
    {
        RegistrationActivity_.intent(this).startForResult(2);
    }

    public void onRememberMeHelpButtonClick()
    {
        mActivityHelper.showAlert(AlertType.REMEMBER_ME_HELP);
    }

    public void onResume()
    {
        super.onResume();
        getWindow().setSoftInputMode(3);
    }

    public void onSignInClick(View view)
    {
        makeLogin();
    }

    protected void saveCustomerWithLoyalty()
    {
        mProfileManager.enrollCustomerWithLoyalty(new _cls5());
    }

    public void showLoginErrorToast()
    {
        dismissDialog();
    }

    public void showLoginFailedDialog()
    {
        dismissDialog();
        mActivityHelper.showAlert(AlertType.SIGN_IN_FAILURE);
    }

    protected void startLandingActivity()
    {
        ((LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).start();
        finish();
    }



    private class _cls2
        implements android.widget.TextView.OnEditorActionListener
    {

        final UserLoginActivity this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6)
            {
                makeLogin();
                return true;
            } else
            {
                return false;
            }
        }

        _cls2()
        {
            this$0 = UserLoginActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final UserLoginActivity this$0;

        public void onClick(View view)
        {
            view = UserChangePassword_.intent(UserLoginActivity.this);
            view.get().putExtra("resetPassword", true);
            view.start();
        }

        _cls3()
        {
            this$0 = UserLoginActivity.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserLoginActivity this$0;

        public void onClick(View view)
        {
            mProfileManager.clearCurrentUser();
            finish();
        }

        _cls1()
        {
            this$0 = UserLoginActivity.this;
            super();
        }
    }


    private class _cls4 extends com.dominos.android.sdk.core.user.UserProfileManager.LoginCallback
    {

        final UserLoginActivity this$0;

        public void onLoginError()
        {
            hideLoading();
            showLoginErrorToast();
        }

        public void onLoginFailed()
        {
            hideLoading();
            showLoginFailedDialog();
        }

        public void onLoginSuccessful()
        {
            hideLoading();
            mAnalyticsUtil.postLogin(mProfileManager.getCurrentUser().getCustomerId());
            if (mEnrollInLoyalty && !mLoyaltyManager.isCustomerEnrolledInLoyalty())
            {
                saveCustomerWithLoyalty();
                return;
            } else
            {
                startNextActivity();
                finish();
                return;
            }
        }

        _cls4()
        {
            this$0 = UserLoginActivity.this;
            super();
        }
    }


    private class _cls5 extends com.dominos.android.sdk.core.user.UserProfileManager.UpdateCustomerWithLoyaltyCallback
    {

        final UserLoginActivity this$0;

        public void onAuthorizationRequired()
        {
        }

        public void onBegin()
        {
            super.onBegin();
        }

        public void onCustomerUpdateError()
        {
            mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
        }

        public void onCustomerUpdated()
        {
            startLandingActivity();
            mAnalyticsUtil.postLoyaltyEnrolledEvent();
        }

        public void onFinish()
        {
            super.onFinish();
            hideLoading();
        }

        public void onLoyaltyEnrollFail()
        {
            mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
        }

        _cls5()
        {
            this$0 = UserLoginActivity.this;
            super();
        }
    }

}
