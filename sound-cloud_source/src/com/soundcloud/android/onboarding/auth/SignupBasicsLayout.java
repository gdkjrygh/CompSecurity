// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import a.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.soundcloud.android.profile.BirthdayInfo;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.android.utils.ScTextUtils;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            GenderOption, GenderPickerDialogFragment

public class SignupBasicsLayout extends FrameLayout
    implements GenderPickerDialogFragment.Callback
{
    private class EmailValidator extends InputValidator
    {

        final SignupBasicsLayout this$0;

        boolean validate(String s)
        {
            emailValid = ScTextUtils.isEmail(s);
            return emailValid;
        }

        public EmailValidator()
        {
            this$0 = SignupBasicsLayout.this;
            super(emailField);
        }
    }

    private abstract class InputValidator extends com.soundcloud.android.utils.ScTextUtils.TextValidator
    {

        final SignupBasicsLayout this$0;

        public void validate(TextView textview, String s)
        {
            if (validate(s))
            {
                textview.setCompoundDrawablesWithIntrinsicBounds(null, null, validDrawable, null);
            } else
            {
                textview.setCompoundDrawables(null, null, placeholderDrawable, null);
            }
            validateForm();
        }

        abstract boolean validate(String s);

        public InputValidator(TextView textview)
        {
            this$0 = SignupBasicsLayout.this;
            super(textview);
        }
    }

    private class PasswordValidator extends InputValidator
    {

        final SignupBasicsLayout this$0;

        boolean validate(String s)
        {
            passwordValid = SignupBasicsLayout.checkPassword(s);
            return passwordValid;
        }

        public PasswordValidator()
        {
            this$0 = SignupBasicsLayout.this;
            super(passwordField);
        }
    }

    public static interface SignUpBasicsHandler
    {

        public abstract FragmentActivity getFragmentActivity();

        public abstract void onCancelSignUp();

        public abstract void onShowPrivacyPolicy();

        public abstract void onShowTermsOfUse();

        public abstract void onSignUp(String s, String s1, BirthdayInfo birthdayinfo, String s2);
    }


    private static final String BUNDLE_AGE = "BUNDLE_AGE";
    private static final String BUNDLE_CUSTOM_GENDER = "BUNDLE_CUSTOM_GENDER";
    private static final String BUNDLE_EMAIL = "BUNDLE_EMAIL";
    private static final String BUNDLE_GENDER = "BUNDLE_GENDER";
    private static final String BUNDLE_PASSWORD = "BUNDLE_PASSWORD";
    public static final String INDICATE_GENDER_DIALOG_TAG = "indicate_gender";
    private static final int MIN_PASSWORD_LENGTH = 6;
    EditText ageEditText;
    View customGenderDivider;
    EditText customGenderEditText;
    AutoCompleteTextView emailField;
    private boolean emailValid;
    TextView genderOptionTextView;
    EditText passwordField;
    private boolean passwordValid;
    private Drawable placeholderDrawable;
    private GenderOption selectedGenderOption;
    Button signUpButton;
    private SignUpBasicsHandler signUpHandler;
    private Drawable validDrawable;

    public SignupBasicsLayout(Context context)
    {
        super(context);
    }

    public SignupBasicsLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SignupBasicsLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static boolean checkPassword(CharSequence charsequence)
    {
        return charsequence != null && charsequence.length() >= 6;
    }

    private void clickifyPrivacy()
    {
        ScTextUtils.clickify((TextView)findViewById(0x7f0f0218), getResources().getString(0x7f0701a9), new _cls1(), false, false);
    }

    private void clickifyTermsOfUse()
    {
        ScTextUtils.clickify((TextView)findViewById(0x7f0f0218), getResources().getString(0x7f0700a2), new _cls2(), false, false);
    }

    private int getAge()
    {
        return (int)ScTextUtils.safeParseLong(ageEditText.getText().toString());
    }

    private String getCustomGender()
    {
        return customGenderEditText.getText().toString();
    }

    private String getEmail()
    {
        return emailField.getText().toString();
    }

    private String getPassword()
    {
        return passwordField.getText().toString();
    }

    private boolean hasAge()
    {
        return ageEditText.getText().length() > 0;
    }

    private void hideKeyboardOnSignup(AutoCompleteTextView autocompletetextview, EditText edittext)
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
        inputmethodmanager.hideSoftInputFromWindow(autocompletetextview.getWindowToken(), 0);
        inputmethodmanager.hideSoftInputFromWindow(edittext.getWindowToken(), 0);
    }

    private void setCurrentGender(GenderOption genderoption)
    {
        selectedGenderOption = genderoption;
        updateGenderLabel();
        updateCustomGenderVisibility();
    }

    private void setupEmailField()
    {
        ArrayAdapter arrayadapter = new ArrayAdapter(getContext(), 0x7f03008c, AndroidUtils.listEmails(getContext()));
        emailField.setAdapter(arrayadapter);
        emailField.setThreshold(0);
        emailField.addTextChangedListener(new EmailValidator());
    }

    private void setupPasswordField()
    {
        passwordField.addTextChangedListener(new PasswordValidator());
    }

    private void setupValidDrawables()
    {
        validDrawable = getResources().getDrawable(0x7f020145);
        placeholderDrawable = new ColorDrawable(0);
        placeholderDrawable.setBounds(0, 0, validDrawable.getIntrinsicWidth(), validDrawable.getIntrinsicHeight());
    }

    private void updateCustomGenderVisibility()
    {
        if (selectedGenderOption == GenderOption.CUSTOM)
        {
            customGenderDivider.setVisibility(0);
            customGenderEditText.setVisibility(0);
            return;
        } else
        {
            customGenderDivider.setVisibility(8);
            customGenderEditText.setVisibility(8);
            return;
        }
    }

    private void updateGenderLabel()
    {
        if (selectedGenderOption != null)
        {
            String s = getResources().getString(selectedGenderOption.getResId());
            genderOptionTextView.setText(s);
            genderOptionTextView.setHint("");
            return;
        } else
        {
            genderOptionTextView.setText(null);
            genderOptionTextView.setHint(0x7f070173);
            return;
        }
    }

    private void validateForm()
    {
        boolean flag1 = true;
        boolean flag;
        if (emailValid && passwordValid)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || !hasAge())
        {
            flag1 = false;
        }
        signUpButton.setEnabled(flag1);
    }

    public SignUpBasicsHandler getSignUpHandler()
    {
        return signUpHandler;
    }

    public Bundle getStateBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_EMAIL", emailField.getText().toString());
        bundle.putString("BUNDLE_PASSWORD", passwordField.getText().toString());
        bundle.putString("BUNDLE_AGE", ageEditText.getText().toString());
        bundle.putSerializable("BUNDLE_GENDER", selectedGenderOption);
        bundle.putString("BUNDLE_CUSTOM_GENDER", customGenderEditText.getText().toString());
        return bundle;
    }

    public void onCancelClick()
    {
        getSignUpHandler().onCancelSignUp();
        hideKeyboardOnSignup(emailField, passwordField);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a.a(this);
        setupValidDrawables();
        setupPasswordField();
        setupEmailField();
        clickifyTermsOfUse();
        clickifyPrivacy();
        validateForm();
        String as[] = AndroidUtils.getAccountsByType(getContext(), "com.google");
        if (as.length > 0)
        {
            emailField.setText(as[0]);
        }
    }

    public void onGenderClick()
    {
        FragmentActivity fragmentactivity = signUpHandler.getFragmentActivity();
        GenderPickerDialogFragment.build(selectedGenderOption).show(fragmentactivity.getSupportFragmentManager(), "indicate_gender");
    }

    public void onGenderSelected(GenderOption genderoption)
    {
        setCurrentGender(genderoption);
    }

    boolean onPasswordEdit(int i, KeyEvent keyevent)
    {
label0:
        {
            boolean flag1 = true;
            boolean flag3 = false;
            boolean flag;
            boolean flag2;
            if (i == 6)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (keyevent != null && keyevent.getKeyCode() == 66)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (keyevent == null || keyevent.getAction() != 0)
            {
                flag1 = false;
            }
            if (i == 0)
            {
                flag2 = flag3;
                if (!flag)
                {
                    break label0;
                }
                flag2 = flag3;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag2 = signUpButton.performClick();
        }
        return flag2;
    }

    public void onSignupClick()
    {
        if (emailField.getText().length() == 0 || passwordField.getText().length() == 0)
        {
            AndroidUtils.showToast(getContext(), 0x7f07008c, new Object[0]);
            return;
        }
        if (!ScTextUtils.isEmail(emailField.getText()))
        {
            AndroidUtils.showToast(getContext(), 0x7f07008d, new Object[0]);
            return;
        }
        if (!checkPassword(passwordField.getText()))
        {
            AndroidUtils.showToast(getContext(), 0x7f07008f, new Object[0]);
            return;
        }
        BirthdayInfo birthdayinfo = BirthdayInfo.buildFrom(getAge());
        if (birthdayinfo.isValid())
        {
            String s1 = getEmail();
            String s2 = getPassword();
            String s;
            if (selectedGenderOption != null)
            {
                s = selectedGenderOption.getApiValue(getCustomGender());
            } else
            {
                s = null;
            }
            hideKeyboardOnSignup(emailField, passwordField);
            signUpHandler.onSignUp(s1, s2, birthdayinfo, s);
            return;
        } else
        {
            AndroidUtils.showToast(getContext(), 0x7f07008a, new Object[0]);
            return;
        }
    }

    public void setSignUpHandler(SignUpBasicsHandler signupbasicshandler)
    {
        signUpHandler = signupbasicshandler;
    }

    public void setStateFromBundle(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            emailField.setText(bundle.getCharSequence("BUNDLE_EMAIL"));
            passwordField.setText(bundle.getCharSequence("BUNDLE_PASSWORD"));
            ageEditText.setText(bundle.getCharSequence("BUNDLE_AGE"));
            setCurrentGender((GenderOption)bundle.getSerializable("BUNDLE_GENDER"));
            customGenderEditText.setText(bundle.getCharSequence("BUNDLE_CUSTOM_GENDER"));
            validateForm();
            return;
        }
    }

    public void yearTextListener()
    {
        validateForm();
    }







/*
    static boolean access$402(SignupBasicsLayout signupbasicslayout, boolean flag)
    {
        signupbasicslayout.emailValid = flag;
        return flag;
    }

*/



/*
    static boolean access$502(SignupBasicsLayout signupbasicslayout, boolean flag)
    {
        signupbasicslayout.passwordValid = flag;
        return flag;
    }

*/

    private class _cls1
        implements com.soundcloud.android.utils.ScTextUtils.ClickSpan.OnClickListener
    {

        final SignupBasicsLayout this$0;

        public void onClick()
        {
            signUpHandler.onShowPrivacyPolicy();
        }

        _cls1()
        {
            this$0 = SignupBasicsLayout.this;
            super();
        }
    }


    private class _cls2
        implements com.soundcloud.android.utils.ScTextUtils.ClickSpan.OnClickListener
    {

        final SignupBasicsLayout this$0;

        public void onClick()
        {
            signUpHandler.onShowTermsOfUse();
        }

        _cls2()
        {
            this$0 = SignupBasicsLayout.this;
            super();
        }
    }

}
