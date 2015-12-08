// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.AccessibleEditText;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            AbstractSignInActivity, SignInConstants, SelectSkypeNameActivity

public class SignUpActivity extends AbstractSignInActivity
    implements TextWatcher, android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, SignInConstants, AsyncCallback
{

    private static final int MAX_CHAR_LENGTH_FULLNAME = 70;
    private static final int MAX_CHAR_LENGTH_PASSWORD = 20;
    private static final int MAX_CHAR_LENGTH_SKYPENAME = 32;
    private static final String PROJECTION[] = {
        "display_name"
    };
    private static final String SKYPE_NAME_KEY = "skypeName";
    private static final String VALIDITY_FLAGS_KEY = "validityFlags";
    private static boolean selectNameActivityIsLaunched = false;
    private static boolean skypenameNeedsValidation;
    AccountManager accountManager;
    ActionBarCustomizer actionBarCustomizer;
    AsyncService asyncService;
    ImageButton continueButton;
    private EditText currentEditText;
    private String email;
    AccessibleEditText emailEdit;
    private boolean emailValid;
    private String fullname;
    AccessibleEditText fullnameEdit;
    private boolean fullnameValid;
    SkyLib lib;
    private boolean marketingOption;
    private String password;
    private String passwordConfirm;
    AccessibleEditText passwordConfirmEdit;
    private boolean passwordConfirmValid;
    AccessibleEditText passwordEdit;
    private boolean passwordValid;
    private String skypename;
    AccessibleEditText skypenameEdit;
    private boolean skypenameValid;
    Provider userPrefsProvider;

    public SignUpActivity()
    {
    }

    private boolean allFieldsAreValid()
    {
        AccessibleEditText accessibleedittext = fullnameEdit;
        AccessibleEditText accessibleedittext1 = passwordEdit;
        AccessibleEditText accessibleedittext2 = passwordConfirmEdit;
        AccessibleEditText accessibleedittext3 = emailEdit;
        for (int i = 0; i < 4; i++)
        {
            if (!formFieldIsValid((new EditText[] {
    accessibleedittext, accessibleedittext1, accessibleedittext2, accessibleedittext3
})[i], true))
            {
                return false;
            }
        }

        return true;
    }

    private void createAccountAndSignIn()
    {
        StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.b);
        fullname = fullnameEdit.getText().toString().trim();
        skypename = skypenameEdit.getText().toString().trim();
        password = passwordEdit.getText().toString().trim();
        email = emailEdit.getText().toString().trim();
        obtainAccount(skypename);
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_OUT)
        {
            showProgress(getString(0x7f0803b7));
        }
        account.register(password, true, true, email, marketingOption);
        account.setStrProperty(PROPKEY.CONTACT_FULLNAME, fullname);
        account.setServersideStrProperty(PROPKEY.CONTACT_FULLNAME, fullname);
    }

    private void enableContinueButton()
    {
        boolean flag;
        if (skypenameValid && fullnameValid && passwordValid && passwordConfirmValid && emailValid)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continueButton.setEnabled(flag);
    }

    private boolean formFieldIsValid(EditText edittext, boolean flag)
    {
        String s;
        String s1;
        s1 = edittext.getText().toString().trim();
        s = null;
        if (edittext != fullnameEdit) goto _L2; else goto _L1
_L1:
        s = validateFullname(s1);
_L4:
        if (TextUtils.isEmpty(s))
        {
            edittext.setError(null);
            edittext.invalidate();
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (edittext == skypenameEdit)
        {
            s = validateSkypename(s1);
        } else
        if (edittext == passwordEdit)
        {
            s = validatePassword(s1);
        } else
        if (edittext == passwordConfirmEdit)
        {
            s = validatePasswordConfirm(s1);
        } else
        if (edittext == emailEdit)
        {
            s = validateEmail(s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            edittext.setError(s);
        }
        return false;
    }

    private String getDefaultEmail()
    {
        if (checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS") == 0)
        {
            android.accounts.Account aaccount[] = accountManager.getAccounts();
            if (aaccount != null)
            {
                int j = aaccount.length;
                for (int i = 0; i < j; i++)
                {
                    android.accounts.Account account = aaccount[i];
                    if (Patterns.EMAIL_ADDRESS.matcher(account.name).matches())
                    {
                        return account.name;
                    }
                }

            }
        }
        return null;
    }

    private void getNameAsync()
    {
        if (checkCallingOrSelfPermission("android.permission.READ_PROFILE") == 0)
        {
            asyncService.a(new Callable() {

                final SignUpActivity this$0;

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public final String call()
                    throws Exception
                {
                    Cursor cursor;
                    String s;
                    cursor = null;
                    s = "";
                    Cursor cursor1 = getContentResolver().query(android.provider.ContactsContract.Profile.CONTENT_URI, SignUpActivity.PROJECTION, null, null, null);
                    cursor = cursor1;
                    if (!cursor1.moveToFirst())
                    {
                        break MISSING_BLOCK_LABEL_46;
                    }
                    cursor = cursor1;
                    s = cursor1.getString(0);
                    if (cursor1 != null && !cursor1.isClosed())
                    {
                        cursor1.close();
                    }
                    return s;
                    Exception exception;
                    exception;
                    if (cursor != null && !cursor.isClosed())
                    {
                        cursor.close();
                    }
                    throw exception;
                }

            
            {
                this$0 = SignUpActivity.this;
                super();
            }
            }, new UiCallback(this, this));
        }
    }

    private void initEditWithLengthFilter(EditText edittext, int i)
    {
        edittext.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(i)
        });
        edittext.setOnFocusChangeListener(this);
        edittext.addTextChangedListener(this);
    }

    private void onFocusGained(View view)
    {
        if (view instanceof EditText)
        {
            currentEditText = (EditText)view;
        }
    }

    private void onFocusLost(View view)
    {
        formFieldIsValid((EditText)view, true);
    }

    private String validateEmail(String s)
    {
        emailValid = false;
        email = s;
        if (lib.validateProfileString(PROPKEY.CONTACT_EMAILS, email, true).m_return == com.skype.SkyLib.VALIDATERESULT.VALIDATED_OK)
        {
            emailValid = true;
            return null;
        } else
        {
            return getString(0x7f0803bc);
        }
    }

    private String validateFullname(String s)
    {
        fullnameValid = false;
        fullname = s;
        if (!TextUtils.isEmpty(fullname))
        {
            fullnameValid = true;
            return null;
        } else
        {
            return getString(0x7f0803d8);
        }
    }

    private String validatePassword(String s)
    {
        passwordValid = false;
        password = s;
        skypename = skypenameEdit.getText().toString().trim();
        s = lib.validatePassword(skypename, password);
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$SkyLib$VALIDATERESULT[];

            static 
            {
                $SwitchMap$com$skype$SkyLib$VALIDATERESULT = new int[com.skype.SkyLib.VALIDATERESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.VALIDATED_OK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.CONTAINS_INVALID_CHAR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.CONTAINS_INVALID_WORD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.STARTS_WITH_INVALID_CHAR.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.TOO_LONG.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.TOO_SHORT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.TOO_SIMPLE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.SAME_AS_USERNAME.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.CONTAINS_SPACE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.SkyLib.VALIDATERESULT[s.ordinal()])
        {
        case 4: // '\004'
        default:
            log.warning((new StringBuilder("Unknown validate password code: ")).append(s).toString());
            return null;

        case 1: // '\001'
            passwordValid = true;
            return null;

        case 8: // '\b'
            return getString(0x7f08040d);

        case 3: // '\003'
            return getString(0x7f08040c);

        case 2: // '\002'
            return getString(0x7f08040b);

        case 9: // '\t'
            return getString(0x7f08040a);

        case 5: // '\005'
            return getString(0x7f08040f);

        case 6: // '\006'
            return getString(0x7f080410);

        case 7: // '\007'
            return getString(0x7f08040e);
        }
    }

    private String validatePasswordConfirm(String s)
    {
        passwordConfirmValid = false;
        passwordConfirm = s;
        password = passwordEdit.getText().toString().trim();
        if (TextUtils.isEmpty(password) || !password.equals(passwordConfirm))
        {
            return getString(0x7f080411);
        } else
        {
            passwordConfirmValid = true;
            return null;
        }
    }

    private String validateSkypename(String s)
    {
        skypenameValid = false;
        skypename = s;
        s = lib.validateProfileString(PROPKEY.CONTACT_SKYPENAME, skypename, true).m_return;
        switch (_cls2..SwitchMap.com.skype.SkyLib.VALIDATERESULT[s.ordinal()])
        {
        default:
            log.warning((new StringBuilder("Unknown validate Skypename code: ")).append(s).toString());
            return null;

        case 1: // '\001'
            skypenameValid = true;
            return null;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return getString(0x7f080435);

        case 5: // '\005'
            return getString(0x7f080437);

        case 6: // '\006'
        case 7: // '\007'
            return getString(0x7f080438);
        }
    }

    protected void accountStatusLoggedIn()
    {
        ((UserPreferences)userPrefsProvider.get()).setNewUser();
        analytics.a(LogEvent.i);
        super.accountStatusLoggedIn();
    }

    public void afterTextChanged(Editable editable)
    {
        if (currentEditText == passwordEdit && !TextUtils.isEmpty(passwordConfirmEdit.getText()))
        {
            formFieldIsValid(passwordEdit, false);
            formFieldIsValid(passwordConfirmEdit, false);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void done(AsyncResult asyncresult)
    {
        if (asyncresult.e())
        {
            asyncresult = (String)asyncresult.a();
            if (!TextUtils.isEmpty(asyncresult) && TextUtils.isEmpty(fullnameEdit.getText().toString()))
            {
                fullnameEdit.setText(asyncresult);
                validateFullname(asyncresult);
            }
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 101)
        {
            selectNameActivityIsLaunched = false;
            skypenameNeedsValidation = true;
            accountProvider.reset();
            account = null;
            if (intent != null)
            {
                intent = intent.getStringExtra("chosenName");
                if (!TextUtils.isEmpty(intent))
                {
                    skypenameEdit.setText(intent);
                } else
                {
                    skypenameEdit.setError(getString(0x7f080436));
                }
            } else
            {
                skypenameEdit.setError(getString(0x7f080436));
            }
        }
        if (skypenameEdit.getError() != null)
        {
            skypenameNeedsValidation = false;
        }
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131756319 2131756319: default 24
    //                   2131756319 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (allFieldsAreValid())
        {
            createAccountAndSignIn();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        getSupportActionBar().b(true);
        actionBarCustomizer.setTitle(getString(0x7f080242));
        actionBarCustomizer.setWhiteOnBlueTheme(true);
        marketingOption = getIntent().getBooleanExtra("marketing", true);
        initEditWithLengthFilter(fullnameEdit, 70);
        initEditWithLengthFilter(skypenameEdit, 32);
        initEditWithLengthFilter(passwordEdit, 20);
        initEditWithLengthFilter(passwordConfirmEdit, 20);
        emailEdit.setOnFocusChangeListener(this);
        emailEdit.addTextChangedListener(this);
        bundle = getDefaultEmail();
        getNameAsync();
        if (bundle != null)
        {
            emailEdit.setText(bundle);
            emailValid = true;
        }
        ViewUtil.a(this, new View[] {
            continueButton
        });
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            onFocusGained(view);
        } else
        {
            onFocusLost(view);
        }
        if ((view == passwordConfirmEdit || view == passwordEdit) && !TextUtils.isEmpty(passwordConfirmEdit.getText()))
        {
            formFieldIsValid(passwordEdit, true);
            formFieldIsValid(passwordConfirmEdit, true);
        }
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        boolean aflag[] = bundle.getBooleanArray("validityFlags");
        if (aflag != null && aflag.length == 5)
        {
            fullnameValid = aflag[0];
            skypenameValid = aflag[1];
            passwordValid = aflag[2];
            passwordConfirmValid = aflag[3];
            emailValid = aflag[4];
            enableContinueButton();
        }
        bundle = bundle.getString("skypeName");
        if (!TextUtils.isEmpty(bundle))
        {
            obtainAccount(bundle);
        }
    }

    protected void onResume()
    {
        super.onResume();
        getSupportActionBar().g();
        if (skypenameNeedsValidation)
        {
            String s = validateSkypename(skypenameEdit.getText().toString().trim());
            if (skypenameValid)
            {
                skypenameEdit.setError(s);
            }
            skypenameEdit.requestFocus();
            skypenameNeedsValidation = false;
            selectNameActivityIsLaunched = false;
        }
        enableContinueButton();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBooleanArray("validityFlags", new boolean[] {
            fullnameValid, skypenameValid, passwordValid, passwordConfirmValid, emailValid
        });
        if (account != null)
        {
            bundle.putString("skypeName", account.getSkypenameProp());
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (currentEditText != null)
        {
            formFieldIsValid(currentEditText, false);
            enableContinueButton();
        }
    }

    protected void showError(com.skype.Account.LOGOUTREASON logoutreason)
    {
label0:
        {
            if (!selectNameActivityIsLaunched)
            {
                if (logoutreason != com.skype.Account.LOGOUTREASON.SKYPENAME_TAKEN)
                {
                    break label0;
                }
                logoutreason = new Intent(this, com/skype/android/app/signin/SelectSkypeNameActivity);
                logoutreason.putExtra("suggestedName", account.getStrProperty(PROPKEY.ACCOUNT_SUGGESTED_SKYPENAME));
                startActivityForResult(logoutreason, 101);
                selectNameActivityIsLaunched = true;
            }
            return;
        }
        super.showError(logoutreason);
    }


}
