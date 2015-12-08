// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.text.InputFilter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.inputfilters.NameInputFilter;
import com.dominos.inputfilters.SpacesInputFilter;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.EmailValidator;
import com.dominos.utils.PhoneTextWatcher;
import com.dominos.utils.TextFocusChangeListener;
import com.dominos.views.LoyaltyEnrollView;
import com.dominos.views.LoyaltyEnrollView_;
import com.google.a.b.ar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, UserLoginActivity_, TermsWebActivity, LoyaltyInfoFragment, 
//            LoyaltyTermsWebActivity_

public class RegistrationActivity extends BaseActivity
    implements com.dominos.android.sdk.data.http.power.PowerCallback.OnError, com.dominos.views.LoyaltyEnrollView.EventListener
{

    private static final ar TEST_STORES = ar.a("9560", "9561");
    private EditText confirmEmailTextBox;
    private EditText confirmPasswordTextBox;
    private CheckBox emailOptIn;
    private EditText emailTextBox;
    private EditText firstNameTextBox;
    private EditText lastNameTextBox;
    TextView lblTermsOfUse;
    Bundle mBundle;
    private LoyaltyEnrollView mLoyaltyEnrollView;
    boolean mPreSelectLoyalty;
    private EditText passwordTextBox;
    private EditText phoneExtentionTextBox;
    private EditText phoneTextBox;
    private CheckBox rememberMe;

    public RegistrationActivity()
    {
    }

    private void addListeners()
    {
        TextFocusChangeListener textfocuschangelistener = new TextFocusChangeListener();
        firstNameTextBox.setOnFocusChangeListener(textfocuschangelistener);
        lastNameTextBox.setOnFocusChangeListener(textfocuschangelistener);
        emailTextBox.setOnFocusChangeListener(textfocuschangelistener);
        confirmEmailTextBox.setOnFocusChangeListener(textfocuschangelistener);
    }

    private void fillInUserInfoFromCheckout()
    {
        if (App.settings().getBoolean("UTILIZE_USER_INFO_FROM_CHECKOUT", false))
        {
            firstNameTextBox.setText(App.settings().getString("CHECKOUT_FIRST_NAME", ""));
            lastNameTextBox.setText(App.settings().getString("CHECKOUT_LAST_NAME", ""));
            phoneTextBox.setText(App.settings().getString("CHECKOUT_PHONE", ""));
            phoneExtentionTextBox.setText(App.settings().getString("CHECKOUT_PHONE_EXT", ""));
            emailTextBox.setText(App.settings().getString("CHECKOUT_EMAIL", ""));
        }
    }

    private void fillLoyaltyEnrollView()
    {
        if (mLoyaltyManager.isLoyaltyAvailable())
        {
            mLoyaltyEnrollView = LoyaltyEnrollView_.build(this, getString(0x7f080106), true, mPreSelectLoyalty);
            ((LinearLayout)findViewById(0x7f0f0399)).addView(mLoyaltyEnrollView);
            mLoyaltyEnrollView.setEventListener(this);
        }
    }

    private EditText getConfirmPasswordTextBox()
    {
        if (confirmPasswordTextBox == null)
        {
            SpacesInputFilter spacesinputfilter = new SpacesInputFilter(this);
            confirmPasswordTextBox = (EditText)findViewById(0x7f0f0392);
            confirmPasswordTextBox.setFilters(new InputFilter[] {
                spacesinputfilter, new android.text.InputFilter.LengthFilter(20)
            });
            confirmPasswordTextBox.setInputType(0x80081);
            confirmPasswordTextBox.setTypeface(FontManager.getDominosFont((Activity)confirmPasswordTextBox.getContext()));
        }
        return confirmPasswordTextBox;
    }

    private EditText getPasswordTextBox()
    {
        if (passwordTextBox == null)
        {
            SpacesInputFilter spacesinputfilter = new SpacesInputFilter(this);
            passwordTextBox = (EditText)findViewById(0x7f0f0391);
            passwordTextBox.setFilters(new InputFilter[] {
                spacesinputfilter, new android.text.InputFilter.LengthFilter(20)
            });
            passwordTextBox.setInputType(0x80081);
            passwordTextBox.setTypeface(FontManager.getDominosFont((Activity)passwordTextBox.getContext()));
        }
        return passwordTextBox;
    }

    private EditText getPhoneTextBox()
    {
        if (phoneTextBox == null)
        {
            phoneTextBox = (EditText)findViewById(0x7f0f038d);
            Object obj = new android.text.InputFilter.LengthFilter(10);
            phoneTextBox.setFilters(new InputFilter[] {
                obj
            });
            obj = new PhoneTextWatcher(this);
            phoneTextBox.addTextChangedListener(((android.text.TextWatcher) (obj)));
        }
        return phoneTextBox;
    }

    private void initActivity()
    {
        ((TextView)findViewById(0x7f0f0100)).setText(getString(0x7f080268));
        phoneTextBox = getPhoneTextBox();
        phoneExtentionTextBox = (EditText)findViewById(0x7f0f038e);
        firstNameTextBox = (EditText)findViewById(0x7f0f038b);
        lastNameTextBox = (EditText)findViewById(0x7f0f038c);
        emailTextBox = (EditText)findViewById(0x7f0f038f);
        confirmEmailTextBox = (EditText)findViewById(0x7f0f0390);
        Object obj = new SpacesInputFilter(this);
        emailTextBox.setFilters(new InputFilter[] {
            obj
        });
        confirmEmailTextBox.setFilters(new InputFilter[] {
            obj
        });
        rememberMe = (CheckBox)findViewById(0x7f0f0394);
        emailOptIn = (CheckBox)findViewById(0x7f0f039c);
        obj = new NameInputFilter(this);
        firstNameTextBox.setFilters(new InputFilter[] {
            obj
        });
        lastNameTextBox.setFilters(new InputFilter[] {
            obj
        });
        passwordTextBox = getPasswordTextBox();
        confirmPasswordTextBox = getConfirmPasswordTextBox();
        obj = getString(0x7f0802f7);
        lblTermsOfUse.setText(Html.fromHtml(((String) (obj))));
        fillInUserInfoFromCheckout();
        fillLoyaltyEnrollView();
    }

    private static boolean isEmpty(String s)
    {
        return s == null || s.trim().length() <= 0;
    }

    private boolean isEnrollInLoyalty()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mLoyaltyManager.isLoyaltyAvailable())
        {
            flag = flag1;
            if (mLoyaltyEnrollView != null)
            {
                flag = mLoyaltyEnrollView.isEnrollChecked();
            }
        }
        return flag;
    }

    private void removeUserInfoFromCheckout()
    {
        App.editor().putBoolean("UTILIZE_USER_INFO_FROM_CHECKOUT", false);
        App.editor().remove("CHECKOUT_FIRST_NAME");
        App.editor().remove("CHECKOUT_LAST_NAME");
        App.editor().remove("CHECKOUT_PHONE");
        App.editor().remove("CHECKOUT_PHONE_EXT");
        App.editor().remove("CHECKOUT_EMAIL");
        App.editor().commit();
    }

    private void saveCustomer(UserObject userobject, boolean flag)
    {
        mProfileManager.saveNewCustomer(userobject, flag, new _cls1());
    }

    private void sendToUserLoginActivity()
    {
        Intent intent = new Intent(this, com/dominos/activities/UserLoginActivity_);
        intent.putExtra("return-to-caller", false);
        startActivity(intent);
    }

    private void setResultAndFinishActivity()
    {
        setResult(-1, new Intent());
        finish();
    }

    private void showEmailAlreadyUsedAlert()
    {
        mActivityHelper.showAlert(AlertType.REGISTRATION_ERROR_EMAIL_ALREADY_USED, new _cls2());
        requestFocus();
    }

    private void showErrorDialog(ArrayList arraylist, StringBuffer stringbuffer)
    {
        mActivityHelper.showAlert(AlertType.MISSING_REGISTRATION_FIELDS, stringbuffer.toString(), null);
        ((View)arraylist.get(0)).requestFocus();
        if (arraylist.get(0) instanceof EditText)
        {
            arraylist = (EditText)arraylist.get(0);
            ((InputMethodManager)getSystemService("input_method")).showSoftInput(arraylist, 2);
        }
    }

    private void validateEmail(ArrayList arraylist, StringBuffer stringbuffer)
    {
        String s = emailTextBox.getText().toString();
        if (isEmpty(s))
        {
            stringbuffer.append(getString(0x7f080110));
            arraylist.add(emailTextBox);
        } else
        {
            if (!EmailValidator.isValidEmail(s))
            {
                stringbuffer.append(getString(0x7f080177));
                arraylist.add(emailTextBox);
                return;
            }
            String s1 = confirmEmailTextBox.getText().toString();
            if (isEmpty(s1))
            {
                stringbuffer.append(getString(0x7f0800c0));
                arraylist.add(emailTextBox);
                return;
            }
            if (!EmailValidator.isValidEmail(s))
            {
                stringbuffer.append(getString(0x7f080172));
                arraylist.add(emailTextBox);
                return;
            }
            if (!s1.equals(s))
            {
                stringbuffer.append(getString(0x7f08010f));
                arraylist.add(emailTextBox);
                return;
            }
        }
    }

    private void validatePasswords(ArrayList arraylist, StringBuffer stringbuffer)
    {
        String s = passwordTextBox.getText().toString();
        if (isEmpty(s))
        {
            stringbuffer.append(getString(0x7f08021f));
            arraylist.add(passwordTextBox);
        } else
        {
            if (s.length() < 8)
            {
                stringbuffer.append(getString(0x7f080220));
                arraylist.add(passwordTextBox);
                return;
            }
            if (s.contains(" "))
            {
                stringbuffer.append(getString(0x7f08021d));
                arraylist.add(passwordTextBox);
                return;
            }
            String s1 = confirmPasswordTextBox.getText().toString();
            if (isEmpty(s1))
            {
                stringbuffer.append(getString(0x7f080245));
                arraylist.add(confirmPasswordTextBox);
                return;
            }
            if (!s1.equals(s))
            {
                stringbuffer.append(getString(0x7f080222));
                arraylist.add(confirmPasswordTextBox);
                return;
            }
        }
    }

    private void validatePhoneNumber(ArrayList arraylist, StringBuffer stringbuffer)
    {
        String s = phoneTextBox.getText().toString();
        if (isEmpty(s))
        {
            stringbuffer.append(getString(0x7f080229));
            arraylist.add(phoneTextBox);
        } else
        if (s.trim().length() < 10)
        {
            stringbuffer.append(getString(0x7f08022a));
            arraylist.add(phoneTextBox);
            return;
        }
    }

    void afterViews()
    {
        initActivity();
        if (mBundle != null)
        {
            firstNameTextBox.setText(mBundle.getString("first_name"));
            lastNameTextBox.setText(mBundle.getString("last_name"));
            emailTextBox.setText(mBundle.getString("email"));
            phoneTextBox.setText(mBundle.getString("phone"));
            phoneExtentionTextBox.setText(mBundle.getString("phone_ext"));
        }
        addListeners();
        boolean flag;
        if (mLoyaltyManager.isLoyaltyAvailable() && mPreSelectLoyalty)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mPreSelectLoyalty = flag;
    }

    protected void createUserObjectAndSave()
    {
        UserObject userobject = new UserObject();
        Object obj = firstNameTextBox.getText().toString();
        Object obj1 = lastNameTextBox.getText().toString();
        String s = confirmEmailTextBox.getText().toString();
        String s1 = phoneTextBox.getText().toString();
        String s2 = phoneExtentionTextBox.getText().toString();
        String s3 = confirmPasswordTextBox.getText().toString();
        userobject.setAgreedToTerms(true);
        userobject.setOver13(true);
        userobject.setEmail(s);
        userobject.setFirstName(((String) (obj)));
        userobject.setLastName(((String) (obj1)));
        userobject.setPhone(s1);
        userobject.setPhoneExtension(s2);
        userobject.setPassword(s3);
        obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        obj1 = Calendar.getInstance();
        if (emailOptIn.isChecked())
        {
            userobject.setEmailOptIn(true);
            userobject.setEmailOptInTime(((DateFormat) (obj)).format(((Calendar) (obj1)).getTime()));
        }
        saveCustomer(userobject, isEnrollInLoyalty());
    }

    protected void displayTerms()
    {
        startActivityForResult(new Intent(this, com/dominos/activities/TermsWebActivity), 0);
    }

    protected void executeLogin(String s, String s1, boolean flag, final boolean enrollInLoyalty)
    {
        mProfileManager.loginForFirstTime(s, s1, flag, new _cls3());
    }

    protected void login()
    {
        String s = confirmEmailTextBox.getText().toString().trim();
        String s1 = confirmPasswordTextBox.getText().toString();
        boolean flag = rememberMe.isChecked();
        App.editor().putBoolean("remember-me", flag);
        App.editor().commit();
        executeLogin(s, s1, flag, isEnrollInLoyalty());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onError(Exception exception, String s)
    {
        sendToUserLoginActivity();
    }

    public void onLoyaltyCheckBoxClick()
    {
        mAnalyticsUtil.postRewardsCreateProfileCheckBoxClick();
    }

    public void onLoyaltyInfoClick()
    {
        mAnalyticsUtil.postRewardsCreateProfileInfoClick();
        LoyaltyInfoFragment.newInstance(LoyaltyInfoFragment.InfoType.INFO).show(getSupportFragmentManager(), LoyaltyInfoFragment.TAG);
    }

    public void onLoyaltyTermsClick()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        LoyaltyTermsWebActivity_.intent(this).start();
    }

    public void onRegisterClick()
    {
        mAnalyticsUtil.postAccountRegistrationClick();
        if (validate())
        {
            createUserObjectAndSave();
        }
    }

    protected void onRememberMeHelpButtonClick()
    {
        mActivityHelper.showAlert(AlertType.KEEP_ME_SIGNED_IN_INFO);
    }

    protected void requestFocus()
    {
        emailTextBox.requestFocus();
        emailTextBox.selectAll();
    }

    public boolean validate()
    {
        ArrayList arraylist = new ArrayList();
        StringBuffer stringbuffer = new StringBuffer();
        if (isEmpty(firstNameTextBox.getText().toString()))
        {
            stringbuffer.append(getString(0x7f08012b));
            arraylist.add(firstNameTextBox);
        }
        if (isEmpty(lastNameTextBox.getText().toString()))
        {
            stringbuffer.append(getString(0x7f080188));
            arraylist.add(lastNameTextBox);
        }
        validateEmail(arraylist, stringbuffer);
        validatePasswords(arraylist, stringbuffer);
        validatePhoneNumber(arraylist, stringbuffer);
        if (!isEmpty(stringbuffer.toString()))
        {
            showErrorDialog(arraylist, stringbuffer);
            return false;
        } else
        {
            return true;
        }
    }






    private class _cls1 extends com.dominos.android.sdk.core.user.UserProfileManager.SaveNewCustomerCallback
    {

        final RegistrationActivity this$0;

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onCredentialsError()
        {
            showShortToast(getString(0x7f080173));
        }

        public void onCustomerSaveError()
        {
            showShortToast(getString(0x7f080060));
        }

        public void onCustomerSaved()
        {
            removeUserInfoFromCheckout();
            mAnalyticsUtil.postAccountRegistrationSuccess();
            login();
        }

        public void onEmailAlreadyUsedError()
        {
            showEmailAlreadyUsedAlert();
        }

        public void onFinish()
        {
            hideLoading();
        }

        _cls1()
        {
            this$0 = RegistrationActivity.this;
            super();
        }
    }


    private class _cls2 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final RegistrationActivity this$0;

        public void onAlertDismissed()
        {
        }

        _cls2()
        {
            this$0 = RegistrationActivity.this;
            super();
        }
    }


    private class _cls3 extends com.dominos.android.sdk.core.user.UserProfileManager.LoginCallback
    {

        final RegistrationActivity this$0;
        final boolean val$enrollInLoyalty;

        public void onBegin()
        {
            showLoading();
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onLoginError()
        {
            hideLoading();
            sendToUserLoginActivity();
        }

        public void onLoginFailed()
        {
            hideLoading();
            sendToUserLoginActivity();
        }

        public void onLoginSuccessful()
        {
            mAnalyticsUtil.postLogin(mProfileManager.getCurrentUser().getCustomerId());
            if (enrollInLoyalty && !mLoyaltyManager.isCustomerEnrolledInLoyalty())
            {
                class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
                {

                    final _cls3 this$1;

                    public void onAlertDismissed()
                    {
                        setResultAndFinishActivity();
                    }

                _cls1()
                {
                    this$1 = _cls3.this;
                    super();
                }
                }

                mActivityHelper.showAlert(AlertType.NEW_CUSTOMER_LOYALTY_ENROLL_FAIL, new _cls1());
                return;
            } else
            {
                mAnalyticsUtil.postLoyaltyEnrolledEvent();
                setResultAndFinishActivity();
                return;
            }
        }

        _cls3()
        {
            this$0 = RegistrationActivity.this;
            enrollInLoyalty = flag;
            super();
        }
    }

}
