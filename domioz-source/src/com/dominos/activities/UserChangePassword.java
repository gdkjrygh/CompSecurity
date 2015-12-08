// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.dominos.App;
import com.dominos.android.sdk.common.dom.useraccounts.CreditCardToken;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.EmailValidator;
import org.androidannotations.api.c.p;
import org.c.c.l;
import org.c.e.a.f;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public class UserChangePassword extends BaseActivity
    implements com.dominos.android.sdk.data.http.power.PowerCallback.OnError
{

    private EditText confirmPassword;
    private EditText currentPassword;
    private UserObject currentUser;
    private EditText emailAddress;
    DominosPrefs_ mDominosPreferences;
    private EditText newPassword;
    UserAuthorization userAuth;

    public UserChangePassword()
    {
    }

    private void loginUser(String s)
    {
        mPowerService.login(currentUser.getEmail(), s, App.isRemembered(), new _cls5(s));
    }

    private void setUserAuthorization(String s)
    {
        userAuth.setAuthorizationCode(currentUser.getEmail(), s);
    }

    private String validatePassword()
    {
        String s;
        String s1;
        String s2;
        s1 = "";
        s2 = newPassword.getText().toString();
        if (s2.length() <= 0)
        {
            s1 = (new StringBuilder()).append("").append(getString(0x7f08021f)).toString();
        }
        s = s1;
        if (s2.length() < 8)
        {
            s = (new StringBuilder()).append(s1).append(getString(0x7f080220)).toString();
        }
        s1 = s;
        if (s2.contains(" "))
        {
            s1 = (new StringBuilder()).append(s).append(getString(0x7f08021d)).toString();
        }
        s = s1;
        if (s1.length() > 0) goto _L2; else goto _L1
_L1:
        String s3 = confirmPassword.getText().toString();
        if (s3.length() > 0) goto _L4; else goto _L3
_L3:
        s = (new StringBuilder()).append(s1).append(getString(0x7f080245)).toString();
_L2:
        s1 = s;
        if (s.length() > 0)
        {
            s1 = s.substring(0, s.length() - 1);
        }
        return s1;
_L4:
        s = s1;
        if (!s3.equals(s2))
        {
            s = (new StringBuilder()).append(s1).append(getString(0x7f080222)).toString();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void changePassword(View view)
    {
        view = validatePassword();
        if (view.length() <= 0)
        {
            view = currentPassword.getText().toString();
            final String newPW = newPassword.getText().toString();
            mPowerService.changePassword(currentUser.getEmail(), view, newPW, new _cls4());
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.MISSING_PASSWORD_FIELDS, view, null);
            return;
        }
    }

    protected void getAllSavedCreditCards(String s)
    {
        mPowerService.getAllCards(s, new _cls6(this));
    }

    protected void handleSavedCreditCardsFetch(String s)
    {
        s = CreditCardToken.parseCreditCardList(s);
        mProfileManager.setSavedPaymentList(s);
        showShortToast(getString(0x7f08021e));
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("resetPassword", false))
        {
            setContentView(0x7f0300c0);
            setTitle(getString(0x7f08012c));
            emailAddress = (EditText)findViewById(0x7f0f0422);
            return;
        } else
        {
            setContentView(0x7f0300bb);
            setTitle(getString(0x7f08008e));
            currentPassword = (EditText)findViewById(0x7f0f03f2);
            newPassword = (EditText)findViewById(0x7f0f03f3);
            confirmPassword = (EditText)findViewById(0x7f0f03f4);
            currentUser = mProfileManager.getCurrentUser();
            bundle = (Button)findViewById(0x7f0f03bd);
            bundle.setVisibility(0);
            bundle.setText(0x7f080047);
            bundle.setOnClickListener(new _cls1());
            return;
        }
    }

    public void onError(Exception exception, String s)
    {
        mDominosPreferences.rememberMeCookieValue().d();
        if (exception instanceof f)
        {
            int i = ((f)exception).getStatusCode().value();
            if (i == 404 || i == 403 || i == 500)
            {
                showErrorAlert();
            } else
            {
                showShortToast(getString(0x7f080060));
            }
        } else
        {
            showShortToast(getString(0x7f080060));
        }
        showShortToast(getString(0x7f08021e));
        finish();
    }

    public void resetPassword(View view)
    {
        if (!EmailValidator.isValidEmail(emailAddress.getText().toString()))
        {
            showInvalidEmail();
            return;
        } else
        {
            mPowerService.resetPassword(emailAddress.getText().toString(), new _cls2());
            return;
        }
    }

    protected void showErrorAlert()
    {
        mActivityHelper.showAlert(AlertType.SIGN_IN_FAILURE);
    }

    protected void showInvalid()
    {
        mActivityHelper.showAlert(AlertType.INVALID_PASSWORD);
    }

    protected void showInvalidEmail()
    {
        mActivityHelper.showAlert(AlertType.INVALID_EMAIL);
    }

    protected void showPasswordResetDialog()
    {
        mActivityHelper.showAlert(AlertType.FORGOT_PASSWORD, new _cls3());
    }




    private class _cls5 extends DelegatingCallback
    {

        final UserChangePassword this$0;
        final String val$password;

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = UserObject.from(s);
            setUserAuthorization(password);
            mProfileManager.saveNewCurrentUser(s);
            getAllSavedCreditCards(s.getCustomerId());
        }

        _cls5(String s)
        {
            this$0 = UserChangePassword.this;
            password = s;
            super(final_powercallback);
        }
    }


    private class _cls4 extends PowerRestCallback
    {

        final UserChangePassword this$0;
        final String val$newPW;

        public void onBegin()
        {
            showLoading();
        }

        public void onError(Exception exception, String s)
        {
            hideLoading();
            int i = 0;
            if (exception instanceof f)
            {
                i = ((f)exception).getStatusCode().value();
            }
            if (i == 404)
            {
                showInvalidEmail();
                return;
            } else
            {
                showInvalid();
                return;
            }
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            Object obj;
            hideLoading();
            obj = new JSONObject(s);
            s = ((JSONObject) (obj)).optString("PasswordSalt", null);
            obj = ((JSONObject) (obj)).optString("PasswordHash", null);
            if (obj == null || s == null)
            {
                try
                {
                    throw new Exception();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                }
                showInvalid();
                return;
            }
            currentUser.setPasswordHash(((String) (obj)));
            currentUser.setPasswordSalt(s);
            mProfileManager.saveNewCurrentUser(currentUser);
            loginUser(newPW);
            return;
        }

        _cls4()
        {
            this$0 = UserChangePassword.this;
            newPW = s;
            super();
        }
    }


    private class _cls6 extends DelegatingCallback
    {

        final UserChangePassword this$0;

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            handleSavedCreditCardsFetch(s);
        }

        _cls6(PowerCallback powercallback)
        {
            this$0 = UserChangePassword.this;
            super(powercallback);
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserChangePassword this$0;

        public void onClick(View view)
        {
            changePassword(view);
        }

        _cls1()
        {
            this$0 = UserChangePassword.this;
            super();
        }
    }


    private class _cls2 extends PowerRestCallback
    {

        final UserChangePassword this$0;

        public void onBegin()
        {
            showLoading();
        }

        public void onError(Exception exception, String s)
        {
            hideLoading();
            showInvalidEmail();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            hideLoading();
            showPasswordResetDialog();
        }

        _cls2()
        {
            this$0 = UserChangePassword.this;
            super();
        }
    }


    private class _cls3 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final UserChangePassword this$0;

        public void onAlertDismissed()
        {
            finish();
        }

        _cls3()
        {
            this$0 = UserChangePassword.this;
            super();
        }
    }

}
