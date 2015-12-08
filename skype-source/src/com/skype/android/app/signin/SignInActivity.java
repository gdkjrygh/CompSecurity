// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.NavigationUrl;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.AccessibleAutoCompleteTextView;
import com.skype.android.widget.SymbolView;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.skype.android.app.signin:
//            AbstractSignInActivity, SignInConstants

public class SignInActivity extends AbstractSignInActivity
    implements android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener, SignInConstants
{

    private static final String ERROR_KEY = "errorKey";
    AccessibilityUtil accessibility;
    ActionBarCustomizer actionBarCustomizer;
    private int currentError;
    EditText passwordEdit;
    Button problemsButton;
    SymbolView signInButton;
    View signInContent;
    SignInDurationReporter signInDurationReporter;
    View signInHeader;
    AccessibleAutoCompleteTextView skypeNameEdit;

    public SignInActivity()
    {
    }

    private void doSignIn()
    {
        String s;
        String s1;
label0:
        {
            PerformanceLog.e.a("USER ACTION: Start signing in");
            StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.b);
            findViewById(0x7f100512).setVisibility(8);
            s = skypeNameEdit.getText().toString().trim();
            s1 = passwordEdit.getText().toString().trim();
            if (s.length() > 0 && s1.length() > 0)
            {
                if (!Patterns.EMAIL_ADDRESS.matcher(s).find())
                {
                    break label0;
                }
                showPotentiallyMSACredentialsDialog();
            }
            return;
        }
        signInWithSkype(s, s1);
    }

    private void hideKeyboard()
    {
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(passwordEdit.getWindowToken(), 2);
    }

    private void styleForOrientation(int i)
    {
        if (layoutExperience.isMultipane() && i == 2)
        {
            getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                int currentHeight;
                int screenHeight;
                final SignInActivity this$0;

                public final void onGlobalLayout()
                {
                    byte byte0 = 0;
                    View view = findViewById(0x1020002);
                    int j;
                    if (view != null)
                    {
                        if (currentHeight != (j = view.getHeight()))
                        {
                            View view1;
                            boolean flag;
                            if (screenHeight - j > screenHeight / 4)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            currentHeight = j;
                            view1 = signInHeader;
                            if (flag)
                            {
                                byte0 = 8;
                            }
                            view1.setVisibility(byte0);
                            return;
                        }
                    }
                }

            
            {
                this$0 = SignInActivity.this;
                super();
                currentHeight = -1;
                screenHeight = getResources().getDisplayMetrics().heightPixels;
            }
            });
        }
    }

    protected void enableSignInButton()
    {
        String s = skypeNameEdit.getText().toString().trim();
        String s1 = passwordEdit.getText().toString().trim();
        SymbolView symbolview = signInButton;
        boolean flag;
        if (s.length() > 0 && s1.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        symbolview.setEnabled(flag);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756001: 
            hideKeyboard();
            doSignIn();
            view = createSignInTelemetryEvent(LogEvent.w, SignInConstants.AccountType.SKYPE, false);
            analytics.a(view);
            signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.c, String.valueOf(SignInConstants.AccountType.SKYPE), false);
            return;

        case 2131756002: 
            navigationUrl.goToUrl(this, com.skype.android.res.Urls.Type.n);
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        getSupportActionBar().b(true);
        actionBarCustomizer.setTitle("");
        actionBarCustomizer.setWhiteTheme(true);
        skypeNameEdit.setOnEditorActionListener(this);
        skypeNameEdit.addTextChangedListener(new TextWatcher() {

            final SignInActivity this$0;

            public final void afterTextChanged(Editable editable)
            {
                String s1 = getString(0x7f08042b);
                if (editable.length() > 0)
                {
                    s1 = (new StringBuilder()).append(getString(0x7f08027b)).append(" ").append(editable.toString()).toString();
                }
                skypeNameEdit.setContentDescription(s1);
            }

            public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
            {
                enableSignInButton();
                if (skypeNameEdit.isPopupShowing() && android.os.Build.VERSION.SDK_INT >= 16)
                {
                    skypeNameEdit.announceForAccessibility(charsequence.toString().substring(j));
                }
            }

            
            {
                this$0 = SignInActivity.this;
                super();
            }
        });
        String s = getIntent().getStringExtra("username");
        if (s != null && skypeNameEdit.getText().length() == 0)
        {
            skypeNameEdit.append(s);
            passwordEdit.requestFocus();
        }
        skypeNameEdit.setAdapter(new ArrayAdapter(this, 0x1090011, AccountUtil.a(lib)));
        passwordEdit.setOnEditorActionListener(this);
        passwordEdit.addTextChangedListener(new TextWatcher() {

            final SignInActivity this$0;

            public final void afterTextChanged(Editable editable)
            {
                int j = editable.length();
                editable = getString(0x7f08042a);
                if (j > 0)
                {
                    editable = getResources().getQuantityString(0x7f0b0014, j, new Object[] {
                        Integer.valueOf(j)
                    });
                }
                passwordEdit.setContentDescription(editable);
            }

            public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
            {
                enableSignInButton();
            }

            
            {
                this$0 = SignInActivity.this;
                super();
            }
        });
        ViewUtil.a(this, new View[] {
            signInButton, problemsButton
        });
        signInButton.setEnabled(false);
        styleForOrientation(getResources().getConfiguration().orientation);
        if (accessibility.a())
        {
            accessibility.b(skypeNameEdit, 12);
            accessibility.b(passwordEdit, 12);
            accessibility.b(signInButton, 12);
        }
        if (bundle != null)
        {
            int i = bundle.getInt("errorKey", 0);
            if (i != 0)
            {
                showErrorView(com.skype.Account.LOGOUTREASON.fromInt(i));
            }
        }
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null)
        {
            if (keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
            {
                return true;
            }
            if (keyevent.getKeyCode() == 66 && keyevent.getAction() == 1)
            {
                hideKeyboard();
                doSignIn();
                return true;
            }
        }
        if (i == 6 || i == 4)
        {
            hideKeyboard();
            doSignIn();
            return true;
        } else
        {
            return false;
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAccountPartnerLinkResult onaccountpartnerlinkresult)
    {
        onaccountpartnerlinkresult = onaccountpartnerlinkresult.getCode();
        static final class _cls4
        {

            static final int $SwitchMap$com$skype$SkyLib$AUTH_RESULT[];

            static 
            {
                $SwitchMap$com$skype$SkyLib$AUTH_RESULT = new int[com.skype.SkyLib.AUTH_RESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_OK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_ANOTHER_MAPPING_EXISTS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.skype.SkyLib.AUTH_RESULT[onaccountpartnerlinkresult.ordinal()])
        {
        default:
            SkypeDialogFragment.dismiss(getSupportFragmentManager());
            log.warning((new StringBuilder("linking failed: ")).append(onaccountpartnerlinkresult).toString());
            showErrorView(null);
            return;

        case 1: // '\001'
            refreshToken = getIntent().getStringExtra("refreshToken");
            signInWithMsa();
            return;

        case 2: // '\002'
            showError(onaccountpartnerlinkresult);
            break;
        }
    }

    protected void onPause()
    {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public void onResume()
    {
        super.onResume();
        getSupportActionBar().g();
        PerformanceLog.e.a("APP ACTION: sign in screen displayed");
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.j, String.valueOf(SignInConstants.AccountType.SKYPE), false, String.valueOf(SignInConstants.ScreenName.SKYPE_SIGN_IN_SCREEN));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (currentError != 0)
        {
            bundle.putInt("errorKey", currentError);
        }
    }

    protected void showErrorView(com.skype.Account.LOGOUTREASON logoutreason)
    {
        int i = 0;
        TextView textview = (TextView)findViewById(0x7f100512);
        if (accessibility.a() && textview.getVisibility() != 0)
        {
            Toast.makeText(this, textview.getText(), 0).show();
        }
        textview.setVisibility(0);
        textview.requestFocus();
        if (logoutreason != null)
        {
            i = logoutreason.toInt();
        }
        currentError = i;
    }
}
